package ast;

import ast.Type.ArrayType.ArrayType;
import ast.Type.PrimitiveType.BooleanType;
import ast.Type.PrimitiveType.IntType;
import ast.Type.PrimitiveType.StringType;
import ast.Type.UserDefinedType.UserDefinedType;
import ast.node.Program;
import ast.node.declaration.ClassDeclaration;
import ast.node.declaration.MethodDeclaration;
import ast.node.declaration.ObjectDeclaration;
import ast.node.declaration.VarDeclaration;
import ast.node.expression.*;
import ast.node.expression.Value.BooleanValue;
import ast.node.expression.Value.IntValue;
import ast.node.expression.Value.StringValue;
import ast.node.statement.*;
import com.sun.xml.internal.bind.v2.TODO;
import symbolTable.*;
import ast.Type.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.io.*;
import java.util.ArrayList;


public class JasminVisitorImpl implements Visitor {
    public static HashMap<String, ClassDeclaration> classDecs;
    private HashMap<String, SymbolTable> methodSymbolTables;
    public static HashMap<String, SymbolTable> classSymbolTables;
    private boolean inMain = false;


    private String outputPath = "output/";
    PrintWriter out;

    int findIndexInSymTable(Identifier element, SymbolTable currSym){
        try {
            SymbolTableVariableItemBase item = (SymbolTableVariableItemBase) currSym.get(element.getName());
            return item.getIndex();
        }catch(ItemNotFoundException ex){
            return -1;
        }
    }

    String getTypeSign(Type varType){
        String result = "";
        if(varType.toString().equals(new ArrayType().toString()))
            result = result + "[I";
        else if(varType.toString().equals(new BooleanType().toString()))
            result += "Z";
        else if(varType.toString().equals(new IntType().toString()))
            result += "I";
        else if(varType.toString().equals(new StringType().toString()))
            result += "Ljava/lang/String;";
        else if(varType.toString().equals(new UserDefinedType().toString()))
            result += (((UserDefinedType)varType).getClassType() + ";");
        else
            result += "V";
        return result;
    }

    @Override
    public void visit(Program program) {
        classDecs = program.getClassDecs();
        methodSymbolTables = program.getMethodSymbolTables();
        classSymbolTables  = program.getClassSymbolTables();

        ClassDeclaration mainClass = program.getMainClass();
        if(mainClass != null) {
            inMain = true;
            mainClass.accept(this);
            inMain = false;
        }
        List <ClassDeclaration> classes = program.getClasses();
        if(classes != null)
        {
            for (int i = 0; i < classes.size(); i++)
                classes.get(i).accept(this);
        }

    }

    @Override
    public void visit(InMainMethodCall inMainMethodCall) {

    }

    @Override
    public void visit(ClassDeclaration classDeclaration) {
        SymbolTable.push(classSymbolTables.get(classDeclaration.getName().getName()));

        try {
            File file = new File(outputPath + classDeclaration.getName().getName() + ".j");
            file.createNewFile();
            out = new PrintWriter(file);
            out.println(".class public " + classDeclaration.getName().getName() );
            if(classDeclaration.getParentName().getName().equals("Object"))
                out.println(".super java/lang/Object" + "\n");
            else
                out.println(".super " + classDeclaration.getParentName().getName() + "\n");
            ArrayList<VarDeclaration> vars = classDeclaration.getVarDeclarations();
            for(int i = 0; i < vars.size(); i++)
                vars.get(i).accept(this);
            ArrayList<MethodDeclaration> meths = classDeclaration.getMethodDeclarations();
            for(int i = 0; i < meths.size(); i++)
                meths.get(i).accept(this);
            out.close();
        }catch(Exception ex){
            System.out.println(ex.toString());
        }

        SymbolTable.pop();
    }

    @Override
    public void visit(MethodDeclaration methodDeclaration) {
        SymbolTable.push(methodSymbolTables.get(methodDeclaration.getName().getName() + "@" + methodDeclaration.getClassName()));

        String argTypesSigns = "";
        ArrayList<VarDeclaration> args = methodDeclaration.getArgs();
        for (int i = 0; i < args.size(); i++) {
            argTypesSigns += getTypeSign(args.get(i).getType());
        }
        String retSign = getTypeSign(methodDeclaration.getReturnType());
        if(inMain)
            out.println(".method public static " + methodDeclaration.getName().getName() + "([Ljava/lang/String;)V\n");
        else
            out.println(".method public " + methodDeclaration.getName().getName() + "(" + argTypesSigns + ")" + retSign + "\n");
        out.println("   .limit locals 1000");
        out.println("   .limit stack 1000" + '\n');
        for (int i = args.size() - 1; i >= 0; i--) {
            out.println("   iload" + (i + 1));
//            out.println("   istore"+args.get(i).getIndex() );
        }
        ArrayList<Statement> body = methodDeclaration.getBody();
        for (int i = 0; i < body.size(); i++)
            body.get(i).accept(this);

        if(!inMain)
            methodDeclaration.getReturnValue().accept(this);

        if(retSign.equals("V") || inMain)
            out.println("   return\n");
        else if(retSign.equals("I") || retSign.equals("Z"))
            out.println("   ireturn\n");
        else
            out.println("   areturn\n");

        out.println(".end method");

        SymbolTable.pop();
    }

    @Override
    public void visit(VarDeclaration varDeclaration) {
        Type varType = varDeclaration.getType();
        out.println(".field protected " + varDeclaration.getIdentifier().getName() + getTypeSign(varType));
    }

    @Override
    public void visit(ArrayCall arrayCall) {

    }

    @Override
    public void visit(BinaryExpression binaryExpression) {
        if(binaryExpression.getBinaryOperator().equals(BinaryOperator.add) ||
           binaryExpression.getBinaryOperator().equals(BinaryOperator.sub) ||
           binaryExpression.getBinaryOperator().equals(BinaryOperator.mult) ||
           binaryExpression.getBinaryOperator().equals(BinaryOperator.div)) {
            binaryExpression.getLeft().accept(this);
            binaryExpression.getRight().accept(this);
        }
        if(binaryExpression.getBinaryOperator().equals(BinaryOperator.add))
            out.println("   iadd");
        else if (binaryExpression.getBinaryOperator().equals(BinaryOperator.sub))
            out.println("   isub");
        else if (binaryExpression.getBinaryOperator().equals(BinaryOperator.mult))
            out.println("   imult");
        else if (binaryExpression.getBinaryOperator().equals(BinaryOperator.div))
            out.println("   idiv");
//        TODO
//        else if (binaryExpression.getBinaryOperator().equals(BinaryOperator.and)) {
//            out.println("   iand");
//        }
//        else if (binaryExpression.getBinaryOperator().equals(BinaryOperator.or)) {
//        }
//            out.println("   ior");
//        else if (binaryExpression.getBinaryOperator().equals(BinaryOperator.eq))
//            out.println("   i");
//        else if (binaryExpression.getBinaryOperator().equals(BinaryOperator.gt))
//            out.println("   i");

    }

    @Override
    public void visit(Identifier identifier) {
        int index = findIndexInSymTable(identifier, SymbolTable.top);
        out.println("   iload_"+index);

    }

    @Override
    public void visit(Length length) {

    }

    @Override
    public void visit(MethodCall methodCall) {

    }

    @Override
    public void visit(NewArray newArray) {

    }

    @Override
    public void visit(NewClass newClass) {

    }

    @Override
    public void visit(This instance) {

    }

    @Override
    public void visit(UnaryExpression unaryExpression) {
       unaryExpression.getValue().accept(this);
       if(unaryExpression.getUnaryOperator().equals(UnaryOperator.minus))
           out.println("    ineg");
       if(unaryExpression.getUnaryOperator().equals(UnaryOperator.not)) {
           out.println("    ifne not_notZero");
           out.println("    iconst_1");
           out.println("    goto not_end");
           out.println("not_notZero:");
           out.println("    iconst_0");
           out.println("not_end:");
       }
    }

    @Override
    public void visit(BooleanValue value) {

    }

    @Override
    public void visit(IntValue value) {
        if(value.getConstant() >= 0 && value.getConstant() <= 5)
            out.println("   iconst_" + value.getConstant());
        else
            out.println("   bipush " + value.getConstant());
    }

    @Override
    public void visit(StringValue value) {
        out.println("   ldc " + value.getConstant());
    }

    @Override
    public void visit(Assign assign) {

    }

    @Override
    public void visit(Block block) {

    }

    @Override
    public void visit(Conditional conditional) {

    }

    @Override
    public void visit(While loop) {

    }

    @Override
    public void visit(Write write) {
        out.println("   getstatic java/lang/System/out Ljava/io/PrintStream;");
        write.getArg().accept(this);
        Type argType = write.getArgType();
        if(argType.toString().equals(new IntType().toString()))
            out.println("   invokevirtual java/io/PrintStream/println(I)V");
        else if(argType.toString().equals(new StringType().toString()))
            out.println("   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        else if(argType.toString().equals(new ArrayType().toString())) {
            out.println("   invokestatic java/util/Arrays/toString([I)Ljava/lang/String;");
            out.println("   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        }
    }
}
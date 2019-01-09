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
    public static UserDefinedType currClassType = new UserDefinedType();
    public static HashMap<String, SymbolTable> classSymbolTables;
    private boolean inMain = false;
    private int labelCount = 1;


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
        if(varType instanceof ArrayType)
            result = result + "[I";
        else if(varType instanceof BooleanType)
            result += "Z";
        else if(varType instanceof IntType)
            result += "I";
        else if(varType instanceof StringType)
            result += "Ljava/lang/String;";
        else if(varType.isUserDefined())
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
        (inMainMethodCall.getExpr()).accept(this);
    }

    @Override
    public void visit(ClassDeclaration classDeclaration) {
        currClassType.setClassType(classDeclaration.getName().getName());
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
                out.println(".field protected " + vars.get(i).getIdentifier().getName() +" "+ getTypeSign(vars.get(i).getType()));
            out.println("; default constructor");
            out.println(".method public <init>()V");
            out.println("   .limit locals 500");
            out.println("   .limit stack 100" + '\n');
            out.println("   aload_0");
            out.println("   invokespecial java/lang/" + classDeclaration.getParentName().getName() + "/<init>()V\n");
            for(int i = 0; i < vars.size(); i++) {
                out.println("   aload 0");
                if(vars.get(i).getIdentifier().getType() instanceof IntType || vars.get(i).getIdentifier().getType() instanceof BooleanType) {
                    out.println("   iconst_0");
                }
                else if(vars.get(i).getIdentifier().getType() instanceof StringType){
                    out.println("   ldc ");
                }
                out.println("   putfield " + currClassType.getClassType() + "/" + vars.get(i).getIdentifier().getName() + " " + getTypeSign(vars.get(i).getIdentifier().getType()));
            }
            out.println("   return");
            out.println(".end method");
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
        out.println("   .limit locals 500");
        out.println("   .limit stack 100" + '\n');

        ArrayList<VarDeclaration> vars = methodDeclaration.getLocalVars();
        for(int i = 0; i<vars.size(); i++)
            vars.get(i).accept(this);
        ArrayList<Statement> body = methodDeclaration.getBody();
        for (int i = 0; i < body.size(); i++)
            body.get(i).accept(this);

        if(!inMain) {
            methodDeclaration.getReturnValue().accept(this);
        }

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
        try{
            SymbolTableVariableItemBase item = (SymbolTableVariableItemBase) SymbolTable.top.get(varDeclaration.getIdentifier().getName());
            if(!item.isField()){
                if(varDeclaration.getIdentifier().getType() instanceof IntType || varDeclaration.getIdentifier().getType() instanceof BooleanType) {
                    out.println("   iconst_0");
                    out.println("   istore " + item.getIndex());

                }
                else if(varDeclaration.getIdentifier().getType() instanceof StringType){
                    out.println("   ldc ");
                    out.println("   astore " + item.getIndex());
                }
            }
        }catch(ItemNotFoundException ex){
        }
    }

    @Override
    public void visit(ArrayCall arrayCall) {
        arrayCall.getInstance().accept(this);
        arrayCall.getIndex().accept(this);
        out.println("   iastore");
    }

    @Override
    public void visit(BinaryExpression binaryExpression) {
        if (binaryExpression.getBinaryOperator().equals(BinaryOperator.add) ||
                binaryExpression.getBinaryOperator().equals(BinaryOperator.sub) ||
                binaryExpression.getBinaryOperator().equals(BinaryOperator.mult) ||
                binaryExpression.getBinaryOperator().equals(BinaryOperator.div)) {
            binaryExpression.getRight().accept(this);
        }
        binaryExpression.getLeft().accept(this);
        if (binaryExpression.getBinaryOperator().equals(BinaryOperator.gt) ||
                binaryExpression.getBinaryOperator().equals(BinaryOperator.lt) ||
                binaryExpression.getBinaryOperator().equals(BinaryOperator.eq) ||
                binaryExpression.getBinaryOperator().equals(BinaryOperator.neq)) {
            binaryExpression.getRight().accept(this);
        }
        if (binaryExpression.getBinaryOperator().equals(BinaryOperator.add))
            out.println("   iadd");
        else if (binaryExpression.getBinaryOperator().equals(BinaryOperator.sub))
            out.println("   isub");
        else if (binaryExpression.getBinaryOperator().equals(BinaryOperator.mult))
            out.println("   imul");
        else if (binaryExpression.getBinaryOperator().equals(BinaryOperator.div))
            out.println("   idiv");
        else if (binaryExpression.getBinaryOperator().equals(BinaryOperator.and)) {
            int zeroLabel = labelCount++;
            int endLabel = labelCount++;
            out.println("   ifeq AND_ISZERO_" + zeroLabel);
            binaryExpression.getRight().accept(this);
            out.println("   ifeq AND_ISZERO_" + zeroLabel);
            out.println("   iconst_1");
            out.println("   goto AND_END_" + endLabel);
            out.println("AND_ISZERO_" + zeroLabel + ":");
            out.println("   iconst_0");
            out.println("AND_END_" + endLabel + ":");
        } else if (binaryExpression.getBinaryOperator().equals(BinaryOperator.or)) {
            int oneLabel = labelCount++;
            int endLabel = labelCount++;
            out.println("   ifne OR_ISONE_" + oneLabel);
            binaryExpression.getRight().accept(this);
            out.println("   ifne OR_ISONE_" + oneLabel);
            out.println("   iconst_0");
            out.println("   goto OR_END_" + endLabel);
            out.println("OR_ISONE_" + oneLabel + ":");
            out.println("   iconst_1");
            out.println("OR_END_" + endLabel + ":");
        } else if (binaryExpression.getBinaryOperator().equals(BinaryOperator.lt)) {
            out.println("   if_icmpge LT_FALSE_" + labelCount);
            out.println("   iconst_1");
            out.println("   goto LT_END_" + (labelCount + 1));
            out.println("LT_FALSE_" + labelCount + ":");
            labelCount++;
            out.println("   iconst_0");
            out.println("LT_END_" + labelCount + ":");
            labelCount++;
        } else if (binaryExpression.getBinaryOperator().equals(BinaryOperator.gt)) {
            out.println("   if_icmple GT_FALSE_" + labelCount);
            out.println("   iconst_1");
            out.println("   goto GT_END_" + (labelCount + 1));
            out.println("GT_FALSE_" + labelCount + ":");
            labelCount++;
            out.println("   iconst_0");
            out.println("GT_END_" + labelCount + ":");
            labelCount++;
        } else if (binaryExpression.getBinaryOperator().equals(BinaryOperator.eq)) {
            out.println("   if_icmpne EQ_FALSE_" + labelCount);
            out.println("   iconst_1");
            out.println("   goto EQ_END_" + (labelCount + 1));
            out.println("EQ_FALSE_" + labelCount + ":");
            labelCount++;
            out.println("   iconst_0");
            out.println("EQ_END_" + labelCount + ":");
            labelCount++;
        } else if (binaryExpression.getBinaryOperator().equals(BinaryOperator.neq)) {
            out.println("   if_icmpeq NEQ_FALSE_" + labelCount);
            out.println("   iconst_1");
            out.println("   goto NEQ_END_" + (labelCount + 1));
            out.println("NEQ_FALSE_" + labelCount + ":");
            labelCount++;
            out.println("   iconst_0");
            out.println("NEQ_END_" + labelCount + ":");
            labelCount++;
        }
        //TODO : assign in BinaryExpression
        else if(binaryExpression.getBinaryOperator().equals(BinaryOperator.assign)){
            Type lValType = binaryExpression.getLeft().getType();

            if(binaryExpression.getLeft() instanceof Identifier) {
                try {
                    binaryExpression.getRight().accept(this);
                    out.println("   dup");
                    SymbolTableVariableItemBase item = (SymbolTableVariableItemBase) SymbolTable.top.get(((Identifier) binaryExpression.getLeft()).getName());
                    Type rValType = binaryExpression.getRight().getType();
                    if (lValType instanceof IntType || lValType instanceof BooleanType)
                        out.println("   istore " + item.getIndex());
                    else
                        out.println("   astore " + item.getIndex());
                } catch (ItemNotFoundException ex) {}
            }
            else if(binaryExpression.getLeft() instanceof ArrayCall){
                try {
                    SymbolTableVariableItemBase item = (SymbolTableVariableItemBase) SymbolTable.top.get(((Identifier)(((ArrayCall)binaryExpression.getLeft()).getInstance())).getName());
                    Type rValType = binaryExpression.getRight().getType();
                    out.println("   aload " + item.getIndex());
                    (((ArrayCall)binaryExpression.getLeft()).getIndex()).accept(this);
                    binaryExpression.getRight().accept(this);
                    out.println("   dup_x2");
                    out.println("   iastore");
                }catch(ItemNotFoundException ex) {}
            }
        }

    }

    @Override
    public void visit(Identifier identifier) {

        try {
            SymbolTableVariableItemBase item = (SymbolTableVariableItemBase) SymbolTable.top.get(identifier.getName());
            if(!item.isField()) {
                if(identifier.getType() instanceof IntType || identifier.getType() instanceof BooleanType) {
                    out.println("   iload " + item.getIndex());
                }
                else {
                    out.println("   aload " + item.getIndex());
                }
            }
            else {
                out.println("   aload_0");
                out.println("   getfield " + currClassType.getClassType() + "/" + identifier.getName() + " " + getTypeSign(identifier.getType()));
            }
        }catch(ItemNotFoundException ex){
        }
    }

    @Override
    public void visit(Length length) {
        length.getExpression().accept(this);
        out.println("   arraylength");
    }

    @Override
    public void visit(MethodCall methodCall) {
        methodCall.getInstance().accept(this);
        ArrayList<Expression> methArgs= methodCall.getArgs();
        for(int i=0; i<methArgs.size(); ++i)
            methArgs.get(i).accept(this);
        try {
            SymbolTableMethodItem item;
            item = (SymbolTableMethodItem) classSymbolTables.get(methodCall.getInstance().getType().toString()).get(methodCall.getMethodName().getName() + "-methodDec");
            String argTypesSigns = "";
            ArrayList<Type> argTypes = item.getArgTypes();
            for (int i = 0; i < argTypes.size(); i++) {
                argTypesSigns += getTypeSign(argTypes.get(i));
            }
            out.println("   invokevirtual " + methodCall.getInstance().getType().toString() + "/" + methodCall.getMethodName().getName() + "(" + argTypesSigns + ")" + getTypeSign(item.getReturnType()));
        }catch (ItemNotFoundException ex){
            System.out.println(ex.toString());
        }
    }

    @Override
    public void visit(NewArray newArray) {
        int size = newArray.getSize();
        if(size <= 5 && size >= 0)
            out.println("   iconst_" + size);
        else
            out.println("   bipush " + size);
        out.println("   newarray int");
    }

    @Override
    public void visit(NewClass newClass) {
        out.println("   new " + newClass.getClassName().getName());
        out.println("   dup");
        out.println("   invokespecial " + newClass.getClassName().getName() + "/<init>()V");
    }

    @Override
    public void visit(This instance) {
        out.println("   aload_0");
    }

    @Override
    public void visit(UnaryExpression unaryExpression) {
       unaryExpression.getValue().accept(this);
       if(unaryExpression.getUnaryOperator().equals(UnaryOperator.minus))
           out.println("    ineg");
       if(unaryExpression.getUnaryOperator().equals(UnaryOperator.not)) {
           out.println("    ifne NOT_NOTZERO_"+labelCount);
           out.println("    iconst_1");
           out.println("    goto NOT_END_"+(labelCount+1) );
           out.println("NOT_NOTZERO_"+labelCount+":");
           labelCount ++;
           out.println("    iconst_0");
           out.println("NOT_END_"+labelCount+":");
           labelCount ++;
       }
    }

    @Override
    public void visit(BooleanValue value) {
        if(value.getConstant())
            out.println("   iconst_" + 1);
        else
            out.println("   iconst_" + 0);

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
        Type lValType = assign.getlValue().getType();

        if(assign.getlValue() instanceof Identifier) {
            try {
                SymbolTableVariableItemBase item = (SymbolTableVariableItemBase) SymbolTable.top.get(((Identifier) assign.getlValue()).getName());
                if(item.isField())
                    out.println("   aload_0");
                assign.getrValue().accept(this);
                Type rValType = assign.getrValue().getType();
                if(item.isField())
                    out.println("   putfield "+currClassType.getClassType()+"/"+((Identifier) assign.getlValue()).getName()+" "+getTypeSign(lValType));
                else if ((lValType instanceof IntType) || (lValType instanceof BooleanType))
                    out.println("   istore " + item.getIndex());
                else
                    out.println("   astore " + item.getIndex());
            } catch (ItemNotFoundException ex) {}
        }
        else if(assign.getlValue() instanceof ArrayCall){
            try {
                SymbolTableVariableItemBase item = (SymbolTableVariableItemBase) SymbolTable.top.get(((Identifier)(((ArrayCall)assign.getlValue()).getInstance())).getName());
                Type rValType = assign.getrValue().getType();
                out.println("   aload " + item.getIndex());
                (((ArrayCall)assign.getlValue()).getIndex()).accept(this);
                assign.getrValue().accept(this);
                out.println("   iastore");
            }catch(ItemNotFoundException ex) {}
        }

    }

    @Override
    public void visit(Block block) {
        int size = block.getBody().size();
        ArrayList<Statement> body= block.getBody();
        for(int i=0; i<size; i++)
            body.get(i).accept(this);
    }

    @Override
    public void visit(Conditional conditional) {

        conditional.getExpression().accept(this);
        int elseLabel = labelCount ++;
        int endLabel = labelCount ++;
        out.println("   ifeq COND_ELSE_" + elseLabel);
        conditional.getConsequenceBody().accept(this);
        out.println("   goto COND_END_" + endLabel);
        out.println("COND_ELSE_" + elseLabel + ":");
        conditional.getAlternativeBody().accept(this);
        out.println("COND_END_" + endLabel + ":");
    }

    @Override
    public void visit(While loop) {
        out.println("WHILE_START_" + labelCount + ":");
        labelCount ++;
        loop.getCondition().accept(this);
        out.println("   ifeq WHILE_END_" + labelCount);
        loop.getBody().accept(this);
        out.println("   goto WHILE_START_" + (labelCount - 1) + ":");
        out.println("WHILE_END_" + labelCount+":");
        labelCount ++;
    }

    @Override
    public void visit(Write write) {
        out.println("   getstatic java/lang/System/out Ljava/io/PrintStream;");
        write.getArg().accept(this);
        Type argType = write.getArgType();
        if(argType instanceof IntType)
            out.println("   invokevirtual java/io/PrintStream/println(I)V");
        else if(argType instanceof StringType)
            out.println("   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        else if(argType instanceof ArrayType) {
            out.println("   invokestatic java/util/Arrays/toString([I)Ljava/lang/String;");
            out.println("   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        }
    }
}
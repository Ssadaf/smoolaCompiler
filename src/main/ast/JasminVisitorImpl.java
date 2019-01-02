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
import symbolTable.SymbolTable;
import symbolTable.SymbolTableVariableItemBase;
import symbolTable.SymbolTableClassItem;
import symbolTable.SymbolTableMethodItem;
import symbolTable.ItemAlreadyExistsException;
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

    private String outputPath = "../../../output/";
    PrintWriter out;

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
        return result;
    }

    @Override
    public void visit(Program program) {

        ClassDeclaration mainClass = program.getMainClass();
        if(mainClass != null)
            mainClass.accept(this);

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

        try {
            out = new PrintWriter(outputPath + classDeclaration.getName().getName() + ".j");
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
        }catch(Exception ex){

        }


    }

    @Override
    public void visit(MethodDeclaration methodDeclaration) {
        String argTypesSigns = "";
        ArrayList<VarDeclaration> args = methodDeclaration.getArgs();
        for(int i = 0; i < args.size(); i++){
            argTypesSigns += getTypeSign(args.get(i).getType());
        }
        String retSign = getTypeSign(methodDeclaration.getReturnType());
        out.println(".method public " + methodDeclaration.getName().getName() + "(" + argTypesSigns + ")" + retSign + "\n");
        out.println("   .limit locals 1000");
        out.println("   .limit stack 1000" + '\n');



        ArrayList<Statement> body = methodDeclaration.getBody();
        for(int i = 0; i < body.size(); i++)
            body.get(i).accept(this);

        out.println(".end method");
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

    }

    @Override
    public void visit(Identifier identifier) {

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

    }

    @Override
    public void visit(BooleanValue value) {

    }

    @Override
    public void visit(IntValue value) {

    }

    @Override
    public void visit(StringValue value) {
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

    }
}
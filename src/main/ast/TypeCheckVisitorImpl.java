package ast;

import ast.Type.ArrayType.ArrayType;
import ast.Type.NoType;
import ast.Type.PrimitiveType.BooleanType;
import ast.Type.PrimitiveType.IntType;
import ast.Type.PrimitiveType.StringType;
import ast.Type.Type;
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
//import sun.jvm.hotspot.debugger.cdbg.Sym;
import symbolTable.ItemAlreadyExistsException;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableClassItem;
import symbolTable.SymbolTableMethodItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class TypeCheckVisitorImpl implements Visitor{
    private boolean hasError = false;
    private HashMap<String, ClassDeclaration> classDecs;
    private UserDefinedType currClassType = new UserDefinedType();
    private HashMap<String, SymbolTable> methodSymbolTables, classSymbolTables;

    @Override
    public void visit(MethodCallInMain methodCallInMain) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Program program) {
        classDecs = program.getClassDecs();
        methodSymbolTables = program.getMethodSymbolTables();
        classSymbolTables  = program.getClassSymbolTables();



        ClassDeclaration mainClass = program.getMainClass();
        if(mainClass != null){
            mainClass.accept(this);
        }
        List<ClassDeclaration> classes = program.getClasses();
        if(classes != null)
        {
            for (int i = 0; i < classes.size(); i++)
                classes.get(i).accept(this);
        }
        SymbolTable.pop();
    }

    @Override
    public void visit(ClassDeclaration classDeclaration) {
        currClassType.setClassDeclaration(classDeclaration);

        SymbolTable.push(classSymbolTables.get(classDeclaration.getName().getName()));
        //System.out.println("pushing symb table" + classDeclaration.getName().getName());
        //classDeclaration.getName().accept(this);
        Identifier parent = classDeclaration.getParentName();
        if(parent != null && parent.getName() != "Object")
            if(!SymbolTable.top.hasItem(parent.getName() + "-classDec"))
                System.out.println("Line:" + classDeclaration.getLine() + ":class "+parent.getName() + " is not declared");

        ArrayList<VarDeclaration> vars = classDeclaration.getVarDeclarations();
        for(int i = 0; i < vars.size(); i++)
            vars.get(i).accept(this);

        ArrayList<MethodDeclaration> meths = classDeclaration.getMethodDeclarations();
        for(int i = 0; i < meths.size(); i++)
            meths.get(i).accept(this);
        SymbolTable.pop();

    }

    @Override
    public void visit(MethodDeclaration methodDeclaration) {
        ArrayList<VarDeclaration> args = methodDeclaration.getArgs();

//       System.out.println("pushing symb table" + methodDeclaration.getName().getName() + "@" + methodDeclaration.getClassName());

        SymbolTable.push(methodSymbolTables.get(methodDeclaration.getName().getName() + "@" + methodDeclaration.getClassName()));

//        for (String key: methodSymbolTables.keySet()) {
//            System.out.println("--- "+ key);
//        }

        ArrayList<Type> argTypes = new ArrayList<Type>();
        for(int i = 0; i < args.size(); ++i)
            argTypes.add(args.get(i).getType());

        //methodDeclaration.getName().accept(this);
        for(int i = 0; i < args.size(); i++)
            args.get(i).accept(this);

        ArrayList<VarDeclaration> localVars = methodDeclaration.getLocalVars();
        for(int i = 0; i < localVars.size(); i++)
            localVars.get(i).accept(this);

        ArrayList<Statement> body = methodDeclaration.getBody();
        for(int i = 0; i < body.size(); i++)
            body.get(i).accept(this);

        methodDeclaration.getReturnValue().accept(this);
        SymbolTable.pop();
    }

    @Override
    public void visit(VarDeclaration varDeclaration) {

        if(varDeclaration.getType().isUserDefined()) {

            UserDefinedType varType = (UserDefinedType) varDeclaration.getType();

            if(classDecs.containsKey(varType.getClassType()))
                varType.setClassDeclaration(classDecs.get(varType.getClassType()));
            else
                System.out.println("Line:" + varDeclaration.getLine() + ":class " + varType.getClassType() + " is not declared" );
        }
        //varDeclaration.getIdentifier().accept(this);
    }

    @Override
    public void visit(ArrayCall arrayCall) {
        arrayCall.getInstance().accept(this);
        arrayCall.getIndex().accept(this);
    }

    @Override
    public void visit(BinaryExpression binaryExpression) {
        binaryExpression.getLeft().accept(this);

        if( binaryExpression.getRight() == null )
            return;
        binaryExpression.getRight().accept(this);
    }

    @Override
    public void visit(Identifier identifier) {
        SymbolTable currSymbolTable = SymbolTable.top;
//        currSymbolTable.printAllSymbolTableItems();
        if(!currSymbolTable.hasItem(identifier.getName() )) {
            System.out.println("Line:" + identifier.getLine() + ":variable " + identifier.getName() + " is not declared");
        }
    }

    @Override
    public void visit(Length length) {
        length.getExpression().accept(this);
    }

    @Override
    public void visit(MethodCall methodCall) {
        methodCall.getInstance().accept(this);

        methodCall.getMethodName().accept(this);

        ArrayList<Expression> args = methodCall.getArgs();
        for(int i = 0; i < args.size(); i++)
            args.get(i).accept(this);
    }

    @Override
    public void visit(NewArray newArray) {
        Type expressionType = newArray.getExpression().typeCheck(SymbolTable.top);
        if(! expressionType.toString().equals(new IntType().toString()) && !expressionType.toString().equals(new NoType().toString()) )
            System.out.println("Line:" + newArray.getLine() +":New Array expression type must be integer");

    }

    @Override
    public void visit(NewClass newClass) {
        if(!SymbolTable.top.hasItem(newClass.getClassName().getName() + "-classDec"))
            System.out.println("Line:" + newClass.getLine() + ":class "+newClass.getClassName().getName() + " is not declared");
    }

    @Override
    public void visit(This instance) {
        ////check later
    }

    @Override
    public void visit(UnaryExpression unaryExpression) {
        unaryExpression.getValue().accept(this);
        unaryExpression.typeCheck(SymbolTable.top);
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
        assign.getlValue().accept(this);

        assign.getrValue().accept(this);
    }

    @Override
    public void visit(Block block) {
        ArrayList<Statement> body = block.getBody();
        for(int i = 0; i < body.size(); i++)
            body.get(i).accept(this);
    }

    @Override
    public void visit(Conditional conditional) {
        conditional.getExpression().accept(this);

        Type expressionType = conditional.getExpression().typeCheck(SymbolTable.top);
        if(! expressionType.toString().equals(new BooleanType().toString()) && !expressionType.toString().equals(new NoType().toString()) )
            System.out.println("Line:" + conditional.getLine() +":condition type must be boolean");


        conditional.getConsequenceBody().accept(this);

        conditional.getAlternativeBody().accept(this);
    }

    @Override
    public void visit(While loop) {
        loop.getCondition().accept(this);

        Type conditionType = loop.getCondition().typeCheck(SymbolTable.top);
        if(! conditionType.toString().equals(new BooleanType().toString()) && !conditionType.toString().equals(new NoType().toString()) )
            System.out.println("Line:" + loop.getLine() +":condition type must be boolean");

        loop.getBody().accept(this);
    }

    @Override
    public void visit(Write write) {
        write.getArg().accept(this);

        Type writeArgType = write.getArg().typeCheck(SymbolTable.top);
        if(!writeArgType.toString().equals(new IntType().toString()) && !writeArgType.toString().equals(new StringType().toString()) && !writeArgType.toString().equals(new ArrayType().toString()) && !writeArgType.toString().equals(new NoType().toString()))
            System.out.println("Line:" + write.getLine() +":unsupported type for writeln");
    }

}
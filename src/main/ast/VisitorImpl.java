package ast;

import ast.Type.PrimitiveType.IntType;
import ast.node.Node;
import ast.node.Program;
import ast.node.declaration.ClassDeclaration;
import ast.node.declaration.MethodDeclaration;
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
import symbolTable.ItemNotFoundException;
import ast.Type.*;

import java.util.List;
import java.util.ArrayList;


public class VisitorImpl implements Visitor {


    @Override
    public void visit(Program program) {
        output.add(program.toString());
        SymbolTable currSymTable = new SymbolTable();
        SymbolTable.push(currSymTable);
        if((program.getMainClass() == null) && (program.getClasses().size() == 0) )
            System.out.println("No class exists in the program");
        ClassDeclaration mainClass = program.getMainClass();
        if(mainClass != null)
            mainClass.accept(this);
        List <ClassDeclaration> classes = program.getClasses();
        if(classes != null)
        {
            for (int i = 0; i < classes.size(); i++)
                classes.get(i).accept(this);
        }
        if(errors.size() == 0)
        {
            for(int i = 0; i < output.size(); i++)
                System.out.println(output.get(i));
        }
//        SymbolTable.pop();
    }

    @Override
    public void visit(ClassDeclaration classDeclaration) {
        output.add(classDeclaration.toString());
        SymbolTableClassItem currClass;
        try{
            currClass = new SymbolTableClassItem(classDeclaration.getName().getName());
            SymbolTable.top.put(currClass);
        }catch(ItemAlreadyExistsException err){
            int num = 1;
            System.out.println("Line:" +classDeclaration.getLine() + ":Redefinition of class " + classDeclaration.getName().getName());
            errors.add("Error");
            while(true){
                try{
                    currClass = new SymbolTableClassItem("Temporary-" + classDeclaration.getName().getName() + num );
                    SymbolTable.top.put(currClass);
                }catch(ItemAlreadyExistsException secErr){num++; continue;}
                break;
            }
        }
        SymbolTable currSymbolTable = new SymbolTable(SymbolTable.top);
        SymbolTable.push(currSymbolTable);

        classDeclaration.getName().accept(this);
        Identifier parent = classDeclaration.getParentName();
        if(parent != null)
            parent.accept(this);
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
        output.add(methodDeclaration.toString());

        SymbolTableMethodItem currMethod;

        ArrayList<VarDeclaration> args = methodDeclaration.getArgs();
        ArrayList<Type> argTypes = new ArrayList<Type>();
        for(int i = 0; i < args.size(); ++i){
            argTypes.add(args.get(i).getType());
        }
        try{
            currMethod = new SymbolTableMethodItem(methodDeclaration.getName().getName(), argTypes);
            SymbolTable.top.put(currMethod);
        }catch (ItemAlreadyExistsException err){
            int num =1;
            System.out.println("Line:" +methodDeclaration.getLine() + ":Redefinition of method " + methodDeclaration.getName().getName());
            errors.add("Error");

            while(true) {
                try {
                    currMethod = new SymbolTableMethodItem(("Temporary-" + methodDeclaration.getName().getName() + num), argTypes);
                    SymbolTable.top.put(currMethod);
                } catch (ItemAlreadyExistsException secErr) {num++; continue;}
                break;
            }
        }
        SymbolTable currSymbolTable = new SymbolTable(SymbolTable.top);
        SymbolTable.push(currSymbolTable);

        methodDeclaration.getName().accept(this);
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
        output.add(varDeclaration.toString());
        //TODO: implement appropriate visit functionality
        SymbolTableClassItem currVar;
        try{
            currVar = new SymbolTableClassItem(varDeclaration.getIdentifier().getName());
            SymbolTable.top.put(currVar);
        }catch(ItemAlreadyExistsException err){
            int num = 1;
            System.out.println("Line:" + varDeclaration.getLine() + ":Redefinition of variable " + varDeclaration.getIdentifier().getName());
            errors.add("Error");
            while(true){
                try{
                    currVar = new SymbolTableClassItem("Temporary-" + varDeclaration.getIdentifier().getName() + num );
                    SymbolTable.top.put(currVar);
                }catch(ItemAlreadyExistsException secErr){num++; continue;}
                break;
            }
        }
        varDeclaration.getIdentifier().accept(this);
    }

    @Override
    public void visit(ArrayCall arrayCall) {
        output.add(arrayCall.toString());
        //TODO: implement appropriate visit functionality
        arrayCall.getInstance().accept(this);
        arrayCall.getIndex().accept(this);
    }

    @Override
    public void visit(BinaryExpression binaryExpression) {
        if( binaryExpression.getRight() == null )
            return;
        output.add(binaryExpression.toString());
        //TODO: implement appropriate visit functionality
        binaryExpression.getLeft().accept(this);
        binaryExpression.getRight().accept(this);
    }

    @Override
    public void visit(Identifier identifier) {
        //TODO: implement appropriate visit functionality
        output.add(identifier.toString());
    }

    @Override
    public void visit(Length length) {
        output.add(length.toString());
        //TODO: implement appropriate visit functionality
        length.getExpression().accept(this);
    }

    @Override
    public void visit(MethodCall methodCall) {
        output.add(methodCall.toString());
        //TODO: implement appropriate visit functionality
        methodCall.getInstance().accept(this);
        methodCall.getMethodName().accept(this);
        ArrayList<Expression> args = methodCall.getArgs();
        for(int i = 0; i < args.size(); i++)
            args.get(i).accept(this);
    }

    @Override
    public void visit(NewArray newArray) {
        output.add(newArray.toString());
        //TODO: implement appropriate visit functionality
        IntValue index = (IntValue)newArray.getExpression();
        int const_index = index.getConstant();
        if(const_index <= 0)
        {
            System.out.println("Line:" + newArray.getLine() + ":Array length should not be zero or negative");
            newArray.setExpression(new IntValue(0, new IntType()));
        }
        newArray.getExpression().accept(this);
    }

    @Override
    public void visit(NewClass newClass) {
        output.add(newClass.toString());
        //TODO: implement appropriate visit functionality
        newClass.getClassName().accept(this);
    }

    @Override
    public void visit(This instance) {
        //TODO: implement appropriate visit functionality
        output.add(instance.toString());
    }

    @Override
    public void visit(UnaryExpression unaryExpression) {
        output.add(unaryExpression.toString());
        //TODO: implement appropriate visit functionality
        unaryExpression.getValue().accept(this);
    }

    @Override
    public void visit(BooleanValue value) {
        //TODO: implement appropriate visit functionality
        output.add(value.toString());
    }

    @Override
    public void visit(IntValue value) {
        //TODO: implement appropriate visit functionality
        output.add(value.toString());
    }

    @Override
    public void visit(StringValue value) {
        //TODO: implement appropriate visit functionality
        output.add(value.toString());
    }

    @Override
    public void visit(Assign assign) {
        output.add(assign.toString());
        //TODO: implement appropriate visit functionality
        assign.getlValue().accept(this);
        assign.getrValue().accept(this);
    }

    @Override
    public void visit(Block block) {
        output.add(block.toString());
        //TODO: implement appropriate visit functionality
        ArrayList<Statement> body = block.getBody();
        for(int i = 0; i < body.size(); i++)
            body.get(i).accept(this);
    }

    @Override
    public void visit(Conditional conditional) {
        output.add(conditional.toString());
        //TODO: implement appropriate visit functionality
        conditional.getExpression().accept(this);
        conditional.getConsequenceBody().accept(this);
        conditional.getAlternativeBody().accept(this);
    }

    @Override
    public void visit(While loop) {
        output.add(loop.toString());
        //TODO: implement appropriate visit functionality
        loop.getCondition().accept(this);
        loop.getBody().accept(this);
    }

    @Override
    public void visit(Write write) {
        output.add(write.toString());
        //TODO: implement appropriate visit functionality
        write.getArg().accept(this);
    }
}
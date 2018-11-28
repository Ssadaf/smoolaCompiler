package ast;

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

import java.util.List;
import java.util.ArrayList;

public class VisitorImpl implements Visitor {

    @Override
    public void visit(Program program) {
        if((program.getMainClass() == null) && (program.getClasses().size() == 0) )
            System.out.println("No class exists in the program");
        program.getMainClass().accept(this);
        List <ClassDeclaration> classes = program.getClasses();
        if(classes != null)
        {
            for (int i = 0; i < classes.size(); i++)
                classes.get(i).accept(this);
        }
        output.add(program.toString());
    }

    @Override
    public void visit(ClassDeclaration classDeclaration) {
        ArrayList<VarDeclaration> vars = classDeclaration.getVarDeclarations();
        for(int i = 0; i < vars.size(); i++)
            vars.get(i).accept(this);
        ArrayList<MethodDeclaration> meths = classDeclaration.getMethodDeclarations();
        for(int i = 0; i < meths.size(); i++)
            meths.get(i).accept(this);
        classDeclaration.getName().accept(this);
        Identifier parent = classDeclaration.getParentName();
        if(parent != null)
            parent.accept(this);
        output.add(classDeclaration.toString());
    }

    @Override
    public void visit(MethodDeclaration methodDeclaration) {
        //TODO: implement appropriate visit functionality
        methodDeclaration.getReturnValue().accept(this);
        methodDeclaration.getName().accept(this);
        ArrayList<VarDeclaration> args = methodDeclaration.getArgs();
        for(int i = 0; i < args.size(); i++)
            args.get(i).accept(this);
        ArrayList<Statement> body = methodDeclaration.getBody();
        for(int i = 0; i < body.size(); i++)
            body.get(i).accept(this);
        ArrayList<VarDeclaration> localVars = methodDeclaration.getLocalVars();
        for(int i = 0; i < localVars.size(); i++)
            localVars.get(i).accept(this);
        output.add(methodDeclaration.toString());

    }

    @Override
    public void visit(VarDeclaration varDeclaration) {
        //TODO: implement appropriate visit functionality
        varDeclaration.getIdentifier().accept(this);
        output.add(varDeclaration.toString());
    }

    @Override
    public void visit(ArrayCall arrayCall) {
        //TODO: implement appropriate visit functionality
        arrayCall.getInstance().accept(this);
        arrayCall.getIndex().accept(this);
        output.add(arrayCall.toString());
    }

    @Override
    public void visit(BinaryExpression binaryExpression) {
        //TODO: implement appropriate visit functionality
        binaryExpression.getLeft().accept(this);
        binaryExpression.getRight().accept(this);
        output.add(binaryExpression.toString());
    }

    @Override
    public void visit(Identifier identifier) {
        //TODO: implement appropriate visit functionality
        output.add(identifier.toString());
    }

    @Override
    public void visit(Length length) {
        //TODO: implement appropriate visit functionality
        length.getExpression().accept(this);
        output.add(length.toString());
    }

    @Override
    public void visit(MethodCall methodCall) {
        //TODO: implement appropriate visit functionality
        methodCall.getInstance().accept(this);
        methodCall.getMethodName().accept(this);
        ArrayList<Expression> args = methodCall.getArgs();
        for(int i = 0; i < args.size(); i++)
            args.get(i).accept(this);
        output.add(methodCall.toString());
    }

    @Override
    public void visit(NewArray newArray) {
        //TODO: implement appropriate visit functionality
        newArray.getExpression().accept(this);
        output.add(newArray.toString());
    }

    @Override
    public void visit(NewClass newClass) {
        //TODO: implement appropriate visit functionality
        newClass.getClassName().accept(this);
        output.add(newClass.toString());
    }

    @Override
    public void visit(This instance) {
        //TODO: implement appropriate visit functionality
        output.add(instance.toString());
    }

    @Override
    public void visit(UnaryExpression unaryExpression) {
        //TODO: implement appropriate visit functionality
        unaryExpression.getValue().accept(this);
        output.add(unaryExpression.toString());
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
        //TODO: implement appropriate visit functionality
        assign.getlValue().accept(this);
        assign.getrValue().accept(this);
        output.add(assign.toString());
    }

    @Override
    public void visit(Block block) {
        //TODO: implement appropriate visit functionality
        ArrayList<Statement> body = block.getBody();
        for(int i = 0; i < body.size(); i++)
            body.get(i).accept(this);
        output.add(block.toString());
    }

    @Override
    public void visit(Conditional conditional) {
        //TODO: implement appropriate visit functionality
        conditional.getExpression().accept(this);
        conditional.getConsequenceBody().accept(this);
        conditional.getAlternativeBody().accept(this);
        output.add(conditional.toString());
    }

    @Override
    public void visit(While loop) {
        //TODO: implement appropriate visit functionality
        loop.getCondition().accept(this);
        loop.getBody().accept(this);
        output.add(loop.toString());
    }

    @Override
    public void visit(Write write) {
        //TODO: implement appropriate visit functionality
        write.getArg().accept(this);
        output.add(write.toString());
    }
}
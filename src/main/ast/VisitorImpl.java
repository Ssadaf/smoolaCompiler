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
        output.add(program.toString());
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
        for(int i = 0; i < output.size(); i++)
            System.out.println(output.get(i));
    }

    @Override
    public void visit(ClassDeclaration classDeclaration) {
        output.add(classDeclaration.toString());
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
    }

    @Override
    public void visit(MethodDeclaration methodDeclaration) {
        //TODO: implement appropriate visit functionality
        output.add(methodDeclaration.toString());
        methodDeclaration.getName().accept(this);
        ArrayList<VarDeclaration> args = methodDeclaration.getArgs();
        for(int i = 0; i < args.size(); i++)
            args.get(i).accept(this);
        ArrayList<VarDeclaration> localVars = methodDeclaration.getLocalVars();
        for(int i = 0; i < localVars.size(); i++)
            localVars.get(i).accept(this);
        ArrayList<Statement> body = methodDeclaration.getBody();
        for(int i = 0; i < body.size(); i++)
            body.get(i).accept(this);
        methodDeclaration.getReturnValue().accept(this);
    }

    @Override
    public void visit(VarDeclaration varDeclaration) {
        output.add(varDeclaration.toString());
        //TODO: implement appropriate visit functionality
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
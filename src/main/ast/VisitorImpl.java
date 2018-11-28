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

public class VisitorImpl implements Visitor {

    @Override
    public void visit(Program program) {
        if((program.getMainClass() == null) && (program.getClasses.size() == 0) )
            System.out.println("No class exists in the program");
        program.getMainClass().accept(this);
        List <ClassDeclaration> classes = program.getClasses();
        for (int i = 0; i < classes.size(); i++)
            classes[i].accept(this);
        output.add(program.toString());
    }

    @Override
    public void visit(ClassDeclaration classDeclaration) {
        Identifier name = classDeclaration.getName();
        Identifier parent = classDeclaration.getParentName();
        ArrayList<VarDeclaration> vars = classDeclaration.getVarDeclarations();
        for(int i = 0; i < vars.size(); i++)
            vars[i].accept(this);
        ArrayList<MethodDeclaration> meths = classDeclaration.getMethodDeclarations();
        for(int i = 0; i < meths.size(); i++)
            meths[i].accept(this);
    }

    @Override
    public void visit(MethodDeclaration methodDeclaration) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(VarDeclaration varDeclaration) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(ArrayCall arrayCall) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(BinaryExpression binaryExpression) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Identifier identifier) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Length length) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(MethodCall methodCall) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(NewArray newArray) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(NewClass newClass) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(This instance) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(UnaryExpression unaryExpression) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(BooleanValue value) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(IntValue value) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(StringValue value) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Assign assign) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Block block) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Conditional conditional) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(While loop) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Write write) {
        //TODO: implement appropriate visit functionality
    }
}

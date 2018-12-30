package ast;

import ast.Type.PrimitiveType.IntType;
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

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


public class JasminVisitor implements Visitor {

    @Override
    public void visit(InMainMethodCall inMainMethodCall) {

    }

    @Override
    public void visit(Program program) {

    }

    @Override
    public void visit(ClassDeclaration classDeclaration) {

    }

    @Override
    public void visit(MethodDeclaration methodDeclaration) {

    }

    @Override
    public void visit(VarDeclaration varDeclaration) {

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
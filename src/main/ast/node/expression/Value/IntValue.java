package ast.node.expression.Value;

import ast.Type.PrimitiveType.IntType;
import ast.Type.Type;
import ast.Visitor;
import symbolTable.SymbolTable;

public class IntValue extends Value {
    private int constant;

    public IntValue(int constant, Type type) {
        this.constant = constant;
        this.type = type;
    }

    public int getConstant() {
        return constant;
    }

    public void setConstant(int constant) {
        this.constant = constant;
    }

    @Override
    public String toString() {
        return "IntValue " + constant;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Type typeCheck(SymbolTable symbolTable){ return new IntType(); }
}

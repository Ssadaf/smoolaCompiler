package ast.node.expression.Value;

import ast.Type.PrimitiveType.BooleanType;
import ast.Type.Type;
import ast.Visitor;
import symbolTable.SymbolTable;

public class BooleanValue extends Value {
    private boolean constant;

    public BooleanValue(boolean constant, Type type) {
        this.constant = constant;
        this.type = type;
    }

    public boolean getConstant() {
        return constant;
    }

    public void setConstant(boolean constant) {
        this.constant = constant;
    }

    @Override
    public String toString() {
        return "BooleanValue " + constant;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Type typeCheck(SymbolTable symbolTable){ return new BooleanType(); }
}

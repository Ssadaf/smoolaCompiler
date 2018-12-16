package ast.node.expression.Value;

import ast.Type.PrimitiveType.StringType;
import ast.Type.Type;
import ast.Visitor;
import symbolTable.SymbolTable;

public class StringValue extends Value {
    private String constant;

    public StringValue(String constant, Type type) {
        this.constant = constant;
        this.type = type;
    }

    public String getConstant() {
        return constant;
    }

    public void setConstant(String constant) {
        this.constant = constant;
    }

    @Override
    public String toString() {
        return "StringValue " + constant;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Type typeCheck(SymbolTable symbolTable){ return new StringType(); }
}

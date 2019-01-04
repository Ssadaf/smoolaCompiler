package ast.node.statement;

import ast.Type.Type;
import ast.Visitor;
import ast.node.expression.Expression;

public class Write extends Statement {
    private Expression arg;
    private Type argType;

    public Write(Expression arg) {
        this.arg = arg;
    }

    public Expression getArg() {
        return arg;
    }

    public void setArgType(Type argType) {
        this.argType = argType;
    }

    public Type getArgType(){
        return argType;
    }

    public void setArg(Expression arg) {
        this.arg = arg;
    }

    @Override
    public String toString() {
        return "Write";
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

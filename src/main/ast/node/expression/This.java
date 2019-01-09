package ast.node.expression;

import ast.Type.Type;
import ast.TypeCheckVisitorImpl;
import ast.Visitor;
import symbolTable.SymbolTable;

public class This extends Expression {
    Type thisType;

    public void setThisType(Type thisType){
        this.thisType = thisType;
    }

    public Type getThisType(){
        return thisType;
    }
    @Override
    public String toString() {
        return "This";
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Type typeCheck(SymbolTable symTable) {
        Type ret = TypeCheckVisitorImpl.currClassType;
        this.setType(ret);
        return ret;
    }
}

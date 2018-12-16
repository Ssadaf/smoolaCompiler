package ast.node.expression;

import ast.Type.NoType;
import ast.Type.Type;
import ast.Visitor;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableVariableItemBase;

public class Identifier extends Expression {
    private String name;

    public Identifier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Identifier " + name;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Type typeCheck(SymbolTable symTable) {
        if(symTable.hasItem(name))
            return ((SymbolTableVariableItemBase)symTable.getInCurrentScope(name)).getType();
        else
            return new NoType();
    }
}

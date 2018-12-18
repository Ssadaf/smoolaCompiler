package ast.Type;

import symbolTable.SymbolTable;

public class NoType extends Type{
    @Override
    public String toString() {
        return "NoType";
    }

    @Override
    public boolean isUserDefined() {return false;}

    @Override
    public Type typeCheck(SymbolTable symTable) {
        return this;
    }
}

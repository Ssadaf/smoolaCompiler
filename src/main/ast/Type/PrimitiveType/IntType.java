package ast.Type.PrimitiveType;

import ast.Type.Type;
import symbolTable.SymbolTable;

public class IntType extends Type {
    @Override
    public String toString() {
        return "int";
    }

    @Override
    public boolean isUserDefined() {return false;}

    @Override
    public Type typeCheck(SymbolTable symTable) {
        return this;
    }
}

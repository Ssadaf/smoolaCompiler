package ast.Type.PrimitiveType;

import ast.Type.Type;
import symbolTable.SymbolTable;

public class StringType extends Type {

    @Override
    public String toString() {
        return "string";
    }

    @Override
    public boolean isUserDefined() {return false;}

    @Override
    public Type typeCheck(SymbolTable symTable) {
        return this;
    }
}

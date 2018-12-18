package ast.Type;

import ast.Type.ArrayType.ArrayType;
import ast.Type.PrimitiveType.IntType;
import symbolTable.SymbolTable;

public abstract class Type {
    public abstract String toString();

    public abstract boolean isUserDefined();

    public Type typeCheck(SymbolTable symTable){return new NoType();}
}

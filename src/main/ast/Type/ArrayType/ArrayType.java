package ast.Type.ArrayType;

import ast.Type.NoType;
import ast.Type.PrimitiveType.IntType;
import ast.Type.Type;
import ast.Type.TypeError;
import symbolTable.SymbolTable;

public class ArrayType extends Type {
    private int size;
    @Override
    public String toString() {
        return "int[]";
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean isUserDefined() {return false;}

    @Override
    public Type typeCheck(SymbolTable symTable) {
        return this;
    }
}

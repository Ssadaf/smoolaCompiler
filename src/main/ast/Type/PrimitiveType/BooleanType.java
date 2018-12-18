package ast.Type.PrimitiveType;

import ast.Type.Type;
import symbolTable.SymbolTable;

public class BooleanType extends Type {

    @Override
    public String toString() {
        return "bool";
    }

    @Override
    public boolean isUserDefined() {return false;}

    @Override
    public Type typeCheck(SymbolTable symTable) {
        return this;
    }}

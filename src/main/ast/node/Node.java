package ast.node;

import ast.Type.NoType;
import ast.Type.Type;
import ast.Type.TypeError;
import ast.Visitor;
import symbolTable.SymbolTable;

public abstract class Node {
    int line;
    public void accept(Visitor visitor) {}
    public void setLine(int l){line = l;}
    public int getLine(){return line;}
    public Type typeCheck(SymbolTable symTable) throws TypeError { return new NoType(); }
}

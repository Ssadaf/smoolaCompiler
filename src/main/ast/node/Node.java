package ast.node;

import ast.Visitor;

public abstract class Node {
    int line;
    public void accept(Visitor visitor) {}
    public void setLine(int l){line = l;}
    public int getLine(){return line;}
}

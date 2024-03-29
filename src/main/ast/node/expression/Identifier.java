package ast.node.expression;

import ast.Type.NoType;
import ast.Type.Type;
import ast.Type.TypeError;
import ast.TypeCheckVisitorImpl;
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
        try {
            if (!symTable.hasItem(this.getName())) {
                throw new TypeError("Line:" + this.getLine() + ":variable " + this.getName() + " is not declared");
            }
            Type retType = ((SymbolTableVariableItemBase) symTable.getInCurrentScope(name)).getType();
            this.setType(retType);
            return retType;
        }
        catch (TypeError err) {
            TypeCheckVisitorImpl.hasTypeError = true;
            System.out.println(err.getMessage());
            return new NoType();
        }
    }
}

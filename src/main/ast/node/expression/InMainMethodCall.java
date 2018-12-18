package ast.node.expression;

import ast.Type.NoType;
import ast.Type.Type;
import ast.Type.TypeError;
import ast.Type.UserDefinedType.UserDefinedType;
import ast.TypeCheckVisitorImpl;
import ast.Visitor;
import symbolTable.ItemNotFoundException;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableItem;
import symbolTable.SymbolTableMethodItem;

import java.util.ArrayList;

public class InMainMethodCall extends Expression {
    private Expression expr;

    public InMainMethodCall(Expression expr) {
        this.expr = expr;
    }


    public Expression getExpr() {
        return expr;
    }

    public void setExpr(Expression expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "MethodCallInMain";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Type typeCheck(SymbolTable symTable) {
        try {
            if(!expr.toString().equals("MethodCall"))
                throw new TypeError("Line:" + this.getLine() +":invalid statement in main");

            return new NoType();

        }catch (TypeError err){
            TypeCheckVisitorImpl.hasTypeError = true;
            System.out.println(err.getMessage());
            return new NoType();
        }
    }
}

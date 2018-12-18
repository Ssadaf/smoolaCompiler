package ast.node.statement;

import ast.Type.NoType;
import ast.Type.Type;
import ast.Type.TypeError;
import ast.Type.UserDefinedType.UserDefinedType;
import ast.TypeCheckVisitorImpl;
import ast.Visitor;
import ast.node.expression.Expression;
import ast.node.expression.MethodCall;
import symbolTable.ItemNotFoundException;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableItem;
import symbolTable.SymbolTableMethodItem;

import java.util.ArrayList;

public class InMainMethodCall extends Statement {
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

            return new MethodCall(null, null).getType();

        }catch (TypeError err){
            TypeCheckVisitorImpl.hasTypeError = true;
            System.out.println(err.getMessage());
            return new NoType();
        }
    }
}

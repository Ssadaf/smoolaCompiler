package ast.node.expression;

import ast.Type.ArrayType.ArrayType;
import ast.Type.NoType;
import ast.Type.PrimitiveType.IntType;
import ast.Type.Type;
import ast.Type.TypeError;
import ast.Visitor;
import symbolTable.SymbolTable;

public class Length extends Expression {
    private Expression expression;

    public Length(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Length";
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Type typeCheck(SymbolTable symTable) {
        try {
            Type exprType = expression.typeCheck(symTable);
            if(! (exprType.toString().equals(new ArrayType().toString()) || exprType.toString().equals(new NoType())) )
                throw new TypeError("Line:" + this.getLine() +":Length can only be called on Arrays");
            return new IntType();
        }catch (TypeError err){
            System.out.println(err.getMessage());
            return new NoType();
        }
    }
}

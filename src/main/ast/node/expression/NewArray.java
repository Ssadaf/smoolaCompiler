package ast.node.expression;

import ast.Type.ArrayType.ArrayType;
import ast.Type.NoType;
import ast.Type.PrimitiveType.IntType;
import ast.Type.Type;
import ast.Type.TypeError;
import ast.TypeCheckVisitorImpl;
import ast.Visitor;
import symbolTable.SymbolTable;

public class NewArray extends Expression {
    private Expression expression;
    private int size;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }
    @Override
    public String toString() {
        return "NewArray";
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    @Override
    public Type typeCheck(SymbolTable symTable) {
        try {
            Type expressionType = this.getExpression().typeCheck(SymbolTable.top);
            if(! expressionType.toString().equals(new IntType().toString()) && !expressionType.toString().equals(new NoType().toString()) )
                throw new TypeError("Line:" + this.getLine() +":New Array expression type must be integer");

            ArrayType retVal =  new ArrayType();
            retVal.setSize(size);
            this.setType(retVal);
            return retVal;
        }catch (TypeError err){
            TypeCheckVisitorImpl.hasTypeError = true;
            System.out.println(err.getMessage());
            return new NoType();
        }
    }
}

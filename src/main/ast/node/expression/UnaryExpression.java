package ast.node.expression;

import ast.Type.NoType;
import ast.Type.PrimitiveType.BooleanType;
import ast.Type.PrimitiveType.IntType;
import ast.Type.Type;
import ast.Type.TypeError;
import ast.TypeCheckVisitorImpl;
import ast.Visitor;
import symbolTable.SymbolTable;

public class UnaryExpression extends Expression {

    private UnaryOperator unaryOperator;
    private Expression value;

    public UnaryExpression(UnaryOperator unaryOperator, Expression value) {
        this.unaryOperator = unaryOperator;
        this.value = value;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    public UnaryOperator getUnaryOperator() {
        return unaryOperator;
    }

    public void setUnaryOperator(UnaryOperator unaryOperator) {
        this.unaryOperator = unaryOperator;
    }

    @Override
    public String toString() {
        return "UnaryExpression " + unaryOperator.name();
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Type typeCheck(SymbolTable symTable) {
        try {
            this.setType(new NoType());
            if(unaryOperator.equals(UnaryOperator.minus)){

                Type valueType = value.typeCheck(symTable);
                if(( !valueType.toString().equals(new IntType().toString()) && !valueType.toString().equals(new NoType().toString()) ) )
                    throw new TypeError("Line:" + this.getLine() + ":unsupported operand type for " + unaryOperator.toString());
                if(valueType.toString().equals(new NoType().toString()))
                    return new NoType();
                else {
                    this.setType(new IntType());
                    return new IntType();
                }
            }
            else if( unaryOperator.equals(UnaryOperator.not) ) {

                Type valueType = value.typeCheck(symTable);
                if( (!valueType.toString().equals(new BooleanType().toString())) && !valueType.toString().equals(new NoType().toString()) )
                    throw new TypeError("Line:" + this.getLine() + ":unsupported operand type for " + unaryOperator.toString());
                if(valueType.toString().equals(new NoType().toString()))
                    return new NoType();
                else {
                    this.setType(new BooleanType());
                    return new BooleanType();
                }
            }
            else{
                return new NoType();
            }
        }catch (TypeError err){
            TypeCheckVisitorImpl.hasTypeError = true;
            System.out.println(err.getMessage());
            return new NoType();
        }
    }
}




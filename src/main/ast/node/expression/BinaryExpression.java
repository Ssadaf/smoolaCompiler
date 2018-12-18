package ast.node.expression;

import ast.Type.ArrayType.ArrayType;
import ast.Type.NoType;
import ast.Type.PrimitiveType.BooleanType;
import ast.Type.PrimitiveType.IntType;
import ast.Type.Type;
import ast.Type.TypeError;
import ast.TypeCheckVisitorImpl;
import ast.Visitor;
import symbolTable.SymbolTable;

public class BinaryExpression extends Expression {

    private Expression left;
    private Expression right;
    private BinaryOperator binaryOperator;

    public BinaryExpression(Expression left, Expression right, BinaryOperator binaryOperator) {
        this.left = left;
        this.right = right;
        this.binaryOperator = binaryOperator;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public BinaryOperator getBinaryOperator() {
        return binaryOperator;
    }

    public void setBinaryOperator(BinaryOperator binaryOperator) {
        this.binaryOperator = binaryOperator;
    }

    @Override
    public String toString() {
        return "BinaryExpression " + binaryOperator.name();
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


    @Override
    public Type typeCheck(SymbolTable symTable) {
        try {
            if(binaryOperator.equals(BinaryOperator.add) || binaryOperator.equals(BinaryOperator.sub)
               || binaryOperator.equals(BinaryOperator.mult) || binaryOperator.equals(BinaryOperator.div)){
                Type leftType = left.typeCheck(symTable);
                Type rightType = right.typeCheck(symTable);

                if((!leftType.toString().equals(new IntType().toString())&& !leftType.toString().equals(new NoType().toString()))
                        || ( !rightType.toString().equals(new IntType().toString()) && !rightType.toString().equals(new NoType().toString()))  )
                    throw new TypeError("Line:" + this.getLine() + ":unsupported operand type for " + binaryOperator.toString());
                if(leftType.toString().equals(new NoType().toString()) || rightType.toString().equals(new NoType().toString()))
                    return new NoType();
                else
                    return new IntType();
            }
            else if( binaryOperator.equals(BinaryOperator.lt) || binaryOperator.equals(BinaryOperator.gt)
                || binaryOperator.equals(BinaryOperator.eq) || binaryOperator.equals(BinaryOperator.neq)) {

                Type leftType = left.typeCheck(symTable);
                Type rightType = right.typeCheck(symTable);
                if( (!leftType.toString().equals(new IntType().toString())) && !leftType.toString().equals(new NoType().toString())
                        || (!rightType.toString().equals((new IntType().toString()))) && !rightType.toString().equals((new NoType().toString())) )
                    throw new TypeError("Line:" + this.getLine() + ":unsupported operand type for " + binaryOperator.toString());
                if(leftType.toString().equals(new NoType().toString()) || rightType.toString().equals((new NoType().toString())) )
                    return new NoType();
                else
                    return new BooleanType();
            }
            else if( binaryOperator.equals(BinaryOperator.and) || binaryOperator.equals(BinaryOperator.or)) {

                Type leftType = left.typeCheck(symTable);
                Type rightType = right.typeCheck(symTable);
                if( (!leftType.toString().equals(new BooleanType().toString())) && !leftType.toString().equals((new NoType().toString()))
                        || (!rightType.toString().equals((new IntType().toString()))) && !rightType.toString().equals(new NoType().toString()) )
                    throw new TypeError("Line:" + this.getLine() + ":unsupported operand type for " + binaryOperator.toString());
                if(leftType.toString().equals((new NoType().toString())) || rightType.toString().equals(new NoType().toString()))
                    return new NoType();
                else
                    return new BooleanType();
            }
            else if( binaryOperator.equals(BinaryOperator.assign)) {
                Type leftType = left.typeCheck(symTable);
                Type rightType = right.typeCheck(symTable);

                if(!TypeCheckVisitorImpl.isSubType(rightType, leftType))
                    throw new TypeError("Line:" + this.getLine() + ":" + "unsupported operand type for assign");
                if(!leftType.toString().equals(new String("ArrayCall")) && !left.toString().split(" ")[0].equals("Identifier") && !leftType.toString().equals(new NoType().toString()))
                    throw new TypeError("Line:" + this.getLine() + ":left side of assignment must be a valid lvalue" );

                if(left.toString().equals((new NoType().toString())) || rightType.toString().equals(new NoType().toString()))
                    return new NoType();
                else
                    return leftType;
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
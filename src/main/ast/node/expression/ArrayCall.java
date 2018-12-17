package ast.node.expression;

import ast.Type.ArrayType.ArrayType;
import ast.Type.PrimitiveType.IntType;
import ast.Visitor;
import ast.Type.*;
import symbolTable.SymbolTable;

import javax.lang.model.type.ErrorType;

public class ArrayCall extends Expression {
    private Expression instance;
    private Expression index;

    public ArrayCall(Expression instance, Expression index) {
        this.instance = instance;
        this.index = index;
    }

    public Expression getInstance() {
        return instance;
    }

    public void setInstance(Expression instance) {
        this.instance = instance;
    }

    public Expression getIndex() {
        return index;
    }

    public void setIndex(Expression index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "ArrayCall";
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Type typeCheck(SymbolTable symTable) {
        try {
            Type indexType = index.typeCheck(symTable);
            if(!indexType.toString().equals(new IntType().toString()) && !indexType.toString().equals(new NoType().toString()) )
                throw new TypeError("Line:" + this.getLine() +":Index of array call must be an integer");

            Type instanceType = instance.typeCheck(symTable);
            if (!instanceType.toString().equals(new ArrayType().toString()) && !instanceType.toString().equals(new NoType().toString()) )
                throw new TypeError("Line:" + this.getLine() +":Instance of array call must be an array");
            if(indexType.toString().equals(new NoType().toString()) || instanceType.toString().equals(new NoType().toString()) )
                return new NoType();
            else
                return new IntType();
        }catch (TypeError err){
            System.out.println(err.getMessage());
            return new NoType();
        }
    }
}

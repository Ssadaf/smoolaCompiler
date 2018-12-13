package ast.node.expression;

import ast.Type.NoType;
import ast.Type.Type;
import ast.Type.TypeError;
import ast.Type.UserDefinedType.UserDefinedType;
import ast.Visitor;
import symbolTable.SymbolTable;

import java.util.ArrayList;

public class MethodCall extends Expression {
    private Expression instance;
    private Identifier methodName;

    public MethodCall(Expression instance, Identifier methodName) {
        this.instance = instance;
        this.methodName = methodName;
    }

    private ArrayList<Expression> args = new ArrayList<>();

    public Expression getInstance() {
        return instance;
    }

    public void setInstance(Expression instance) {
        this.instance = instance;
    }

    public Identifier getMethodName() {
        return methodName;
    }

    public void setMethodName(Identifier methodName) {
        this.methodName = methodName;
    }

    public ArrayList<Expression> getArgs() {
        return args;
    }

    public void addArg(Expression arg) {
        this.args.add(arg);
    }

    @Override
    public String toString() {
        return "MethodCall";
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

//    @Override
//    public Type typeCheck(SymbolTable symTable) {
//        try {
//            Type instanceType = instance.typeCheck(symTable);
//            if(!instanceType.toString().equals(new UserDefinedType().toString()))
//                throw new TypeError("Line:" + this.getLine() +":Index of array call must be an integer");
//
//            return new IntType();
//        }catch (TypeError err){
//            System.out.println(err.getMessage());
//            return new NoType();
//        }
//    }
}

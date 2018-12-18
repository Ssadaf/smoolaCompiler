//package ast.node.expression;
//
//import ast.Visitor;
//
//import java.util.ArrayList;
//
//public class InMainMethodCall {
//    private Expression instance;
//    private Identifier methodName;
//    private ArrayList<Expression> args = new ArrayList<>();
//
//    public InMainMethodCall(Expression instance, Identifier methodName) {
//        this.instance = instance;
//        this.methodName = methodName;
//    }
//
//
//    public Expression getInstance() {
//        return instance;
//    }
//
//    public void setInstance(Expression instance) {
//        this.instance = instance;
//    }
//
//    public Identifier getMethodName() {
//        return methodName;
//    }
//
//    public void setMethodName(Identifier methodName) {
//        this.methodName = methodName;
//    }
//
//    public ArrayList<Expression> getArgs() {
//        return args;
//    }
//
//    public void addArg(Expression arg) {
//        this.args.add(arg);
//    }
//
//    @Override
//    public String toString() {
//        return "MethodCallInMain";
//    }
//    @Override
//    public void accept(Visitor visitor) {
//        visitor.visit(this);
//    }
//}

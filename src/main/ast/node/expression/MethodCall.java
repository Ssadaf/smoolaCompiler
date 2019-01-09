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

public class MethodCall extends Expression {
    private Expression instance;
    private Identifier methodName;
    private ArrayList<Expression> args = new ArrayList<>();

    public MethodCall(Expression instance, Identifier methodName) {
        this.instance = instance;
        this.methodName = methodName;
    }


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

    @Override
    public Type typeCheck(SymbolTable symTable) {
        try {
            SymbolTableItem item;
            Type instanceType = instance.typeCheck(symTable);
            if(instanceType.isUserDefined())
                if(symTable.hasItem( ((UserDefinedType)instanceType).getName()+ "-classDec"))
                    throw new TypeError("Line:" + this.getLine() +":class "+instanceType.toString()+" is not declared");
            try{

                if(instanceType.toString().equals(new NoType().toString()))
                    return new NoType();
                if(!instanceType.isUserDefined())
                    throw new TypeError("Line:" + this.getLine() +":the instance of method call is not a class ");
//                System.out.println(instanceType.toString());
                item = TypeCheckVisitorImpl.classSymbolTables.get(instanceType.toString()).get(methodName.getName()+"-methodDec");
            }catch (ItemNotFoundException notFound){
                throw new TypeError("Line:" + this.getLine() +":there is no method named "+methodName.getName()+" in class "+ instanceType);
            }
            SymbolTableMethodItem methItem = (SymbolTableMethodItem) item;
            ArrayList<Type> methArgsType = methItem.getArgTypes();
            if(args.size() != methArgsType.size())
                throw new TypeError("Line:" + this.getLine() + ":invalid count of arguments for method call " + methItem.getName());
            for(int i = 0; i < args.size(); i++){
                if(!args.get(i).typeCheck(symTable).toString().equals(methArgsType.get(i).toString()))
                    throw new TypeError("Line:" + this.getLine() + ":incompatible argument type of " + args.get(i).toString() + " for calling " + methItem.getName());
            }
            this.setType(methItem.getReturnType());
            return methItem.getReturnType();

        }catch (TypeError err){
            TypeCheckVisitorImpl.hasTypeError = true;
            System.out.println(err.getMessage());
            return new NoType();
        }
    }
}

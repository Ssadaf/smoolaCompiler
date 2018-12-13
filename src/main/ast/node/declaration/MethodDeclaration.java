package ast.node.declaration;

import ast.Type.NoType;
import ast.Type.Type;
import ast.Type.TypeError;
import ast.Visitor;
import ast.node.expression.Expression;
import ast.node.expression.Identifier;
import ast.node.statement.Statement;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableVariableItemBase;

import java.util.ArrayList;

public class MethodDeclaration extends Declaration {
    private Expression returnValue;
    private Type returnType;
    private Identifier name, className;
    private ArrayList<VarDeclaration> args = new ArrayList<>();
    private ArrayList<VarDeclaration> localVars = new ArrayList<>();
    private ArrayList<Statement> body = new ArrayList<>();

    public MethodDeclaration(Identifier name) {
        this.name = name;
    }

    public void setClassName(Identifier className) {
        this.className = className;
    }

    public Expression getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(Expression returnValue) {
        this.returnValue = returnValue;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public Identifier getName() {
        return name;
    }

    public String getClassName() { return className.getName(); }

    public void setName(Identifier name) {
        this.name = name;
    }

    public ArrayList<VarDeclaration> getArgs() {
        return args;
    }

    public void addArg(VarDeclaration arg) {
        this.args.add(arg);
    }

    public ArrayList<Statement> getBody() {
        return body;
    }

    public void addStatement(Statement statement) {
        this.body.add(statement);
    }

    public ArrayList<VarDeclaration> getLocalVars() {
        return localVars;
    }

    public void addLocalVar(VarDeclaration localVar) {
        this.localVars.add(localVar);
    }

    @Override
    public String toString() {
        return "MethodDeclaration";
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    @Override
    public Type typeCheck(SymbolTable symTable){
        try{
            if(returnValue.typeCheck(symTable) != returnType){
                throw new TypeError("Line:" + this.getLine() + ":" + name.getName() + " return type must be " + returnType.toString());
            }
            return returnType;
        }catch(TypeError err){
            System.out.println(err.getMessage());
            return new NoType();
        }
    }
}

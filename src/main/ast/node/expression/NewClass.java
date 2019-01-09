package ast.node.expression;

import ast.Type.NoType;
import ast.Type.Type;
import ast.Type.TypeError;
import ast.Type.UserDefinedType.UserDefinedType;
import ast.TypeCheckVisitorImpl;
import ast.Visitor;
import symbolTable.SymbolTable;

public class NewClass extends Expression {
    private Identifier className;
    private UserDefinedType classType;

    public NewClass(Identifier className) {
        this.className = className;
        this.classType = new UserDefinedType();
        classType.setClassType(className.toString());
    }

    public UserDefinedType getType(){
        return classType;
    }

    public Identifier getClassName() {
        return className;
    }

    public void setClassName(Identifier className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "NewClass";
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Type typeCheck(SymbolTable symTable) {
        try {
            if(!symTable.hasItem(this.getClassName().getName() + "-classDec"))
                throw new TypeError("Line:" + this.getLine() + ":class " + this.getClassName().getName() + " is not declared");
            else {
                classType.setClassDeclaration(TypeCheckVisitorImpl.classDecs.get(classType.getClassType().split(" ")[1]));
                Type ret = classType.typeCheck(symTable);
                this.setType(ret);
                return ret;
            }
        }catch (TypeError err){
            TypeCheckVisitorImpl.hasTypeError = true;
            System.out.println(err.getMessage());
            return new NoType();
        }
    }
}


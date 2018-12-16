package ast.Type.UserDefinedType;

import ast.Type.Type;
import ast.node.declaration.ClassDeclaration;
import ast.node.expression.Identifier;

public class UserDefinedType extends Type {
    private ClassDeclaration classDeclaration;
    private String classType;

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassType(String classType) { this.classType = classType; }

    public String getClassType() { return classType; }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    public Identifier getName() {
        return name;
    }

    public void setName(Identifier name) {
        this.name = name;
    }

    private Identifier name;

    @Override
    public String toString() {
        return classDeclaration.getName().getName();
    }

    @Override
    public boolean isUserDefined() {return true;}
}

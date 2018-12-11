package ast.node.declaration;
import ast.Visitor;
import ast.node.expression.Identifier;

public class ObjectDeclaration extends ClassDeclaration{
    private Identifier name;
    private Identifier parentName;

    public ObjectDeclaration(Identifier name, Identifier parentName) {
        super(name, parentName);
    }

    @Override
    public String toString() {
        return "Object";
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

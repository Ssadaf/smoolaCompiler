package ast.Type;

public class NoType extends Type{
    @Override
    public String toString() {
        return "no Type";
    }

    @Override
    public boolean isUserDefined() {return false;}
}
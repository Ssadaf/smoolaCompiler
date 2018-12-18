package symbolTable;

import ast.Type.Type;

import java.util.ArrayList;

public class SymbolTableMethodItem extends SymbolTableItem {

    Type returnType;
    ArrayList<Type> argTypes = new ArrayList<>();

    public SymbolTableMethodItem(String name, ArrayList<Type> argTypes, Type returnType) {
        this.name = name;
        this.argTypes = argTypes;
        this.returnType = returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public ArrayList<Type> getArgTypes(){return argTypes;}

    public Type getReturnType() {return returnType;}

    public String getName() {
        return name;
    }

    @Override
    public String getKey() {
        return (name + "-methodDec");
    }

}

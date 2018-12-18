package symbolTable;

import ast.Type.Type;

public class SymbolTableClassItem extends SymbolTableItem{
    private int index;
    protected Type type;

    public SymbolTableClassItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getKey() {
        return (name + "-classDec");
    }

}

package ast.node;

import ast.Type.Type;
import ast.Type.UserDefinedType.UserDefinedType;
import ast.Visitor;
import java.util.ArrayList;
import ast.node.declaration.ClassDeclaration;
import symbolTable.SymbolTable;

import java.util.HashMap;
import java.util.List;

public class Program{
    private ArrayList<ClassDeclaration> classes = new ArrayList<>();
    private ClassDeclaration mainClass;

    private HashMap <String, SymbolTable> classSymbolTables;
    private HashMap <String, SymbolTable> methodSymbolTables;
    private HashMap <String, ClassDeclaration> classDecs;

    public ClassDeclaration getMainClass() {
        return mainClass;
    }

    public void setMainClass(ClassDeclaration mainClass) {
        this.mainClass = mainClass;
    }

    public void addClass(ClassDeclaration classDeclaration) {
        classes.add(classDeclaration);
    }

    public List<ClassDeclaration> getClasses() {
        return classes;
    }

    @Override
    public String toString() {
        return "Program";
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setClassSymbolTable(HashMap <String, SymbolTable> cSymbolTables) {
        classSymbolTables = cSymbolTables;
    }

    public void setMethodSymbolTable(HashMap <String, SymbolTable> mSymbolTables) {
        methodSymbolTables = mSymbolTables;
    }

    public void setClassDecs(HashMap <String, ClassDeclaration> classes){
        classDecs = classes;
    }
    public HashMap <String, ClassDeclaration> getClassDecs(){
        return classDecs;
    }
}

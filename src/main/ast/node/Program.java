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
    private HashMap<String, String> relation = new HashMap<String, String>();

    public void setRelation(HashMap<String, String> relation){ this.relation = relation;}

    public HashMap<String, String> getRelation(){return relation;}

    public ClassDeclaration getMainClass() {
        return mainClass;
    }

    public HashMap <String, SymbolTable> getClassSymbolTables(){
        return classSymbolTables;
    }

    public HashMap <String, SymbolTable> getMethodSymbolTables(){
        return methodSymbolTables;
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

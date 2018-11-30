package ast;

import ast.node.expression.Identifier;

public class DuplicateMethodInfo {
    private Identifier methodName;
    private Identifier className;
    private Identifier parentName;

    public DuplicateMethodInfo(Identifier methodName, Identifier className, Identifier parentName){
        this.methodName = methodName;
        this.className = className;
        this.parentName = parentName;
    }

    public String getMethodName(){
        return methodName.getName();
    }

    public String getClassName(){
        return className.getName();
    }

    public String getParentName(){
        if(parentName == null)
            return "";
        else
            return parentName.getName();
    }
}

package ast;

import ast.node.expression.Identifier;

public class DuplicateMethodInfo {
    private Identifier methodName;
    private Identifier className;

    public DuplicateMethodInfo(Identifier methodName, Identifier className){
        this.methodName = methodName;
        this.className = className;
    }

    public String getMethodName(){
        return methodName.getName();
    }

    public String getClassName(){
        return className.getName();
    }

}

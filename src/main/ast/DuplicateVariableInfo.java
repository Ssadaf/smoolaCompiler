package ast;

import ast.node.expression.Identifier;

public class DuplicateVariableInfo {
    private Identifier varName;
    private Identifier className;

    public DuplicateVariableInfo(Identifier varName, Identifier className){
            this.varName = varName;
            this.className = className;
    }

    public String getVarName(){
            return varName.getName();
        }
    public String getClassName(){
            return className.getName();
        }

}

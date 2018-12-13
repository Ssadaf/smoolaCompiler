package ast;

import ast.node.expression.Identifier;

import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateHandler {
    private ArrayList<DuplicateMethodInfo> dupMethodInfo = new ArrayList<DuplicateMethodInfo>();;
    private ArrayList<DuplicateVariableInfo> dupVarInfo = new ArrayList<DuplicateVariableInfo>();;
    private HashMap<String, String> relation = new HashMap<String, String>();


    public void addRelation(Identifier child, Identifier parent)
    {
        relation.put(child.getName(), parent.getName());
    }

    public HashMap<String, String> getRelations(){
        return relation;
    }

    public boolean checkRelationIsParent(String child, String parent)
    {
        String parentToCheck;
        String childToCheck = child;
        while(true)
        {
            if(relation.containsKey(childToCheck)) {
                parentToCheck = relation.get(childToCheck);
                //System.out.println(parentToCheck + " " + childToCheck);
                if(parentToCheck.equals("Object"))
                    return false;
                if(parentToCheck.equals(parent))
                    return true;
                childToCheck = parentToCheck;
            }
            else
                return false;
        }
    }

    public boolean hasRelation(String first, String second)
    {
        return (checkRelationIsParent(first, second) || checkRelationIsParent(second, first));
    }

    public boolean checkMethodDuplication(DuplicateMethodInfo newItem)
    {
        for(int i = 0; i < dupMethodInfo.size(); i++)
        {
            if(dupMethodInfo.get(i).getMethodName().equals(newItem.getMethodName()))
            {
                if(hasRelation(dupMethodInfo.get(i).getClassName(), newItem.getClassName()))
                {
                    dupMethodInfo.add(newItem);
                    return true;
                }
            }
        }
        dupMethodInfo.add(newItem);
        return false;
    }

    public boolean checkVariableDuplication(DuplicateVariableInfo newItem)
    {
        for(int i = 0; i < dupVarInfo.size(); i++)
        {
            if(dupVarInfo.get(i).getVarName().equals(newItem.getVarName()))
            {
                if(hasRelation(dupVarInfo.get(i).getClassName(), newItem.getClassName()))
                {
                    dupVarInfo.add(newItem);
                    return true;
                }
            }
        }
        dupVarInfo.add(newItem);
        return false;
    }
}
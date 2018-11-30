package ast;

import ast.node.expression.Identifier;

import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateMethodHandler {
    private ArrayList<DuplicateMethodInfo> dupMethodInfo;
    private HashMap<String, String> relation = new HashMap<String, String>();

    public DuplicateMethodHandler(){
        dupMethodInfo = new ArrayList<DuplicateMethodInfo>();
    }

    public void addRelation(Identifier child, Identifier parent)
    {
        if(parent == null)
            relation.put(child.getName(), "");
        else
            relation.put(child.getName(), parent.getName());
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
                if(parentToCheck.equals(""))
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

    public void addItem(DuplicateMethodInfo newItem){
        dupMethodInfo.add(newItem);
    }

    public boolean checkDuplication(DuplicateMethodInfo newItem)
    {
        for(int i = 0; i < dupMethodInfo.size(); i++)
        {
            if(dupMethodInfo.get(i).getMethodName().equals(newItem.getMethodName()))
            {
                if(hasRelation(dupMethodInfo.get(i).getClassName(), newItem.getClassName()))
                {
                    addItem(newItem);
                    return true;
                }
            }
        }
        addItem(newItem);
        return false;
    }
}

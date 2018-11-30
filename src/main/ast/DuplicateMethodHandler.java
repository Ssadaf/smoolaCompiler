package ast;

import java.util.ArrayList;

public class DuplicateMethodHandler {
    private ArrayList<DuplicateMethodInfo> dupMethodInfo;

    public DuplicateMethodHandler(){
        dupMethodInfo = new ArrayList<DuplicateMethodInfo>();
    }

    public void addItem(DuplicateMethodInfo newItem){
        dupMethodInfo.add(newItem);
    }

    public boolean checkDuplication(String methodName, String parent){
        String checkingParent = parent;

        for (int i = 0; i < dupMethodInfo.size(); ++i) {
            if((dupMethodInfo.get(i).getMethodName() == methodName) && (dupMethodInfo.get(i).getClassName() == parent))
                return false;
        }
        return true;
    }
}

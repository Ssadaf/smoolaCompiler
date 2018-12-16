package ast;

import ast.Type.PrimitiveType.IntType;
import ast.Type.UserDefinedType.UserDefinedType;
import ast.node.Node;
import ast.node.Program;
import ast.node.declaration.ClassDeclaration;
import ast.node.declaration.MethodDeclaration;
import ast.node.declaration.ObjectDeclaration;
import ast.node.declaration.VarDeclaration;
import ast.node.expression.*;
import ast.node.expression.Value.BooleanValue;
import ast.node.expression.Value.IntValue;
import ast.node.expression.Value.StringValue;
import ast.node.statement.*;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableVariableItemBase;
import symbolTable.SymbolTableClassItem;
import symbolTable.SymbolTableMethodItem;
import symbolTable.ItemAlreadyExistsException;
import symbolTable.ItemNotFoundException;
import ast.Type.*;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


public class VisitorImpl implements Visitor {

    private boolean hasMethodDuplication = false;
    private boolean hasVariableDuplication = false;
    private boolean hasError = false;
    private int variableIndex = 1;
    private HashMap <String, SymbolTable> classSymbolTables = new HashMap<String, SymbolTable>();
    private HashMap <String, SymbolTable> methodSymbolTables = new HashMap<String, SymbolTable>();
    private HashMap <String, ClassDeclaration> classDecs = new HashMap<String, ClassDeclaration>();

    private void updateClass(String classToCheck, Map<String, String> relation) {
        String parentOfClassToCheck = relation.get(classToCheck);
       if (classSymbolTables.get(classToCheck).isUpdated == true)
            return;
        else if (parentOfClassToCheck == "Object" || !classSymbolTables.containsKey(parentOfClassToCheck)) {
            classSymbolTables.get(classToCheck).updateSymbolTables(SymbolTable.top);
            classSymbolTables.get(classToCheck).isUpdated = true;
            return;
        }
        else if(classSymbolTables.get(parentOfClassToCheck).isUpdated){
            classSymbolTables.get(classToCheck).updateSymbolTables(classSymbolTables.get(parentOfClassToCheck));
            classSymbolTables.get(classToCheck).isUpdated = true;
            return;
        }
        else {
            updateClass(parentOfClassToCheck, relation);
            classSymbolTables.get(classToCheck).updateSymbolTables(classSymbolTables.get(parentOfClassToCheck));
            classSymbolTables.get(classToCheck).isUpdated = true;
            return;
        }
    }

    private void updateMethod(String methodName, String ClassName){
        methodSymbolTables.get(methodName).updateSymbolTables(classSymbolTables.get(ClassName));
    }

    private Program createCompleteSymbolTable(Program program){
        Map<String, String> relation = duplicateHandler.getRelations();
        for (String className: relation.keySet()) {
            updateClass(className, relation);
        }
//        for (String key: classSymbolTables.keySet()){
//                System.out.println("****** " + key);
//                program.getClassSymbolTables().get(key).printAllSymbolTableItems();
//        }
        for(String methodName:methodSymbolTables.keySet()){
            String[] methodInfo = methodName.split("@");
            updateMethod(methodName, methodInfo[1]);
        }
//        for (String key: methodSymbolTables.keySet()){
//                System.out.println("****** " + key);
//                program.getMethodSymbolTables().get(key).printAllSymbolTableItems();
//        }
        return program;
    }

    @Override
    public void visit(MethodCallInMain methodCallInMain) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Program program) {
        output.add(program.toString());
        SymbolTable currSymTable = new SymbolTable();
        SymbolTable.push(currSymTable);
        if((program.getMainClass() == null) && (program.getClasses().size() == 0) )
            System.out.println("No class exists in the program");
        ClassDeclaration mainClass = program.getMainClass();
        classDecs.put(program.getMainClass().getName().getName(), mainClass);
        ObjectDeclaration objectClass = new ObjectDeclaration(new Identifier("Object"), null);
//        objectClass.accept(this);
        if(mainClass != null){
            mainClass.accept(this);
            duplicateHandler.addRelation(mainClass.getName(), mainClass.getParentName());
        }
        List <ClassDeclaration> classes = program.getClasses();
//        if(classes != null)
////        {
////            for (int i = 0; i < classes.size(); i++)
////                duplicateHandler.addRelation(classes.get(i).getName(), classes.get(i).getParentName());
////        }
        if(classes != null)
        {
            for (int i = 0; i < classes.size(); i++)
                classes.get(i).accept(this);
        }

        program.setClassSymbolTable(classSymbolTables);
        program.setMethodSymbolTable(methodSymbolTables);
        program.setClassDecs(classDecs);

        program.setClassSymbolTable(createCompleteSymbolTable(program).getClassSymbolTables());;


        if(!hasError) {
            Visitor typeVisitor = new TypeCheckVisitorImpl();
            program.accept(typeVisitor);
        }
        SymbolTable.pop();
    }

    @Override
    public void visit(ClassDeclaration classDeclaration) {
        output.add(classDeclaration.toString());
        SymbolTableClassItem currClass;

        try{
            currClass = new SymbolTableClassItem(classDeclaration.getName().getName());
            SymbolTable.top.put(currClass);
        }catch(ItemAlreadyExistsException err){
            int num = 1;
            System.out.println("Line:" +classDeclaration.getLine() + ":Redefinition of class " + classDeclaration.getName().getName());
            hasError = true;
            while(true){
                try{
                    currClass = new SymbolTableClassItem("Temporary-" + classDeclaration.getName().getName() + num );
                    SymbolTable.top.put(currClass);
                }catch(ItemAlreadyExistsException secErr){num++; continue;}
                break;
            }
        }
        SymbolTable currSymbolTable = new SymbolTable(SymbolTable.top);
        SymbolTable.push(currSymbolTable);
        classDecs.put(classDeclaration.getName().getName(), classDeclaration);

        classDeclaration.getName().accept(this);
        Identifier parent = classDeclaration.getParentName();
        if(parent != null && parent.getName() != "Object")
            parent.accept(this);

        ArrayList<VarDeclaration> vars = classDeclaration.getVarDeclarations();
        duplicateHandler.addRelation(classDeclaration.getName(), classDeclaration.getParentName());
        for(int i = 0; i < vars.size(); i++) {
            hasVariableDuplication = false;
            DuplicateVariableInfo currVarInfo = new DuplicateVariableInfo(vars.get(i).getIdentifier(), classDeclaration.getName());
            hasVariableDuplication = duplicateHandler.checkVariableDuplication(currVarInfo);
            vars.get(i).accept(this);
        }

        ArrayList<MethodDeclaration> meths = classDeclaration.getMethodDeclarations();
        for(int i = 0; i < meths.size(); i++) {
            hasMethodDuplication = false;
            DuplicateMethodInfo currMethInfo = new DuplicateMethodInfo(meths.get(i).getName(), classDeclaration.getName());
            hasMethodDuplication = duplicateHandler.checkMethodDuplication(currMethInfo);
            meths.get(i).accept(this);
        }

        classSymbolTables.put(currClass.getName(), SymbolTable.top);

        SymbolTable.pop();
    }

    @Override
    public void visit(MethodDeclaration methodDeclaration) {
        output.add(methodDeclaration.toString());

        SymbolTableMethodItem currMethod;

        ArrayList<VarDeclaration> args = methodDeclaration.getArgs();
        ArrayList<Type> argTypes = new ArrayList<Type>();
        for(int i = 0; i < args.size(); ++i)
            argTypes.add(args.get(i).getType());
        try{
            if(hasMethodDuplication)
                throw new ItemAlreadyExistsException();
            currMethod = new SymbolTableMethodItem(methodDeclaration.getName().getName(), argTypes);
            SymbolTable.top.put(currMethod);
        }catch (ItemAlreadyExistsException err){
            int num =1;
            System.out.println("Line:" +methodDeclaration.getLine() + ":Redefinition of method " + methodDeclaration.getName().getName());
            hasError = true;

            while(true) {
                try {
                    currMethod = new SymbolTableMethodItem(("Temporary-" + methodDeclaration.getName().getName() + num), argTypes);
                    SymbolTable.top.put(currMethod);
                } catch (ItemAlreadyExistsException secErr) {num++; continue;}
                break;
            }
        }

        hasMethodDuplication = false;
        SymbolTable currSymbolTable = new SymbolTable(SymbolTable.top);
        SymbolTable.push(currSymbolTable);

        methodDeclaration.getName().accept(this);
        for(int i = 0; i < args.size(); i++)
            args.get(i).accept(this);
        ArrayList<VarDeclaration> localVars = methodDeclaration.getLocalVars();
        for(int i = 0; i < localVars.size(); i++)
            localVars.get(i).accept(this);
        ArrayList<Statement> body = methodDeclaration.getBody();
        for(int i = 0; i < body.size(); i++)
            body.get(i).accept(this);
        methodDeclaration.getReturnValue().accept(this);

        methodSymbolTables.put(currMethod.getName() + "@" + methodDeclaration.getClassName(), SymbolTable.top);

        SymbolTable.pop();
    }

    @Override
    public void visit(VarDeclaration varDeclaration) {
        output.add(varDeclaration.toString());
        SymbolTableVariableItemBase currVar;
        try{
            if(hasVariableDuplication)
                throw new ItemAlreadyExistsException();
            currVar = new SymbolTableVariableItemBase(varDeclaration.getIdentifier().getName(), varDeclaration.getType(), variableIndex);
            SymbolTable.top.put(currVar);
        }catch(ItemAlreadyExistsException err){
            int num = 1;
            System.out.println("Line:" + varDeclaration.getLine() + ":Redefinition of variable " + varDeclaration.getIdentifier().getName());
            hasError = true;
            while(true){
                try{
                    currVar = new SymbolTableVariableItemBase("Temporary-" + varDeclaration.getIdentifier().getName() + num , varDeclaration.getType(), variableIndex);
                    SymbolTable.top.put(currVar);
                }catch(ItemAlreadyExistsException secErr){num++; continue;}
                break;
            }
        }
        hasVariableDuplication = false;
        variableIndex ++;
        varDeclaration.getIdentifier().accept(this);
    }

    @Override
    public void visit(ArrayCall arrayCall) {
        output.add(arrayCall.toString());
        arrayCall.getInstance().accept(this);
        arrayCall.getIndex().accept(this);
    }

    @Override
    public void visit(BinaryExpression binaryExpression) {
        if( binaryExpression.getRight() == null )
            return;
        output.add(binaryExpression.toString());
        binaryExpression.getLeft().accept(this);
        binaryExpression.getRight().accept(this);
    }

    @Override
    public void visit(Identifier identifier) {
        output.add(identifier.toString());
    }

    @Override
    public void visit(Length length) {
        output.add(length.toString());
        length.getExpression().accept(this);
    }

    @Override
    public void visit(MethodCall methodCall) {
        output.add(methodCall.toString());
        methodCall.getInstance().accept(this);
        methodCall.getMethodName().accept(this);
        ArrayList<Expression> args = methodCall.getArgs();
        for(int i = 0; i < args.size(); i++)
            args.get(i).accept(this);
    }

    @Override
    public void visit(NewArray newArray) {
        output.add(newArray.toString());
        IntValue index = (IntValue)newArray.getExpression();
        int const_index = index.getConstant();
        if(const_index == 0)
        {
            System.out.println("Line:" + newArray.getLine() + ":Array length should not be zero or negative");
            newArray.setExpression(new IntValue(0, new IntType()));
        }
        newArray.getExpression().accept(this);
    }

    @Override
    public void visit(NewClass newClass) {
        output.add(newClass.toString());
        newClass.getClassName().accept(this);
    }

    @Override
    public void visit(This instance) {
        output.add(instance.toString());
    }

    @Override
    public void visit(UnaryExpression unaryExpression) {
        output.add(unaryExpression.toString());
        unaryExpression.getValue().accept(this);
    }

    @Override
    public void visit(BooleanValue value) {
        output.add(value.toString());
    }

    @Override
    public void visit(IntValue value) {
        output.add(value.toString());
    }

    @Override
    public void visit(StringValue value) {
        output.add(value.toString());
    }

    @Override
    public void visit(Assign assign) {
        output.add(assign.toString());
        assign.getlValue().accept(this);
        assign.getrValue().accept(this);
    }

    @Override
    public void visit(Block block) {
        output.add(block.toString());
        ArrayList<Statement> body = block.getBody();
        for(int i = 0; i < body.size(); i++)
            body.get(i).accept(this);
    }

    @Override
    public void visit(Conditional conditional) {
        output.add(conditional.toString());
        conditional.getExpression().accept(this);
        conditional.getConsequenceBody().accept(this);
        if(conditional.getAlternativeBody() != null)
            conditional.getAlternativeBody().accept(this);
    }

    @Override
    public void visit(While loop) {
        output.add(loop.toString());
        loop.getCondition().accept(this);
        loop.getBody().accept(this);
    }

    @Override
    public void visit(Write write) {
        output.add(write.toString());
        write.getArg().accept(this);
    }
}
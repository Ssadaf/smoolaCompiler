package ast;

import ast.Type.PrimitiveType.IntType;
import ast.Type.Type;
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
import symbolTable.ItemAlreadyExistsException;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableClassItem;
import symbolTable.SymbolTableMethodItem;

import java.util.ArrayList;
import java.util.List;

public class TypeCheckerVisitor implements Visitor{
    private boolean hasError = false;

    @Override
    public void visit(MethodCallInMain methodCallInMain) {
        //TODO: implement appropriate visit functionality
    }

    @Override
    public void visit(Program program) {
        ClassDeclaration mainClass = program.getMainClass();
        if(mainClass != null){
            mainClass.accept(this);
//            duplicateHandler.addRelation(mainClass.getName(), mainClass.getParentName());
        }
        List<ClassDeclaration> classes = program.getClasses();
        if(classes != null)
        {
            for (int i = 0; i < classes.size(); i++)
                classes.get(i).accept(this);
        }
    }

    @Override
    public void visit(ClassDeclaration classDeclaration) {
        classDeclaration.getName().accept(this);
        Identifier parent = classDeclaration.getParentName();
        if(parent != null)
            parent.accept(this);

        ArrayList<VarDeclaration> vars = classDeclaration.getVarDeclarations();
        duplicateHandler.addRelation(classDeclaration.getName(), classDeclaration.getParentName());
        for(int i = 0; i < vars.size(); i++) {
            vars.get(i).accept(this);
        }

        ArrayList<MethodDeclaration> meths = classDeclaration.getMethodDeclarations();
        for(int i = 0; i < meths.size(); i++) {
            meths.get(i).accept(this);
        }

        SymbolTable.pop();
    }

    @Override
    public void visit(MethodDeclaration methodDeclaration) {
//        output.add(methodDeclaration.toString());

        SymbolTableMethodItem currMethod;

        ArrayList<VarDeclaration> args = methodDeclaration.getArgs();
        ArrayList<Type> argTypes = new ArrayList<Type>();
        for(int i = 0; i < args.size(); ++i)
            argTypes.add(args.get(i).getType());

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

        SymbolTable.pop();
    }

    @Override
    public void visit(VarDeclaration varDeclaration) {
//        output.add(varDeclaration.toString());
        SymbolTableClassItem currVar;
        try{
            if(hasVariableDuplication)
                throw new ItemAlreadyExistsException();
            currVar = new SymbolTableClassItem(varDeclaration.getIdentifier().getName());
            SymbolTable.top.put(currVar);
        }catch(ItemAlreadyExistsException err){
            int num = 1;
            System.out.println("Line:" + varDeclaration.getLine() + ":Redefinition of variable " + varDeclaration.getIdentifier().getName());
            hasError = true;
            while(true){
                try{
                    currVar = new SymbolTableClassItem("Temporary-" + varDeclaration.getIdentifier().getName() + num );
                    SymbolTable.top.put(currVar);
                }catch(ItemAlreadyExistsException secErr){num++; continue;}
                break;
            }
        }
        hasVariableDuplication = false;
        varDeclaration.getIdentifier().accept(this);
    }

    @Override
    public void visit(ArrayCall arrayCall) {
//        output.add(arrayCall.toString());
        arrayCall.getInstance().accept(this);
        arrayCall.getIndex().accept(this);
    }

    @Override
    public void visit(BinaryExpression binaryExpression) {
        if( binaryExpression.getRight() == null )
            return;
//        output.add(binaryExpression.toString());
        binaryExpression.getLeft().accept(this);
        binaryExpression.getRight().accept(this);
    }

    @Override
    public void visit(Identifier identifier) {
//        output.add(identifier.toString());
    }

    @Override
    public void visit(Length length) {
//        output.add(length.toString());
        length.getExpression().accept(this);
    }

    @Override
    public void visit(MethodCall methodCall) {
//        output.add(methodCall.toString());
        methodCall.getInstance().accept(this);
        methodCall.getMethodName().accept(this);
        ArrayList<Expression> args = methodCall.getArgs();
        for(int i = 0; i < args.size(); i++)
            args.get(i).accept(this);
    }

    @Override
    public void visit(NewArray newArray) {
//        output.add(newArray.toString());
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
//        output.add(newClass.toString());
        newClass.getClassName().accept(this);
    }

    @Override
    public void visit(This instance) {
//        output.add(instance.toString());
    }

    @Override
    public void visit(UnaryExpression unaryExpression) {
//        output.add(unaryExpression.toString());
        unaryExpression.getValue().accept(this);
    }

    @Override
    public void visit(BooleanValue value) {
//        output.add(value.toString());
    }

    @Override
    public void visit(IntValue value) {
//        output.add(value.toString());
    }

    @Override
    public void visit(StringValue value) {
//        output.add(value.toString());
    }

    @Override
    public void visit(Assign assign) {
//        output.add(assign.toString());
        assign.getlValue().accept(this);
        assign.getrValue().accept(this);
    }

    @Override
    public void visit(Block block) {
//        output.add(block.toString());
        ArrayList<Statement> body = block.getBody();
        for(int i = 0; i < body.size(); i++)
            body.get(i).accept(this);
    }

    @Override
    public void visit(Conditional conditional) {
//        output.add(conditional.toString());
        conditional.getExpression().accept(this);
        conditional.getConsequenceBody().accept(this);
        conditional.getAlternativeBody().accept(this);
    }

    @Override
    public void visit(While loop) {
//        output.add(loop.toString());
        loop.getCondition().accept(this);
        loop.getBody().accept(this);
    }

    @Override
    public void visit(Write write) {
//        output.add(write.toString());
        write.getArg().accept(this);
    }

}

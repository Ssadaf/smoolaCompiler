package ast;

import ast.Type.ArrayType.ArrayType;
import ast.Type.NoType;
import ast.Type.PrimitiveType.BooleanType;
import ast.Type.PrimitiveType.IntType;
import ast.Type.PrimitiveType.StringType;
import ast.Type.Type;
import ast.Type.UserDefinedType.UserDefinedType;
import ast.node.Program;
import ast.node.declaration.ClassDeclaration;
import ast.node.declaration.MethodDeclaration;
import ast.node.declaration.VarDeclaration;
import ast.node.expression.*;
import ast.node.expression.Value.BooleanValue;
import ast.node.expression.Value.IntValue;
import ast.node.expression.Value.StringValue;
import ast.node.statement.*;
//import sun.jvm.hotspot.debugger.cdbg.Sym;
import symbolTable.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TypeCheckVisitorImpl implements Visitor{
    private boolean hasError = false;
    public static HashMap<String, ClassDeclaration> classDecs;
    public static UserDefinedType currClassType = new UserDefinedType();
    private HashMap<String, SymbolTable> methodSymbolTables;
    public static HashMap<String, SymbolTable> classSymbolTables;
    public static HashMap<String, String> relation = new HashMap<String, String>();
    public static boolean hasTypeError = false;
    private boolean inMain = false;

    public static boolean checkRelationIsParent(String child, String parent)
    {
        String parentToCheck;
        String childToCheck = child;
        while(true)
        {
            if(relation.containsKey(childToCheck)) {
                parentToCheck = relation.get(childToCheck);
                if(parentToCheck.equals("Object"))
                    return parentToCheck.equals(parent);
                if(parentToCheck.equals(parent))
                    return true;
                childToCheck = parentToCheck;
            }
            else
                return false;
        }
    }

    public static boolean isSubType(Type sub, Type supr){
//        System.out.println("SUB----- " + sub.toString());
//        System.out.println("SUPER----- " + supr.toString() );
//        if(supr.isUserDefined()) {
//            if(((UserDefinedType)supr).getClassType().equals(new NoType()) && !sub.toString().equals(new NoType()))
//                return false;
//        }

        if(sub.toString().equals(new NoType().toString()))
            return true;
        else if(!supr.isUserDefined())
            return (sub.toString().equals( supr.toString()) );
        else if(sub.isUserDefined()) {
            if( checkRelationIsParent(sub.toString(), supr.toString()) || sub.toString().equals(supr.toString()))
                return true;
            else
                return false;
        }
        else
            return false;
    }

    @Override
    public void visit(InMainMethodCall inMainMethodCall) {
        if(!inMain) {
            hasTypeError = true;
            System.out.println("Line:" + inMainMethodCall.getLine() + ":method call as a statement is not allowed out of main");
        }
        else
            inMainMethodCall.typeCheck(SymbolTable.top);
        inMainMethodCall.getExpr().accept(this);
    }

    @Override
    public void visit(Program program) {
        classDecs = program.getClassDecs();
        methodSymbolTables = program.getMethodSymbolTables();
        classSymbolTables  = program.getClassSymbolTables();
        relation = program.getRelation();

        ClassDeclaration mainClass = program.getMainClass();
        if(mainClass != null){
            inMain = true;
            mainClass.accept(this);
            inMain = false;
        }
        List<ClassDeclaration> classes = program.getClasses();
        if(classes != null)
        {
            for (int i = 0; i < classes.size(); i++)
                classes.get(i).accept(this);
        }

        if(!hasTypeError){
            for(int i = 0; i < output.size(); i++)
                System.out.println(output.get(i));
            Visitor jasminVisitor = new JasminVisitorImpl();
            program.accept(jasminVisitor);
        }
        SymbolTable.pop();
    }

    @Override
    public void visit(ClassDeclaration classDeclaration) {
        currClassType.setClassDeclaration(classDeclaration);

        SymbolTable.push(classSymbolTables.get(classDeclaration.getName().getName()));
        Identifier parent = classDeclaration.getParentName();
        if(parent != null && parent.getName() != "Object")
            if(!SymbolTable.top.hasItem(parent.getName() + "-classDec"))
                System.out.println("Line:" + classDeclaration.getLine() + ":class "+parent.getName() + " is not declared");

        ArrayList<VarDeclaration> vars = classDeclaration.getVarDeclarations();
        for(int i = 0; i < vars.size(); i++)
            vars.get(i).accept(this);

        ArrayList<MethodDeclaration> meths = classDeclaration.getMethodDeclarations();
        for(int i = 0; i < meths.size(); i++)
            meths.get(i).accept(this);
        SymbolTable.pop();
    }

    @Override
    public void visit(MethodDeclaration methodDeclaration) {
        ArrayList<VarDeclaration> args = methodDeclaration.getArgs();

        if(inMain){
            if(!methodDeclaration.getName().getName().equals("main") ){
                System.out.println("Line:" + methodDeclaration.getLine() + ": method name in main class must be <main>");
                hasTypeError = true;
            }
//            if(args.size()!=0){
//                System.out.println("Line:" + methodDeclaration.getLine() + ": main method must not have any argument");
//                hasTypeError = true;
//            }
//            if( ! methodDeclaration.getReturnType().toString().equals(new IntType().toString())){
//                System.out.println("Line:" + methodDeclaration.getLine() + ": main method return type must be int");
//                hasTypeError = true;
//            }

        }

        if(methodDeclaration.getReturnType().isUserDefined()) {
            UserDefinedType methRetType = (UserDefinedType) methodDeclaration.getReturnType();

            if(classDecs.containsKey(methRetType.getClassType())) {
                ((UserDefinedType) methodDeclaration.getReturnType()).setClassDeclaration(classDecs.get(methRetType.getClassType()));
                try{
                    ((UserDefinedType)((SymbolTableMethodItem)SymbolTable.top.get(methodDeclaration.toString())).getReturnType()).setClassDeclaration(classDecs.get(methRetType.getClassType()));
                }catch(ItemNotFoundException notFound){

                }
            }
            else {
                System.out.println("Line:" + methodDeclaration.getLine() + ":class " + methRetType.getClassType() + " is not declared");
                hasTypeError = true;
            }
        }

        SymbolTable.push(methodSymbolTables.get(methodDeclaration.getName().getName() + "@" + methodDeclaration.getClassName()));

        ArrayList<Type> argTypes = new ArrayList<Type>();
        for(int i = 0; i < args.size(); ++i)
            argTypes.add(args.get(i).getType());
        for(int i = 0; i < args.size(); i++)
            args.get(i).accept(this);

        ArrayList<VarDeclaration> localVars = methodDeclaration.getLocalVars();
        for(int i = 0; i < localVars.size(); i++)
            localVars.get(i).accept(this);

        ArrayList<Statement> body = methodDeclaration.getBody();
        for(int i = 0; i < body.size(); i++)
            body.get(i).accept(this);
        Type retType = methodDeclaration.getReturnValue().typeCheck(SymbolTable.top);
        if( !isSubType(retType, methodDeclaration.getReturnType())){
            hasTypeError = true;
            System.out.println("Line:" + methodDeclaration.getReturnValue().getLine() + ":" + methodDeclaration.getName().getName() + " return type must be " + methodDeclaration.getReturnType().toString());
        }

        //methodDeclaration.getReturnValue().accept(this);
        SymbolTable.pop();
    }

    @Override
    public void visit(VarDeclaration varDeclaration) {

        if(varDeclaration.getType().isUserDefined()) {
            UserDefinedType varType = (UserDefinedType) varDeclaration.getType();

            if(classDecs.containsKey(varType.getClassType()))
                varType.setClassDeclaration(classDecs.get(varType.getClassType()));
            else {
                hasTypeError = true;
                System.out.println("Line:" + varDeclaration.getLine() + ":class " + varType.getClassType() + " is not declared");
            }
        }
        varDeclaration.getIdentifier().setType(varDeclaration.getType());
        //varDeclaration.getIdentifier().accept(this);
    }

    @Override
    public void visit(ArrayCall arrayCall) {
        //arrayCall.getInstance().accept(this);
        //arrayCall.getIndex().accept(this);
        arrayCall.typeCheck(SymbolTable.top);
        arrayCall.setType(new IntType());
    }

    @Override
    public void visit(BinaryExpression binaryExpression) {
        //if( binaryExpression.getRight() == null )
         //   binaryExpression.getLeft().accept(this);

        binaryExpression.getLeft().accept(this);

        Type retType = binaryExpression.typeCheck(SymbolTable.top);
        binaryExpression.setType(retType);
        binaryExpression.getRight().accept(this);

    }

    @Override
    public void visit(Identifier identifier) {
        SymbolTable currSymbolTable = SymbolTable.top;

    }

    @Override
    public void visit(Length length) {
        Type expressionType = length.getExpression().typeCheck(SymbolTable.top);
        if(!expressionType.toString().equals(new ArrayType().toString()) && !expressionType.toString().equals(new NoType().toString()) ) {
            System.out.println("Line:" + length.getLine() + ":length method call is only valid on arrays");
            hasTypeError = true;
        }
        length.setType(new IntType());
        //length.getExpression().accept(this);
    }

    @Override
    public void visit(MethodCall methodCall) {


        Type retType = methodCall.typeCheck(SymbolTable.top);
        methodCall.setType(retType);
//        ArrayList<Expression> args = methodCall.getArgs();
//        for(int i = 0; i < args.size(); i++)
//            args.get(i).accept(this);
    }

    @Override
    public void visit(NewArray newArray) {

        Type retType = newArray.typeCheck(SymbolTable.top);
        newArray.setType(retType);
    }

    @Override
    public void visit(NewClass newClass) {
        Type retType = newClass.typeCheck(SymbolTable.top);
        newClass.setType(retType);
    }

    @Override
    public void visit(This instance) {
        instance.setType(currClassType);
    }

    @Override
    public void visit(UnaryExpression unaryExpression) {
        //unaryExpression.getValue().accept(this);
        Type retType = unaryExpression.typeCheck(SymbolTable.top);
        unaryExpression.setType(retType);
    }

    @Override
    public void visit(BooleanValue value) {
        value.setType(new BooleanType());
    }

    @Override
    public void visit(IntValue value) {
        value.setType(new IntType());
    }

    @Override
    public void visit(StringValue value) {
        value.setType(new StringType());
    }

    @Override
    public void visit(Assign assign) {
        //System.out.println("@#@#@#@ " + assign.getrValue() + " " + assign.getrValue());
        Type rType = assign.getrValue().typeCheck(SymbolTable.top);
        Type lType = assign.getlValue().typeCheck(SymbolTable.top);

        //if(assign.getrValue()==null)
          //  assign.getlValue().accept(this);

        if(!isSubType(rType, lType)){
            hasTypeError = true;
            System.out.println("Line:" + assign.getLine() + ":unsupported operand type for assign");
        }
        if(rType.toString().equals(new ArrayType().toString()) && lType.toString().equals(new ArrayType().toString())){
            ((ArrayType)lType).setSize( ((ArrayType)rType).getSize() );
        }
        //System.out.println("______________ " + assign.getlValue().toString());
        if(!assign.getlValue().toString().equals(new String("ArrayCall")) && !assign.getlValue().toString().split(" ")[0].equals("Identifier") && !lType.toString().equals(new NoType().toString())){
            System.out.println("Line:" + assign.getLine() + ":left side of assignment must be a valid lvalue" );
            hasTypeError = true;
        }
    }

    @Override
    public void visit(Block block) {
        ArrayList<Statement> body = block.getBody();
        for(int i = 0; i < body.size(); i++) {
            body.get(i).accept(this);

        }
    }

    @Override
    public void visit(Conditional conditional) {
        //conditional.getExpression().accept(this);

        Type expressionType = conditional.getExpression().typeCheck(SymbolTable.top);
        if(expressionType.isUserDefined() && ((UserDefinedType)expressionType).getClassDeclaration()!=null) {
            if (!expressionType.toString().equals(new BooleanType().toString())) {
                hasTypeError = true;
                System.out.println("Line:" + conditional.getLine() + ":condition type must be boolean");
            }
        }
        else if (!expressionType.toString().equals(new BooleanType().toString()) && !expressionType.toString().equals(new NoType().toString())) {
                System.out.println("Line:" + conditional.getLine() + ":condition type must be boolean");
                hasTypeError = true;
        }

        conditional.getConsequenceBody().accept(this);
        if(conditional.getAlternativeBody() != null)
            conditional.getAlternativeBody().accept(this);
    }

    @Override
    public void visit(While loop) {
        //loop.getCondition().accept(this);

        Type conditionType = loop.getCondition().typeCheck(SymbolTable.top);
        if(! conditionType.toString().equals(new BooleanType().toString()) && !conditionType.toString().equals(new NoType().toString()) ) {
            System.out.println("Line:" + loop.getLine() + ":condition type must be boolean");
            hasTypeError = true;
        }

        loop.getBody().accept(this);
    }

    @Override
    public void visit(Write write) {
        //write.getArg().accept(this);

        Type writeArgType = write.getArg().typeCheck(SymbolTable.top);
        write.setArgType(writeArgType);
        if(!writeArgType.toString().equals(new IntType().toString()) && !writeArgType.toString().equals(new StringType().toString()) && !writeArgType.toString().equals(new ArrayType().toString()) && !writeArgType.toString().equals(new NoType().toString())) {
            System.out.println("Line:" + write.getLine() +":unsupported type for writeln");
            hasTypeError = true;
        }
    }

}
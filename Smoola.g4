grammar Smoola;

@parser::header
{
    import ast.*;
    import ast.node.*;
    import ast.node.declaration.*;
    import ast.node.expression.*;
    import ast.node.expression.Value.*;
    import ast.node.statement.*;
    import ast.Type.*;
    import ast.Type.ArrayType.*;
    import ast.Type.PrimitiveType.*;
    import ast.Type.UserDefinedType.*;
}

    program returns [Program prog]:
        {$prog = new Program();}
         mainClass{$prog.setMainClass($mainClass.syn_classDec);}
         (classDeclaration{$prog.addClass($classDeclaration.syn_classDec);})* EOF
    ;
    mainClass returns [ClassDeclaration syn_classDec]:
        // name should be checked later
        'class' className = ID {$syn_classDec = new ClassDeclaration(new Identifier($className.text), null);
                $syn_classDec.getParentName().setLine($className.getLine());
                $syn_classDec.setLine($className.getLine());}
                {MethodDeclaration mainMethod = new MethodDeclaration(new Identifier(null)); mainMethod.setClassName(new Identifier($className.text));}
                '{' 'def' methodName = ID {mainMethod.setLine($methodName.getLine()); mainMethod.setName(new Identifier($methodName.text));}'(' ')' ':' 'int' {mainMethod.setReturnType(new IntType());} '{'
                statements {ArrayList<Statement> allStatements = $statements.syn_stmt.getBody(); for(int i = 0; i < allStatements.size(); i++) {mainMethod.addStatement(allStatements.get(i));} }
                'return' expression {mainMethod.setReturnValue($expression.syn_expr);} ';' '}''}' {$syn_classDec.addMethodDeclaration(mainMethod); }
    ;
    classDeclaration returns [ClassDeclaration syn_classDec]:
        'class' className = ID {$syn_classDec = new ClassDeclaration(new Identifier($className.text), null); }('extends' classParent = ID {$syn_classDec.setParentName(new Identifier($classParent.text) );} )?
                '{' (varDeclaration {$syn_classDec.addVarDeclaration($varDeclaration.syn_varDec);})*
                (methodDeclaration {$methodDeclaration.syn_methodDec.setClassName(new Identifier($className.text)); $syn_classDec.addMethodDeclaration($methodDeclaration.syn_methodDec);})* '}'
                {$syn_classDec.setLine($className.getLine());}
    ;
    varDeclaration returns [VarDeclaration syn_varDec]:
        'var' varName = ID ':' type {$syn_varDec = new VarDeclaration(new Identifier($varName.text), $type.syn_type);
        $syn_varDec.setLine($varName.getLine());
        } ';'
    ;
    methodDeclaration returns [MethodDeclaration syn_methodDec]:
        'def' {$syn_methodDec = new MethodDeclaration(new Identifier(null));}
         methodName = ID {$syn_methodDec.setLine($methodName.getLine()); $syn_methodDec.setName(new Identifier($methodName.text));} ('(' ')' | ('(' argName = ID {$syn_methodDec.setName(new Identifier($methodName.text));}':'
         type{$syn_methodDec.addArg(new VarDeclaration(new Identifier($argName.text), $type.syn_type));} (',' argName = ID ':' type {$syn_methodDec.addArg(new VarDeclaration(new Identifier($argName.text), $type.syn_type));})* ')')) ':' type {$syn_methodDec.setReturnType($type.syn_type);}'{'
         (varDeclaration{$syn_methodDec.addLocalVar($varDeclaration.syn_varDec);})*
         statements{ArrayList<Statement> allStatements = $statements.syn_stmt.getBody(); for(int i = 0; i < allStatements.size(); i++)
         {$syn_methodDec.addStatement(allStatements.get(i));} }
         'return' expression ';' {$syn_methodDec.setReturnValue($expression.syn_expr);}'}'
    ;
    statements returns [Block syn_stmt]:
        {$syn_stmt = new Block();
        $syn_stmt.setLine($ctx.start.getLine());}
        (statement {$syn_stmt.addStatement($statement.syn_stmt);})*
    ;
    statement returns [Statement syn_stmt]:
        statementBlock {$syn_stmt = $statementBlock.syn_stmt;} |
        statementCondition {$syn_stmt = $statementCondition.syn_stmt;} |
        statementLoop {$syn_stmt = $statementLoop.syn_stmt;} |
        statementWrite {$syn_stmt = $statementWrite.syn_stmt;} |
        statementAssignment {$syn_stmt = $statementAssignment.syn_stmt;}
    ;
    statementBlock returns [Statement syn_stmt]:
        '{'  statements '}' {$syn_stmt = $statements.syn_stmt;}
    ;
    statementCondition returns [Conditional syn_stmt]:
        'if' '('expression')' 'then' statement {$syn_stmt = new Conditional($expression.syn_expr, $statement.syn_stmt);
        $syn_stmt.setLine($ctx.start.getLine());}
        ('else' statement)? {$syn_stmt.setAlternativeBody($statement.syn_stmt);}
    ;
    statementLoop returns [While syn_stmt]:
        'while' '(' expression ')' statement {$syn_stmt = new While($expression.syn_expr, $statement.syn_stmt);
        $syn_stmt.setLine($ctx.start.getLine());}
    ;
    statementWrite returns [Write syn_stmt]:
        'writeln(' expression ')' ';' {$syn_stmt = new Write($expression.syn_expr);
        $syn_stmt.setLine($ctx.start.getLine());}

    ;
    statementAssignment returns [Statement syn_stmt]:
        expressionAssignment ';' {$syn_stmt = ($expressionAssignment.syn_expr.getRight() == null ? new Statement() :(new Assign($expressionAssignment.syn_expr.getLeft(), $expressionAssignment.syn_expr.getRight())));
        $syn_stmt.setLine($ctx.start.getLine());}
    ;
    expression returns[ Expression syn_expr]:
		expressionAssignment {$syn_expr = ($expressionAssignment.syn_expr.getRight() == null ? $expressionAssignment.syn_expr.getLeft() : $expressionAssignment.syn_expr);}
	;
    expressionAssignment returns [ BinaryExpression syn_expr]:
		expressionOr '=' expressionAssignment {$syn_expr = new BinaryExpression($expressionOr.syn_expr, (($expressionAssignment.syn_expr.getRight() == null)? $expressionAssignment.syn_expr.getLeft() : $expressionAssignment.syn_expr), BinaryOperator.assign);
		$syn_expr.setLine($ctx.start.getLine());}
	    |	expressionOr {$syn_expr = new BinaryExpression($expressionOr.syn_expr, null, null);}
	;
    expressionOr returns [Expression syn_expr]:
		expressionAnd expressionOrTemp[$expressionAnd.syn_expr] {$syn_expr = $expressionOrTemp.syn_expr;}
	;
    expressionOrTemp [Expression inh_expr] returns [Expression syn_expr]:
		'||' expressionAnd {Expression exprTillNow = new BinaryExpression($inh_expr, $expressionAnd.syn_expr, BinaryOperator.or);
		                     exprTillNow.setLine($ctx.start.getLine());}
	    expressionOrTemp[exprTillNow] {$syn_expr = $expressionOrTemp.syn_expr;}
	    | {$syn_expr = inh_expr;}
	;
    expressionAnd returns [Expression syn_expr]:
		expressionEq expressionAndTemp[$expressionEq.syn_expr] {$syn_expr = $expressionAndTemp.syn_expr;}
	;
    expressionAndTemp[Expression inh_expr] returns[Expression syn_expr]:
		'&&' expressionEq{Expression exprTillNow = new BinaryExpression($inh_expr, $expressionEq.syn_expr, BinaryOperator.and);
		    exprTillNow.setLine($ctx.start.getLine());}
		    expressionAndTemp[exprTillNow] {$syn_expr = $expressionAndTemp.syn_expr;}
	    | {$syn_expr = $inh_expr;}
	;
    expressionEq returns [Expression syn_expr]:
		expressionCmp expressionEqTemp[$expressionCmp.syn_expr] {$syn_expr = $expressionEqTemp.syn_expr;}
	;
    expressionEqTemp[Expression inh_expr] returns [Expression syn_expr]:
        {BinaryOperator op;}
		('==' {op = BinaryOperator.eq;}| '<>'{op = BinaryOperator.neq;}) expressionCmp {Expression exprTillNow = new BinaryExpression($inh_expr, $expressionCmp.syn_expr, op);
		    exprTillNow.setLine($ctx.start.getLine());}
		    expressionEqTemp[exprTillNow] {$syn_expr = $expressionEqTemp.syn_expr;}
	    | {$syn_expr = $inh_expr;}
	;
    expressionCmp returns [Expression syn_expr]:
		expressionAdd expressionCmpTemp[$expressionAdd.syn_expr] {$syn_expr = $expressionCmpTemp.syn_expr;}
	;
    expressionCmpTemp[Expression inh_expr] returns [Expression syn_expr]:
        {BinaryOperator op;}
		('<' {op = BinaryOperator.lt;}| '>' {op = BinaryOperator.gt;}) expressionAdd {Expression exprTillNow = new BinaryExpression($inh_expr, $expressionAdd.syn_expr, op);
		    exprTillNow.setLine($ctx.start.getLine());}
		    expressionCmpTemp[exprTillNow] {$syn_expr = $expressionCmpTemp.syn_expr;}
	    | {$syn_expr = $inh_expr;}
	;

    expressionAdd returns [Expression syn_expr]:
		expressionMult expressionAddTemp[$expressionMult.syn_expr] {$syn_expr = $expressionAddTemp.syn_expr;}
	;

    expressionAddTemp[Expression inh_expr] returns [Expression syn_expr]:
        {BinaryOperator op;}
		('+' {op = BinaryOperator.add;}| '-' {op = BinaryOperator.sub;})
		expressionMult{Expression exprTillNow = new BinaryExpression($inh_expr, $expressionMult.syn_expr, op);
                       exprTillNow.setLine($ctx.start.getLine());}
                       expressionAddTemp[exprTillNow] {$syn_expr = $expressionAddTemp.syn_expr;}
	    | {$syn_expr = $inh_expr;}
	;

    expressionMult returns [Expression syn_expr]:
		expressionUnary expressionMultTemp[$expressionUnary.syn_expr] {$syn_expr = $expressionMultTemp.syn_expr;}
	;

    expressionMultTemp[Expression inh_expr] returns [Expression syn_expr, String syn_op]:
        {BinaryOperator op;}
		('*' {op = BinaryOperator.mult;}| '/' {op = BinaryOperator.div;})
		expressionUnary{Expression exprTillNow = new BinaryExpression($inh_expr, $expressionUnary.syn_expr, op);
                        exprTillNow.setLine($ctx.start.getLine());} expressionMultTemp[exprTillNow]
		{$syn_expr = $expressionMultTemp.syn_expr;}
	    | {$syn_expr = inh_expr;}
	;

    expressionUnary returns [Expression syn_expr]:
		{UnaryOperator op; }
		('!' {op = UnaryOperator.not;}| '-' {op = UnaryOperator.minus;}) expressionUnary
		{$syn_expr = new UnaryExpression(op, $expressionUnary.syn_expr);
		$syn_expr.setLine($ctx.start.getLine());}
	    |	expressionMem {$syn_expr = $expressionMem.syn_expr;}
	;

    expressionMem returns [Expression syn_expr]:
		expressionMethods expressionMemTemp { $syn_expr = ($expressionMemTemp.syn_expr == null) ? $expressionMethods.syn_expr :  (new ArrayCall($expressionMethods.syn_expr, $expressionMemTemp.syn_expr));
		        if($expressionMemTemp.syn_expr != null)
		            $syn_expr.setLine($ctx.start.getLine());}
	;

    expressionMemTemp returns [Expression syn_expr]:
		'[' expression ']' {$syn_expr = $expression.syn_expr;
		        $syn_expr.setLine($ctx.start.getLine());}
	    | {$syn_expr = null;}
	;
	expressionMethods returns [Expression syn_expr]:
	    expressionOther expressionMethodsTemp [$expressionOther.syn_expr] {$syn_expr = $expressionMethodsTemp.syn_expr;
	            $syn_expr.setLine($ctx.start.getLine());}
	;
	expressionMethodsTemp [Expression inh_instance] returns[Expression syn_expr]:
	       {Expression instanceTillNow = new MethodCall(null, null);}
	       {MethodCall methodCallTillNow = new MethodCall(null, null);}
	    '.' (methodName = ID {methodCallTillNow = new MethodCall($inh_instance, new Identifier($methodName.text));} '(' ')' {instanceTillNow = methodCallTillNow;}
	    | methodName = ID {methodCallTillNow = new MethodCall($inh_instance, new Identifier($methodName.text));} '(' (expression {methodCallTillNow.addArg($expression.syn_expr);}(',' expression {methodCallTillNow.addArg($expression.syn_expr);})*) ')' {instanceTillNow = methodCallTillNow;}| 'length' {instanceTillNow = new Length($inh_instance);} )
	        expressionMethodsTemp[instanceTillNow]
	            {$syn_expr = $expressionMethodsTemp.syn_expr; $syn_expr.setLine($ctx.start.getLine());}
	    | {$syn_expr = $inh_instance; }
	;
    expressionOther returns [Expression syn_expr]:
		val = CONST_NUM { $syn_expr = new IntValue( $val.int, new IntType() );
		        $syn_expr.setLine($ctx.start.getLine());}
        |	val = CONST_STR { $syn_expr = new StringValue( $val.text, new StringType() );
                $syn_expr.setLine($ctx.start.getLine());}
        |   'new ' 'int' '[' size = CONST_NUM ']' {NewArray newArr = new NewArray(); newArr.setExpression(new IntValue( $size.int, new IntType() ));
                $syn_expr = newArr; $syn_expr.setLine($ctx.start.getLine());}
        |   'new ' className = ID '(' ')' { $syn_expr = new NewClass( new Identifier($className.text) );
                $syn_expr.setLine($ctx.start.getLine());}
        |   'this' { $syn_expr = new This();
                $syn_expr.setLine($ctx.start.getLine());}
        |   'true' { $syn_expr = new BooleanValue( true, new BooleanType() );
                $syn_expr.setLine($ctx.start.getLine());}
        |   'false' { $syn_expr = new BooleanValue( false, new BooleanType() );
                $syn_expr.setLine($ctx.start.getLine());}
        |	iden = ID { $syn_expr = new Identifier($iden.text);
                $syn_expr.setLine($ctx.start.getLine());}
        |   arrayName = ID '[' expression ']' { $syn_expr = new ArrayCall( new Identifier($arrayName.text), $expression.syn_expr);
                $syn_expr.setLine($ctx.start.getLine());}
        |	'(' expression ')' { $syn_expr = $expression.syn_expr; }
	;
	type returns [Type syn_type]:
	    'int' { $syn_type = new IntType();}
	    |'boolean' { $syn_type = new BooleanType();}
	    |'string' { $syn_type = new StringType();}
	    |'int' '[' ']' { $syn_type = new ArrayType();}
	    |classType = ID { UserDefinedType temp = new UserDefinedType(); temp.setClassType($classType.text); $syn_type = temp;}
	;
    CONST_NUM:
		[0-9]+
	;

    CONST_STR:
		'"' ~('\r' | '\n' | '"')* '"'
	;
    NL:
		'\r'? '\n' -> skip
	;

    ID :
		[a-zA-Z_][a-zA-Z0-9_]*
	;

    COMMENT:
		'#'(~[\r\n])* -> skip
	;

    WS:
    	[ \t] -> skip
    ;
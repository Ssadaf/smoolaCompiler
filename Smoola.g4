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

    program:
        {Program prog = new Program();}
         mainClass{prog.setMainClass($mainClass.syn_classDec);}
         (classDeclaration{prog.addClass($classDeclaration.syn_classDec);})* EOF
    ;
    mainClass returns [ClassDeclaration syn_classDec]:
        // name should be checked later
        'class' className = ID {$syn_classDec = new ClassDeclaration(new Identifier($className.text), null);
                $syn_classDec.setLine($ctx.start.getLine());}
                '{' 'def' ID '(' ')' ':' 'int' '{'  statements 'return' expression ';' '}' '}'
    ;
    classDeclaration returns [ClassDeclaration syn_classDec]:
        'class' className = ID ('extends' classParent = ID {$syn_classDec.setParentName(new Identifier($classParent.text) );} )?
                '{' (varDeclaration {$syn_classDec.addVarDeclaration($varDeclaration.syn_varDec);})*
                (methodDeclaration {$syn_classDec.addMethodDeclaration($methodDeclaration.syn_methodDec);})* '}'
    ;
    varDeclaration returns [VarDeclaration syn_varDec]:
        'var' varName = ID ':' type {$syn_varDec = new VarDeclaration(new Identifier($varName.text), $type.syn_type);
        $syn_varDec.setLine($ctx.start.getLine());} ';'
    ;
    methodDeclaration returns [MethodDeclaration syn_methodDec]:
        'def' methodName = ID {$syn_methodDec = new MethodDeclaration(new Identifier($methodName.text) );
        $syn_methodDec.setLine($ctx.start.getLine());}
        ('(' ')' | ('(' ID ':' type (',' ID ':' type)* ')')) ':' type '{'  varDeclaration* statements 'return' expression ';' '}'
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
    statementAssignment returns [Assign syn_stmt]:
        expressionOr '=' expressionAssignment ';' {$syn_stmt = new Assign($expressionOr.syn_expr, $expressionAssignment.syn_expr);
        $syn_stmt.setLine($ctx.start.getLine());}
    ;
    expression returns[ Expression syn_expr]:
		expressionAssignment {$syn_expr = $expressionAssignment.syn_expr;}
	;
    expressionAssignment returns [ Expression syn_expr]:
		expressionOr '=' expressionAssignment {$syn_expr = new BinaryExpression($expressionOr.syn_expr, $expressionAssignment.syn_expr, BinaryOperator.assign);
		$syn_expr.setLine($ctx.start.getLine());}
	    |	expressionOr {$syn_expr = $expressionOr.syn_expr;}
	;
    expressionOr returns [Expression syn_expr]:
		expressionAnd expressionOrTemp {$syn_expr = ($expressionOrTemp.syn_expr == null) ?
		$expressionAnd.syn_expr :
		new BinaryExpression($expressionAnd.syn_expr, $expressionOrTemp.syn_expr, BinaryOperator.or);
		if($expressionOrTemp.syn_expr != null)
		    $syn_expr.setLine($ctx.start.getLine());}
	;
    expressionOrTemp returns [Expression syn_expr]:
		'||' expressionAnd  expressionOrTemp {$syn_expr = ($expressionOrTemp.syn_expr == null) ?
		($expressionAnd.syn_expr) :
		(new BinaryExpression($expressionAnd.syn_expr, $expressionOrTemp.syn_expr, BinaryOperator.or));
		if($expressionOrTemp.syn_expr == null)
		    $syn_expr.setLine($ctx.start.getLine());}
	    | {$syn_expr = null;}
	;
    expressionAnd returns [Expression syn_expr]:
		expressionEq expressionAndTemp {$syn_expr = ($expressionAndTemp.syn_expr == null) ?
		 $expressionEq.syn_expr :
		 (new BinaryExpression($expressionEq.syn_expr, $expressionAndTemp.syn_expr, BinaryOperator.and));
		 if($expressionAndTemp.syn_expr == null)
		    $syn_expr.setLine($ctx.start.getLine());
		 }
	;
    expressionAndTemp returns[Expression syn_expr]:
		'&&' expressionEq expressionAndTemp {$syn_expr = ($expressionAndTemp.syn_expr == null) ?
		($expressionEq.syn_expr) :
		(new BinaryExpression($expressionEq.syn_expr, $expressionAndTemp.syn_expr, BinaryOperator.and));
		if($expressionAndTemp.syn_expr == null)
    		$syn_expr.setLine($ctx.start.getLine());
		}
	    | {$syn_expr = null;}
	;
    expressionEq returns [Expression syn_expr]:
		expressionCmp expressionEqTemp {$syn_expr = ($expressionEqTemp.syn_expr == null) ?
		$expressionCmp.syn_expr :
		(new BinaryExpression($expressionCmp.syn_expr, $expressionEqTemp.syn_expr, ($expressionEqTemp.syn_op == "==" ? BinaryOperator.eq : BinaryOperator.neq)) );
		if($expressionEqTemp.syn_expr == null)
    		 $syn_expr.setLine($ctx.start.getLine());
		 }
	;
    expressionEqTemp returns [Expression syn_expr, String syn_op]:
		('==' {$syn_op = "==";}| '<>'{$syn_op = "<>";}) expressionCmp expressionEqTemp {$syn_expr = ($expressionEqTemp.syn_expr == null) ?
		($expressionCmp.syn_expr) :
		(new BinaryExpression($expressionCmp.syn_expr, $expressionEqTemp.syn_expr, ($expressionEqTemp.syn_op == "==" ? BinaryOperator.eq : BinaryOperator.neq)) );
		if($expressionEqTemp.syn_expr != null)
		    $syn_expr.setLine($ctx.start.getLine());}
	    | {$syn_expr = null; $syn_op = "";}
	;
    expressionCmp returns [Expression syn_expr]:
		expressionAdd expressionCmpTemp {$syn_expr = ($expressionCmpTemp.syn_expr == null) ?
		$expressionAdd.syn_expr :
		(new BinaryExpression($expressionAdd.syn_expr, $expressionCmpTemp.syn_expr, ($expressionCmpTemp.syn_op == "<" ? BinaryOperator.lt : BinaryOperator.gt)) );
		if($expressionCmpTemp.syn_expr != null)
		    $syn_expr.setLine($ctx.start.getLine());}
	;
    expressionCmpTemp returns [Expression syn_expr, String syn_op]:
		('<' {$syn_op = "<";}| '>' {$syn_op = ">";}) expressionAdd expressionCmpTemp {$syn_expr = ($expressionCmpTemp.syn_expr == null) ?
		($expressionAdd.syn_expr) :
		(new BinaryExpression($expressionAdd.syn_expr, $expressionCmpTemp.syn_expr, ($expressionCmpTemp.syn_op == "<" ? BinaryOperator.lt : BinaryOperator.gt)));
        if($expressionCmpTemp.syn_expr != null)
            $syn_expr.setLine($ctx.start.getLine());
		}
	    | {$syn_expr = null; $syn_op = "";}
	;

    expressionAdd returns [Expression syn_expr]:
		expressionMult expressionAddTemp {$syn_expr = ($expressionAddTemp.syn_expr == null) ?
		$expressionMult.syn_expr :
		(new BinaryExpression($expressionMult.syn_expr, $expressionAddTemp.syn_expr, ($expressionAddTemp.syn_op == "+" ? BinaryOperator.add : BinaryOperator.sub)) );
		if($expressionAddTemp.syn_expr != null)
		    $syn_expr.setLine($ctx.start.getLine());}
	;

    expressionAddTemp returns [Expression syn_expr, String syn_op]:
		('+' {$syn_op = "+";}| '-' {$syn_op = "-";})
		expressionMult expressionAddTemp {$syn_expr = ($expressionAddTemp.syn_expr == null) ? ($expressionMult.syn_expr) : (new BinaryExpression($expressionMult.syn_expr, $expressionAddTemp.syn_expr, ($expressionAddTemp.syn_op == "+" ? BinaryOperator.add : BinaryOperator.sub)) );
		if($expressionAddTemp.syn_expr != null)
		    $syn_expr.setLine($ctx.start.getLine());}
	    | {$syn_expr = null; $syn_op = "";}
	;

    expressionMult returns [Expression syn_expr]:
		expressionUnary expressionMultTemp {$syn_expr = ($expressionMultTemp.syn_expr == null) ?
		$expressionUnary.syn_expr :
		(new BinaryExpression($expressionUnary.syn_expr, $expressionMultTemp.syn_expr, ($expressionMultTemp.syn_op == "*") ? BinaryOperator.mult: BinaryOperator.div));
		if($expressionMultTemp.syn_expr != null)
		    $syn_expr.setLine($ctx.start.getLine());}
	;

    expressionMultTemp returns [Expression syn_expr, String syn_op]:
		('*' {$syn_op = "*";}| '/' {$syn_op = "/";}) expressionUnary expressionMultTemp
		{$syn_expr = ($expressionMultTemp.syn_expr == null) ?
		($expressionUnary.syn_expr) :
		(new BinaryExpression($expressionUnary.syn_expr, $expressionMultTemp.syn_expr, ($expressionMultTemp.syn_op == "*" ? BinaryOperator.mult : BinaryOperator.div)) );
		if($expressionMultTemp.syn_expr != null)
		    $syn_expr.setLine($ctx.start.getLine());}
	    | {$syn_expr = null; $syn_op = "";}
	;

    expressionUnary returns [Expression syn_expr]:
		{UnaryOperator op; } ('!' {op = UnaryOperator.not;}| '-' {op = UnaryOperator.minus;}) expressionUnary
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
	    '.' (methodName = ID {instanceTillNow = new MethodCall($inh_instance, new Identifier($methodName.text));}
	    '(' ')' | methodName = ID '(' (expression (',' expression)*) ')' {instanceTillNow = new MethodCall($inh_instance, new Identifier($methodName.text));} | 'length' {instanceTillNow = new Length($inh_instance);} ) expressionMethodsTemp[instanceTillNow]
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
	    |ID { $syn_type = new UserDefinedType();}
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
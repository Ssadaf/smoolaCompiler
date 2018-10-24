lexer grammar SMOOLA;

BOOLEAN: 'boolean'
    {System.out.println("boolean")};

STRING: 'string'
    {System.out.println("string")};

INT: 'int'
    {System.out.println("int")};

CLASS: 'class'
    {System.out.println("ClassDec:")};

METHOD: 'def'
    {System.out.println("MethodDec:")};

THEN: 'then';

IF: 'if'
     {System.out.println("Conditional:if")};

WRITELN: 'writeln';

EXTENDS: 'extends';

VAR: 'var'
    {System.out.println("VarDec:")};

THIS: 'this';

FALSE: 'false';

TRUE: 'true';

WHILE: 'while'
     {System.out.println("Loop:While")};

ELSE: 'else'
     {System.out.println("Conditional:else")};

RETURN: 'return';

NEW: 'new';

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;

ADD: '+';

SUB: '-';

AND: '&&';

OR: '||';

MUL: '*';

DIV: '/';

NOT: '!';

EQUAL: '==';

NOTEQUAL: '<>';

LESSTHAN: '<';

GRATERTHAN: '>';

ASSIGN: '=';

NUMBER: [0-9]+;

WHITESPACE: [ \t\r\n] -> skip;

//LOGICAL_UNARY: NOT;
//
//LOGICAL_BINARY: OR | AND;
//
//COMPARATOR_BINARY: EQUAL | NOTEQUAL | LESSTHAN | GRATERTHAN;
//
//ARITHMATIC_BINARY: ADD | SUB | MUL | DIV;

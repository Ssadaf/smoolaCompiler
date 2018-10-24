grammar SMOOLA;

comparator_exp: expression COMPARATOR_BINARY expression;

arithmethic_exp: expression ARITHMETIC_BINARY expression
              | SUB expression;

logical_exp: expression LOGICAL_BINARY expression
           | LOGICAL_UNARY expression ;

condition: '('expression')';

while_expression: WHILE condition '{'body'}';

if_expression: IF condition THEN ('{'body'}'| line) (ELSE ('{'body'}' | line) | ); 

line: (expression |
      | while_expression
      | if_expression)';';

expression: '('expression')'
          | comparator_exp
          | arithmethic_exp
          | logical_exp
          | IDENTIFIER
          | INT
          | LOGICAL_VAL;

body: (line)* | '{'body'}';


var_dec: VAR IDENTIFIER ':' TYPE;
//PROGRAM: MAIN_CLASS

TYPE: BOOLEAN | STRING | INT | ARRAY | IDENTIFIER;

ARRAY: 'int[]';

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

LOGICAL_VAL: TRUE | FALSE;

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

COMMENT: '#'~('\r' | '\n')*;

LOGICAL_UNARY: NOT;

LOGICAL_BINARY: OR | AND;

COMPARATOR_BINARY: EQUAL | NOTEQUAL | LESSTHAN | GRATERTHAN;

ARITHMETIC_BINARY: ADD | SUB | MUL | DIV;

//grammar SMOOLA;
//
//@members{
//   void print(Object obj){
//        System.out.println(obj);
//   }
//}
//
//program
//    :    additionExp
//    ;
//
//additionExp
//    :    multiplyExp
//         ( '+' multiplyExp
//         | '-' multiplyExp
//         )*
//    ;
//
//
//multiplyExp
//    :    atomExp
//         ( '*' atomExp
//         | '/' atomExp
//         )*
//    ;
//
//atomExp
//    :    num = NUMBER {print($num.text);}
//    |    '(' additionExp ')'
//    ;
//
//
//NUMBER
//    :    [0-9]+
//    ;

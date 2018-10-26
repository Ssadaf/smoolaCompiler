grammar SMOOLA;

//program: main_class (usual_class)* EOF;

//main_class: CLASS IDENTIFIER '{' main_method '}';

//main_method: DEF 'main' '(' ')' ':' 'int' '{' method_body '}';

//usual_class: CLASS IDENTIFIER ( (EXTENDS IDENTIFIER) | ) '{' var_dec* method* '}';

arithmethic_exp: mult_expr ( (SUB | ADD) mult_expr )*;

condition: '('expression')';

while_expression: WHILE condition '{'body'}';

if_expression: IF condition THEN ('{'body'}'| line) (ELSE ('{'body'}' | line) | );

expression:('('expression')'
          | equal_exp
          | arithmethic_exp
          | logical_exp
          | logical_val
          | string
          | IDENTIFIER
          | NUMBER) expression
          | ;

line: (expression
      | while_expression
      | if_expression
      | comment
      | )';';

body: (line)*
      | '{'body'}';

//method_body: body RETURN expression ';' ;

//method: DEF IDENTIFIER  '(' ((argument (',' argument)*) | ) ')' ':' type '{'var_dec* method_body'}';

argument: IDENTIFIER ':' type;

var_dec: VAR IDENTIFIER ':' type ';' ;


type: BOOLEAN 
    | STRING 
    | INT 
    | ARRAY 
    | IDENTIFIER;

logical_val: TRUE 
           | FALSE;

comment: '#'~('\r' | '\n')*;

string: '"'~('\r' | '\n' | '"' )'"';

comparator_atom: ( arithmethic_exp )
              ( (GRATERTHAN | LESSTHAN)
              ( arithmethic_exp ))*;

logical_exp: and_expr( OR and_expr )*;

equal_exp: (comparator_atom | atom_logical_expr | ( '(' (comparator_atom | atom_bool_exp)  ')') )
           ( (EQUAL | NOTEQUAL) (comparator_atom| atom_logical_expr |( '(' (comparator_atom | atom_bool_exp) ')') ) )*;

mult_expr: atom_arith_expr ( ( MUL | DIV ) atom_arith_expr )*;

atom_bool_exp: logical_val | '(' logical_exp ')';

atom_arith_expr: (SUB | )(IDENTIFIER | NUMBER | '(' arithmethic_exp ')');

and_expr: (equal_exp) ( AND ( equal_exp) )*;

atom_logical_expr: (NOT| ) (IDENTIFIER | logical_val | '(' logical_exp ')');

NUMBER: ('-' | '+' | ) [0-9]+;

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

WHITESPACE: [ \t\r\n] -> skip;

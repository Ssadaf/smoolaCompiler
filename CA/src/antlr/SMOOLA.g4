grammar SMOOLA;

program: main_class (usual_class)* EOF;

main_class: comment* CLASS IDENTIFIER '{' main_method '}';

main_method: comment* METHOD 'main' '(' ')' ':' 'int' comment* '{' method_body '}'comment*;

usual_class: comment* CLASS IDENTIFIER ( (EXTENDS IDENTIFIER) | ) '{'( (comment | var_dec)* (comment | method)* )'}';

arithmethic_exp: mult_expr ( (SUB | ADD) mult_expr )*;

condition: '('expression')';

while_expression: comment* WHILE condition comment* '{' body '}'comment*;

if_expression: comment* IF condition THEN comment* ('{'body'}'| line) comment* (ELSE ('{'body'}' | line) | )comment*;

array_element: IDENTIFIER '[' arithmethic_exp ']';

assignment: (IDENTIFIER | array_element) ('=' (expression))+;

instanciation: IDENTIFIER '=' NEW IDENTIFIER '('( ( expression (',' expression )*) | )')';

expression:('('expression')'
          | assignment
          | logical_exp
          | instanciation
          | string) expression
          | ;

line: expression ';'
      | instanciation ';'
      | while_expression
      | if_expression
      | comment
      |';';

body: (line)*
      | '{'body'}';

method_body: body RETURN expression ';' comment*;

method: comment* METHOD IDENTIFIER  '(' ((argument (',' argument)*) | ) ')' ':' type comment* '{' (comment | var_dec)* method_body'}' comment*;

argument: IDENTIFIER ':' type;

var_dec: VAR IDENTIFIER ':' type ';' ;

type: BOOLEAN 
    | STRING 
    | INT 
    | ARRAY 
    | IDENTIFIER;

logical_val: TRUE 
           | FALSE;

string: '"'~('\r' | '\n' | '"' )'"';

comparator_atom: ( arithmethic_exp )
              ( (GRATERTHAN | LESSTHAN)
              ( arithmethic_exp ))*;

logical_exp: and_expr( OR and_expr )*;

equal_exp: (comparator_atom | atom_logical_expr | ( '(' (comparator_atom | atom_bool_exp)  ')') )
           ( (EQUAL | NOTEQUAL) (comparator_atom| atom_logical_expr |( '(' (comparator_atom | atom_bool_exp) ')') ) )*;

mult_expr: atom_arith_expr ( ( MUL | DIV ) atom_arith_expr )*;

atom_bool_exp: logical_val | '(' logical_exp ')';

atom_arith_expr: (SUB | )(IDENTIFIER | array_element | NUMBER | '(' arithmethic_exp ')');

and_expr: (equal_exp) ( AND ( equal_exp) )*;

atom_logical_expr: (NOT| ) (IDENTIFIER | array_element | logical_val | '(' logical_exp ')');

comment: COMMENT;

COMMENT: '#'~[\r\n]*;

NUMBER: ('-' | ) [0-9]+;

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

ENTER: '\n' -> skip;

WS: [ \t\r] -> skip ;




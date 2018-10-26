grammar SMOOLA;

program: main_class (usual_class)* EOF;

main_class: comment* CLASS IDENTIFIER '{' main_method '}';

main_method: comment* METHOD 'main' '(' ')' ':' 'int' comment* '{' main_method_body '}'comment*;

usual_class: comment* CLASS IDENTIFIER ( (EXTENDS IDENTIFIER) | ) '{'( (comment | var_dec)* (comment | method)* )'}';

main_arithmethic_exp: main_mult_expr ( (SUB | ADD) main_mult_expr )*;

arithmethic_exp: mult_expr ( (SUB | ADD) mult_expr )*;

condition: '('expression')';

main_condition: '(' main_expression ')';

while_expression: comment* WHILE condition comment* '{' body '}'comment*;

main_while_expression: comment* WHILE main_condition comment* '{' main_body '}'comment*;

if_expression: comment* IF condition THEN comment* ('{'body'}'| line) comment* (ELSE ('{'body'}' | line) | )comment*;

main_if_expression: comment* IF main_condition THEN comment* ('{'main_body'}'| main_line) comment* (ELSE ('{'main_body'}' | main_line) | )comment*;

array_element: IDENTIFIER '[' arithmethic_exp ']';

assignment: (IDENTIFIER | array_element) ('=' (expression | method_call | new_array))+;

main_assignment: (IDENTIFIER | array_element) ('=' (main_expression | method_call | new_array))+;

instanciation: (IDENTIFIER | array_element) '=' NEW (IDENTIFIER '('( ( expression (',' expression )*) | )')');

new_array: NEW INT '[' NUMBER ']';

array_length: IDENTIFIER '.' LENGTH;

method_call: ( NEW (IDENTIFIER '('( ( expression (',' expression )*) | )')') | IDENTIFIER ) '.' IDENTIFIER '('( ( expression (',' expression )*) | )')';

main_writeln_call: WRITELN '(' (NUMBER | string | IDENTIFIER | method_call) ')';

writeln_call: WRITELN '(' (NUMBER | string | IDENTIFIER) ')';

main_expression: ('('main_expression')'
               | main_assignment
               | main_logical_exp
               | instanciation
               | string) main_expression
               | method_call
               | ;

main_line: main_expression ';'
         | main_while_expression
         | main_if_expression
         | comment
         | main_writeln_call ';'
         | method_call ';'
         | ';';

expression:('('expression')'
          | assignment
          | logical_exp
          | instanciation
          | string) expression
          | ;

line: expression ';'
      | while_expression
      | if_expression
      | comment
      | writeln_call ';'
      |';';

body: (line)*
      | '{'body'}';


main_body: (main_line)*
         | '{'main_body'}';

method_body: body RETURN expression ';' comment*;

main_method_body: main_body RETURN (main_expression) ';' comment*;

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

main_comparator_atom: ( main_arithmethic_exp )
                      ( (GRATERTHAN | LESSTHAN)
                      ( main_arithmethic_exp ))*;

comparator_atom: ( arithmethic_exp )
              ( (GRATERTHAN | LESSTHAN)
              ( arithmethic_exp ))*;

logical_exp: and_expr( OR and_expr )*;

main_logical_exp: main_and_expr(OR main_and_expr);

equal_exp: (comparator_atom | atom_logical_expr | ( '(' (comparator_atom | atom_bool_exp)  ')') )
           ( (EQUAL | NOTEQUAL) (comparator_atom| atom_logical_expr |( '(' (comparator_atom | atom_bool_exp) ')') ) )*;

main_equal_exp: (main_comparator_atom | main_atom_logical_expr | ( '(' (main_comparator_atom | main_atom_bool_exp)  ')') )
                ( (EQUAL | NOTEQUAL) (main_comparator_atom| main_atom_logical_expr |( '(' (main_comparator_atom | main_atom_bool_exp) ')') ) )*;

mult_expr: atom_arith_expr ( ( MUL | DIV ) atom_arith_expr )*;

main_mult_expr: main_atom_arith_expr ( ( MUL | DIV ) main_atom_arith_expr )*;

atom_bool_exp: logical_val | '(' logical_exp ')';

main_atom_bool_exp: logical_val | '(' main_logical_exp ')';

main_atom_arith_expr: (SUB | )(IDENTIFIER | array_element | method_call | NUMBER | array_length |'(' main_arithmethic_exp ')');

atom_arith_expr: (SUB | )(IDENTIFIER | array_element | NUMBER | array_length |'(' arithmethic_exp ')');

and_expr: (equal_exp) ( AND ( equal_exp) )*;

main_and_expr: (main_equal_exp) (AND (main_equal_exp) )*;

main_atom_logical_expr: (NOT| ) (IDENTIFIER | array_element | logical_val | method_call | '(' main_logical_exp ')');

atom_logical_expr: (NOT| ) (IDENTIFIER | array_element | logical_val | '(' logical_exp ')');

comment: COMMENT;

COMMENT: '#'~[\r\n]*;

NUMBER: ('-' | ) [0-9]+;

LENGTH: 'length';

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




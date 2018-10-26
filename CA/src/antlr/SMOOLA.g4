grammar SMOOLA;

program: main_class (usual_class)* EOF;

main_class: comment* CLASS IDENTIFIER LEFT_CURL main_method RIGHT_CURL;

main_method: comment* METHOD IDENTIFIER LEFT_PAR RIGHT_PAR COLUMN INT comment* LEFT_CURL main_method_body RIGHT_CURL comment*;

usual_class: comment* CLASS IDENTIFIER ( (EXTENDS IDENTIFIER) | ) LEFT_CURL( (comment | var_dec)* (comment | method)* )RIGHT_CURL;

main_arithmethic_exp: main_mult_expr ( (SUB | ADD) main_mult_expr )*;

arithmethic_exp: mult_expr ( (SUB | ADD) mult_expr )*;

condition: LEFT_PAR expression RIGHT_PAR;

main_condition: LEFT_PAR main_expression RIGHT_PAR;

while_expression: comment* WHILE condition comment* LEFT_CURL body RIGHT_CURL comment*;

main_while_expression: comment* WHILE main_condition comment* LEFT_CURL main_body RIGHT_CURL comment*;

if_expression: comment* IF condition THEN comment* (LEFT_CURL body RIGHT_CURL| line) comment* (ELSE (LEFT_CURL body RIGHT_CURL | line) | )comment*;

main_if_expression: comment* IF main_condition THEN comment* (LEFT_CURL main_body RIGHT_CURL| main_line) comment* (ELSE (LEFT_CURL main_body RIGHT_CURL | main_line) | )comment*;

array_element: IDENTIFIER LEFT_BRACKET arithmethic_exp RIGHT_BRACKET;

assignment: (IDENTIFIER | array_element) (ASSIGN (expression | method_call | new_array))+;

main_assignment: (IDENTIFIER | array_element) (ASSIGN (main_expression | method_call | new_array))+;

instanciation: (IDENTIFIER | array_element) ASSIGN NEW (IDENTIFIER LEFT_PAR( ( expression (COMMA expression )*) | )RIGHT_PAR);

new_array: NEW INT LEFT_BRACKET NUMBER RIGHT_BRACKET;

array_length: IDENTIFIER DOT LENGTH;

method_call: ( NEW (IDENTIFIER LEFT_PAR( ( expression (COMMA expression )*) | )RIGHT_PAR) | IDENTIFIER ) DOT IDENTIFIER LEFT_PAR( ( expression (COMMA expression )*) | )RIGHT_PAR;

main_writeln_call: WRITELN LEFT_PAR (NUMBER | string | IDENTIFIER | method_call) RIGHT_PAR;

writeln_call: WRITELN LEFT_PAR (NUMBER | string | IDENTIFIER) RIGHT_PAR;

main_expression: (LEFT_PAR main_expression RIGHT_PAR
               | main_assignment
               | main_logical_exp
               | instanciation
               | method_call
               | string) main_expression
               | ;

main_line: main_expression SEMI_COLUMN
         | main_while_expression
         | main_if_expression
         | comment
         | main_writeln_call SEMI_COLUMN
         | method_call SEMI_COLUMN
         | SEMI_COLUMN;

expression:(LEFT_PAR expression RIGHT_PAR
          | assignment
          | logical_exp
          | instanciation
          | string) expression
          | ;

line: expression SEMI_COLUMN
      | while_expression
      | if_expression
      | comment
      | writeln_call SEMI_COLUMN
      |SEMI_COLUMN;

body: (line)*
      | LEFT_CURL body RIGHT_CURL;


main_body: (main_line)*
         | LEFT_CURL main_body RIGHT_CURL;

method_body: body RETURN expression SEMI_COLUMN comment*;

main_method_body: main_body RETURN main_expression SEMI_COLUMN comment*;

method: comment* METHOD IDENTIFIER  LEFT_PAR ((argument (COMMA argument)*) | ) RIGHT_PAR COLUMN type comment* LEFT_CURL (comment | var_dec)* method_body RIGHT_CURL comment*;

argument: IDENTIFIER COLUMN type;

var_dec: VAR IDENTIFIER COLUMN type SEMI_COLUMN ;

type: BOOLEAN 
    | STRING 
    | INT 
    | ARRAY 
    | IDENTIFIER;

logical_val: TRUE 
           | FALSE;

string: STRING_VAL;

main_comparator_atom: ( main_arithmethic_exp )
                      ( (GRATERTHAN | LESSTHAN)
                      ( main_arithmethic_exp ))*;

comparator_atom: ( arithmethic_exp )
              ( (GRATERTHAN | LESSTHAN)
              ( arithmethic_exp ))*;

logical_exp: and_expr( OR and_expr )*;

main_logical_exp: main_and_expr(OR main_and_expr)*;

equal_exp: (comparator_atom | atom_logical_expr | ( LEFT_PAR (comparator_atom | atom_bool_exp)  RIGHT_PAR) )
           ( (EQUAL | NOTEQUAL) (comparator_atom| atom_logical_expr |( LEFT_PAR (comparator_atom | atom_bool_exp) RIGHT_PAR) ) )*;

main_equal_exp: (main_comparator_atom | main_atom_logical_expr | ( LEFT_PAR (main_comparator_atom | main_atom_bool_exp)  RIGHT_PAR) )
                ( (EQUAL | NOTEQUAL) (main_comparator_atom| main_atom_logical_expr |( LEFT_PAR (main_comparator_atom | main_atom_bool_exp) RIGHT_PAR) ) )*;

mult_expr: atom_arith_expr ( ( MUL | DIV ) atom_arith_expr )*;

main_mult_expr: main_atom_arith_expr ( ( MUL | DIV ) main_atom_arith_expr )*;

atom_bool_exp: logical_val | LEFT_PAR logical_exp RIGHT_PAR;

main_atom_bool_exp: logical_val | LEFT_PAR main_logical_exp RIGHT_PAR;

main_atom_arith_expr: (SUB | )(IDENTIFIER | array_element | method_call | NUMBER | array_length |LEFT_PAR main_arithmethic_exp RIGHT_PAR);

atom_arith_expr: (SUB | )(IDENTIFIER | array_element | NUMBER | array_length |LEFT_PAR arithmethic_exp RIGHT_PAR);

and_expr: (equal_exp) ( AND ( equal_exp) )*;

main_and_expr: (main_equal_exp) (AND (main_equal_exp) )*;

main_atom_logical_expr: (NOT| ) (IDENTIFIER | array_element | logical_val | method_call | LEFT_PAR main_logical_exp RIGHT_PAR);

atom_logical_expr: (NOT| ) (IDENTIFIER | array_element | logical_val | LEFT_PAR logical_exp RIGHT_PAR);

comment: COMMENT;

DOT: '.';

LEFT_BRACKET: '[';

RIGHT_BRACKET: ']';

STRING_VAL: '"'~('\r' | '\n' | '"' )'"';

COLUMN: ':';

SEMI_COLUMN: ';';

LEFT_PAR: '(';

RIGHT_PAR: ')';

LEFT_CURL: '{';

RIGHT_CURL: '}';

COMMA: ',';

COMMENT: '#'~[\r\n]*;

NUMBER: ('-' | ) [0-9]+;

LENGTH: 'length';

ARRAY: 'int[]';

BOOLEAN: 'boolean';

STRING: 'string';

INT: 'int';

CLASS: 'class';

METHOD: 'def';

THEN: 'then';

IF: 'if';

WRITELN: 'writeln';

EXTENDS: 'extends';

VAR: 'var';

THIS: 'this';

FALSE: 'false';

TRUE: 'true';

WHILE: 'while';

ELSE: 'else';

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

//ENTER: '\n' -> skip;

WS: [ \t\r\n] -> skip ;




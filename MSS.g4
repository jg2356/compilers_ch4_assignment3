grammar MSS;

prog: (expr NEWLINE)+
    ;
expr: DOUBLE # double
    | BOOLEAN # boolean
    | '(' RATOR expr* ')' # opexpr
    | '(' 'def' ID expr ')' # defvar
    | '(' 'if' expr expr expr ')' # ifexpr
    | ID # refvar
    ;

RATOR: ARITHMETIC_OP | RELATIONAL_OP | BOOLEAN_OP ; 
ARITHMETIC_OP: '^' | '*' | '/' | '+' | '-' ;
RELATIONAL_OP: '=' | '>' | '<' ;
BOOLEAN_OP: '&' | '|' | '!' ;
BOOLEAN: 'true' | 'false' ;
DOUBLE: ('-')? DIGIT+ ( '.' DIGIT+)? ;
ID: LETTER (LETTER|DIGIT|'_')* ;
NEWLINE: '\r'?'\n' ;
WS: [ \t] -> skip ;
fragment
 DIGIT: [0-9] ;
fragment
 LETTER: [a-zA-Z] ;

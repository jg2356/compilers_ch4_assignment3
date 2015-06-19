grammar MSS;

prog: (expr NEWLINE)+
    ;
expr: DOUBLE # double
    | '(' RATOR expr* ')' # operation
    | '(' 'def' ID expr ')' # defvar
    | ID # refvar
    ;

ID: LETTER (LETTER|DIGIT|'_')* ;
RATOR: '^' | '*' | '/' | '+' | '-' ;
NEWLINE: '\r'?'\n' ;
DOUBLE: ('-')? DIGIT+ ( '.' DIGIT+)? ;
WS: [ \t] -> skip ;
fragment
 DIGIT: [0-9] ;
fragment
 LETTER: [a-zA-Z] ;

grammar Calculadora;

prog:   (stat NEWLINE)* EOF;

stat:   expr                   # printExpr
    |   ID '=' expr            # assign
    ;

expr:   expr op=('*'|'/') expr          # MulDiv
    |   expr op=('+'|'-') expr          # AddSub
    |   expr POW expr                   # Power
    |   ABS expr ABS                    # Absolute
    |   SUB expr                        # Negative
    |   LPAREN expr RPAREN              # Parens
    |   NUMBER                          # Number
    |   ID                              # Id
    ;

ID  :   [a-zA-Z]+ ;
NUMBER  :   [0-9]+ ('.' [0-9]+)?;
POW     :   '^';
ABS     :   '|';
SUB     :   '-';
LPAREN  :   '(';
RPAREN  :   ')';
NEWLINE :   [\r\n]+;
WS      :   [ \t]+ -> skip;

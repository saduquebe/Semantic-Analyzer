grammar BccLanguage;

prog    : fn_decl_list* main_prog;

var_decl: ID ':' DATATYPE (',' ID ':' DATATYPE)*;

fn_decl_list: FUNCTION FID ':' DATATYPE '(' var_decl? ')'
            (VAR var_decl ';')?
            stmt_block
            ;

stmt_block  : '{' stmt+ '}'
            | stmt
            ;

stmt    : PRINT lexpr ';'
        | INPUT ID ';'
        | WHEN '(' lexpr ')' DO stmt_block
        | IF '(' lexpr ')' DO stmt_block ELSE stmt_block
        | UNLESS '(' lexpr ')' DO stmt_block
        | WHILE '(' lexpr ')' DO stmt_block
        | RETURN lexpr ';'
        | UNTIL '(' lexpr ')' DO stmt_block
        | LOOP stmt_block
        | DO stmt_block WHILE '(' lexpr ')'
        | DO stmt_block UNTIL '(' lexpr ')'
        | REPEAT NUM ':' stmt_block
        | FOR '(' lexpr ';' lexpr ';' lexpr ')' DO stmt_block
        | NEXT ';'
        | BREAK ';'
        | ID ':=' lexpr ';'
        | ID '+=' lexpr ';'
        | ID '-=' lexpr ';'
        | ID '*=' lexpr ';'
        | ID '/=' lexpr ';'
        | ID '%=' lexpr ';'
        | ID '++' ';'
        | ID '--' ';'
        | SUBS ID ';'
        | ADD ID ';'
        ;

lexpr   : nexpr ((AND nexpr)* | (OR nexpr)*)
        ;

nexpr   : NOT '(' lexpr ')'
        | rexpr
        ;

rexpr   : simple_expr (COMPARISONOP simple_expr)?
        ;

simple_expr : term (SUMOP term)*
            ;

term    : factor ((MUL|DIV|MOD) factor)*
        ;

factor  : NUM
        | BOOL
        | ID (RIGHT_INC=ADD | RIGHT_DEC=SUBS)?
        | (LEFT_INC=ADD | lEFT_DEC=SUBS)? ID
        | ID
        | '(' ALONE_EXPR=lexpr ')'
        | FID '(' (lexpr (',' lexpr)*)? ')'
        ;


main_prog   : (VAR var_decl ';')? stmt* END
            ;

MUL: '*';
DIV: '/';
MOD: '%';
SUMOP: ('+'|'-');
COMPARISONOP: ('<'|'=='|'<='|'>'|'>='|'!=');
DATATYPE: ('num' | 'bool');
FUNCTION: 'function';
VAR: 'var';
PRINT: 'print';
INPUT: 'input';
WHEN: 'when';
IF: 'if';
UNLESS: 'unless';
WHILE: 'while';
REPEAT: 'repeat';
RETURN: 'return';
UNTIL: 'until';
LOOP: 'loop';
DO: 'do';
ELSE: 'else';

AND: 'and';
OR: 'or';
FOR: 'for';
NEXT: 'next';
BREAK: 'break';
NOT: 'not';
BOOL: ('true' | 'false');
SUBS: '--';
ADD: '++';
END: 'end';
NUM: [0-9]+([.][0-9]+)?;
FID: '@'[a-zA-Z]+;
ID: [a-zA-Z]+ ;
ESP : [ \t\r\n]+ -> skip ;

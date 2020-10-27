grammar ETSql;

@header{
package com.shopee.xiaoshuai.entrytask.antlr;
}


fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];

fragment ZERO: [0];
fragment NONEZERO:[1-9];
fragment DIGIT:    [0-9];
fragment DIGITS:   DIGIT+;
fragment LETTER:[a-zA-Z];  //匹配字母
fragment DQUOTA_STRING:              '"' ( '\\'. | '""' | ~('"'| '\\') )* '"';
fragment SQUOTA_STRING:              '\'' ('\\'. | '\'\'' | ~('\'' | '\\'))* '\'';
fragment BQUOTA_STRING:              '`' ( '\\'. | '``' | ~('`'|'\\'))* '`';


// 操作符
EQUAL_OPERATOR:            '='; // Also assign.
GREATER_OR_EQUAL_OPERATOR: '>=';
GREATER_THAN_OPERATOR:     '>';
LESS_OR_EQUAL_OPERATOR:    '<=';
LESS_THAN_OPERATOR:        '<';
NOT_EQUAL_OPERATOR:        '!=';
NOT_EQUAL2_OPERATOR:       '<>' -> type(NOT_EQUAL_OPERATOR);

PLUS_OPERATOR:  '+';
MINUS_OPERATOR: '-';
MULT_OPERATOR:  '*';
DIV_OPERATOR:   '/';

LOGICAL_NOT_OPERATOR: '!';
LOGICAL_AND_OPERATOR: '&&';
LOGICAL_OR_OPERATOR: '||' ;

COMMA_SYMBOL:       ',';
SEMICOLON_SYMBOL:   ';';
COLON_SYMBOL:       ':';
OPEN_PAR_SYMBOL:    '(';
CLOSE_PAR_SYMBOL:   ')';
UNDERLINE_SYMBOL:   '_';

NULL2_SYMBOL: '\\N';
PARAM_MARKER: '?';

//关键字
CREATE_SYMBOL:                   C R E A T E;                                // SQL-2003-R
SELECT_SYMBOL:                   S E L E C T;                                // SQL-2003-R
FROM_SYMBOL:                     F R O M;
TABLE_SYMBOL:                    T A B L E ;
AS_SYMBOL:                       A S;                                        // SQL-2003-R
WHERE_SYMBOL:                    W H E R E;                                  // SQL-2003-R
SUM_SYMBOL:                      S U M;                                       // SQL-2003-N
AND_SYMBOL:                      A N D;                                      // SQL-2003-R
OR_SYMBOL:                       O R;                                        // SQL-2003-R
STRING_SYMBOL:                   S T R I N G;
INT_SYMBOL:                      I N T;                                      // SQL-2003-R
DOUBLE_SYMBOL:                   D O U B L E;                                // SQL-2003-R
GROUP_SYMBOL:                    G R O U P;                                  // SQL-2003-R
BY_SYMBOL:                       B Y;                                        // SQL-2003-R
BETWEEN_SYMBOL:                  B E T W E E N;                              // SQL-2003-R
NO_SYMBOL:                       N O;                                        // SQL-2003-R
NOT_SYMBOL:                      N O T;
IN_SYMBOL:                       I N;                                        // SQL-2003-R

WS: [ \r\n\t]+ -> channel(HIDDEN);  //忽略空白符

//数据类型
IDENTIFIER:                      (LETTER | DIGIT | '_')+;                   //匹配只含有数字字母和下划线的文本
STRING_LITERAL:                  DQUOTA_STRING | SQUOTA_STRING | BQUOTA_STRING; //字符串
INT:                             (ZERO| NONEZERO(DIGIT)*|'-' NONEZERO(DIGIT)*); //匹配整数
DOUBLE:                          (NONEZERO(DIGIT)*)'.'(DIGIT)*;            //配置带小数点的数



//语法
sqlstatement:( selectStatement|createStatement ) SEMICOLON_SYMBOL;

//建表语句解析
createStatement : CREATE_SYMBOL TABLE_SYMBOL tableName OPEN_PAR_SYMBOL column_defs CLOSE_PAR_SYMBOL;

column_defs:(column_def) (COMMA_SYMBOL column_def)*;

column_def: fullColumnName type_name;

type_name: INT_SYMBOL | STRING_SYMBOL | DOUBLE_SYMBOL;


//查询语句
selectStatement: SELECT_SYMBOL selectElements FROM_SYMBOL tableSources  ( whereClause )?   ( groupByCaluse )?;

selectElements: (star='*' | selectElement ) (',' selectElement)*;

selectElement
    : fullColumnName (AS_SYMBOL? uid)?
    | functionCall (AS_SYMBOL? uid)?
    ;

fullColumnName: IDENTIFIER ;

uid: IDENTIFIER      ;

functionCall:  SUM_SYMBOL OPEN_PAR_SYMBOL functionArg CLOSE_PAR_SYMBOL ;     //aggregateFunctionCall

functionArg:  IDENTIFIER;

tableSources: tableName | subquery;

subquery:(OPEN_PAR_SYMBOL selectStatement CLOSE_PAR_SYMBOL (AS_SYMBOL)? tableName);

tableName: IDENTIFIER ;


whereClause: WHERE_SYMBOL   logicExpression ;

logicExpression
     : conditionExpression
     |logicExpression logicalOperator logicExpression
     ;

conditionExpression
    :fullColumnName comparisonOperator value;


logicalOperator
    : AND_SYMBOL | LOGICAL_AND_OPERATOR  | OR_SYMBOL | LOGICAL_OR_OPERATOR
    ;

comparisonOperator
    : EQUAL_OPERATOR | GREATER_THAN_OPERATOR | LESS_THAN_OPERATOR | GREATER_OR_EQUAL_OPERATOR | LESS_OR_EQUAL_OPERATOR
    | NOT_EQUAL_OPERATOR | NOT_EQUAL2_OPERATOR
    ;

value
    :uid
    |textLiteral
    | decimalLiteral
    ;

textLiteral    : STRING_LITERAL    ;
decimalLiteral : DOUBLE | INT;


groupByCaluse:   GROUP_SYMBOL BY_SYMBOL   groupByItem (',' groupByItem)*    ;

groupByItem
    : fullColumnName ?
    ;























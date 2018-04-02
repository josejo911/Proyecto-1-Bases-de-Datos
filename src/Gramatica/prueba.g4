/**
Universidad del Vale de Guatemala
Gramtica para el proyecto.
Marlon Fuentes
Jose Jo
Diego */

grammar prueba;
//non-tokens

program
    : (query SEMICOLON)*  #sqlScript
    ;

CREATE: 'CREATE'|'create';
DATABASE: 'DATABASE'|'database';
DATABASES: 'DATABASES'|'databases';
ALTER: 'ALTER'|'alter';
DROP:'DROP'|'drop';
SHOW: 'SHOW'|'show';
USE: 'USE'|'use';
TABLE: 'TABLE'|'table';
CONSTRAINT: 'CONSTRAINT'|'constraint';
PRIMARY: 'PRIMARY'|'primary';
FOREIGN: 'FOREIGN'|'foreign';
KEY: 'KEY'|'key';
REFERENCES: 'REFERENCES'|'references';
CHECK: 'CHECK'|'check';
INT: 'INT'|'int';
FLOAT: 'FLOAT'| 'float';
DATE: 'DATE'| 'date';
CHAR: 'CHAR'|'char';
AND: 'AND'|'and';
OR: 'OR'|'or';
NOT: 'NOT'|'not';
RENAME: 'RENAME'|'rename';
TO: 'TO'|'to';
ADD: 'ADD'|'add';
COLUMN: 'COLUMN'|'column';
FROM: 'FROM' |'from';
INSERT: 'INSERT'|'insert';
INTO: 'INTO'|'into';
RELATIONAL: '<'|'>'|'='|'<='|'>=';
TABLES: 'TABLES'|'tables';
COLUMNS: 'COLUMNS'|'columns';
UPDATE: 'UPDATE'|'update';
SELECT: 'SELECT'|'select';
ORDER: 'ORDER'|'order';
BY:'BY'|'by';
ASC: 'ASC'|'asc';
DESC: 'DESC'|'desc';
NULL: 'NULL'|'null';
ALL: '*';
SET: 'SET'|'set';
WHERE: 'WHERE' | 'where';
DELETE: 'DELETE'|'delete';
SEMICOLON: ';';
WS :
    [ \t\r\n]+ -> skip
    ;
COMMENTS:
    ['//']*->skip
    ;
fragment LETTER: ('a'..'z'|'A'..'Z');
fragment DIGIT: '0'..'9';

//tokens
//ID empieza con letra y luego una letra o un digito, o solo una letra
ID: LETTER(LETTER|DIGIT)*;
NUM: DIGIT(DIGIT)*;
DATEFORMAT: DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-'DIGIT DIGIT;
CHARFORMAT: CHAR '('DIGIT')'|CHAR '('LETTER')';
//UNIT
/*
*
*/


query
    :createDatabase        #sqlCreateDB
    | alterDatabase        #sqlAlterDB
    |dropDatabase          #sqlDropDB
    | showDatabase         #sqlShowDB
    | useDatabase          #sqlUseDB
    | createTable          #sqlCreateTB
    | alterTable           #sqlAlterTB
    | dropTable            #sqlDropTB
    | showTables           #sqlShowTB
    | showColumns          #sqlShowColumns
    | insertInto           #sqlInsertTB
    | update               #sqlUpdateTB
    | deleteFrom           #sqlDeleteTB
    | select               #sqlSelectTB
    ;

//reglas
createDatabase
    : CREATE DATABASE ID    #createDatabaseRule
    ;
alterDatabase
    : ALTER DATABASE ID RENAME TO ID    #alterDatabaseRule
    ;
dropDatabase
    : DROP DATABASE ID  #dropDatabaseRule
    ;
showDatabase
    : SHOW DATABASES    #showDatabaseRule
    ;
useDatabase
    : USE DATABASE ID    #useDatabaseRule
    ;
createTable
    : CREATE TABLE ID '('ID dataType (',' ID dataType)* (CONSTRAINT cConstraint ) ')'  #createTableRule
    ;

//subreglas, no las principales pero utilizadas en las de arriba.
dataType
        : INT      #int
        |FLOAT     #float
        |DATE       #date
        |CHAR '('NUM ')'    #char
        ;
cConstraint
        : primaryKey    #primaryKeyConstraintRule
        |foreignKey(foreignKey)*    #foreignKeyConstraintRule
        |check(check)*  #checkConstraintRule
        ;
primaryKey
        : 'PK_'ID PRIMARY KEY '('ID(','ID)*')'  #primaryKeyRule
        ;
foreignKey
        : 'FK_'ID FOREIGN KEY '(' ID (','ID)*')' REFERENCES ID '(' ID (','ID)*')'   #foreignKeyRule
        ;
check
        :'CH_'ID CHECK '('exp ')'    #checkRule
        ;
logic
        : AND   #andLogicRule
        |OR     #orLogicRule
        ;
valuesFormat
        : ID    #idValueFormatRule
        |NUM    #numValueFormatRule
        |DATEFORMAT #dateFormatRule
        |CHARFORMAT #charFormatRule
        ;
selectFormat
        : ALL   #allSelectFormatRule
        | ID (',' ID)*  #idSelectFormatRule
        ;
orderFormat
        : ASC   #ascOrderFormatRule
        | DESC  #descOrderFormatRule
        ;
//revisar

exp
    : expression #expRule
    | #emptyExpression
    ;

expression
    : andExpr #andExpressionRule
    | expression OR andExpr  #orExpressionRule
    ;

andExpr
    : eqExpr #eqExpressionRule
    | andExpr AND eqExpr #andExpressioRule
    ;

eqExpr
    : relationExpr #relationExprRule
    | eqExpr eq_op relationExpr  #equalityExpressionRule
    ;

relationExpr
    : unaryExpr   #unaryExpressionRule
    | relationExpr rel_op unaryExpr #relationExpressionRule
    ;

unaryExpr
    :  '('(NOT)? ID  ')'  #notExpressionRule
    ;

eq_op
    : '=='|'!='  #eqOperators
    ;
rel_op
    : '<' | '>' | '<=' | '>='| '=' #relationOperators
    ;

alterTable
        : ALTER TABLE ID RENAME TO ID #alterTableIdRule
        |ALTER TABLE ID action (',' action)* #alterTableActionRule
        ;
action
        : ADD COLUMN ID dataType CONSTRAINT cConstraint #actionAddColumnRule
        |ADD CONSTRAINT cConstraint #actionAddConstraintRule
        |DROP COLUMN ID #actionDropColumnRule
        |DROP CONSTRAINT ID #actionDropConstraintRule
        ;

dropTable
        : DROP TABLE ID #dropTableRule
        ;
showTables
        : SHOW TABLES   #showTablesRule
        ;
showColumns
        : SHOW COLUMNS FROM ID  #showColumnsRule
        ;
//parte dos
insertInto
        : INSERT INTO ID '('ID(','ID)*')' VALUES '('valuesFormat (','valuesFormat)* ')' #insertIntoRule
        ;
update
        : UPDATE ID SET ID '='dataType(','dataType)* (WHERE exp)? #updateRule
        ;
deleteFrom
        : DELETE FROM ID (WHERE exp)? #deleteFromRule
        ;
select
        : SELECT selectFormat FROM ID (WHERE exp( ORDER BY orderFormat)?)?   #selectRule
        ;



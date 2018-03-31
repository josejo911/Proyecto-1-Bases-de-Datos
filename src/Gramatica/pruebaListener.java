// Generated from prueba.g4 by ANTLR 4.7.1
package Gramatica;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pruebaParser}.
 */
public interface pruebaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code sqlScript}
	 * labeled alternative in {@link pruebaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterSqlScript(pruebaParser.SqlScriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlScript}
	 * labeled alternative in {@link pruebaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitSqlScript(pruebaParser.SqlScriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlCreateDB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterSqlCreateDB(pruebaParser.SqlCreateDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlCreateDB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitSqlCreateDB(pruebaParser.SqlCreateDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlAlterDB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterSqlAlterDB(pruebaParser.SqlAlterDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlAlterDB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitSqlAlterDB(pruebaParser.SqlAlterDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlDropDB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterSqlDropDB(pruebaParser.SqlDropDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlDropDB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitSqlDropDB(pruebaParser.SqlDropDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlShowDB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterSqlShowDB(pruebaParser.SqlShowDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlShowDB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitSqlShowDB(pruebaParser.SqlShowDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlUseDB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterSqlUseDB(pruebaParser.SqlUseDBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlUseDB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitSqlUseDB(pruebaParser.SqlUseDBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlCreateTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterSqlCreateTB(pruebaParser.SqlCreateTBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlCreateTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitSqlCreateTB(pruebaParser.SqlCreateTBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlAlterTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterSqlAlterTB(pruebaParser.SqlAlterTBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlAlterTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitSqlAlterTB(pruebaParser.SqlAlterTBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlDropTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterSqlDropTB(pruebaParser.SqlDropTBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlDropTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitSqlDropTB(pruebaParser.SqlDropTBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlShowTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterSqlShowTB(pruebaParser.SqlShowTBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlShowTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitSqlShowTB(pruebaParser.SqlShowTBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlShowColumns}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterSqlShowColumns(pruebaParser.SqlShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlShowColumns}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitSqlShowColumns(pruebaParser.SqlShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlInsertTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterSqlInsertTB(pruebaParser.SqlInsertTBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlInsertTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitSqlInsertTB(pruebaParser.SqlInsertTBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlUpdateTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterSqlUpdateTB(pruebaParser.SqlUpdateTBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlUpdateTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitSqlUpdateTB(pruebaParser.SqlUpdateTBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlDeleteTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterSqlDeleteTB(pruebaParser.SqlDeleteTBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlDeleteTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitSqlDeleteTB(pruebaParser.SqlDeleteTBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlSelectTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterSqlSelectTB(pruebaParser.SqlSelectTBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlSelectTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitSqlSelectTB(pruebaParser.SqlSelectTBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createDatabaseRule}
	 * labeled alternative in {@link pruebaParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseRule(pruebaParser.CreateDatabaseRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createDatabaseRule}
	 * labeled alternative in {@link pruebaParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseRule(pruebaParser.CreateDatabaseRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterDatabaseRule}
	 * labeled alternative in {@link pruebaParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabaseRule(pruebaParser.AlterDatabaseRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterDatabaseRule}
	 * labeled alternative in {@link pruebaParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabaseRule(pruebaParser.AlterDatabaseRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropDatabaseRule}
	 * labeled alternative in {@link pruebaParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabaseRule(pruebaParser.DropDatabaseRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropDatabaseRule}
	 * labeled alternative in {@link pruebaParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabaseRule(pruebaParser.DropDatabaseRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showDatabaseRule}
	 * labeled alternative in {@link pruebaParser#showDatabase}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabaseRule(pruebaParser.ShowDatabaseRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showDatabaseRule}
	 * labeled alternative in {@link pruebaParser#showDatabase}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabaseRule(pruebaParser.ShowDatabaseRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code useDatabaseRule}
	 * labeled alternative in {@link pruebaParser#useDatabase}.
	 * @param ctx the parse tree
	 */
	void enterUseDatabaseRule(pruebaParser.UseDatabaseRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code useDatabaseRule}
	 * labeled alternative in {@link pruebaParser#useDatabase}.
	 * @param ctx the parse tree
	 */
	void exitUseDatabaseRule(pruebaParser.UseDatabaseRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableRule}
	 * labeled alternative in {@link pruebaParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableRule(pruebaParser.CreateTableRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableRule}
	 * labeled alternative in {@link pruebaParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableRule(pruebaParser.CreateTableRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link pruebaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterInt(pruebaParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link pruebaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitInt(pruebaParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link pruebaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterFloat(pruebaParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link pruebaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitFloat(pruebaParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code date}
	 * labeled alternative in {@link pruebaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDate(pruebaParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code date}
	 * labeled alternative in {@link pruebaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDate(pruebaParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char}
	 * labeled alternative in {@link pruebaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterChar(pruebaParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char}
	 * labeled alternative in {@link pruebaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitChar(pruebaParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryKeyConstraintRule}
	 * labeled alternative in {@link pruebaParser#cConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyConstraintRule(pruebaParser.PrimaryKeyConstraintRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyConstraintRule}
	 * labeled alternative in {@link pruebaParser#cConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyConstraintRule(pruebaParser.PrimaryKeyConstraintRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foreignKeyConstraintRule}
	 * labeled alternative in {@link pruebaParser#cConstraint}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyConstraintRule(pruebaParser.ForeignKeyConstraintRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreignKeyConstraintRule}
	 * labeled alternative in {@link pruebaParser#cConstraint}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyConstraintRule(pruebaParser.ForeignKeyConstraintRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkConstraintRule}
	 * labeled alternative in {@link pruebaParser#cConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckConstraintRule(pruebaParser.CheckConstraintRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkConstraintRule}
	 * labeled alternative in {@link pruebaParser#cConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckConstraintRule(pruebaParser.CheckConstraintRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryKeyRule}
	 * labeled alternative in {@link pruebaParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyRule(pruebaParser.PrimaryKeyRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyRule}
	 * labeled alternative in {@link pruebaParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyRule(pruebaParser.PrimaryKeyRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foreignKeyRule}
	 * labeled alternative in {@link pruebaParser#foreignKey}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyRule(pruebaParser.ForeignKeyRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreignKeyRule}
	 * labeled alternative in {@link pruebaParser#foreignKey}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyRule(pruebaParser.ForeignKeyRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkRule}
	 * labeled alternative in {@link pruebaParser#check}.
	 * @param ctx the parse tree
	 */
	void enterCheckRule(pruebaParser.CheckRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkRule}
	 * labeled alternative in {@link pruebaParser#check}.
	 * @param ctx the parse tree
	 */
	void exitCheckRule(pruebaParser.CheckRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andLogicRule}
	 * labeled alternative in {@link pruebaParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterAndLogicRule(pruebaParser.AndLogicRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andLogicRule}
	 * labeled alternative in {@link pruebaParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitAndLogicRule(pruebaParser.AndLogicRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orLogicRule}
	 * labeled alternative in {@link pruebaParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterOrLogicRule(pruebaParser.OrLogicRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orLogicRule}
	 * labeled alternative in {@link pruebaParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitOrLogicRule(pruebaParser.OrLogicRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idValueFormatRule}
	 * labeled alternative in {@link pruebaParser#valuesFormat}.
	 * @param ctx the parse tree
	 */
	void enterIdValueFormatRule(pruebaParser.IdValueFormatRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idValueFormatRule}
	 * labeled alternative in {@link pruebaParser#valuesFormat}.
	 * @param ctx the parse tree
	 */
	void exitIdValueFormatRule(pruebaParser.IdValueFormatRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numValueFormatRule}
	 * labeled alternative in {@link pruebaParser#valuesFormat}.
	 * @param ctx the parse tree
	 */
	void enterNumValueFormatRule(pruebaParser.NumValueFormatRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numValueFormatRule}
	 * labeled alternative in {@link pruebaParser#valuesFormat}.
	 * @param ctx the parse tree
	 */
	void exitNumValueFormatRule(pruebaParser.NumValueFormatRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dateFormatRule}
	 * labeled alternative in {@link pruebaParser#valuesFormat}.
	 * @param ctx the parse tree
	 */
	void enterDateFormatRule(pruebaParser.DateFormatRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dateFormatRule}
	 * labeled alternative in {@link pruebaParser#valuesFormat}.
	 * @param ctx the parse tree
	 */
	void exitDateFormatRule(pruebaParser.DateFormatRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charFormatRule}
	 * labeled alternative in {@link pruebaParser#valuesFormat}.
	 * @param ctx the parse tree
	 */
	void enterCharFormatRule(pruebaParser.CharFormatRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charFormatRule}
	 * labeled alternative in {@link pruebaParser#valuesFormat}.
	 * @param ctx the parse tree
	 */
	void exitCharFormatRule(pruebaParser.CharFormatRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allSelectFormatRule}
	 * labeled alternative in {@link pruebaParser#selectFormat}.
	 * @param ctx the parse tree
	 */
	void enterAllSelectFormatRule(pruebaParser.AllSelectFormatRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allSelectFormatRule}
	 * labeled alternative in {@link pruebaParser#selectFormat}.
	 * @param ctx the parse tree
	 */
	void exitAllSelectFormatRule(pruebaParser.AllSelectFormatRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idSelectFormatRule}
	 * labeled alternative in {@link pruebaParser#selectFormat}.
	 * @param ctx the parse tree
	 */
	void enterIdSelectFormatRule(pruebaParser.IdSelectFormatRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idSelectFormatRule}
	 * labeled alternative in {@link pruebaParser#selectFormat}.
	 * @param ctx the parse tree
	 */
	void exitIdSelectFormatRule(pruebaParser.IdSelectFormatRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ascOrderFormatRule}
	 * labeled alternative in {@link pruebaParser#orderFormat}.
	 * @param ctx the parse tree
	 */
	void enterAscOrderFormatRule(pruebaParser.AscOrderFormatRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ascOrderFormatRule}
	 * labeled alternative in {@link pruebaParser#orderFormat}.
	 * @param ctx the parse tree
	 */
	void exitAscOrderFormatRule(pruebaParser.AscOrderFormatRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code descOrderFormatRule}
	 * labeled alternative in {@link pruebaParser#orderFormat}.
	 * @param ctx the parse tree
	 */
	void enterDescOrderFormatRule(pruebaParser.DescOrderFormatRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code descOrderFormatRule}
	 * labeled alternative in {@link pruebaParser#orderFormat}.
	 * @param ctx the parse tree
	 */
	void exitDescOrderFormatRule(pruebaParser.DescOrderFormatRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpressionRule}
	 * labeled alternative in {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpressionRule(pruebaParser.NotExpressionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpressionRule}
	 * labeled alternative in {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpressionRule(pruebaParser.NotExpressionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicExpressionRule}
	 * labeled alternative in {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpressionRule(pruebaParser.LogicExpressionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicExpressionRule}
	 * labeled alternative in {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpressionRule(pruebaParser.LogicExpressionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpressionRule}
	 * labeled alternative in {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpressionRule(pruebaParser.RelationalExpressionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpressionRule}
	 * labeled alternative in {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpressionRule(pruebaParser.RelationalExpressionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpressionRule}
	 * labeled alternative in {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumExpressionRule(pruebaParser.NumExpressionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpressionRule}
	 * labeled alternative in {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumExpressionRule(pruebaParser.NumExpressionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpressionRule}
	 * labeled alternative in {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpressionRule(pruebaParser.IdExpressionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpressionRule}
	 * labeled alternative in {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpressionRule(pruebaParser.IdExpressionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableIdRule}
	 * labeled alternative in {@link pruebaParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableIdRule(pruebaParser.AlterTableIdRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableIdRule}
	 * labeled alternative in {@link pruebaParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableIdRule(pruebaParser.AlterTableIdRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableActionRule}
	 * labeled alternative in {@link pruebaParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableActionRule(pruebaParser.AlterTableActionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableActionRule}
	 * labeled alternative in {@link pruebaParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableActionRule(pruebaParser.AlterTableActionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionAddColumnRule}
	 * labeled alternative in {@link pruebaParser#action}.
	 * @param ctx the parse tree
	 */
	void enterActionAddColumnRule(pruebaParser.ActionAddColumnRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionAddColumnRule}
	 * labeled alternative in {@link pruebaParser#action}.
	 * @param ctx the parse tree
	 */
	void exitActionAddColumnRule(pruebaParser.ActionAddColumnRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionAddConstraintRule}
	 * labeled alternative in {@link pruebaParser#action}.
	 * @param ctx the parse tree
	 */
	void enterActionAddConstraintRule(pruebaParser.ActionAddConstraintRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionAddConstraintRule}
	 * labeled alternative in {@link pruebaParser#action}.
	 * @param ctx the parse tree
	 */
	void exitActionAddConstraintRule(pruebaParser.ActionAddConstraintRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionDropColumnRule}
	 * labeled alternative in {@link pruebaParser#action}.
	 * @param ctx the parse tree
	 */
	void enterActionDropColumnRule(pruebaParser.ActionDropColumnRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionDropColumnRule}
	 * labeled alternative in {@link pruebaParser#action}.
	 * @param ctx the parse tree
	 */
	void exitActionDropColumnRule(pruebaParser.ActionDropColumnRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionDropConstraintRule}
	 * labeled alternative in {@link pruebaParser#action}.
	 * @param ctx the parse tree
	 */
	void enterActionDropConstraintRule(pruebaParser.ActionDropConstraintRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionDropConstraintRule}
	 * labeled alternative in {@link pruebaParser#action}.
	 * @param ctx the parse tree
	 */
	void exitActionDropConstraintRule(pruebaParser.ActionDropConstraintRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTableRule}
	 * labeled alternative in {@link pruebaParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTableRule(pruebaParser.DropTableRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTableRule}
	 * labeled alternative in {@link pruebaParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTableRule(pruebaParser.DropTableRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTablesRule}
	 * labeled alternative in {@link pruebaParser#showTables}.
	 * @param ctx the parse tree
	 */
	void enterShowTablesRule(pruebaParser.ShowTablesRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTablesRule}
	 * labeled alternative in {@link pruebaParser#showTables}.
	 * @param ctx the parse tree
	 */
	void exitShowTablesRule(pruebaParser.ShowTablesRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumnsRule}
	 * labeled alternative in {@link pruebaParser#showColumns}.
	 * @param ctx the parse tree
	 */
	void enterShowColumnsRule(pruebaParser.ShowColumnsRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumnsRule}
	 * labeled alternative in {@link pruebaParser#showColumns}.
	 * @param ctx the parse tree
	 */
	void exitShowColumnsRule(pruebaParser.ShowColumnsRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoRule}
	 * labeled alternative in {@link pruebaParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoRule(pruebaParser.InsertIntoRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoRule}
	 * labeled alternative in {@link pruebaParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoRule(pruebaParser.InsertIntoRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code updateRule}
	 * labeled alternative in {@link pruebaParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdateRule(pruebaParser.UpdateRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code updateRule}
	 * labeled alternative in {@link pruebaParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdateRule(pruebaParser.UpdateRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleteFromRule}
	 * labeled alternative in {@link pruebaParser#deleteFrom}.
	 * @param ctx the parse tree
	 */
	void enterDeleteFromRule(pruebaParser.DeleteFromRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleteFromRule}
	 * labeled alternative in {@link pruebaParser#deleteFrom}.
	 * @param ctx the parse tree
	 */
	void exitDeleteFromRule(pruebaParser.DeleteFromRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectRule}
	 * labeled alternative in {@link pruebaParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelectRule(pruebaParser.SelectRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectRule}
	 * labeled alternative in {@link pruebaParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelectRule(pruebaParser.SelectRuleContext ctx);
}
// Generated from prueba.g4 by ANTLR 4.7.1
package Gramatica;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pruebaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pruebaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code sqlScript}
	 * labeled alternative in {@link pruebaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlScript(pruebaParser.SqlScriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlCreateDB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlCreateDB(pruebaParser.SqlCreateDBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlAlterDB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlAlterDB(pruebaParser.SqlAlterDBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlDropDB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlDropDB(pruebaParser.SqlDropDBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlShowDB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlShowDB(pruebaParser.SqlShowDBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlUseDB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlUseDB(pruebaParser.SqlUseDBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlCreateTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlCreateTB(pruebaParser.SqlCreateTBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlAlterTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlAlterTB(pruebaParser.SqlAlterTBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlDropTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlDropTB(pruebaParser.SqlDropTBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlShowTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlShowTB(pruebaParser.SqlShowTBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlShowColumns}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlShowColumns(pruebaParser.SqlShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlInsertTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlInsertTB(pruebaParser.SqlInsertTBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlUpdateTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlUpdateTB(pruebaParser.SqlUpdateTBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlDeleteTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlDeleteTB(pruebaParser.SqlDeleteTBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlSelectTB}
	 * labeled alternative in {@link pruebaParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlSelectTB(pruebaParser.SqlSelectTBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createDatabaseRule}
	 * labeled alternative in {@link pruebaParser#createDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabaseRule(pruebaParser.CreateDatabaseRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterDatabaseRule}
	 * labeled alternative in {@link pruebaParser#alterDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabaseRule(pruebaParser.AlterDatabaseRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropDatabaseRule}
	 * labeled alternative in {@link pruebaParser#dropDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabaseRule(pruebaParser.DropDatabaseRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showDatabaseRule}
	 * labeled alternative in {@link pruebaParser#showDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabaseRule(pruebaParser.ShowDatabaseRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code useDatabaseRule}
	 * labeled alternative in {@link pruebaParser#useDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseDatabaseRule(pruebaParser.UseDatabaseRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableRule}
	 * labeled alternative in {@link pruebaParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableRule(pruebaParser.CreateTableRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link pruebaParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(pruebaParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link pruebaParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(pruebaParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code date}
	 * labeled alternative in {@link pruebaParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(pruebaParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code char}
	 * labeled alternative in {@link pruebaParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(pruebaParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryKeyConstraintRule}
	 * labeled alternative in {@link pruebaParser#cConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyConstraintRule(pruebaParser.PrimaryKeyConstraintRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code foreignKeyConstraintRule}
	 * labeled alternative in {@link pruebaParser#cConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyConstraintRule(pruebaParser.ForeignKeyConstraintRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkConstraintRule}
	 * labeled alternative in {@link pruebaParser#cConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckConstraintRule(pruebaParser.CheckConstraintRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryKeyRule}
	 * labeled alternative in {@link pruebaParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyRule(pruebaParser.PrimaryKeyRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code foreignKeyRule}
	 * labeled alternative in {@link pruebaParser#foreignKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyRule(pruebaParser.ForeignKeyRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkRule}
	 * labeled alternative in {@link pruebaParser#check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckRule(pruebaParser.CheckRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andLogicRule}
	 * labeled alternative in {@link pruebaParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndLogicRule(pruebaParser.AndLogicRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orLogicRule}
	 * labeled alternative in {@link pruebaParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrLogicRule(pruebaParser.OrLogicRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idValueFormatRule}
	 * labeled alternative in {@link pruebaParser#valuesFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdValueFormatRule(pruebaParser.IdValueFormatRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numValueFormatRule}
	 * labeled alternative in {@link pruebaParser#valuesFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumValueFormatRule(pruebaParser.NumValueFormatRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dateFormatRule}
	 * labeled alternative in {@link pruebaParser#valuesFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateFormatRule(pruebaParser.DateFormatRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charFormatRule}
	 * labeled alternative in {@link pruebaParser#valuesFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFormatRule(pruebaParser.CharFormatRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allSelectFormatRule}
	 * labeled alternative in {@link pruebaParser#selectFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllSelectFormatRule(pruebaParser.AllSelectFormatRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idSelectFormatRule}
	 * labeled alternative in {@link pruebaParser#selectFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSelectFormatRule(pruebaParser.IdSelectFormatRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ascOrderFormatRule}
	 * labeled alternative in {@link pruebaParser#orderFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscOrderFormatRule(pruebaParser.AscOrderFormatRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code descOrderFormatRule}
	 * labeled alternative in {@link pruebaParser#orderFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescOrderFormatRule(pruebaParser.DescOrderFormatRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expRule}
	 * labeled alternative in {@link pruebaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRule(pruebaParser.ExpRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyExpression}
	 * labeled alternative in {@link pruebaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyExpression(pruebaParser.EmptyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpressionRule}
	 * labeled alternative in {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpressionRule(pruebaParser.AndExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpressionRule}
	 * labeled alternative in {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpressionRule(pruebaParser.OrExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpressioRule}
	 * labeled alternative in {@link pruebaParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpressioRule(pruebaParser.AndExpressioRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpressionRule}
	 * labeled alternative in {@link pruebaParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpressionRule(pruebaParser.EqExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationExprRule}
	 * labeled alternative in {@link pruebaParser#eqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExprRule(pruebaParser.RelationExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpressionRule}
	 * labeled alternative in {@link pruebaParser#eqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpressionRule(pruebaParser.EqualityExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpressionRule}
	 * labeled alternative in {@link pruebaParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionRule(pruebaParser.UnaryExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationExpressionRule}
	 * labeled alternative in {@link pruebaParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpressionRule(pruebaParser.RelationExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpressionRule}
	 * labeled alternative in {@link pruebaParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpressionRule(pruebaParser.NotExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_op(pruebaParser.Eq_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(pruebaParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterTableIdRule}
	 * labeled alternative in {@link pruebaParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableIdRule(pruebaParser.AlterTableIdRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterTableActionRule}
	 * labeled alternative in {@link pruebaParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableActionRule(pruebaParser.AlterTableActionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionAddColumnRule}
	 * labeled alternative in {@link pruebaParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionAddColumnRule(pruebaParser.ActionAddColumnRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionAddConstraintRule}
	 * labeled alternative in {@link pruebaParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionAddConstraintRule(pruebaParser.ActionAddConstraintRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionDropColumnRule}
	 * labeled alternative in {@link pruebaParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionDropColumnRule(pruebaParser.ActionDropColumnRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionDropConstraintRule}
	 * labeled alternative in {@link pruebaParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionDropConstraintRule(pruebaParser.ActionDropConstraintRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTableRule}
	 * labeled alternative in {@link pruebaParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableRule(pruebaParser.DropTableRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTablesRule}
	 * labeled alternative in {@link pruebaParser#showTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTablesRule(pruebaParser.ShowTablesRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumnsRule}
	 * labeled alternative in {@link pruebaParser#showColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumnsRule(pruebaParser.ShowColumnsRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertIntoRule}
	 * labeled alternative in {@link pruebaParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertIntoRule(pruebaParser.InsertIntoRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code updateRule}
	 * labeled alternative in {@link pruebaParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateRule(pruebaParser.UpdateRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deleteFromRule}
	 * labeled alternative in {@link pruebaParser#deleteFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteFromRule(pruebaParser.DeleteFromRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectRule}
	 * labeled alternative in {@link pruebaParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectRule(pruebaParser.SelectRuleContext ctx);
}
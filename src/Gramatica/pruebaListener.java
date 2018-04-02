// Generated from C:/Users/Aegis DSS/IdeaProjects/Proyecto-1-Bases-de-Datos-New/src/Gramatica\prueba.g4 by ANTLR 4.7
package Gramatica;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pruebaParser}.
 */
public interface pruebaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pruebaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(pruebaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(pruebaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#fecha}.
	 * @param ctx the parse tree
	 */
	void enterFecha(pruebaParser.FechaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#fecha}.
	 * @param ctx the parse tree
	 */
	void exitFecha(pruebaParser.FechaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(pruebaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(pruebaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#database}.
	 * @param ctx the parse tree
	 */
	void enterDatabase(pruebaParser.DatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#database}.
	 * @param ctx the parse tree
	 */
	void exitDatabase(pruebaParser.DatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(pruebaParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(pruebaParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabase(pruebaParser.AlterDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabase(pruebaParser.AlterDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(pruebaParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(pruebaParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#showDatabase}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabase(pruebaParser.ShowDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#showDatabase}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabase(pruebaParser.ShowDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#useDatabase}.
	 * @param ctx the parse tree
	 */
	void enterUseDatabase(pruebaParser.UseDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#useDatabase}.
	 * @param ctx the parse tree
	 */
	void exitUseDatabase(pruebaParser.UseDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#opTable}.
	 * @param ctx the parse tree
	 */
	void enterOpTable(pruebaParser.OpTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#opTable}.
	 * @param ctx the parse tree
	 */
	void exitOpTable(pruebaParser.OpTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(pruebaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(pruebaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(pruebaParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(pruebaParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(pruebaParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(pruebaParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(pruebaParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(pruebaParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#foreignKey}.
	 * @param ctx the parse tree
	 */
	void enterForeignKey(pruebaParser.ForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#foreignKey}.
	 * @param ctx the parse tree
	 */
	void exitForeignKey(pruebaParser.ForeignKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#check}.
	 * @param ctx the parse tree
	 */
	void enterCheck(pruebaParser.CheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#check}.
	 * @param ctx the parse tree
	 */
	void exitCheck(pruebaParser.CheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(pruebaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(pruebaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(pruebaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(pruebaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(pruebaParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(pruebaParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(pruebaParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(pruebaParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpr(pruebaParser.RelationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpr(pruebaParser.RelationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(pruebaParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(pruebaParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(pruebaParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(pruebaParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(pruebaParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(pruebaParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(pruebaParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(pruebaParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#showTables}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(pruebaParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#showTables}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(pruebaParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#showColumns}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(pruebaParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#showColumns}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(pruebaParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertInto(pruebaParser.InsertIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertInto(pruebaParser.InsertIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#updateSet}.
	 * @param ctx the parse tree
	 */
	void enterUpdateSet(pruebaParser.UpdateSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#updateSet}.
	 * @param ctx the parse tree
	 */
	void exitUpdateSet(pruebaParser.UpdateSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#deleteFrom}.
	 * @param ctx the parse tree
	 */
	void enterDeleteFrom(pruebaParser.DeleteFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#deleteFrom}.
	 * @param ctx the parse tree
	 */
	void exitDeleteFrom(pruebaParser.DeleteFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#selectFrom}.
	 * @param ctx the parse tree
	 */
	void enterSelectFrom(pruebaParser.SelectFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#selectFrom}.
	 * @param ctx the parse tree
	 */
	void exitSelectFrom(pruebaParser.SelectFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#sep}.
	 * @param ctx the parse tree
	 */
	void enterSep(pruebaParser.SepContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#sep}.
	 * @param ctx the parse tree
	 */
	void exitSep(pruebaParser.SepContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(pruebaParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(pruebaParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(pruebaParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(pruebaParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#add_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd_op(pruebaParser.Add_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#add_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd_op(pruebaParser.Add_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link pruebaParser#mult_op}.
	 * @param ctx the parse tree
	 */
	void enterMult_op(pruebaParser.Mult_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link pruebaParser#mult_op}.
	 * @param ctx the parse tree
	 */
	void exitMult_op(pruebaParser.Mult_opContext ctx);
}
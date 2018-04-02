// Generated from C:/Users/Aegis DSS/IdeaProjects/Proyecto-1-Bases-de-Datos-New/src/Gramatica\prueba.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link pruebaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(pruebaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#fecha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFecha(pruebaParser.FechaContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(pruebaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase(pruebaParser.DatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#createDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(pruebaParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#alterDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabase(pruebaParser.AlterDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#dropDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(pruebaParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#showDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabase(pruebaParser.ShowDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#useDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseDatabase(pruebaParser.UseDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#opTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpTable(pruebaParser.OpTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(pruebaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(pruebaParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(pruebaParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(pruebaParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#foreignKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKey(pruebaParser.ForeignKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck(pruebaParser.CheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(pruebaParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(pruebaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(pruebaParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#eqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(pruebaParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpr(pruebaParser.RelationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(pruebaParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(pruebaParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(pruebaParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(pruebaParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#showTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(pruebaParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#showColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(pruebaParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertInto(pruebaParser.InsertIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#updateSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSet(pruebaParser.UpdateSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#deleteFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteFrom(pruebaParser.DeleteFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#selectFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFrom(pruebaParser.SelectFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#sep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSep(pruebaParser.SepContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(pruebaParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_op(pruebaParser.Eq_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#add_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_op(pruebaParser.Add_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link pruebaParser#mult_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_op(pruebaParser.Mult_opContext ctx);
}
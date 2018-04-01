package sample.Main;

import Gramatica.pruebaBaseVisitor;
import Gramatica.pruebaParser;

public class TheVisitor extends pruebaBaseVisitor<String> {

    @Override public String visitSqlScript(pruebaParser.SqlScriptContext ctx) {




        return visitChildren(ctx); }

    @Override
    public String visitSqlCreateDB(pruebaParser.SqlCreateDBContext ctx) {
        return super.visitSqlCreateDB(ctx);
    }

    @Override
    public String visitSqlAlterDB(pruebaParser.SqlAlterDBContext ctx) {
        return super.visitSqlAlterDB(ctx);
    }

    @Override
    public String visitSqlDropDB(pruebaParser.SqlDropDBContext ctx) {
        return super.visitSqlDropDB(ctx);
    }

    @Override
    public String visitSqlShowDB(pruebaParser.SqlShowDBContext ctx) {
        return super.visitSqlShowDB(ctx);
    }

    @Override
    public String visitSqlUseDB(pruebaParser.SqlUseDBContext ctx) {
        return super.visitSqlUseDB(ctx);
    }

    @Override
    public String visitSqlCreateTB(pruebaParser.SqlCreateTBContext ctx) {
        return super.visitSqlCreateTB(ctx);
    }

    @Override
    public String visitSqlAlterTB(pruebaParser.SqlAlterTBContext ctx) {
        return super.visitSqlAlterTB(ctx);
    }

    @Override
    public String visitSqlDropTB(pruebaParser.SqlDropTBContext ctx) {
        return super.visitSqlDropTB(ctx);
    }

    @Override
    public String visitSqlShowTB(pruebaParser.SqlShowTBContext ctx) {
        return super.visitSqlShowTB(ctx);
    }

    @Override
    public String visitSqlShowColumns(pruebaParser.SqlShowColumnsContext ctx) {
        return super.visitSqlShowColumns(ctx);
    }

    @Override
    public String visitSqlInsertTB(pruebaParser.SqlInsertTBContext ctx) {
        return super.visitSqlInsertTB(ctx);
    }

    @Override
    public String visitSqlUpdateTB(pruebaParser.SqlUpdateTBContext ctx) {
        return super.visitSqlUpdateTB(ctx);
    }

    @Override
    public String visitSqlDeleteTB(pruebaParser.SqlDeleteTBContext ctx) {
        return super.visitSqlDeleteTB(ctx);
    }

    @Override
    public String visitSqlSelectTB(pruebaParser.SqlSelectTBContext ctx) {
        return super.visitSqlSelectTB(ctx);
    }

    @Override
    public String visitCreateDatabaseRule(pruebaParser.CreateDatabaseRuleContext ctx) {
        return super.visitCreateDatabaseRule(ctx);
    }

    @Override
    public String visitAlterDatabaseRule(pruebaParser.AlterDatabaseRuleContext ctx) {
        return super.visitAlterDatabaseRule(ctx);
    }

    @Override
    public String visitDropDatabaseRule(pruebaParser.DropDatabaseRuleContext ctx) {
        return super.visitDropDatabaseRule(ctx);
    }

    @Override
    public String visitShowDatabaseRule(pruebaParser.ShowDatabaseRuleContext ctx) {
        return super.visitShowDatabaseRule(ctx);
    }

    @Override
    public String visitUseDatabaseRule(pruebaParser.UseDatabaseRuleContext ctx) {
        return super.visitUseDatabaseRule(ctx);
    }

    @Override
    public String visitCreateTableRule(pruebaParser.CreateTableRuleContext ctx) {
        return super.visitCreateTableRule(ctx);
    }

    @Override
    public String visitInt(pruebaParser.IntContext ctx) {
        return super.visitInt(ctx);
    }

    @Override
    public String visitFloat(pruebaParser.FloatContext ctx) {
        return super.visitFloat(ctx);
    }

    @Override
    public String visitDate(pruebaParser.DateContext ctx) {
        return super.visitDate(ctx);
    }

    @Override
    public String visitChar(pruebaParser.CharContext ctx) {
        return super.visitChar(ctx);
    }

    @Override
    public String visitPrimaryKeyConstraintRule(pruebaParser.PrimaryKeyConstraintRuleContext ctx) {
        return super.visitPrimaryKeyConstraintRule(ctx);
    }

    @Override
    public String visitForeignKeyConstraintRule(pruebaParser.ForeignKeyConstraintRuleContext ctx) {
        return super.visitForeignKeyConstraintRule(ctx);
    }

    @Override
    public String visitCheckConstraintRule(pruebaParser.CheckConstraintRuleContext ctx) {
        return super.visitCheckConstraintRule(ctx);
    }

    @Override
    public String visitPrimaryKeyRule(pruebaParser.PrimaryKeyRuleContext ctx) {
        return super.visitPrimaryKeyRule(ctx);
    }

    @Override
    public String visitForeignKeyRule(pruebaParser.ForeignKeyRuleContext ctx) {
        return super.visitForeignKeyRule(ctx);
    }

    @Override
    public String visitCheckRule(pruebaParser.CheckRuleContext ctx) {
        return super.visitCheckRule(ctx);
    }

    @Override
    public String visitAndLogicRule(pruebaParser.AndLogicRuleContext ctx) {
        return super.visitAndLogicRule(ctx);
    }

    @Override
    public String visitOrLogicRule(pruebaParser.OrLogicRuleContext ctx) {
        return super.visitOrLogicRule(ctx);
    }

    @Override
    public String visitIdValueFormatRule(pruebaParser.IdValueFormatRuleContext ctx) {
        return super.visitIdValueFormatRule(ctx);
    }

    @Override
    public String visitNumValueFormatRule(pruebaParser.NumValueFormatRuleContext ctx) {
        return super.visitNumValueFormatRule(ctx);
    }

    @Override
    public String visitDateFormatRule(pruebaParser.DateFormatRuleContext ctx) {
        return super.visitDateFormatRule(ctx);
    }

    @Override
    public String visitCharFormatRule(pruebaParser.CharFormatRuleContext ctx) {
        return super.visitCharFormatRule(ctx);
    }

    @Override
    public String visitAllSelectFormatRule(pruebaParser.AllSelectFormatRuleContext ctx) {
        return super.visitAllSelectFormatRule(ctx);
    }

    @Override
    public String visitIdSelectFormatRule(pruebaParser.IdSelectFormatRuleContext ctx) {
        return super.visitIdSelectFormatRule(ctx);
    }

    @Override
    public String visitAscOrderFormatRule(pruebaParser.AscOrderFormatRuleContext ctx) {
        return super.visitAscOrderFormatRule(ctx);
    }

    @Override
    public String visitDescOrderFormatRule(pruebaParser.DescOrderFormatRuleContext ctx) {
        return super.visitDescOrderFormatRule(ctx);
    }

    @Override
    public String visitNotExpressionRule(pruebaParser.NotExpressionRuleContext ctx) {
        return super.visitNotExpressionRule(ctx);
    }

    @Override
    public String visitLogicExpressionRule(pruebaParser.LogicExpressionRuleContext ctx) {
        return super.visitLogicExpressionRule(ctx);
    }

    @Override
    public String visitRelationalExpressionRule(pruebaParser.RelationalExpressionRuleContext ctx) {
        return super.visitRelationalExpressionRule(ctx);
    }

    @Override
    public String visitNumExpressionRule(pruebaParser.NumExpressionRuleContext ctx) {
        return super.visitNumExpressionRule(ctx);
    }

    @Override
    public String visitIdExpressionRule(pruebaParser.IdExpressionRuleContext ctx) {
        return super.visitIdExpressionRule(ctx);
    }

    @Override
    public String visitAlterTableIdRule(pruebaParser.AlterTableIdRuleContext ctx) {
        return super.visitAlterTableIdRule(ctx);
    }

    @Override
    public String visitAlterTableActionRule(pruebaParser.AlterTableActionRuleContext ctx) {
        return super.visitAlterTableActionRule(ctx);
    }

    @Override
    public String visitActionAddColumnRule(pruebaParser.ActionAddColumnRuleContext ctx) {
        return super.visitActionAddColumnRule(ctx);
    }

    @Override
    public String visitActionAddConstraintRule(pruebaParser.ActionAddConstraintRuleContext ctx) {
        return super.visitActionAddConstraintRule(ctx);
    }

    @Override
    public String visitActionDropColumnRule(pruebaParser.ActionDropColumnRuleContext ctx) {
        return super.visitActionDropColumnRule(ctx);
    }

    @Override
    public String visitActionDropConstraintRule(pruebaParser.ActionDropConstraintRuleContext ctx) {
        return super.visitActionDropConstraintRule(ctx);
    }

    @Override
    public String visitDropTableRule(pruebaParser.DropTableRuleContext ctx) {
        return super.visitDropTableRule(ctx);
    }

    @Override
    public String visitShowTablesRule(pruebaParser.ShowTablesRuleContext ctx) {
        return super.visitShowTablesRule(ctx);
    }

    @Override
    public String visitShowColumnsRule(pruebaParser.ShowColumnsRuleContext ctx) {
        return super.visitShowColumnsRule(ctx);
    }

    @Override
    public String visitInsertIntoRule(pruebaParser.InsertIntoRuleContext ctx) {
        return super.visitInsertIntoRule(ctx);
    }

    @Override
    public String visitUpdateRule(pruebaParser.UpdateRuleContext ctx) {
        return super.visitUpdateRule(ctx);
    }

    @Override
    public String visitDeleteFromRule(pruebaParser.DeleteFromRuleContext ctx) {
        return super.visitDeleteFromRule(ctx);
    }

    @Override
    public String visitSelectRule(pruebaParser.SelectRuleContext ctx) {
        return super.visitSelectRule(ctx);
    }


}

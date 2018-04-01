package sample.Main;

import Gramatica.pruebaBaseVisitor;
import Gramatica.pruebaParser;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.runtime.tree.TreeVisitor;
import org.codehaus.jettison.json.JSONException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TheVisitor extends pruebaBaseVisitor<Tipo> {

    private String texto; // Variable para almacenar texto de errores y resultados.
    private DatabaseManager dbManager; // Objeto para acceder a metodos de manejo de la BD

    public TheVisitor(boolean verbose) {
        this.dbManager = new DatabaseManager(verbose);
        this.texto="";
    }


    @Override public Tipo visitSqlScript(pruebaParser.SqlScriptContext ctx) {

        Tipo tipo = visitChildren(ctx);
        if (tipo != null) {
            if (!dbManager.getInserts().isEmpty()) {
                try {
                    dbManager.insert(dbManager.getInserts()); // Se llama al metodo de los inserts
                } catch (JSONException ex) {
                    Tipo error = new Error("Error en Insert");
                    texto = texto + error.getName() + "\n";
                    Logger.getLogger(TreeVisitor.class.getName()).log(Level.SEVERE, null, ex);
                    return error;
                }
            }
            return tipo;
        } else {
            texto = "Codigo incorrecto o vacio";
            return tipo;
        }
    }

    @Override
    public Tipo visitSqlCreateDB(pruebaParser.SqlCreateDBContext ctx) {return super.visitSqlCreateDB(ctx);}

    @Override
    public Tipo visitSqlAlterDB(pruebaParser.SqlAlterDBContext ctx) { return super.visitSqlAlterDB(ctx);   }

    @Override
    public Tipo visitSqlDropDB(pruebaParser.SqlDropDBContext ctx) {
        return super.visitSqlDropDB(ctx);
    }

    @Override
    public Tipo visitSqlShowDB(pruebaParser.SqlShowDBContext ctx) {
        return super.visitSqlShowDB(ctx);
    }

    @Override
    public Tipo visitSqlUseDB(pruebaParser.SqlUseDBContext ctx) {
        return super.visitSqlUseDB(ctx);
    }

    @Override
    public Tipo visitSqlCreateTB(pruebaParser.SqlCreateTBContext ctx) {
        return super.visitSqlCreateTB(ctx);
    }

    @Override
    public Tipo visitSqlAlterTB(pruebaParser.SqlAlterTBContext ctx) {
        return super.visitSqlAlterTB(ctx);
    }

    @Override
    public Tipo visitSqlDropTB(pruebaParser.SqlDropTBContext ctx) {
        return super.visitSqlDropTB(ctx);
    }

    @Override
    public Tipo visitSqlShowTB(pruebaParser.SqlShowTBContext ctx) {
        return super.visitSqlShowTB(ctx);
    }

    @Override
    public Tipo visitSqlShowColumns(pruebaParser.SqlShowColumnsContext ctx) {
        return super.visitSqlShowColumns(ctx);
    }

    @Override
    public Tipo visitSqlInsertTB(pruebaParser.SqlInsertTBContext ctx) {
        return super.visitSqlInsertTB(ctx);
    }

    @Override
    public Tipo visitSqlUpdateTB(pruebaParser.SqlUpdateTBContext ctx) {
        return super.visitSqlUpdateTB(ctx);
    }

    @Override
    public Tipo visitSqlDeleteTB(pruebaParser.SqlDeleteTBContext ctx) {
        return super.visitSqlDeleteTB(ctx);
    }

    @Override
    public Tipo visitSqlSelectTB(pruebaParser.SqlSelectTBContext ctx) {
        return super.visitSqlSelectTB(ctx);
    }

    @Override
    public Tipo visitCreateDatabaseRule(pruebaParser.CreateDatabaseRuleContext ctx) {
        String databaseName= ctx.getText();

        if(dbManager.createDatabase(databaseName)){
            Tipo tipo = new Valido("Base de datos: " + databaseName + " creada");
            texto = texto + tipo.getName() + "\n";
            return tipo;
        }
        else{
            Tipo tipo = new Error("Error: Creacion de base de datos :" + databaseName);
            texto = texto + tipo.getName()+ "\n";
            return tipo;
        }
    }

    @Override
    public Tipo visitAlterDatabaseRule(pruebaParser.AlterDatabaseRuleContext ctx) {
        String databaseName =ctx.ID(0).getText();//obtenes el nombre viejo
        String databaseNameNew = ctx.ID(1).getText();//obtenemos el nombre nuevo
        if(dbManager.alterDatabase(databaseName, databaseNameNew)){
            Tipo tipo = new Valido("Nombre de Base de datos: " + databaseName + " modificada a:"+databaseNameNew); //llamamos a validar
            texto = texto + tipo.getName() + "\n";//alamacenamos el tipo de funcion exitosa
            return tipo;
        }
        else{
            Tipo error = new Error("Error: No fue posible realizar la modificacion"+databaseNameNew+"No existe:"+databaseName); //armamos el error
            texto = texto + error.getName()+"\n"; //alamacenamos el error
            return error;
        }
    }

    @Override
    public Tipo visitDropDatabaseRule(pruebaParser.DropDatabaseRuleContext ctx) {
        String databaseName = ctx.ID().getText();
        //crear el alert box
        Alert al = new Alert(Alert.AlertType.CONFIRMATION);
        al.setTitle("Confirme Accion");
        al.setContentText("¿Seguro que desea borrar la base de datos"+databaseName+"?");
        Optional<ButtonType> result = al.showAndWait();
        int resultado;
        //asignar valor al boton presionado
        if(result.get()==ButtonType.OK){
            resultado = 1;
        }else{
            resultado = 2;
        }
        if(resultado==1){

            if(dbManager.deleteDatabase(databaseName)){
                Tipo tipo = new Valido("Se elimino exitosamente la base de datos"+databaseName);
                texto = texto+ tipo.getName()+"\n";
                return tipo;
            }else{
                Tipo tipo = new Error("Error al eliminar la base de datos: "+databaseName);
                texto = texto+tipo.getName()+"\n";
                return tipo;
            }
        }
        else{
            Tipo tipo = new Valido("No se elimino la base de datos"+databaseName);
            texto = texto+tipo.getName()+"\n";
            return tipo;
        }
    }

    @Override
    public Tipo visitShowDatabaseRule(pruebaParser.ShowDatabaseRuleContext ctx) {
        String total="";
        ArrayList<String> lista = dbManager.showAllDatabases();
        if(lista!=null){
            Tipo tipo = new Valido("Bases de Datos encontradas:"+"\n");
            for (String tabla:lista){
                total+="• "+tabla+"\n";
            }
            texto =texto +tipo.getName()+total+"\n";
            return tipo;
        }
        else{
            Tipo tipo = new Error("No ha creado ninguna base de datos");
            texto = texto +tipo.getName()+"\n";
            return tipo;
        }

    }

    @Override
    public Tipo visitUseDatabaseRule(pruebaParser.UseDatabaseRuleContext ctx) {
        String basedeDatosName =ctx.ID().getText();
        if(dbManager.useDatabase(basedeDatosName)){
            Tipo tipo =new Valido("Usando base de datos"+basedeDatosName);
            texto = texto +tipo.getName()+"\n";
            return tipo;

        }else{
            Tipo tipo = new Error("No existe la base de datos pedida"+basedeDatosName);
            texto = texto+tipo.getName()+"\n";
            return tipo;

        }
    }

    @Override
    public Tipo visitCreateTableRule(pruebaParser.CreateTableRuleContext ctx) {
        return super.visitCreateTableRule(ctx);
    }

    @Override
    public Tipo visitInt(pruebaParser.IntContext ctx) {
        return super.visitInt(ctx);
    }

    @Override
    public Tipo visitFloat(pruebaParser.FloatContext ctx) {
        return super.visitFloat(ctx);
    }

    @Override
    public Tipo visitDate(pruebaParser.DateContext ctx) {
        return super.visitDate(ctx);
    }

    @Override
    public Tipo visitChar(pruebaParser.CharContext ctx) {
        return super.visitChar(ctx);
    }

    @Override
    public Tipo visitPrimaryKeyConstraintRule(pruebaParser.PrimaryKeyConstraintRuleContext ctx) {
        return super.visitPrimaryKeyConstraintRule(ctx);
    }

    @Override
    public Tipo visitForeignKeyConstraintRule(pruebaParser.ForeignKeyConstraintRuleContext ctx) {
        return super.visitForeignKeyConstraintRule(ctx);
    }

    @Override
    public Tipo visitCheckConstraintRule(pruebaParser.CheckConstraintRuleContext ctx) {
        return super.visitCheckConstraintRule(ctx);
    }

    @Override
    public Tipo visitPrimaryKeyRule(pruebaParser.PrimaryKeyRuleContext ctx) {
        return super.visitPrimaryKeyRule(ctx);
    }

    @Override
    public Tipo visitForeignKeyRule(pruebaParser.ForeignKeyRuleContext ctx) {
        return super.visitForeignKeyRule(ctx);
    }

    @Override
    public Tipo visitCheckRule(pruebaParser.CheckRuleContext ctx) {
        return super.visitCheckRule(ctx);
    }

    @Override
    public Tipo visitAndLogicRule(pruebaParser.AndLogicRuleContext ctx) {
        return super.visitAndLogicRule(ctx);
    }

    @Override
    public Tipo visitOrLogicRule(pruebaParser.OrLogicRuleContext ctx) {
        return super.visitOrLogicRule(ctx);
    }

    @Override
    public Tipo visitIdValueFormatRule(pruebaParser.IdValueFormatRuleContext ctx) {
        return super.visitIdValueFormatRule(ctx);
    }

    @Override
    public Tipo visitNumValueFormatRule(pruebaParser.NumValueFormatRuleContext ctx) {
        return super.visitNumValueFormatRule(ctx);
    }

    @Override
    public Tipo visitDateFormatRule(pruebaParser.DateFormatRuleContext ctx) {
        return super.visitDateFormatRule(ctx);
    }

    @Override
    public Tipo visitCharFormatRule(pruebaParser.CharFormatRuleContext ctx) {
        return super.visitCharFormatRule(ctx);
    }

    @Override
    public Tipo visitAllSelectFormatRule(pruebaParser.AllSelectFormatRuleContext ctx) {
        return super.visitAllSelectFormatRule(ctx);
    }

    @Override
    public Tipo visitIdSelectFormatRule(pruebaParser.IdSelectFormatRuleContext ctx) {
        return super.visitIdSelectFormatRule(ctx);
    }

    @Override
    public Tipo visitAscOrderFormatRule(pruebaParser.AscOrderFormatRuleContext ctx) {
        return super.visitAscOrderFormatRule(ctx);
    }

    @Override
    public Tipo visitDescOrderFormatRule(pruebaParser.DescOrderFormatRuleContext ctx) {
        return super.visitDescOrderFormatRule(ctx);
    }

    @Override
    public Tipo visitNotExpressionRule(pruebaParser.NotExpressionRuleContext ctx) {
        return super.visitNotExpressionRule(ctx);
    }

    @Override
    public Tipo visitLogicExpressionRule(pruebaParser.LogicExpressionRuleContext ctx) {
        return super.visitLogicExpressionRule(ctx);
    }

    @Override
    public Tipo visitRelationalExpressionRule(pruebaParser.RelationalExpressionRuleContext ctx) {
        return super.visitRelationalExpressionRule(ctx);
    }

    @Override
    public Tipo visitNumExpressionRule(pruebaParser.NumExpressionRuleContext ctx) {
        return super.visitNumExpressionRule(ctx);
    }

    @Override
    public Tipo visitIdExpressionRule(pruebaParser.IdExpressionRuleContext ctx) {
        return super.visitIdExpressionRule(ctx);
    }

    @Override
    public Tipo visitAlterTableIdRule(pruebaParser.AlterTableIdRuleContext ctx) {
        return super.visitAlterTableIdRule(ctx);
    }

    @Override
    public Tipo visitAlterTableActionRule(pruebaParser.AlterTableActionRuleContext ctx) {
        return super.visitAlterTableActionRule(ctx);
    }

    @Override
    public Tipo visitActionAddColumnRule(pruebaParser.ActionAddColumnRuleContext ctx) {
        return super.visitActionAddColumnRule(ctx);
    }

    @Override
    public Tipo visitActionAddConstraintRule(pruebaParser.ActionAddConstraintRuleContext ctx) {
        return super.visitActionAddConstraintRule(ctx);
    }

    @Override
    public Tipo visitActionDropColumnRule(pruebaParser.ActionDropColumnRuleContext ctx) {
        return super.visitActionDropColumnRule(ctx);
    }

    @Override
    public Tipo visitActionDropConstraintRule(pruebaParser.ActionDropConstraintRuleContext ctx) {
        return super.visitActionDropConstraintRule(ctx);
    }

    @Override
    public Tipo visitDropTableRule(pruebaParser.DropTableRuleContext ctx) {
        return super.visitDropTableRule(ctx);
    }

    @Override
    public Tipo visitShowTablesRule(pruebaParser.ShowTablesRuleContext ctx) {
        return super.visitShowTablesRule(ctx);
    }

    @Override
    public Tipo visitShowColumnsRule(pruebaParser.ShowColumnsRuleContext ctx) {
        return super.visitShowColumnsRule(ctx);
    }

    @Override
    public Tipo visitInsertIntoRule(pruebaParser.InsertIntoRuleContext ctx) {
        return super.visitInsertIntoRule(ctx);
    }

    @Override
    public Tipo visitUpdateRule(pruebaParser.UpdateRuleContext ctx) {
        return super.visitUpdateRule(ctx);
    }

    @Override
    public Tipo visitDeleteFromRule(pruebaParser.DeleteFromRuleContext ctx) {
        return super.visitDeleteFromRule(ctx);
    }

    @Override
    public Tipo visitSelectRule(pruebaParser.SelectRuleContext ctx) {
        return super.visitSelectRule(ctx);
    }
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}

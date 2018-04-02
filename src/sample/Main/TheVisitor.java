package sample.Main;

import Gramatica.pruebaBaseVisitor;
import Gramatica.pruebaParser;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.runtime.tree.TreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
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
    public Tipo visitSqlCreateDB(pruebaParser.SqlCreateDBContext ctx) {
        return super.visitSqlCreateDB(ctx);
    }

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
        ArrayList<Tipo> listaTipos = new ArrayList(); // Lista de tipos de los nombres de columnas
        ArrayList<String> listaDeIds= new ArrayList();// Lista de nombres de columna
        int contador=0;
        boolean bandera=false;
        boolean bandera2=true;
        ArrayList<Pareja> parejas= new ArrayList();
        int counter=0;
        ArrayList<Tipo> listaCons = new ArrayList();
        Tipo envio=new Tipo("");
        // Se obtienen los nombres de las constraints.
         pruebaParser.CConstraintContext constraint = ctx.cConstraint();
         String con = constraint.getText();
         Tipo resultado=visit(constraint);
         envio= resultado;
         listaCons.add(resultado);
         counter++;
        // Se obtienen los tipos de datos de las columnas
        for(pruebaParser.DataTypeContext tc: ctx.dataType()){
            Tipo tipo =visit(tc);
            listaTipos.add(tipo);
            if(tipo instanceof Error){
                Tipo error= new Error("Error: Tipo de columna inválido");
                texto = texto + error.getName()+"\n";
                return error;
            }
        }
        // obtencion de la lista de ids.
        for(TerminalNode i :ctx.ID()){
            if(contador!=0){
                String id= i.getText();
                listaDeIds.add(id);
            }
            contador+=1;

        }
        for(int i =0;i<listaTipos.size();i++){
            parejas.add(new Pareja(i,listaDeIds.get(i),listaTipos.get(i)));
        }
        String tableName= ctx.ID(0).getText();
        // valores para primary
        ArrayList<String> columnName=new ArrayList<>();
        String constraintName="";

        // valores para check
        String nameVariableCheck="";
        String operador= "";
        String numeroCheck="";
        String nombreConstraint="";
        String nombreColumna="";
        String tablaReferencia="";
        String columnReferencia="";
        int result;

        if(counter>1){
            bandera2=false;
            int countersillo=0;
            for(Tipo cons: listaCons){
                switch(cons.getName()){
                    case "primary":
                        // En caso de que sea una primary key, se ingresa en este case para realizar una accion
                        ArrayList a= (ArrayList)cons.getObjeto();
                        for(int c=0;c<a.size();c++){
                            String m = a.get(c).getClass().toString();
                            if(a.get(c).getClass().toString().equals("class java.lang.String")){
                                String value =a.get(c).toString();
                                constraintName+=value;
                            }
                            else{
                                ArrayList aro= (ArrayList)a.get(c);
                                for(Object o :aro){
                                    String vg=o.toString();
                                    if(columnName.equals("")){
                                        columnName.add(vg);
                                    }
                                    else{
                                        String bla= vg;
                                        columnName.add(bla);
                                    }
                                }
                            }
                        }


                        if(countersillo==0){
                            dbManager.createTable(tableName,parejas);
                            countersillo++;
                        }

                        if(validarColumnasPrimary(parejas,columnName)){

                            for(String columna: columnName){
                                dbManager.createPrimaryKey(tableName, columna, constraintName);
                            }
                        }
                        else{
                            Tipo tipo= new Error("Error: El nombre de columna de la PK no existe en las columnas de la tabla. \n"
                                    +"No se creó la tabla.");
                            texto = texto + tipo.getName()+"\n";
                            return tipo;
                        }
                        break;
                    // en caso de que la restriccion sea de tipo check
                    case "check":
                        ArrayList<String> b= (ArrayList)cons.getObjeto();
                        nameVariableCheck= b.get(0);
                        operador=b.get(1);
                        numeroCheck= b.get(2);
                        constraintName= b.get(3);


                        if(countersillo==0){
                            dbManager.createTable(tableName,parejas);
                            countersillo++;
                        }

                        if(validarColumnasCheck(parejas,nameVariableCheck)){

                            dbManager.createCheck(tableName,nameVariableCheck,operador,numeroCheck,constraintName);
                        }
                        else{
                            Tipo tipo= new Error("Error: columna del check no existe o tiene error. \n"
                                    +"No se creó la tabla.");
                            texto = texto + tipo.getName()+"\n";
                            return tipo;
                        }
                        break;
                    case "foreign":
                        // caso en que la restriccion vaya a se de tipo foreign key
                        ArrayList<Object> o=(ArrayList)cons.getObjeto();
                        nombreConstraint= o.get(0).toString();
                        nombreColumna= o.get(1).toString();
                        ArrayList<Object> listado= (ArrayList)o.get(2);
                        tablaReferencia= listado.get(0).toString();
                        ArrayList<String> ar=(ArrayList)listado.get(1);
                        columnReferencia=ar.get(0);
                        if(countersillo==0){
                            dbManager.createTable(tableName,parejas);
                            countersillo++;
                        }

                        dbManager.createForeignKey(tableName,nombreColumna, nombreConstraint,columnReferencia,tablaReferencia);
                        break;
                    default:
                        break;

                }
            }
        }
        // caso para cuando una primary key se encuentra en el create.
        else if(envio.getName().equals("primary")){
            bandera=true;
            ArrayList a= (ArrayList)envio.getObjeto();
            for(int c=0;c<a.size();c++){
                String m = a.get(c).getClass().toString();
                if(a.get(c).getClass().toString().equals("class java.lang.String")){
                    String value =a.get(c).toString();
                    constraintName+=value;
                }
                else{
                    ArrayList aro= (ArrayList)a.get(c);
                    for(Object o :aro){
                        String vg=o.toString();
                        if(columnName.equals("")){
                            columnName.add(vg);
                        }
                        else{
                            String bla= vg;
                            columnName.add(bla);
                        }
                    }
                }
            }

        }

        else if(envio.getName().equals("check")){
            bandera=true;
            ArrayList<String> a= (ArrayList)envio.getObjeto();
            nameVariableCheck= a.get(0);
            operador=a.get(1);
            numeroCheck= a.get(2);
            constraintName= a.get(3);

        }
        else if(envio.getName().equals("foreign")){
            bandera=true;
            ArrayList<Object> o=(ArrayList<Object>)envio.getObjeto();
            nombreConstraint= o.get(0).toString();
            nombreColumna= o.get(1).toString();
            ArrayList<Object> listado= (ArrayList)o.get(2);
            ArrayList<String> pre= (ArrayList)listado;
            columnReferencia=pre.get(1);
            tablaReferencia=listado.get(0).toString();
        }

        if(bandera){
            switch(envio.getName()){
                case "primary":
                    if(validarColumnasPrimary(parejas,columnName)){
                        result= dbManager.createTable(tableName,parejas);
                        for(String columna: columnName){
                            dbManager.createPrimaryKey(tableName, columna, constraintName);
                        }
                    }
                    else{
                        Tipo tipo= new Error("El nombre de columna de la PK no existe en las columnas de la tabla. \n"
                                +"No se creó la tabla.");
                        texto = texto + tipo.getName()+"\n";
                        return tipo;
                    }
                    break;

                case "check":
                    if(validarColumnasCheck(parejas,nameVariableCheck)){
                        result= dbManager.createTable(tableName,parejas);
                        dbManager.createCheck(tableName,nameVariableCheck,operador,numeroCheck,constraintName);
                    }
                    else{
                        Tipo tipo= new Error("Error: columna del check no existe o tiene error. \n"
                                +"No se creó la tabla.");
                        texto = texto + tipo.getName()+"\n";
                        return tipo;
                    }
                    break;

                case "foreign":

                    dbManager.createTable(tableName,parejas);
                    dbManager.createForeignKey(tableName,nombreColumna, nombreConstraint,columnReferencia,tablaReferencia);

                default:
                    result=1;
            }

        }
        else if(bandera2){
            result= dbManager.createTable(tableName,parejas);
        }
        else{
            result=1;
        }

        switch (result) {
            case 1:
            {
                Tipo tipo= new Valido("Se creo la tabla: " + tableName + " correctamente");
                texto = texto + tipo.getName()+"\n";
                return tipo;
            }
            case 0:
            {
                Tipo tipo= new Error("Error: No se pudo crear la tabla: " + tableName);
                texto = texto + tipo.getName()+"\n";
                return tipo;
            }
            case 2:
            {
                Tipo tipo= new Error("Error: No se esta utilizando ninguna DB: ");
                texto = texto + tipo.getName()+"\n";
                return tipo;
            }
            default:
                Tipo error= new Error("Error: Creacion de la tabla");
                texto = texto + error.getName()+"\n";
                return error;
        }

    }

    @Override
    public Tipo visitInt(pruebaParser.IntContext ctx) {
        Tipo tipo = new Int("Int");
        return tipo;
    }

    @Override
    public Tipo visitFloat(pruebaParser.FloatContext ctx) {
        Tipo tipo = new Flotante("Float");
        return tipo;
    }

    @Override
    public Tipo visitDate(pruebaParser.DateContext ctx) {
        Tipo tipo = new Date("Date");
        return tipo;
    }

    @Override
    public Tipo visitChar(pruebaParser.CharContext ctx) {
        Tipo tipo = new Char("Char");
        return tipo;
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
        ArrayList<String> listaDeIds= new ArrayList();
        String nombreConstraint= ctx.ID(0).getText();
        ArrayList<Object> obs = new ArrayList();
        // Se recorren los ids de los nombres de las llaves.
        int contador=0;
        for(TerminalNode i :ctx.ID()){
            if(contador!=0){
                String id= i.getText();
                listaDeIds.add(id);
            }
            contador+=1;
        }
        obs.add(nombreConstraint);
        obs.add(listaDeIds);

        Tipo tipo= new Tipo(obs);
        tipo.setName("primary");
        return tipo;
    }

    @Override
        public Tipo visitForeignKeyRule(pruebaParser.ForeignKeyRuleContext ctx) {
        String primerId= ctx.ID(0).getText();
        String id = ctx.ID(1).getText();
        ArrayList<Object> obs = new ArrayList();
        Tipo foreignKeyReference = visit(ctx.REFERENCES());
        ArrayList<String> listaDeIdsReferences = (ArrayList<String>)foreignKeyReference.getObjeto();
        obs.add(primerId);
        obs.add(id);
        obs.add(listaDeIdsReferences);
        Tipo tipo = new Tipo("foreign");
        tipo.setObjeto(obs);
        return tipo;
    }

    @Override
    public Tipo visitCheckRule(pruebaParser.CheckRuleContext ctx) {
        String nombreConstraint = ctx.ID().getText();
        Tipo tipo=visit(ctx.exp());
        tipo.setName("check");
        ArrayList<String> lista = (ArrayList)tipo.getObjeto();
        lista.add(nombreConstraint);
        tipo.setObjeto(lista);
        return tipo;
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
    public Tipo visitExpRule(pruebaParser.ExpRuleContext ctx) {
        return super.visitExpRule(ctx);
    }

    @Override
    public Tipo visitEmptyExpression(pruebaParser.EmptyExpressionContext ctx) {
        return super.visitEmptyExpression(ctx);
    }

    @Override
    public Tipo visitAndExpressionRule(pruebaParser.AndExpressionRuleContext ctx) {
        return super.visitAndExpressionRule(ctx);
    }

    @Override
    public Tipo visitOrExpressionRule(pruebaParser.OrExpressionRuleContext ctx) {
        return super.visitOrExpressionRule(ctx);
    }

    @Override
    public Tipo visitAndExpressioRule(pruebaParser.AndExpressioRuleContext ctx) {
        return super.visitAndExpressioRule(ctx);
    }

    @Override
    public Tipo visitEqExpressionRule(pruebaParser.EqExpressionRuleContext ctx) {
        return super.visitEqExpressionRule(ctx);
    }

    @Override
    public Tipo visitRelationExprRule(pruebaParser.RelationExprRuleContext ctx) {
        return super.visitRelationExprRule(ctx);
    }

    @Override
    public Tipo visitEqualityExpressionRule(pruebaParser.EqualityExpressionRuleContext ctx) {
        return super.visitEqualityExpressionRule(ctx);
    }

    @Override
    public Tipo visitUnaryExpressionRule(pruebaParser.UnaryExpressionRuleContext ctx) {
        return super.visitUnaryExpressionRule(ctx);
    }

    @Override
    public Tipo visitRelationExpressionRule(pruebaParser.RelationExpressionRuleContext ctx) {
        return super.visitRelationExpressionRule(ctx);
    }

    @Override
    public Tipo visitNotExpressionRule(pruebaParser.NotExpressionRuleContext ctx) {
        return super.visitNotExpressionRule(ctx);
    }

    @Override
    public Tipo visitEq_op(pruebaParser.Eq_opContext ctx) {
        return super.visitEq_op(ctx);
    }

    @Override
    public Tipo visitRel_op(pruebaParser.Rel_opContext ctx) {
        return super.visitRel_op(ctx);
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

    public boolean validarColumnasPrimary(ArrayList<Pareja> columnasTabla,ArrayList<String> columnasPrimary ){
        ArrayList<String> listaTemp= new ArrayList<>();
        for(Pareja par: columnasTabla){
            listaTemp.add(par.getColumnName());
        }

        return listaTemp.containsAll(columnasPrimary);

    }
    // metodo para revisar las columnas en la tabla para poder usar una llave de tipo CHECK
    public boolean validarColumnasCheck(ArrayList<Pareja> columnasTabla,String columnasPrimary ){
        ArrayList<String> listaTemp= new ArrayList<>();
        for(Pareja par: columnasTabla){
            listaTemp.add(par.getColumnName());
        }

        return listaTemp.contains(columnasPrimary);

    }

    // metodo para verificaion de columnas para una foreign key
    public boolean validarColumnasForeign(ArrayList<Pareja> columnasTabla,String columnasPrimary ){
        ArrayList<String> listaTemp= new ArrayList<>();
        for(Pareja par: columnasTabla){
            listaTemp.add(par.getColumnName());
        }

        return listaTemp.contains(columnasPrimary);

    }

}

package sample.Main;
/**
 *Universidad del valle de guatemala
 * Nombre: Marlon Fuentes, Jose Jo, Diego Alvarez
 * Clase encargada de la definicion del visitor del manejador de bases de datos
 * */

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;

import Gramatica.*;


public class TheVisitor extends pruebaBaseVisitor<Tipo> {
    /**
     * String texto: Variable utilizada para almacenar texto de errores y resultados obtenidos
     * DatabaseManager dbManager: Objeto definido para acceder a metodos de manejo de bases de datos
     */

    private String texto;
    private DatabaseManager dbManager;

    public TheVisitor(boolean verbose) {
        this.dbManager= new DatabaseManager(verbose);
        this.texto="";
    }

    @Override
    /**
     * Metodo que devuelve la ejecucion del visitor llamando al metodo INSERT
     */
    public Tipo visitPrograma(pruebaParser.ProgramaContext ctx) {
        Tipo tipo =visitChildren(ctx);
        if(tipo!=null){
            if(!dbManager.getInserts().isEmpty()){
                try {
                    dbManager.insert(dbManager.getInserts());
                    /**
                     * Se llama al metodo de los INSERTS
                     * si no se hace el insert despliega un mensaje de error
                     */
                } catch (JSONException ex) {
                    Tipo error = new Error("Error: Insert no se realizo correctamente");
                    texto = texto + error.getName()+"\n";
                    Logger.getLogger(TheVisitor.class.getName()).log(Level.SEVERE, null, ex);
                    return error;
                }
            }
            return tipo;
        }
        else{
            texto="Error: Ingrese una sentencia o sentencias correctamente.";
            return tipo;
        }
    }

    @Override
    public Tipo visitDatabase(pruebaParser.DatabaseContext ctx) {
        return visitChildren(ctx);
    }

    // Metodo para crear una BD. Se usa obteniendo el nombre de la BD que se indico en la instruccion
    @Override
    public Tipo visitCreateDatabase(pruebaParser.CreateDatabaseContext ctx) {
        /**
         * Metodo encargado de crear una base de datos nueva
         * para ello utiliza el nombre de la base de datos que se indico en la instruccion
         * Si el nombre no se encuentra despliega un mensaje de error
         *
         */

        String databaseName= ctx.IDX().getText();

        if(dbManager.createDatabase(databaseName)){
            Tipo tipo = new Valido("Se creo la base de datos : " + databaseName);
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
    public Tipo visitAlterDatabase(pruebaParser.AlterDatabaseContext ctx) {
        /**
         * Metodo encargado de realizar un alrter en una Bse de datos
         * puede camviar el nombre de la base de datos con este metodo
         */

        String dbNameOriginal= ctx.IDX(0).getText();
        String dbNameNuevo= ctx.IDX(1).getText();

        if(dbManager.alterDatabase(dbNameOriginal, dbNameNuevo)){
            Tipo tipo = new Valido("Base de datos: "+ dbNameOriginal + " modificada con exito por: " + dbNameNuevo );
            texto = texto + tipo.getName()+"\n";
            return tipo;
        }
        else{
            Tipo error = new Error("Error: Modificacion de la base de datos: "+ dbNameNuevo + ", No existe.");
            texto = texto + error.getName()+"\n";
            return error;
        }
    }

    @Override
    public Tipo visitDropDatabase(pruebaParser.DropDatabaseContext ctx) {
        /**
         * Metodo encargado de hacer un drop o eliminacion de una bases de datos
         * para hacer eso requiere verificaciondes del usuario
         */
        String dbName= ctx.IDX().getText();
        /**
         * Primero se hace una verificacion extra para asegurarse que quiere borrar la base de datos
         */
        int result= JOptionPane.showConfirmDialog(null, "Esta seguro que desea borrar la BD:"+
                " "+dbName+" ?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(result==JOptionPane.YES_OPTION){
            if(dbManager.deleteDatabase(dbName)){
                /**
                 * Si el usuario indica que si quiere eliminarla se procede a eliminarla
                 */
                Tipo tipo = new Valido("Se elimino la base de datos: "+ dbName);
                texto = texto + tipo.getName()+"\n";
                return tipo;
            }
            else{
                /**
                 * Si la base de datos no existe de despliega un error
                 */
                Tipo tipo= new Error("Error al eliminar la base de datos: " + dbName + " ,No existe.");
                texto = texto + tipo.getName()+"\n";
                return tipo;
            }
        }
        else{
            /**
             * Si la base de datos existe se elimina del directorio
             */
            Tipo tipo = new Valido("No se elimino la base de datos: "+ dbName);
            texto = texto + tipo.getName()+"\n";
            return tipo;
        }
    }

    @Override
    public Tipo visitShowDatabase(pruebaParser.ShowDatabaseContext ctx) {
        /**
         * Metodo encargado de mostrar una base de datos existente en el directorio
         * si no existe se muestra un error
         */
        String total="";

        ArrayList<String> lista= dbManager.showAllDatabases();
        if(lista!=null){
            Tipo tipo = new Valido("Bases de datos existentes: " + "\n");
            for(String s: lista){
                total+= "• " + s + "\n";
            }
            texto = texto + tipo.getName()+ total + "\n";
            return tipo;
        }
        /**
         * Si no existe la base de datos se muestra un error
         */
        else{
            Tipo tipo= new Error("No existen bases de datos");
            texto = texto + tipo.getName()+"\n";
            return tipo;
        }
    }

    @Override
    public Tipo visitUseDatabase(pruebaParser.UseDatabaseContext ctx) {
        /**
         * Metodo para ejecucion ( idispensable )
         * sirve para saber cual base de datos usar en el directorio de bases de datos
         */

        String dbName= ctx.IDX().getText();
        /**
         * Se indica el nombre de la base de datos con el que se va a trabajar
         */
        if(dbManager.useDatabase(dbName)){

            Tipo tipo = new Valido("Usando base de datos: " + dbName);
            texto = texto + tipo.getName()+"\n";
            return tipo;
        }
        else{
            Tipo tipo= new Error("No existe la base de datos: " + dbName);
            texto = texto + tipo.getName()+"\n";
            return tipo;
        }
    }

    @Override
    // Listo
    public Tipo visitOpTable(pruebaParser.OpTableContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Tipo visitTipo(pruebaParser.TipoContext ctx) {
        /**
         * Metodo para identificar los diferentes tipos de datos de la gramatica
         */

        if(ctx.INT()!=null){
            Tipo tipo = new Int("Int");
            return tipo;
        }
        else if(ctx.FLOAT()!=null){
            Tipo tipo = new Flotante("Float");
            return tipo;
        }
        else if(ctx.DATE()!=null){
            Tipo tipo = new Date("Date");
            return tipo;
        }
        else if(ctx.CHAR()!=null){
            Tipo tipo = new Char("Char");
            return tipo;
        }
        else if(ctx.NUMX()!=null){
            Tipo tipo = new Int("Int");
            return tipo;
        }
        else{
            Tipo error= new Error("Error");
            return error;
        }
    }

    @Override
    public Tipo visitCreateTable(pruebaParser.CreateTableContext ctx) {
        /**
         * Metodo para crear una tabla en una base de datos
         * Se puede usar de varias maneras con diferentes parametros
         */

        ArrayList<Tipo> listaTipos = new ArrayList();
        ArrayList<String> listaDeIds= new ArrayList();
        /**
         * Se crearon dos tipos de listas
         * una copntiene los tipos de los nombres de columnas
         * y la otra la lista de los nombres de columnas
         */
        int contador=0;
        boolean bandera=false;
        boolean bandera2=true;
        ArrayList<Pareja> parejas= new ArrayList();
        int counter=0;
        ArrayList<Tipo> listaCons = new ArrayList();
        Tipo envio=new Tipo("");
        /**
         * Obtenemos los nombres de los constraints
         */
        for(pruebaParser.ConstraintContext constraint: ctx.constraint()){
            String con = constraint.getText();
            Tipo result=visit(constraint);
            envio= result;
            listaCons.add(result);
            counter++;
        }
        /**
         * Se obtienen los tipos de datos de las columnas
         */
        for(pruebaParser.TipoContext tc: ctx.tipo()){
            Tipo tipo =visit(tc);
            listaTipos.add(tipo);
            if(tipo instanceof Error){
                Tipo error= new Error("Error: Tipo de columna inválido");
                texto = texto + error.getName()+"\n";
                return error;
            }
        }
        /**
         * en este ciclo obtenemos la lista de los ids
         */
        for(TerminalNode i :ctx.IDX()){
            if(contador!=0){
                String id= i.getText();
                listaDeIds.add(id);
            }
            contador+=1;

        }
        for(int i =0;i<listaTipos.size();i++){
            parejas.add(new Pareja(i,listaDeIds.get(i),listaTipos.get(i)));
        }
        String tableName= ctx.IDX(0).getText();
        /**
         * Valores para los primary keys
         */
        ArrayList<String> columnName=new ArrayList<>();
        String constraintName="";

        // valores para check
        /**
         * Valores para los checks
         * verificamos el nombre de la variable check
         * operador
         * numero check
         * nombre de la constraint
         * tabla de referencia
         * columna de referencia
         */
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
                        /**
                         * Si es una llave primaria se ingresa en este caso para realizar una accion
                         */
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
                    case "check":
                        /**
                         * Si la restriccion es de tipo check se realiza la siguiente accion
                         * sino se muestra un erroor y posteriormente no se crea la tabla
                         */
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
                        /**
                         * En caso de que la restriccion sea una llave foranea se realiza esta accion
                         */
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
        else if(envio.getName().equals("primary")){
            /**
             * En el caso de que una llave primaria se encuentre en el create
             */
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
            /**
             * Si es un check se hace esta accion
             */
            bandera=true;
            ArrayList<String> a= (ArrayList)envio.getObjeto();
            nameVariableCheck= a.get(0);
            operador=a.get(1);
            numeroCheck= a.get(2);
            constraintName= a.get(3);

        }
        else if(envio.getName().equals("foreign")){
            /**
             *
             * Si es una llave foranea se hace esta accion
             */
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
                /**
                 * Caso de validacion de columna de la llave primaria
                 */
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
                    /**
                     * Caso de validacion de columna de check
                     */
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
                    /**
                     * Caso de validacion de una llave foranea
                     */

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

    public boolean validarColumnasPrimary(ArrayList<Pareja> columnasTabla,ArrayList<String> columnasPrimary ){
        /**
         * Metodo utilizado para validar las columnas de una tabla para que despues podamos saber si puede aplicar a
         * una llave primaria
         */
        ArrayList<String> listaTemp= new ArrayList<>();
        for(Pareja par: columnasTabla){
            listaTemp.add(par.getColumnName());
        }

        return listaTemp.containsAll(columnasPrimary);

    }
    public boolean validarColumnasCheck(ArrayList<Pareja> columnasTabla,String columnasPrimary ){
        /**
         * Metodo utilizado para validar las columnas de una tabla para que despues podamos saber si puede aplicar a
         * una llave de tipo check
         */
        ArrayList<String> listaTemp= new ArrayList<>();
        for(Pareja par: columnasTabla){
            listaTemp.add(par.getColumnName());
        }

        return listaTemp.contains(columnasPrimary);

    }

    public boolean validarColumnasForeign(ArrayList<Pareja> columnasTabla,String columnasPrimary ){
        /**
         * Metodo encargado de verificar las columnas para una llave foranea
         */
        ArrayList<String> listaTemp= new ArrayList<>();
        for(Pareja par: columnasTabla){
            listaTemp.add(par.getColumnName());
        }

        return listaTemp.contains(columnasPrimary);

    }

    @Override
    public Tipo visitConstraint(pruebaParser.ConstraintContext ctx) {
        /**
         * No se modifica este metodo asi queda
         */
        return visitChildren(ctx);
    }

    @Override
    public Tipo visitPrimaryKey(pruebaParser.PrimaryKeyContext ctx) {
        /**
         * Metodo utilizado especialmente por el visitor para obtener los valores imporatnes
         * para la declaracion de una llave primaria
         */
        ArrayList<String> listaDeIds= new ArrayList();
        String nombreConstraint= ctx.IDX(0).getText();
        ArrayList<Object> obs = new ArrayList();
        /**
         * Se recorren los ids de los nombres de las llaves
         */
        int contador=0;
        for(TerminalNode i :ctx.IDX()){
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
    public Tipo visitForeignKey(pruebaParser.ForeignKeyContext ctx) {
        /**
         * Metodo encargado de obtener los valores imporatnes para crear posteriormente una llave foranea
         */

        String primerId= ctx.IDX(0).getText();
        String id = ctx.IDX(1).getText();
        ArrayList<Object> obs = new ArrayList();
        Tipo foreignKeyReference = visit(ctx.FOREIGN());
        ArrayList<String> listaDeIdsReferences = (ArrayList<String>)foreignKeyReference.getObjeto();
        obs.add(primerId);
        obs.add(id);
        obs.add(listaDeIdsReferences);
        Tipo tipo = new Tipo("foreign");
        tipo.setObjeto(obs);
        return tipo;
    }




    @Override
    public Tipo visitCheck(pruebaParser.CheckContext ctx) {
        /**
         * Metodo encargado de obtener el nombre de la constraint check y los valores imporatnes
         *         // se obtiene el nombre de la constraint
         */
        String nombreConstraint = ctx.IDX().getText();
        Tipo tipo=visit(ctx.exp());
        tipo.setName("check");
        ArrayList<String> lista = (ArrayList)tipo.getObjeto();
        lista.add(nombreConstraint);
        tipo.setObjeto(lista);
        return tipo;
    }

    @Override
    public Tipo visitExp(pruebaParser.ExpContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Tipo visitExpression(pruebaParser.ExpressionContext ctx) {
        /**
         * Metodo encargado de obtener una expresion de tipo relacion para poder utilizar expresiones con OR
         */
        if(ctx.children.size()>1){
            ArrayList<String> total= new ArrayList<>();
            Tipo t1= visit(ctx.expression());
            Tipo t2= visit(ctx.andExpr());
            Tipo nuevo = new Tipo("relation");
            ArrayList<String> parte1=(ArrayList)t1.getObjeto();
            parte1.add("OR");
            ArrayList<String> parte2=(ArrayList)t2.getObjeto();
            parte1.addAll(parte2);
            nuevo.setObjeto(parte1);
            return nuevo;
        }
        return visitChildren(ctx);
    }

    @Override
    public Tipo visitAndExpr(pruebaParser.AndExprContext ctx) {
        /**
         * Metodo encargado de obtener una expresion de tipo relacion para poder utilizar expresiones con AND
         */
        if(ctx.children.size()>1){
            ArrayList<String> total= new ArrayList<>();
            Tipo t1= visit(ctx.andExpr());
            Tipo t2= visit(ctx.eqExpr());
            Tipo nuevo = new Tipo("relation");
            ArrayList<String> parte1=(ArrayList)t1.getObjeto();
            parte1.add("AND");
            ArrayList<String> parte2=(ArrayList)t2.getObjeto();
            parte1.addAll(parte2);
            nuevo.setObjeto(parte1);
            return nuevo;
        }
        return visitChildren(ctx);
    }

    @Override
    public Tipo visitEqExpr(pruebaParser.EqExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Tipo visitRelationExpr(pruebaParser.RelationExprContext ctx) {
        /**
         * Metodo encargado de obtener valores de una relacion expresion
         */
        String te="";
        String alf="";
        try{
            te = ctx.rel_op().getText();
        }
        catch(Exception e){

        }
        try{
            alf= ctx.relationExpr().getText();
        }
        catch(Exception e){

        }
        String a = ctx.unaryExpr().getText();
        Tipo tipo = new Tipo("relation");
        ArrayList<String> list= new ArrayList();
        list.add(alf);
        list.add(te);
        list.add(a);
        tipo.setObjeto(list);
        return tipo;
    }

    @Override
    public Tipo visitUnaryExpr(pruebaParser.UnaryExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Tipo visitAlterTable(pruebaParser.AlterTableContext ctx) {
        /**
         * Metodo encargado para hacer un alter table con constraints o no
         * o tambien solo rename y ya
         */

        if(ctx.children.get(3).getText().equals("RENAME")){
            // aca se usa cuando solamente se quiere renombrar una TABLA, y nada mas
            String tablaOriginal= ctx.IDX(0).getText();
            String tablaNueva= ctx.IDX(1).getText();

            if(dbManager.alterTableName(tablaOriginal, tablaNueva)){
                Tipo tipo= new Valido("Se modifico la tabla: "+ tablaOriginal + " por la tabla : " + tablaNueva);
                texto = texto + tipo.getName()+"\n";
                return tipo;
            }
            else{
                Tipo tipo = new Error("Error: No se pudo modificar la tabla: " + tablaOriginal);
                texto = texto + tipo.getName()+"\n";
                return tipo;
            }
        }
        else{
            /**
             * Esta parte se ejecuta siemmpre y cuando se vaya a hacer un drop column en el alter table
             */
            String tablaOriginal= ctx.IDX(0).getText();
            Tipo accion =visit(ctx.action(0));

            if(accion.getObjeto().toString().equals("dropcolumn")){
                boolean w=dbManager.dropColumn(tablaOriginal,accion.getName());
                if(w){
                    Tipo tipo= new Valido("Se modifico la tabla: "+ tablaOriginal + "\n"
                            +"Se hizo drop a la columna: " + accion.getName()+ " .\n");
                    texto = texto + tipo.getName()+"\n";
                    return tipo;
                }
                else{
                    Tipo tipo = new Error("Error: No se pudo modificar la tabla: " + tablaOriginal);
                    texto = texto + tipo.getName()+"\n";
                    return tipo;
                }
            }
            else if(accion.getObjeto().toString().equals("dropconstraint")){
                /**
                 * Esta parte sirve para cuando realizamos un drop constraints en el alter
                 */
                boolean w=dbManager.dropConstraint(tablaOriginal,accion.getName());
                if(w){
                    Tipo tipo= new Valido("Se modifico la tabla: "+ tablaOriginal + "\n"
                            +"Se hizo drop a la constraint: " + accion.getName()+ " .\n");
                    texto = texto + tipo.getName()+"\n";
                    return tipo;
                }
                else{
                    Tipo tipo = new Error("Error: No se pudo hacer drop a la constraint: " + accion.getName());
                    texto = texto + tipo.getName()+"\n";
                    return tipo;
                }

            }

            else if(accion.getObjeto().getClass().toString().equals("class java.util.ArrayList")){
                ArrayList lista =(ArrayList)accion.getObjeto();
                /**
                 * En esta parte si existen llaves ya sean primarias, foraneas o check, se ejecuta esta parte
                 */
                switch (accion.getName()){
                    case "primary":
                        ArrayList<String> lista2=(ArrayList)lista.get(1);
                        String nombreConstraint=lista.get(0).toString();
                        String nombreColumna=lista2.get(0);

                        if(!dbManager.constraintExist(tablaOriginal, nombreConstraint)){

                            if(!dbManager.hasPrimaryKey(tablaOriginal)){
                                boolean w=dbManager.createPrimaryKey(tablaOriginal,nombreColumna, nombreConstraint);
                                if(w){
                                    Tipo tipo= new Valido("Se modifico la tabla: "+ tablaOriginal + "\n"
                                            +"Se hizo add constraint con valor: " + nombreConstraint+ " .");
                                    texto = texto + tipo.getName()+"\n";
                                    return tipo;
                                }
                                else{
                                    Tipo tipo = new Error("Error: No se pudo modificar la tabla: " + tablaOriginal);
                                    texto = texto + tipo.getName()+"\n";
                                    return tipo;
                                }
                            }
                            else{
                                Tipo tipo= new Error("Error: Ya tiene una PK la tabla : "+ tablaOriginal + "\n");
                                texto = texto + tipo.getName()+"\n";
                                return tipo;
                            }

                        }
                        else{
                            Tipo tipo= new Valido("Error en modificacion de la tabla : "+ tablaOriginal + "\n"
                                    +"Ya existe la constraint o una constraint");
                            texto = texto + tipo.getName()+"\n";
                            return tipo;
                        }

                    case "check":
                        ArrayList<String> list= lista;
                        String paramCheck="";
                        ArrayList<String> first=new ArrayList<>();
                        ArrayList<String> second=new ArrayList<>();
                        int c=0;
                        boolean ban=false;
                        for(int i=0;i<3;i++){
                            first.add(list.get(i));
                        }
                        for(int j=0;j<list.size()-1;j++){
                            if(ban){
                                second.add(list.get(j));
                            }
                            if(list.get(j).equals(" AND ")){
                                ban=true;
                            }
                        }

                        String nombreCons=list.get(lista.size()-1);
                        String columna= list.get(2);

                        if(dbManager.columnExist(tablaOriginal,columna)){

                            boolean w2=dbManager.createCheck(tablaOriginal,columna,first.get(1),first.get(0),nombreCons);
                            boolean w3=dbManager.createCheck(tablaOriginal,columna,second.get(1),second.get(2),nombreCons);
                            if(w2 && w3){
                                Tipo tipo= new Valido("Se modifico la tabla: "+ tablaOriginal + "\n"
                                        +"Se hizo add check con valor: " +nombreCons + " .");
                                texto = texto + tipo.getName()+"\n";
                                return tipo;
                            }
                            else{
                                Tipo tipo = new Error("Error: No se pudo modificar la tabla: " + tablaOriginal
                                        + "\n La columna no existe o ya tiene un valor.");
                                texto = texto + tipo.getName()+"\n";
                                return tipo;
                            }
                        }
                        else{
                            Tipo tipo = new Error("Error: No se pudo modificar la tabla: " + tablaOriginal
                                    + "\n La columna no existe.");
                            texto = texto + tipo.getName()+"\n";
                            return tipo;
                        }


                    case "foreign":
                        ArrayList<Object> o=(ArrayList<Object>)accion.getObjeto();
                        nombreConstraint= o.get(0).toString();
                        nombreColumna= o.get(1).toString();
                        ArrayList<Object> listado= (ArrayList)o.get(2);
                        ArrayList arr= (ArrayList)listado.get(1);

                        String columnReferencia=arr.get(0).toString();
                        String tablaReferencia=listado.get(0).toString();

                        if(!dbManager.constraintExist(tablaOriginal, nombreConstraint)){
                            if(dbManager.columnExist(tablaOriginal,nombreColumna)){
                                if(dbManager.columnExist(tablaReferencia, columnReferencia)){
                                    Pareja in=dbManager.getSingleColumn(tablaOriginal,nombreColumna);
                                    Pareja out=dbManager.getSingleColumn(tablaReferencia,columnReferencia);

                                    String tipo1=in.getTipo().getName();
                                    String tipo2=out.getTipo().getName();

                                    if(!tipo1.equals(tipo2)){
                                        if(!((tipo1.equals("Int")&&tipo2.equals("Float"))||(tipo1.equals("Float")
                                                && tipo2.equals("Int")))){

                                            Tipo tipo = new Error("Error: Tipos incompatibles en la instrucción, con tabla : " + tablaOriginal);
                                            texto = texto + tipo.getName()+"\n";
                                            return tipo;
                                        }

                                    }


                                    boolean tf=dbManager.createForeignKey(tablaOriginal,nombreColumna, nombreConstraint,columnReferencia,tablaReferencia);

                                    if(tf){
                                        Tipo tipo= new Valido("Se modifico la tabla: "+ tablaOriginal + "\n");
                                        texto = texto + tipo.getName()+"\n";
                                        return tipo;
                                    }
                                    else{
                                        Tipo tipo = new Error("Error: No se pudo modificar la tabla: " + tablaOriginal);
                                        texto = texto + tipo.getName()+"\n";
                                        return tipo;
                                    }

                                }
                                else{
                                    Tipo tipo = new Error("Error: No se pudo modificar la tabla: " + tablaOriginal
                                            + "\n La columna referenciada no existe.");
                                    texto = texto + tipo.getName()+"\n";
                                    return tipo;
                                }


                            }
                            else{
                                Tipo tipo = new Error("Error: No se pudo modificar la tabla: " + tablaOriginal
                                        + "\n La columna no existe.");
                                texto = texto + tipo.getName()+"\n";
                                return tipo;

                            }

                        }
                        else{
                            Tipo tipo = new Error("Error: No se pudo modificar la tabla: " + tablaOriginal
                                    + "\n La restriccion ya existe.");
                            texto = texto + tipo.getName()+"\n";
                            return tipo;
                        }

                    default:
                        break;

                }
            }

            else{
                boolean success= dbManager.addColumn(tablaOriginal,new Pareja(1,accion.getObjeto().toString(),accion));
                if(success){
                    Tipo tipo= new Valido("Se modifico la tabla. \nSe añadio la columna correctamente");
                    texto = texto + tipo.getName()+"\n";
                    return tipo;
                }
                else{
                    Tipo tipo = new Error("Error: No existe la tabla : " + tablaOriginal);
                    texto = texto + tipo.getName()+"\n";
                    return tipo;
                }
            }

        }
        return null;
    }

    @Override
    public Tipo visitAction(pruebaParser.ActionContext ctx) {
        /**
         * Metodo encargado de retornar informacion que sirve para anadir constraints
         * hace un drop a las columnas y constraints
         */
        ArrayList<Tipo> constraints = new ArrayList();

        if(ctx.tipo()!=null){
            String columnName= ctx.IDX().getText();
            Tipo tipo =visit(ctx.tipo());
            tipo.setObjeto(columnName);
            return tipo;
        }
        /**
         * Esta parte sirve para devolver el nombre de la constraints cuando es un ADD
         */
        else if(ctx.children.get(0).getText().equals("ADD")&&
                ctx.children.get(1).getText().equals("CONSTRAINT")){

            Tipo tipo = visit(ctx.constraint().get(0));
            return tipo;
        }
        /**
         * Esta parte sirve para devolver el nombre de la columna cuando es un DROP
         */

        else if(ctx.children.get(0).getText().equals("DROP")&&
                ctx.children.get(1).getText().equals("COLUMN")){

            String columnName =ctx.IDX().getText();
            Tipo tipo = new Tipo(columnName);
            tipo.setObjeto("dropcolumn");
            return tipo;
        }
        /**
         * Esta parte sirve para devolver el nombre de la constraints cuando es un DROP
         */
        else if(ctx.children.get(0).getText().equals("DROP")&&
                ctx.children.get(1).getText().equals("CONSTRAINT")){

            String constraintName =ctx.IDX().getText();
            Tipo tipo = new Tipo(constraintName);
            tipo.setObjeto("dropconstraint");
            return tipo;
        }

        else{
            Tipo tipo = new Error("Error");
            return tipo;
        }

    }

    @Override
    public Tipo visitDropTable(pruebaParser.DropTableContext ctx) {
        /**
         * Aun falta verificar que no haya una llave foranea al hacer el drop de una tabla
         */

        try {
            String tableName= ctx.IDX().getText();
            /**
             * Si se quiere borar una tabla solo se le pasa el nombre y se hace el DROP
             */
            if(dbManager.checkForeignTable(tableName)){

                if(dbManager.dropTable(tableName)){
                    Tipo tipo = new Valido("Se eliminó correctamente la tabla: " + tableName);
                    texto = texto + tipo.getName()+"\n";
                    return tipo;
                }
                else{
                    Tipo tipo = new Error("Error: No se pudo eliminar la tabla: " + tableName +
                            " Tabla no existe o tiene dependencias.");
                    texto = texto + tipo.getName()+"\n";
                    return tipo;
                }
            }
            else{
                Tipo tipo = new Error("Error: No se pudo eliminar la tabla: " + tableName +
                        " Tabla tiene dependencias.");
                texto = texto + tipo.getName()+"\n";
                return tipo;

            }
        } catch (JSONException ex) {
            Logger.getLogger(TheVisitor.class.getName()).log(Level.SEVERE, null, ex);
            Tipo tipo = new Error("Error desconocido.");
            texto = texto + tipo.getName()+"\n";
            return tipo;
        }
    }

    @Override
    public Tipo visitShowTables(pruebaParser.ShowTablesContext ctx) {
        /**
         * Metodo encargado de mostrar las tablas existentes en una base de datos
         */
        ArrayList<String> total=new ArrayList<>();
        String sum= "";
        ArrayList<String> lista= dbManager.showAllTables();
        if(lista!=null){
            Tipo tipo = new Valido("\nTablas existentes: " + "\n");

            for(String wat: lista){
                sum+= "• " +wat +"\n";
            }
            texto = texto + tipo.getName()+ sum + "\n";
            return tipo;
        }
        else{
            Tipo tipo= new Error("No existen tablas en la base de datos");
            texto = texto + tipo.getName()+"\n";
            return tipo;
        }
    }

    @Override
    public Tipo visitShowColumns(pruebaParser.ShowColumnsContext ctx) {
        /**
         * Metodo encargado de mostra las columnas existentes en una tabla de una base de datos
         * se muestra las llaves tambien
         */

        /**
         * Mostramos las columnnas
         */
        String tabla=ctx.IDX().getText();
        String result="";

        JSONArray array=dbManager.getAllColumns(tabla);
        JSONArray array2=dbManager.getAllConstraints(tabla);

        for (int i=0; i < array.length(); i++) {
            try {
                result+= "• " + array.getJSONObject(i).getString("name")+"\n";
            } catch (JSONException ex) {
                Logger.getLogger(TheVisitor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        result+= "\n" + "RESTRICCIONES: " + "\n";
        result+= "Nombre " + "\t" + "Tipo " + "\t" + "Condición" + "\t\n";
        for (int i=0; i < array2.length(); i++) {

            try {
                result+= "• " + array2.getJSONObject(i).getString("name")+"\t";
                result+= array2.getJSONObject(i).getString("type")+"\t";
                if(array2.getJSONObject(i).getString("type").equals("check")){
                    result+= array2.getJSONObject(i).getString("column");
                    result+= array2.getJSONObject(i).getString("conditionType");
                    result+= array2.getJSONObject(i).getString("conditionValue")+"\t";
                }
                result += "\n";
            } catch (JSONException ex) {
                Logger.getLogger(TheVisitor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        /**
         * Se devuelve el tipo valido si no existen errores para indicar que se realizo una instruccion
         */
        Tipo valido = new Tipo("Columnas existentes para tabla "+ tabla + ": \n");
        texto=texto+ valido.getName()+ result;

        return valido;
    }

    @Override
    public Tipo visitInsertInto(pruebaParser.InsertIntoContext ctx) {
        /**
         * Metodo encargado para el INSERT en donde se quiere mandar las columnas y los nuevos valores
         */
        ArrayList<String> listaDeIds= new ArrayList();
        ArrayList<String> newRowValues= new ArrayList();
        ArrayList<String> dataTypes= new ArrayList();
        ArrayList<Pareja> columns = new ArrayList();
        ArrayList<String> columnasOriginales = new ArrayList();
        int contador=0;
        String tableName="";

        if(ctx.IDX().size()==1){
            tableName=ctx.IDX().get(0).getText();
        }
        else{
            for(TerminalNode i :ctx.IDX()){
                if(contador!=0){
                    String id= i.getText();
                    listaDeIds.add(id);
                }
                else{
                    tableName= ctx.IDX(0).getText();
                }
                contador+=1;
            }
        }

        for(int j=0;j<listaDeIds.size();j++){
            columns.add(new Pareja(j,listaDeIds.get(j),null));
        }

        for(pruebaParser.LiteralContext literal :ctx.literal()){
            Tipo tipo = visit(literal);
            if(!(tipo instanceof Error)){
                newRowValues.add(tipo.getObjeto().toString());
                dataTypes.add(tipo.getName());
            }
            else{
                return tipo;
            }

        }
        // Se utiliza el metodo insert hasta arriba, aqui solo se appendea a una lista para mientras.

        if(newRowValues.size()==columns.size() || columns.isEmpty()){
            ArrayList<Pareja> lista=getColumnsFromTable(tableName);
            ArrayList<String> lista2 = new ArrayList();
            for(Pareja p: lista){
                lista2.add(p.getColumnName());
                columnasOriginales.add(p.getTipo().getName());
            }
            if(lista2.containsAll(listaDeIds)){
                newRowValues=quitarComillas(newRowValues);
                ArrayList<String> resValues= revisarTiposDato(dataTypes,lista,newRowValues);
                ArrayList<String> hp= resValues;
                resValues=ordenarDatos(listaDeIds,lista,resValues);



                if(!compararTiposDatos(columnasOriginales,dataTypes)){
                    Tipo tipo = new Error("Error: Existe 1 o más tipos de datos que no concuerdan en la expresión");
                    texto = texto + tipo.getName()+"\n";
                    return tipo;
                }

                if(resValues.isEmpty()){
                    resValues=hp;
                }

                if(revisarSizeChar(newRowValues)){
                    if(!resValues.get(0).equals("error")){

                        InsertStructure estructura;
                        if(!listaDeIds.isEmpty()){
                            while(listaDeIds.size()>resValues.size()){
                                resValues.add("NULL");
                            }
                            estructura = new InsertStructure(tableName,listaDeIds,resValues);
                        }
                        else{
                            while(lista2.size()>resValues.size()){
                                resValues.add("NULL");
                            }
                            estructura= new InsertStructure(tableName,lista2,resValues);
                        }

                        dbManager.getInserts().add(estructura);

                        Tipo tipo = new Valido("Insert realizado con éxito en la tabla: " + tableName);
                        texto = texto + tipo.getName()+"\n";
                        return tipo;
                    }
                    else{
                        ArrayList<ArrayList<String>> ordered= validarOrdenColumns(listaDeIds,lista2,newRowValues,dataTypes);

                        ArrayList<String> resValues2= revisarTiposDato(ordered.get(1),lista,ordered.get(0));
                        if(!resValues2.get(0).equals("error")){

                            InsertStructure estructura;
                            if(!listaDeIds.isEmpty()){
                                while(listaDeIds.size()>resValues2.size()){
                                    resValues2.add("NULL");
                                }
                                estructura = new InsertStructure(tableName,listaDeIds,resValues2);
                            }
                            else{
                                while(lista2.size()>resValues2.size()){
                                    resValues2.add("NULL");
                                }
                                estructura= new InsertStructure(tableName,lista2,resValues2);
                            }

                            dbManager.getInserts().add(estructura);

                            Tipo tipo = new Valido("Insert realizado con éxito en la tabla: " + tableName);
                            texto = texto + tipo.getName()+"\n";
                            return tipo;
                        }
                        else{
                            Tipo tipo = new Error("Error: Existe 1 o más tipos de datos que no concuerdan en la expresión");
                            texto = texto + tipo.getName()+"\n";
                            return tipo;
                        }
                    }
                }
                else{
                    Tipo tipo = new Error("Error: El valor ingresado para un valor a insertar \n"
                            + " sobrepasa el tamaño indicado para esa columna.");
                    texto = texto + tipo.getName()+"\n";
                    return tipo;
                }

            }
            else{
                Tipo tipo = new Error("Error: No existe una columna/s expresada, en la tabla: " + tableName);
                texto = texto + tipo.getName()+"\n";
                return tipo;
            }
        }
        else{
            Tipo tipo = new Error("Error: Más columnas que expresiones en la instrucción");
            texto = texto + tipo.getName()+"\n";
            return tipo;
        }


    }


    @Override
    public Tipo visitUpdateSet(pruebaParser.UpdateSetContext ctx) {
        /**
         * Metodo encargado de realizar el update de data en una tabla de la base de datos
         * se edeben hacer vasrias validaciones
         */

        String tableName= ctx.IDX(0).getText();
        ArrayList<Tipo> list1= new ArrayList<>();
        ArrayList<String> list2= new ArrayList<>();
        ArrayList<String> nombreColumnasSet= new ArrayList<>();
        boolean whereExists=false;
        String lit="";
        String columnName2="";
        String valor="";
        String signo="";

        for(int i=0;i<ctx.IDX().size()-1;i++){
            Tipo tipo = visit(ctx.literal().get(i));
            try{
                lit = tipo.getObjeto().toString();
            }
            catch(Exception e){
                lit="NULL";
            }
            nombreColumnasSet.add(ctx.IDX(i+1).getText());

            list1.add(tipo);
            list2.add(lit);

        }

        /**
         * Llamada a metodo updateSET
         */
        ArrayList<String> columnsTable= new ArrayList<>();
        ArrayList<Pareja> colFromTable=getColumnsFromTable(tableName);
        for(int k=0;k<colFromTable.size();k++){
            columnsTable.add(colFromTable.get(k).getColumnName());
        }

        if(ctx.WHERE()!=null){
            whereExists=true;
            Tipo tipo = visit(ctx.exp());
            ArrayList<String> lista = (ArrayList)tipo.getObjeto();
            columnName2 =lista.get(0);
            valor= lista.get(2).replaceAll("\'", "");
            signo=lista.get(1);

            if(!columnsTable.contains(columnName2)){
                Tipo error = new Error("Error en UPDATE: Una columna o más no existen en el WHERE.");
                texto = texto + error.getName()+"\n";
                return error;
            }
        }
        /**
         * Se quitan las comillas de los inputs
         */
        list2=quitarComillas(list2);

        if(columnsTable.containsAll(nombreColumnasSet)){
            if(revisarSizeChar(list2)){
                try {
                    for(int j=0;j<nombreColumnasSet.size();j++){
                        if(whereExists){
                            dbManager.update(tableName,nombreColumnasSet.get(j),list2.get(j),new WhereStructure(columnName2,valor,signo));

                        }
                        else{
                            dbManager.update(tableName,nombreColumnasSet.get(j),list2.get(j),null);
                        }
                    }
                    Tipo valido = new Valido("UPDATE: Se realizo el update correctamente. Se modifico la tabla: "+ tableName);
                    texto = texto + valido.getName()+"\n";
                    return valido;

                } catch (JSONException ex) {
                    Logger.getLogger(TheVisitor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                Tipo tipo = new Error("Error: El valor ingresado para un valor a hacer UPDATE:  \n"
                        + " sobrepasa el tamaño indicado para esa columna.");
                texto = texto + tipo.getName()+"\n";
                return tipo;

            }

        }
        else{
            Tipo error = new Error("Error en UPDATE: Una columna o más no existen.");
            texto = texto + error.getName()+"\n";
            return error;
        }

        return visitChildren(ctx);
    }

    @Override
    public Tipo visitDeleteFrom(pruebaParser.DeleteFromContext ctx) {
        /**
         * Metodo para realizar un DELETE de la Base de datos
         * obtenemos las tablas existentes del DBManager
         */

        ArrayList<String> temp = new ArrayList<>();
        String tableName= ctx.IDX().getText();
        Tipo tipo = visit(ctx.exp());
        ArrayList<String> lista = (ArrayList)tipo.getObjeto();
        String columnName =lista.get(0);
        String operador= lista.get(1);
        String valor= lista.get(2);
        /**
         * Mostramos todas las tablas de los archivos de las tablas
         * pero sin haber sido parseadas
         */
        ArrayList<String> total=dbManager.showAllTables();
        ArrayList<String> tablasExistentes= new ArrayList<>();

        for(String s: total){
            String [] sub=s.split("\\.");
            String name=sub[0];
            if(!tablasExistentes.contains(name)){
                tablasExistentes.add(name);
            }
        }

        try{
            ArrayList<Pareja> parejas= getColumnsFromTable(tableName);
            for(Pareja p: parejas){
                temp.add(p.getColumnName());
            }
        }
        catch(Exception e){
            tipo = new Error("Error: No existe la tabla: " + tableName+" en las tablas de la BD.");
            texto = texto + tipo.getName()+"\n";
            return tipo;

        }

        if(temp.contains(columnName)){

            WhereStructure ws = new WhereStructure(columnName,valor.replaceAll("\'",""), operador);
            try {
                boolean result= dbManager.delete(tableName,ws);
                if(!result){
                    tipo = new Error("Error: Delete viola la llave foránea.");
                    texto = texto + tipo.getName()+"\n";
                    return tipo;
                }


            } catch (JSONException ex) {
                Logger.getLogger(TheVisitor.class.getName()).log(Level.SEVERE, null, ex);
                tipo = new Error("Error: No se realizo el DELETE.");
                texto = texto + tipo.getName()+"\n";
                return tipo;
            }

            tipo = new Valido("Se hizo el delete correctamente en la tabla: " + tableName);
            texto = texto + tipo.getName() + "\n";
            return tipo;
        }
        else{
            tipo = new Error("Error: No existe la columna: " + columnName+" en las tabla.");
            texto = texto + tipo.getName()+"\n";
            return tipo;
        }
    }

    @Override
    public Tipo visitSelectFrom(pruebaParser.SelectFromContext ctx) {
        /**
         * Metodo encargado de realizar un SELECT de informacion de una tabla de una base de datos
         */
        Tipo tipo= visit(ctx.sep());
        ArrayList<String> columnas=new ArrayList<>();
        ArrayList<String> nombreTablas= new ArrayList();
        String allColumns="";
        ArrayList<String> listaExpresion=null;
        ArrayList<String> listaOrder=null;
        boolean whereExists=false;
        boolean asterisco=false;
        boolean orderExists=false;
        String ascOrDes="";
        String valorOrder="";

        try{
            columnas = (ArrayList<String>)tipo.getObjeto();
        }
        catch(Exception e){
            allColumns =tipo.getObjeto().toString();
            asterisco=true;
        }

        for(int j=0;j<ctx.IDX().getChildCount();j++){
            nombreTablas.add(ctx.IDX().getText());
        }
        if(asterisco){
            columnas =getColumnsSelect(getColumnsFromTable(nombreTablas.get(0)));
        }

        if(ctx.WHERE()!=null){
            whereExists=true;
            Tipo ret = visit(ctx.exp().get(0));
            listaExpresion= (ArrayList<String>)ret.getObjeto();
        }

        if(ctx.ORDER()!=null){
            orderExists=true;
            Tipo order;
            if(!whereExists){
                order= visit(ctx.exp().get(0));
            }
            else{
                order= visit(ctx.exp().get(1));
            }

            listaOrder= (ArrayList<String>)order.getObjeto();
            valorOrder=listaOrder.get(2);

            if(ctx.DESC()!=null){
                ascOrDes="DESC";
            }
            else if(ctx.ASC()!=null){
                ascOrDes="ASC";
            }
        }

        try {

            JSONArray array;

            if(nombreTablas.size()>1){
                array=dbManager.selectCartessian(nombreTablas.get(0),nombreTablas.get(1));
            }
            else{
                if(!whereExists){
                    array=dbManager.select(nombreTablas.get(0),columnas,null,null,"");
                    if(orderExists){
                        array=dbManager.orderJSON(array,valorOrder);
                    }
                }
                else{
                    if(listaExpresion.size()>3){
                        WhereStructure where1= new WhereStructure(listaExpresion.get(0),
                                listaExpresion.get(2).replaceAll("\'",""),listaExpresion.get(1));

                        WhereStructure where2= new WhereStructure(listaExpresion.get(4),
                                listaExpresion.get(6).replaceAll("\'",""),listaExpresion.get(5));
                        array=dbManager.select(nombreTablas.get(0),columnas,where1,where2,listaExpresion.get(3));
                        if(orderExists){
                            // ORDEN EXISTE
                            array=dbManager.orderJSON(array,valorOrder);
                        }
                    }
                    else{
                        WhereStructure where1= new WhereStructure(listaExpresion.get(0),
                                listaExpresion.get(2).replaceAll("\'",""),listaExpresion.get(1));
                        array=dbManager.select(nombreTablas.get(0),columnas,where1,null,"");
                        if(orderExists){
                            // ORDEN EXISTE
                            array=dbManager.orderJSON(array,valorOrder);
                        }
                    }
                }
            }

            String result = "RESULTADO SELECT: \n";
            for(String columna : columnas){
                result +=  columna + "\t";
            }
            result += "\n";

            if(ascOrDes.equals("DESC")){
                for(int i  = array.length()-1; i >=0; i--){
                    for(String columna : columnas){
                        result += array.getJSONObject(i).getString(columna) + "\t";
                    }
                    result += "\n";
                }
            }
            else{
                for(int i  = 0; i < array.length(); i++){
                    for(String columna : columnas){
                        result += array.getJSONObject(i).getString(columna) + "\t";
                    }
                    result += "\n";
                }
            }

            tipo = new Valido(result);
            texto = texto + tipo.getName()+"\n";
            return tipo;

        } catch (JSONException ex) {
            Logger.getLogger(TheVisitor.class.getName()).log(Level.SEVERE, null, ex);
        }

        return visitChildren(ctx);
    }

    @Override

    public Tipo visitSep(pruebaParser.SepContext ctx) {
        /**
         * Metodo encargado para ver cuando se mandan parametros en el select
         * o solo manda un asterisco que representa todos los campos de la tabla
         */

        ArrayList<String> listaDeIds= new ArrayList();
        if(ctx.IDX().size()>0){
            for(TerminalNode i :ctx.IDX()){
                String id= i.getText();
                listaDeIds.add(id);
            }
            return new Tipo(listaDeIds);
        }
        else{
            Tipo tipo = new Valido("Valido");
            String i= "*";
            tipo.setObjeto(i);
            return tipo;
        }
    }

    @Override
    // Listo
    public Tipo visitRel_op(pruebaParser.Rel_opContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    // Listo
    public Tipo visitEq_op(pruebaParser.Eq_opContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    // Listo
    public Tipo visitAdd_op(pruebaParser.Add_opContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    // Listo
    public Tipo visitMult_op(pruebaParser.Mult_opContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Tipo visitFecha(pruebaParser.FechaContext ctx) {
        /**
         * Metodo encargado de parsear una fecha y verificar que este en formato correcto
         */
        String year=ctx.children.get(1).getText();
        String total= ctx.children.get(3).getText();
        int mes= Integer.parseInt(total);
        String total2=ctx.children.get(5).getText();
        int dias= Integer.parseInt(total2);
        /**
         * SE verifica que el mes sea menos de 12
         */
        if(mes<=12){
            /**
             * y que sea menos a 31 en los dias si no es asi existe un error
             */
            if(dias<=31){
                Tipo tipo = new Date("Date");
                String value= year + "-" + total + "-" + total2;
                tipo.setObjeto(value);
                return tipo;
            }
            /**
             *  Se muestra un error si la fecha no esta bien escriuta
             */
            else{
                Tipo error = new Error("Error: Fecha incorrecta. Revise la sentencia");
                texto = texto + error.getName()+"\n";
                return error;
            }
        }
        else{
            Tipo error = new Error("Error: Fecha incorrecta. Revise la sentencia");
            texto = texto + error.getName()+"\n";
            return error;
        }
    }

    @Override
    public Tipo visitLiteral(pruebaParser.LiteralContext ctx) {
        /**
         * Este metodo se encarga de diferencias los tipos de datos y mandar el valor del tipo de dato
         */

        if(ctx.NUMX()!=null){
            Tipo tipo = visit(ctx.NUMX());
            return tipo;
        }
        else if(ctx.NUMX()!=null){
            Tipo tipo = new Int("Int");
            String value= ctx.NUMX().getText();
            tipo.setObjeto(value);
            return tipo;
        }
        else if(ctx.fecha()!=null){
            Tipo tipo= visit(ctx.fecha());
            return tipo;
        }
        else if(ctx.CHARX()!=null){
            Tipo tipo = new Char("Char");
            String value= ctx.CHARX().getText();
            tipo.setObjeto(value);
            return tipo;
        }
        else{
            Tipo error= new Error("Error");
            return error;
        }
    }

    @Override
    public Tipo visitFloatx(pruebaParser.TipoContext ctx){
        /**
         * Este metodo sirve para parsear un float y convertirloa este tipo de dato
         */
        String part1=ctx.children.get(0).getText();
        String part2=ctx.children.get(2).getText();
        Tipo tipo= new Flotante("Float");
        String valor=part1+ "."+ part2;
        tipo.setObjeto(valor);
        return tipo;
    }

    /**
     * Getters y setters para mostrar el texto de los errores o informacion al usuario
     * @return texto
     */


    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * Este metodo sirve para obtener las columnas con sus tipos de una tabla en la base de datos
     * @param tabla
     * @return lista
     */

    // metodo para obtener las columnas con sus respectivos tipos de una tabla de la BD.
    public ArrayList<Pareja> getColumnsFromTable(String tabla){
        ArrayList<Pareja> lista= new ArrayList<>();
        JSONArray array=dbManager.getAllColumns(tabla);

        for (int i=0; i < array.length(); i++) {
            try {
                lista.add(new Pareja(i,array.getJSONObject(i).getString("name"),
                        new Tipo(array.getJSONObject(i).getString("type"))));

            } catch (JSONException ex) {
                Logger.getLogger(TheVisitor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }


    public ArrayList<String> revisarTiposDato(ArrayList<String> lista1, ArrayList<Pareja> lista2,ArrayList<String> newRowValues){
        /**
         * Este metodo se encarga de revisar si los tipos de datos concuerdan entre dos listas
         * si no concuerdan se muestran errores
         * y se trata de CASTEAR los valores para tratar de corregir el dato
         */
        ArrayList<String> error= new ArrayList<>();
        for(int j=0;j<lista1.size();j++){
            if(!(lista2.get(j).getTipo().getName().equals(lista1.get(j)))){
                String valor=newRowValues.get(j).replaceAll("\'", "");
                switch(lista1.get(j)){
                    case "Char":
                        switch(lista2.get(j).getTipo().getName()){
                            case "Float":
                                try{
                                    Float.parseFloat(valor);
                                    newRowValues.add(j,valor);
                                    newRowValues.remove(j+1);
                                    break;
                                }
                                catch(Exception e){
                                    error.add("error");
                                    return error;
                                }
                            case "Int":
                                try{
                                    Integer.parseInt(valor);
                                    newRowValues.add(j,valor);
                                    newRowValues.remove(j+1);
                                    break;
                                }
                                catch(Exception e){
                                    error.add("error");
                                    return error;
                                }
                        }
                        break;
                    case "Int":
                        switch(lista2.get(j).getTipo().getName()){
                            case "Char":
                                try{
                                    newRowValues.add(j,valor);
                                    newRowValues.remove(j+1);
                                    break;
                                }
                                catch(Exception e){
                                    error.add("error");
                                    return error;
                                }
                            case "Float":
                                try{
                                    String newValue=String.valueOf(Float.parseFloat(valor));
                                    newRowValues.add(j,newValue);
                                    newRowValues.remove(j+1);
                                    break;
                                }
                                catch(Exception e){
                                    error.add("error");
                                    return error;
                                }
                            default:
                                error.add("error");
                                return error;
                        }
                        break;
                    case "Float":
                        switch(lista2.get(j).getTipo().getName()){
                            case "Int":
                                try{
                                    int valor2 =Math.round(Float.parseFloat(valor));
                                    newRowValues.add(j,String.valueOf(valor2));
                                    newRowValues.remove(j+1);
                                    break;
                                }
                                catch(Exception e){
                                    error.add("error");
                                    return error;
                                }
                        }
                        break;
                }
            }
        }


        return newRowValues;
    }

    public ArrayList<String> quitarComillas(ArrayList<String> values){
        ArrayList<String> newnewValues= new ArrayList<>();
        for(String valor: values){
            newnewValues.add(valor.replaceAll("\'",""));
        }
        return newnewValues;
    }

    public ArrayList<String> getColumnsSelect(ArrayList<Pareja> lista){
        /**
         * Lista de las columnas del SELECT
         */
        ArrayList<String> list= new ArrayList<>();
        for(Pareja p: lista){
            list.add(p.getColumnName());
        }
        return list;
    }

    public boolean revisarSizeChar(ArrayList<String> rowValues){
        for(String row: rowValues){
            if(row.equals("ABCDEFGHIJKLMNOPQRSTUVWXYZ")){
                return false;
            }
        }
        return true;
    }

    public ArrayList<ArrayList<String>> validarOrdenColumns(ArrayList<String> lnuevos,ArrayList<String> loriginales,
                                                            ArrayList<String> newrows, ArrayList<String> datatipos){
        ArrayList<String> rowsOrdenados = new ArrayList<>();

        ArrayList<String> tiposOrdenados = new ArrayList<>();
        ArrayList<ArrayList<String>> pro= new ArrayList<>();

        for(int k=0;k<loriginales.size();k++){
            rowsOrdenados.add("");
            tiposOrdenados.add("");
        }

        for(int j=0;j<loriginales.size();j++){
            int number=lnuevos.indexOf(loriginales.get(j));
            if(number!=-1){
                rowsOrdenados.add(j, newrows.get(number));
                rowsOrdenados.remove(j+1);
                tiposOrdenados.add(j,datatipos.get(number));
                tiposOrdenados.remove(j+1);
            }
        }

        for(int m=0;m<rowsOrdenados.size();m++){
            if(rowsOrdenados.get(m).equals("")){
                rowsOrdenados.set(m,"NULL");
            }
        }
        pro.add(rowsOrdenados);
        pro.add(tiposOrdenados);

        return pro;
    }

    public ArrayList<String> ordenarDatos(ArrayList<String> listaDeIds,ArrayList<Pareja> lista,ArrayList<String> resValues){
        ArrayList<String> newres= new ArrayList();
        /**
         * Metodo encargado de ordenar los datos en una lista
         */

        if(!listaDeIds.isEmpty()){
            if(!resValues.get(0).equals("error")){
                for(int k=0;k<listaDeIds.size();k++){
                    newres.add("");
                }

                for(int j=0;j<lista.size();j++){
                    int number=listaDeIds.indexOf(lista.get(j).getColumnName());
                    if(number!=-1){
                        newres.add(j, resValues.get(number));
                        newres.remove(j+1);
                    }
                }
            }

        }
        return newres;
    }

    public boolean compararTiposDatos(ArrayList<String> original, ArrayList<String> nuevo){
        /**
         * Metodo encargado de tomar los tipos de datos y compararlos
         */
        boolean ban=true;
        for(int i=0;i<original.size();i++){
            try{
                if(!original.get(i).equals(nuevo.get(i))){
                    ban=false;
                }
            }
            catch(Exception e){
                // seguir
            }
        }

        try{
            if(original.get(2).equals("Date")&& nuevo.get(2).equals("Char")){
                if(original.get(3).equals("Char")&&nuevo.get(3).equals("Int")){
                    return false;
                }
            }
        }
        catch(Exception e){
        }

        return true;
    }

}
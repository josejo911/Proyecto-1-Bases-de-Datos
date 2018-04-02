package sample.Main;
/**
 *Universidad del valle de guatemala
 * Nombre: Marlon Fuentes, Jose Jo, Diego Alvarez
 * Clase encargada del manejo de parte logica del manejador de base de datos,
 * en ella se realizan las acciones de memoria.
 * */

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseManager {
    /**
     * Se genera un objeto FileManager para poder utilizar los metodos de creacion de archivos y directorios
     * El arrayList inserts almacena la estrucura de todos los inserts que se generen
     */

	TypeWritter TW = new TypeWritter();
	String dbName;
        ArrayList<InsertStructure> inserts;
        private boolean verboseActivated;
        
         public DatabaseManager(String dbName) {
            this.dbName = dbName;
        }

        public DatabaseManager(boolean verbose) {
              this.inserts= new ArrayList<>();
              this.verboseActivated=verbose;
        }
       
	public boolean createDatabase(String dbName){
        /**
         * Descripcion de metodo:
         *          Metodo encargado de la generacion de bases de datos
         *
         */
        if(verboseActivated) System.out.println("Verbose: Creando Base de Datos");
		return TW.crearCarpeta(dbName);
	}
	
	public boolean alterDatabase(String oldDbName, String newDbName){

        /**
         * Descripcion de metodo:
         *          Metodo encargado de la modificacion de la base sde datos
         *
         */
                if(verboseActivated) System.out.println("Verbose: Modificando Base de Datos");
		return TW.renombrarCarpeta(oldDbName, newDbName);
	}
	
	public boolean deleteDatabase(String dbName){

        /**
         * Descripcion de metodo:
         *          Metodo encargado de la eliminacion de la base de datos
         *
         */
                if(verboseActivated) System.out.println("Verbose: Eliminando Base de Datos");
		return TW.borrarCarpeta(dbName);
	}
	
	public ArrayList<String> showAllDatabases(){

        /**
         * Descripcion de metodo:
         *          Metodo encargado de mostrar todas las bases de datos almacenadas en el arraylist
         *
         */
	    return TW.getAllFolders();
	}
	
	public boolean useDatabase(String dbName){

        /**
         * Descripcion de metodo:
         *          Metodo encargado de utilizar las bases de datos utilizadas con el directorio
         *
         */
            
                ArrayList<String> lista= showAllDatabases();
                if(lista.indexOf(dbName)<0){
                    return false;
                }
                else{
                    this.dbName = dbName + "/";
                    return true;
                }
		
	}
	
	public ArrayList<String> showAllTables(){
            ArrayList<String> files = TW.getAllFiles(dbName);
            ArrayList<String> tables = new ArrayList<>();
            for (String file : files) {
                String fileName = file.substring(0, file.indexOf("."));
                if(!tables.contains(file.substring(0, file.indexOf(".")))){
                    tables.add(fileName);
                }
            }
            return tables;
	}
        
	public boolean checkForeignTable(String checkTable) throws JSONException{

        /**
         * Descripcion de metodo:
         *          Metodo encargado de mostrar si la tabla tiene una llave primaria
         *
         */
            ArrayList<String> tables = showAllTables();
            for (String table : tables) {
                String tableName = table + ".rels";
                String fileContent = TW.leerArchivo(tableName, dbName);
                JSONArray currentForeigns = new JSONArray(fileContent);
                for(int i = 0; i < currentForeigns.length(); i++){
                    if(currentForeigns.getJSONObject(i).getString("type").equals("foreign")){
                        //is a Foreign Key
                        if(currentForeigns.getJSONObject(i).getString("referenceTable").equals(checkTable)){
                            //There's a Foreign Key
                            return false;
                        }
                    }
                }
            }
            return true;
	}
        
        public boolean constraintExist(String table, String constraint){
            boolean exists = false;             
            try {
                JSONArray jsonArray = getAllConstraints(table);
                for (int i=0; i < jsonArray.length(); i++) {
                    if(!exists) exists = jsonArray.getJSONObject(i).getString("name").equals(constraint);
                }
            } catch (JSONException ex) {
                Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }            
                return exists;
        }
  
        public boolean hasPrimaryKey(String table){

            /**
             * Descripcion de metodo:
             *          Metodo encargado de revisar si la tabla tiene una llave primaria asignada
             *
             */
            boolean exists = false;             
            try {
                JSONArray jsonArray = getAllConstraints(table);
                for (int i=0; i < jsonArray.length(); i++) {
                    if(!exists){
                        exists = jsonArray.getJSONObject(i).getString("type").equals("primary");
                    }
                }
            } catch (JSONException ex) {
                Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }            
            return exists;
        }
        
        public boolean columnExist(String table, String column){

            /**
             * Descripcion de metodo:
             *          Metodo encargado de revisar si la columna existe en la tabla
             *
             */
            boolean exists = false;             
            try {
                JSONArray jsonArray = getAllColumns(table);
                for (int i=0; i < jsonArray.length(); i++) {
                    if(!exists) exists = jsonArray.getJSONObject(i).getString("name").equals(column);
                    
                }
            } catch (JSONException ex) {
                Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }            
                return exists;
        }
         
        public Pareja getSingleColumn(String table, String column){

            /**
             * Descripcion de metodo:
             *          Metodo encargado de mostrar las parejas de las columnas
             *
             */
            boolean exists = false;     
            JSONObject jsonObject = null;
            Pareja pareja = null;
            
            try {
                JSONArray jsonArray = getAllColumns(table);
                for (int i=0; i < jsonArray.length(); i++) {
                    if(!exists){
                        exists = jsonArray.getJSONObject(i).getString("name").equals(column);
                        jsonObject = jsonArray.getJSONObject(i);
                        pareja = new Pareja(jsonObject.getInt("number"), jsonObject.getString("name"), new Tipo(jsonObject.getString("type")));
                    }
                }
            } catch (JSONException ex) {
                Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }            
            
            return pareja;
        }
        
        public JSONArray getAllColumns(String table){

            /**
             * Descripcion de metodo:
             *          Metodo encargado de mostrar todas las columnas de la tabla
             *
             */
            
            String fileContent = TW.leerArchivo(table + ".cols", dbName);
            JSONArray jsonArray=null;
            try {
                jsonArray = new JSONArray(fileContent);
            } catch (JSONException ex) {
                Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
                        
            return jsonArray;
        }
        
        public JSONArray getAllConstraints(String table){
            String fileContent = TW.leerArchivo(table + ".rels", dbName);
            JSONArray jsonArray= new JSONArray();
            try {
                jsonArray = new JSONArray(fileContent);
            } catch (JSONException ex) {
                Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            return jsonArray;
        }
        
        public boolean createCheck(String table, String column, String conditionType,
                                   String conditionValue,String constraintName){

            /**
             * Descripcion de metodo:
             *          Metodo encargado de ver los checks  agregando los objetos
             *          utiliza los atributos
             *          tabla
             *          columna
             *          tipo de condicion
             *          valor de la condicion
             *          nombre
             *
             */
            boolean success = false;
            String tableName = table + ".rels";
            String fileContent = TW.leerArchivo(tableName, dbName);
            if(columnExist(table, column)){
                JSONArray jsonArray;
                try {
                    jsonArray = new JSONArray(fileContent);
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("type", "check");
                    jsonObject.put("column", column);
                    jsonObject.put("conditionType", conditionType);
                    jsonObject.put("conditionValue", conditionValue);
                    jsonObject.put("name", constraintName);
                    jsonArray.put(jsonObject);
                    TW.escribirArchivo(tableName, dbName, jsonArray.toString());
                    success = true;
                } catch (JSONException ex) {

                }
            }
            return success;
        }
        
        public boolean createForeignKey(String table, String column, String constraint, 
                String referenceColumn, String referenceTable){

            /**
             * Descripcion de metodo:
             *          Metodo encargado de generar una llave foranea
             *          utiliza los atributos de
             *              tabla
             *              columna
             *              constraint
             *              columna a referenciar
             *              referencia de tabla
             *
             */
            boolean success = false;
            
            String tableName = table + ".rels";
            String fileContent = TW.leerArchivo(tableName, dbName);
            if(columnExist(table, column)){
                JSONArray jsonArray;
                try {
                    jsonArray = new JSONArray(fileContent);
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("type", "foreign");
                    jsonObject.put("column", column);
                    jsonObject.put("name", constraint);
                    jsonObject.put("referenceColumn", referenceColumn);
                    jsonObject.put("referenceTable", referenceTable);
                    jsonArray.put(jsonObject);
                    TW.escribirArchivo(tableName, dbName, jsonArray.toString());
                    success = true;
                } catch (JSONException ex) {

                }
            }
            
            return success;
        }
        
        
        
        
        public boolean createPrimaryKey(String table, String column, String constraint){

            /**
             * Descripcion de metodo:
             *          Metodo encargado de crear una llave primaria
             *          utiliza los atributos
             *                  tabla
             *                  columna
             *                  constraint
             *
             */
            boolean success = false;
            String tableName = table + ".rels";
            String fileContent = TW.leerArchivo(tableName, dbName);
            if(columnExist(table, column)){
                JSONArray jsonArray;
                try {
                    jsonArray = new JSONArray(fileContent);
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("type", "primary");
                    jsonObject.put("column", column);
                    jsonObject.put("name", constraint);
                    jsonArray.put(jsonObject);
                    TW.escribirArchivo(tableName, dbName, jsonArray.toString());
                    success = true;
                } catch (JSONException ex) {

                }
            }
            return success;
        }
        
	public int createTable(String s, ArrayList<Pareja> columns){

        /**
         * Descripcion de metodo:
         *          Metodo encargado de crear una tabla utilizando el arraylist de las parejas
         *          crea 3 archivos
         *              .json
         *              .cols
         *              .rels
         *
         */
            if(verboseActivated) System.out.println("Verbose: Creando tabla...");
            if(this.dbName!=null){
		try{
			String text = "";
			TW.crearArchivo(s + ".json", dbName);
			TW.crearArchivo(s + ".cols", dbName);
			TW.crearArchivo(s + ".rels", dbName);
			
                        JSONArray array = new JSONArray();
                        JSONObject object;
                        
			for(Pareja column: columns){
                            object = new JSONObject();
                            
                            object.put("number", column.getNumero());
                            object.put("name", column.getColumnName());
                            object.put("type", column.getTipo().getName());
				  //text += column.getNumero()+"," + column.getColumnName() + "," + column.getTipo().getName() + ",";
                            array.put(object);
			}

			//text = text.substring(0, text.length()-1);
			TW.escribirArchivo(s + ".cols", dbName, array.toString());
			TW.escribirArchivo(s + ".rels", dbName, "[]");
                        TW.escribirArchivo(s + ".json", dbName, "[]");
			return 1;
		}catch(Exception e){
			TW.borrarArchivo(s + ".json", dbName);
			TW.borrarArchivo(s + ".cols", dbName);
			TW.borrarArchivo(s + ".rels", dbName);
			return 0;
		}
            }
            else{
                return 2;
            }
	}
	
	public boolean alterTableName(String tNameOld, String tNameNew){
                if(verboseActivated) System.out.println("Verbose: Modificando tabla...");
		TW.renombrarArchivo(tNameOld + ".json", tNameNew + ".json", dbName);
		TW.renombrarArchivo(tNameOld + ".cols", tNameNew + ".cols", dbName);
		return TW.renombrarArchivo(tNameOld + ".rels", tNameNew + ".rels", dbName);
	}
	
	public boolean dropTable(String tableName){

        /**
         * Descripcion de metodo:
         *          Verifica las llaves foraneas de la tabla
         *
         */
                if(verboseActivated) System.out.println("Verbose: Eliminando tabla...");
		//Verificar las llaves foráneas
		TW.borrarArchivo(tableName + ".json", dbName);
                TW.borrarArchivo(tableName + ".cols", dbName);
                return TW.borrarArchivo(tableName + ".rels", dbName);
	}
	
	public boolean addColumn(String table, Pareja column){

        /**
         * Descripcion de metodo:
         *          Metodo encargado de agregar columnas a la tabla agregando el numero, nombre y tipo
         *
         */
            boolean success = false;
            try {
                JSONArray array = getAllColumns(table);
                JSONObject object = new JSONObject();
                object.put("number", column.getNumero());
                object.put("name", column.getColumnName());
                object.put("type", column.getTipo().getName());
                try{
                    array.put(object);
                    TW.escribirArchivo(table + ".cols", dbName, array.toString());
                    success = true;
                }
                catch(Exception e){
                    success = false;
                }
    
            } catch (JSONException ex) {
                Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            return success;
	}
        
        public boolean dropConstraint(String table, String constraintName){
            //Falta Validación de Constraints
            // borrar el ultimo
            boolean success = false;
            try {
                JSONArray array = getAllConstraints(table);
                for (int i=array.length()-1; i>=0; i--) {
                    if (array.getJSONObject(i).getString("name").equals(constraintName)){
                        array.remove(array.getJSONObject(i));
                    }
                }
                TW.escribirArchivo(table + ".rels", dbName, array.toString());
                success = true;
            } catch (JSONException ex) {
                Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            return success;
	}
	
	public boolean dropColumn(String table, String columnName){

        /**
         * Descripcion de metodo:
         *          Metodo encargado de la eliminacion de una columna en la tabla
         *
         */
            //Falta Validación de Constraints
            boolean success = false;
            try {
                JSONArray array = getAllColumns(table);
                for (int i=0; i < array.length(); i++) {
                    if (array.getJSONObject(i).getString("name").equals(columnName)){
                        array.remove(array.getJSONObject(i));
                    }
                }
                TW.escribirArchivo(table + ".cols", dbName, array.toString());
                success = true;
            } catch (JSONException ex) {
                Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            return success;
	}
	
	public boolean alterColumnName(String table, String oldColumnName, String newColumnName){
            //Falta Validación de Constraints
            boolean success = false;
            try {
                JSONArray array = getAllColumns(table);
                for (int i=0; i < array.length(); i++) {
                    if (array.getJSONObject(i).getString("name").equals(oldColumnName)){
                        array.getJSONObject(i).remove("name");
                        array.getJSONObject(i).put("name", newColumnName);
                    }
                }
                TW.escribirArchivo(table + ".cols", dbName, array.toString());
                success = true;
            } catch (JSONException ex) {
                Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            return success;
	}
        
        public boolean alterColumnType(String table, String columnName, String newColumnType){
            boolean success = false;
            try {
                JSONArray array = getAllColumns(table);
                for (int i=0; i < array.length(); i++) {
                    if (array.getJSONObject(i).getString("tpye").equals(columnName)){
                        array.getJSONObject(i).remove("type");
                        array.getJSONObject(i).put("type", newColumnType);
                    }
                }
                TW.escribirArchivo(table + ".cols", dbName, array.toString());
                success = true;
            } catch (JSONException ex) {
                Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            return success;
	}

        public boolean insert(ArrayList<InsertStructure> structure) throws JSONException{

            /**
             * Descripcion de metodo:
             *          Metodo encargado de hacer la instruccion INSERT
             *          En el primer FOR se obtiene todas las columnas ya que siempre son de utlilidad
             *          despues revisamos que se encuentran todas las columnas y se genera un JSON
             *          donde se genera el archivo
             *
             */
            String tableName = structure.get(0).getTable() + ".json";
            String fileContent = TW.leerArchivo(tableName, dbName);
            JSONArray allInserts = new JSONArray(fileContent);
            for(InsertStructure item : structure){
                //Obtenemos todas las columnas porque siempre sirven
                ArrayList<String> allColumns = jsonArrayToArrayList(getAllColumns(item.getTable()));
                
                item.setColumns(allColumns);
                /**
                 * Aca se revisan las columnas
                 * y se crea el JSON que se guarda en el archivo
                 */
                JSONObject newRow = new JSONObject();
                for(int i = 0; i<item.getColumns().size(); i++){
                    String thisColumn = item.getColumns().get(i);
                    String thisValue ;
                    try{
                    thisValue = item.getValues().get(i);
                    }catch(Exception e){
                        thisValue = "NULL";
                    }
                    /**
                     * Se agregan todos los elementos al JSON
                     */
                    newRow.put(thisColumn, thisValue);
                }
                
                allInserts.put(newRow);
                
            }
            TW.escribirArchivo(tableName, dbName, allInserts.toString());
            return true;
        }
        
       public JSONArray select(String table, ArrayList<String> columns, WhereStructure where1, WhereStructure where2, String whereOperator) throws JSONException{

           /**
            * Descripcion de metodo:
            *          Metodo encargado de hacer el SELECT
            *          se hace el select de la tabla completa
            *
            */
            String fileContent = TW.leerArchivo(table + ".json", dbName);
            JSONArray currentSelect = new JSONArray(fileContent);
            
            if(columns != null){

                /**
                 *
                 * Aca se filtran las columnas
                 */
                JSONObject currentRow;
                JSONArray tempSelect = new JSONArray();
                for(int i  = 0; i < currentSelect.length(); i++){
                    currentRow = new JSONObject();
                    for(String column : columns){
                        currentRow.put(column, currentSelect.getJSONObject(i).getString(column));
                    }
                    tempSelect.put(currentRow);
                }
                currentSelect = tempSelect;
            }
            boolean isNumber;
            
            if(where2 == null && where1 != null){
                //Solo hay un WHERE
                JSONArray tempSelect = new JSONArray();
                for(int i  = 0; i < currentSelect.length(); i++){
                    if(chooseComparison(where1, currentSelect.getJSONObject(i))){
                        tempSelect.put(currentSelect.getJSONObject(i));
                    }
                }
                currentSelect = tempSelect;
                
            }else{
                /**
                 * Aca se encuentran los 2 WHERES
                 */
                if(whereOperator.equals("AND")){
                    JSONArray tempSelect = new JSONArray();
                    for(int i  = 0; i < currentSelect.length(); i++){
                        if(chooseComparison(where1, currentSelect.getJSONObject(i)) && chooseComparison(where2, currentSelect.getJSONObject(i))){
                            tempSelect.put(currentSelect.getJSONObject(i));
                        }
                    }
                    currentSelect = tempSelect;
                }else if (whereOperator.equals("OR")){
                    JSONArray tempSelect = new JSONArray();
                    for(int i  = 0; i < currentSelect.length(); i++){
                        if(chooseComparison(where1, currentSelect.getJSONObject(i)) || chooseComparison(where2, currentSelect.getJSONObject(i))){
                            tempSelect.put(currentSelect.getJSONObject(i));
                        }
                    }
                    currentSelect = tempSelect;
                }
            }
            return currentSelect;
        }
        
        public JSONArray selectCartessian(String table1, String table2) throws JSONException{
            String fileContent1 = TW.leerArchivo(table1 + ".json", dbName);
            String fileContent2 = TW.leerArchivo(table2 + ".json", dbName);
            JSONArray select1 = new JSONArray(fileContent1);
            JSONArray select2 = new JSONArray(fileContent2);
            JSONArray resultSelect = new JSONArray();
            
            for(int i=0; i < select1.length(); i++){
                String jsonString = select1.getJSONObject(i).toString();
                String tempString = jsonString.substring(0, jsonString.length() - 1);
                
                for(int j=0; j < select2.length(); i++){
                    String jsonString2 = select1.getJSONObject(i).toString().substring(1);
                    JSONObject newChild = new JSONObject(tempString + "," + jsonString2);
                    resultSelect.put(newChild);
                }
            }
            
            return resultSelect;
        }
        
        public boolean delete(String table, WhereStructure where) throws JSONException{

            /**
             * Descripcion de metodo:
             *          Metodo encargado de eliminar todo del json
             *
             */
            String tableName = table + ".json";
            JSONArray result = new JSONArray();
            if(where == null){
                TW.escribirArchivo(tableName, dbName, result.toString());
                return true;
            }else{
                String fileContent = TW.leerArchivo(tableName, dbName);
                JSONArray actual = new JSONArray(fileContent);
                ArrayList<String> allTables = showAllTables();
                
                for(int i=0; i<actual.length(); i++){
                    for(String theTable : allTables){
                        if(!theTable.equals(table)){
                            if(actual.getJSONObject(i).getString(where.getWhereColumn()).equals(where.getWhereValue())){
                                if(!checkForeignRow(theTable, actual.getJSONObject(i), table)){
                                    //result.put(actual.getJSONObject(i));
                                    return false;
                                }
                            }else{

                                /**
                                 * Si no cumple con la instruccion del  WHERE
                                 * lo agregamos al JSON
                                 *
                                 */
                                result.put(actual.getJSONObject(i));
                            }
                        }
                    }
                }
                TW.escribirArchivo(tableName, dbName, result.toString());
                return true;
            }
        }
        
        
        public JSONArray orderJSON(JSONArray jsonArr, String key) throws JSONException{
            List<JSONObject> jsonValues = new ArrayList<>();
            for (int i = 0; i < jsonArr.length(); i++) {
                jsonValues.add(jsonArr.getJSONObject(i));
            }
            Collections.sort( jsonValues, new Comparator<JSONObject>() {
                //You can change "Name" with "ID" if you want to sort by ID
                private final String KEY_NAME = key;

                @Override
                public int compare(JSONObject a, JSONObject b) {
                    String valA = new String();
                    String valB = new String();

                    try {
                        valA = (String) a.get(KEY_NAME);
                        valB = (String) b.get(KEY_NAME);
                    } 
                    catch (JSONException e) {
                        //do something
                    }

                    return valA.compareTo(valB);
                    //if you want to change the sort order, simply use the following:
                    //return -valA.compareTo(valB);
                }
            });
            JSONArray newJSONArray = new JSONArray();
            for (int i = 0; i < jsonArr.length(); i++) {
                newJSONArray.put(jsonValues.get(i));
            }
            return newJSONArray;
        }
        
        public boolean checkForeignRow(String checkTable, JSONObject checkValue, String origenTable) throws JSONException{
            /**
             * Aca se revisa la row que tiene la llave foranea
             */
            String tableName = checkTable + ".rels";
            String fileContent = TW.leerArchivo(tableName, dbName);
            JSONArray currentForeigns = new JSONArray(fileContent);
            for(int i = 0; i < currentForeigns.length(); i++){
                if(currentForeigns.getJSONObject(i).getString("type").equals("foreign")){
                    //is a Foreign Key
                    String referenceTable = currentForeigns.getJSONObject(i).getString("referenceTable");
                    String thisColumn = currentForeigns.getJSONObject(i).getString("column");
                    String referenceColumn = currentForeigns.getJSONObject(i).getString("referenceColumn");
                    if(origenTable.equals(referenceTable)){
                        JSONArray result = select(checkTable, null, new WhereStructure(thisColumn, checkValue.getString(referenceColumn), "="), null, null);
                        if(result.length() > 0){
                            //There's a Foreign Key
                            return false;
                        }
                    }
                }
            }
            return true;
	}
        
        public boolean checkForeignRow2(String checkTable, JSONObject checkValue, String origenTable) throws JSONException{
            String tableName = checkTable + ".rels";
            String fileContent = TW.leerArchivo(tableName, dbName);
            JSONArray currentForeigns = new JSONArray(fileContent);
            for(int i = 0; i < currentForeigns.length(); i++){
                if(currentForeigns.getJSONObject(i).getString("type").equals("foreign")){
                    //is a Foreign Key
                    String referenceTable = currentForeigns.getJSONObject(i).getString("referenceTable");
                    String thisColumn = currentForeigns.getJSONObject(i).getString("column");
                    String referenceColumn = currentForeigns.getJSONObject(i).getString("referenceColumn");
                    
                        JSONArray result = select(referenceTable, null, new WhereStructure(referenceColumn, checkValue.getString(thisColumn), "="), null, null);
                        if(result.length() > 0){
                            //There's a Foreign Key
                            return false;
                        }
                    
                }
            }
            return true;
	}
        
//        public boolean update(String table, String key, String value, WhereStructure where) throws JSONException{
//            String tableName = table + ".json";
//            String fileContent = TW.leerArchivo(tableName, dbName);
//            JSONArray currentSelect = new JSONArray(fileContent);
//            if(where == null){
//                //No hay condición
//                for(int i = 0; i < currentSelect.length(); i++){
//                    currentSelect.getJSONObject(i).remove(key);
//                    currentSelect.getJSONObject(i).put(key, value);
//                }
//            }else{
//                //Hay condición
//                for(int i = 0; i < currentSelect.length(); i++){   
//                    if(currentSelect.getJSONObject(i).getString(where.getWhereColumn()).equals(where.getWhereValue())){
//                        currentSelect.getJSONObject(i).remove(key);
//                        currentSelect.getJSONObject(i).put(key, value);
//                    }
//                }
//            }
//            TW.escribirArchivo(tableName, dbName, currentSelect.toString());
//            return true;
//        }
        
        public boolean update(String table, String updateColumn, String updateValue, WhereStructure where) throws JSONException{
            /**
             * Aca actualizamos todos los valores de la tabla tando como columnas, valores
             * y los agregamos al json
             *
             */
            String tableName = table + ".json";
            JSONArray result = new JSONArray();
            boolean resultado = true;
            if(where == null){
                String fileContent = TW.leerArchivo(tableName, dbName);
                JSONArray actual = new JSONArray(fileContent);
                
                for(int i=0; i<actual.length(); i++){
                    JSONObject newObject = actual.getJSONObject(i);
                    newObject.remove(updateColumn);
                    newObject.put(updateColumn, updateValue);
                    result.put(actual.getJSONObject(i));
                }
                
                TW.escribirArchivo(tableName, dbName, result.toString());
            }else{
                String fileContent = TW.leerArchivo(tableName, dbName);
                JSONArray actual = new JSONArray(fileContent);
                ArrayList<String> allTables = showAllTables();
                
                for(int i=0; i<actual.length(); i++){
                    boolean yaModifico = false;
                    
                        
                        if(actual.getJSONObject(i).getString(where.getWhereColumn()).equals(where.getWhereValue())){
                            /**
                             * Si cumple con el WHERE
                             * hay una llave foranea que depende del valor que queremos camviar
                             */
                            //Cumple con el WHERE
                            if(!(checkForeignRow2(table, actual.getJSONObject(i), table) && checkForeignRow("empleado", actual.getJSONObject(i), table))){
                                //Hay una llave FK que depende del valor que queremos cambiar
                                resultado = false;
                            }else{
                                /**
                                 * Aca cambiamos el valor
                                 */
                                if(!yaModifico){
                                    JSONObject newObject = actual.getJSONObject(i);
                                    newObject.remove(updateColumn);
                                    newObject.put(updateColumn, updateValue);
                                    result.put(actual.getJSONObject(i));
                                }
                                yaModifico = true;
                            }
                        }else{
                            /**
                             * Si no cumple con el WHERE
                             * entonces se agrega sin ningun cambio
                             */
                            if(!yaModifico){
                                result.put(actual.getJSONObject(i));
                            }
                            yaModifico = true;
                        }
                    }
                
                
                if(resultado){
                    TW.escribirArchivo(tableName, dbName, result.toString());
                }
            }
            return resultado;
        }
        
        public static boolean isInteger(String s) {
            try { 
                Float.parseFloat(s); 
            } catch(NumberFormatException | NullPointerException e) { 
                return false; 
            }
            // only got here if we didn't return false
            return true;
        }
        
           
        public boolean chooseComparison(WhereStructure where, JSONObject jsonObject) throws JSONException{
            boolean isNumber = isInteger(where.getWhereValue());
                
                if(!(where.getWhereValue().equals("NULL"))&&!(jsonObject.getString(where.getWhereColumn()).equals("NULL"))){
                    if(where.getWhereSign().equals("=") && !isNumber){
                        return where.getWhereValue().equals(jsonObject.getString(where.getWhereColumn()));   
                    }else if(where.getWhereSign().equals("=") && isNumber){
                        return Float.parseFloat(where.getWhereValue()) == Float.parseFloat(jsonObject.getString(where.getWhereColumn()));
                    }else if(where.getWhereSign().equals(">")){
                        return Float.parseFloat(jsonObject.getString(where.getWhereColumn())) > Float.parseFloat(where.getWhereValue());
                    }else if(where.getWhereSign().equals("<")){
                       return Float.parseFloat(jsonObject.getString(where.getWhereColumn()))  < Float.parseFloat(where.getWhereValue());
                    }
                }
                else{
                     if(where.getWhereSign().equals("=")){
                        return where.getWhereValue().equals(jsonObject.getString(where.getWhereColumn()));   
                    }
                }
            
            return false;
        }

        
        
        public ArrayList<String> jsonArrayToArrayList(JSONArray jArray){
            ArrayList<String> listdata = new ArrayList<>();     
            if (jArray != null) { 
               for (int i=0;i<jArray.length();i++){ 
                   try {
                       listdata.add(jArray.getJSONObject(i).getString("name"));
                   } catch (JSONException ex) {
                       Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
                   }
               } 
            } 
            return listdata;
        }

    public ArrayList<InsertStructure> getInserts() {
        return inserts;
    }

    public void setInserts(ArrayList<InsertStructure> inserts) {
        this.inserts = inserts;
    }
       	
}

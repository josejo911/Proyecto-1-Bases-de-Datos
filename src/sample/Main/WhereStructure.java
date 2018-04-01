

package sample.Main;

// Clase para manejar guardado de valores importantes para la clausula WHERE
public class WhereStructure {
    private String whereColumn;
    private String whereValue;
    private String whereSign;

    public WhereStructure(String whereColumn, String whereValue, String whereSign) {
        this.whereColumn = whereColumn;
        this.whereValue = whereValue;
        this.whereSign = whereSign;
    }
       
    public String getWhereSign(){
        return whereSign;
    }
    
    public String getWhereColumn(){
        return whereColumn;
    }
    
    public String getWhereValue(){
        return whereValue;
    }
    
    public void setWhereSign(String whereSign){
        this.whereSign = whereSign;
    }
    
    public void setWhereColumn(String whereColumn){
        this.whereColumn = whereColumn;
    }
    
    public void setWhereValue(String whereValue){
        this.whereValue = whereValue;
    }
}
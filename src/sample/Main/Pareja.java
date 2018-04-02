package sample.Main;
/**
 *Universidad del valle de guatemala
 * Nombre: Marlon Fuentes, Jose Jo, Diego Alvarez
 * Clase encargada de guardar el numero, columna y un tipo de columna
 * */
public class Pareja {
    private int numero;
    private String columnName;
    private Tipo tipo;

    public Pareja(int numero, String columnName, Tipo tipo) {
        this.numero = numero;
        this.columnName = columnName;
        this.tipo = tipo;
    }

    public Pareja() {
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
}

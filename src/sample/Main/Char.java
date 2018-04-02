package sample.Main;
/**
 *Universidad del valle de guatemala
 * Nombre: Marlon Fuentes, Jose Jo, Diego Alvarez
 * Clase encargada de comunicacrse con el manejador de cuantos caracteres es cada dato
 * utilizando la clase tipo para asignar
 * */

public class Char extends Tipo {
    private int size;
    
    public Char(String nombre) {
        super(nombre);
        
    }

    public int getsize() {
        return size;
    }

    public void setsize(int size) {
        this.size = size;
    }
    
    
  
}

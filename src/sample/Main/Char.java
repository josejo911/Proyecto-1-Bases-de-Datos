

package sample.Main;

public class Char extends Tipo {
    // tamano para poder decirle al manejador de cuantos caracteres es el dato.
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

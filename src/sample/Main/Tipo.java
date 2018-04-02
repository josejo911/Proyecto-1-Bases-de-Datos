package sample.Main;

/**
 *Universidad del valle de guatemala
 * Nombre: Marlon Fuentes, Jose Jo, Diego Alvarez
 * Clase encargada de definir el tipo de dato de una propiedad.
 * */
public class Tipo {
     private String name;
     private Object objeto;
     
    public Tipo(String name) {
        this.name = name;
    }

    public Tipo(Object objeto) {
        this.objeto = objeto;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
       
}

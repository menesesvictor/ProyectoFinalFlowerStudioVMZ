
package modelo;


public class Flor {
    
    int id; 
    String nombre;
    String existencia;
    String precio; 

    public Flor() {
    }

    public Flor(int id, String nombre, String existencia, String precio) {
        this.id = id;
        this.nombre = nombre;
        this.existencia = existencia;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExistencia() {
        return existencia;
    }

    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
   
}

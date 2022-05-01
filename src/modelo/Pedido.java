
package modelo;


public class Pedido {
    
    String nombre;
    int telefono; 
    String direccion;
    String pedido;
    int cantidad; 

    public Pedido() {
    }

    public Pedido(String nombre, int telefono, String direccion, String pedido, int cantidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.pedido = pedido;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}

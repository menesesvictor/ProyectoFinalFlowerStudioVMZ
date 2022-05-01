
package modelo;


public class Cliente {
    
    int idclientes; 
    String usuarioclientes;
    String passwordclientes;

    public Cliente() {
    }

    public Cliente(int idclientes, String usuarioclientes, String passwordclientes) {
        this.idclientes = idclientes;
        this.usuarioclientes = usuarioclientes;
        this.passwordclientes = passwordclientes;
    }

    public int getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(int idclientes) {
        this.idclientes = idclientes;
    }

    public String getUsuarioclientes() {
        return usuarioclientes;
    }

    public void setUsuarioclientes(String usuarioclientes) {
        this.usuarioclientes = usuarioclientes;
    }

    public String getPasswordclientes() {
        return passwordclientes;
    }

    public void setPasswordclientes(String passwordclientes) {
        this.passwordclientes = passwordclientes;
    }
    
    
    
}

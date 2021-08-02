
package reto11;

public class Clientes extends Usuarios{
    private String direccion;
    private String numTelefono;
    private String clienteID;

    public Clientes(String direccion, String numTelefono, String clienteID, String nombre, int edad, String correo) {
        super(nombre, edad, correo);
        this.direccion = direccion;
        this.numTelefono = numTelefono;
        this.clienteID = clienteID;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getClienteID() {
        return clienteID;
    }

    public void setClienteID(String clienteID) {
        this.clienteID = clienteID;
    }
    
    
}

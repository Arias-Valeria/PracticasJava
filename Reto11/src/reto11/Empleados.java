
package reto11;

public class Empleados extends Usuarios{
    private String puestoLaboral;
    private String empleadoID;

    public Empleados(String puestoLaboral, String empleadoID, String nombre, int edad, String correo) {
        super(nombre, edad, correo);
        this.puestoLaboral = puestoLaboral;
        this.empleadoID = empleadoID;
    }

    public String getPuestoLaboral() {
        return puestoLaboral;
    }

    public void setPuestoLaboral(String puestoLaboral) {
        this.puestoLaboral = puestoLaboral;
    }

    public String getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(String empleadoID) {
        this.empleadoID = empleadoID;
    }
    
    
}

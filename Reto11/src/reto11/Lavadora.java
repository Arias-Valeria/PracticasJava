
package reto11;

public class Lavadora extends Electrodomesticos{
    private int capacidad;
    private String funciones;

    public Lavadora(int capacidad, String funciones, String color, double peso, String material, int voltaje, String numModelo) {
        super(color, peso, material, voltaje, numModelo);
        this.capacidad = capacidad;
        this.funciones = funciones;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }
 
    
}

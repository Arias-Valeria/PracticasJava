
package reto11;

public class Electrodomesticos {
    private String color;
    private double peso;
    private String material;
    private int voltaje;
    private String numModelo;

    public Electrodomesticos(String color, double peso, String material, int voltaje, String numModelo) {
        this.color = color;
        this.peso = peso;
        this.material = material;
        this.voltaje = voltaje;
        this.numModelo = numModelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public String getNumModelo() {
        return numModelo;
    }

    public void setNumModelo(String numModelo) {
        this.numModelo = numModelo;
    }
 
    
}

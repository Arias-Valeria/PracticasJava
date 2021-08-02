
package reto11;

public class Licuadora extends Electrodomesticos{
    private int potencia;
    private int numVelocidades; 

    public Licuadora(int potencia, int numVelocidades, String color, double peso, String material, int voltaje, String numModelo) {
        super(color, peso, material, voltaje, numModelo);
        this.potencia = potencia;
        this.numVelocidades = numVelocidades;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumVelocidades() {
        return numVelocidades;
    }

    public void setNumVelocidades(int numVelocidades) {
        this.numVelocidades = numVelocidades;
    }
    
    
}

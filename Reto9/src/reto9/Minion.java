
package reto9;

import java.util.Random;

public class Minion {
    //Definir atributos.
    private int numOjos; //1 o 2.
    private String colorPiel;
    private String altura;
    private String colores[] = {"Amarillo", "Morado"}; //Amarillo o Morado
    private String alturas[] = {"Mediano", "Alto"}; // Medino o alto
    private int nivelCreacion; //del 1 al 5
    private int nivelReparacion; //del 1 al 5
    private int nivelDestruccion; //del 1 al 5
   
    //Constructor.
   public Minion (){ 
       //Variable Random para asignar valores.
       Random nivel = new Random();
        numOjos = nivel.nextInt(2)+1;
       nivelCreacion = nivel.nextInt(5)+1;
       nivelReparacion = nivel.nextInt(5)+1;
       nivelDestruccion = nivel.nextInt(5)+1;
       colorPiel = colores[nivel.nextInt(colores.length)];
       altura = alturas[nivel.nextInt(alturas.length)];
   }

    public int getNumOjos() {
        return numOjos;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public String getAltura() {
        return altura;
    }

    public int getNivelCreacion() {
        return nivelCreacion;
    }

    public int getNivelReparacion() {
        return nivelReparacion;
    }

    public int getNivelDestruccion() {
        return nivelDestruccion;
    }


    
}

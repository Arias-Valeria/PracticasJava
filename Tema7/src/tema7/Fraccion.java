
package tema7;

public class Fraccion {
    private int denominador;
    private int numerador;
    //constructor.
public int getNumerador() { 
    return numerador; 
}
 public int getDenominador() { 
     return denominador;
 }

 public void setNumerador(int numerador) { 
     this.numerador = numerador; 
 }

 public void setDenominador(int denominador) {
 this.denominador = denominador; 
 }
 
 public void despliega()

      { System.out.println(numerador + "/" + denominador); }
}

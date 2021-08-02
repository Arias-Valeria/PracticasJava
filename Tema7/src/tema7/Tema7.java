
package tema7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tema7 {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
    public static void simplificar (Fraccion f){
        if (f.getNumerador() % 2 == 0 && f.getDenominador() % 2 == 0){
            f.setNumerador(f.getNumerador()/2);
            f.setDenominador(f.getDenominador()/2);
        }
    }
    public static void main(String[] args) throws IOException {
          /*
            Hay un plano caterciano
            tengo un punto en la coordenada x = 1 - y =2
            punto2 y valor inicial en x = 3 - y = 7
        punto1 x = 4 y Y = 7
        */
        
         /*Punto punto1 = new Punto();
        punto1.despligaPunto();
        Punto punto2 = new Punto(3.0,7.0);
        punto2.despligaPunto();
        Punto punto3 = new Punto (12.00);
        punto3.despligaPunto();
        punto1.setX(4);
        punto1.setY(7);
        System.out.println("Valores del punto 1: ");
        punto1.despligaPunto();
        
         
         Fraccion prueba = new Fraccion ();
         prueba.setNumerador(3);
         prueba.setDenominador(4);
         prueba.despliega();
         */
         
         System.out.println("Teclee una fraccion.");
         System.out.println("Indique el numerador: ");
         int n = Integer.parseInt(entrada.readLine());
         System.out.println("Indique el denominador: ");
         int d = Integer.parseInt(entrada.readLine());
         
         Fraccion f = new Fraccion();
         f.setNumerador(n);
         f.setDenominador(d);
         f.despliega();
         simplificar(f);
         f.despliega();

    }
    
}

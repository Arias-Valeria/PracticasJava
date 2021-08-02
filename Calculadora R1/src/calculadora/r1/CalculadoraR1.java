package calculadora.r1;
//Librería para los valores de las variables.
import java.io.BufferedReader;
//Captura e indica los errores.
import java.io.IOException;
//Librería que lee los valores de la consola.
import java.io.InputStreamReader;

public class CalculadoraR1 {
    //Para leer y capturar los datos ingresados por el usuario.
    public static BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        //Declaración de variables.
        double valorUno;
        double valorDos;
        char operacion;
        //Opciones del sistema.
        System.out.println("Indique la operación a realizar \n 1: Suma \n 2: Resta \n 3: Multiplicación \n 4: División");
        operacion = entrada.readLine().charAt(0);
        
        //Lectura y almacenamiento de datos.
          System.out.println("Indique el primer valor");
                valorUno = Double.parseDouble(entrada.readLine());
                
                System.out.println("Indique el segundo valor");
                valorDos = Double.parseDouble(entrada.readLine());
        
        //Evaluación de los casos según "ValorUno" y "ValorDos"
        switch(operacion){
            case '1':
                //Suma
                System.out.println(valorUno + " + " + valorDos + " = " + (valorUno + valorDos));
                break;
            
            case '2':
                //Resta
                System.out.println(valorUno + " - " + valorDos + " = " + (valorUno - valorDos));
                break;
                
            case '3':
                //Multiplicación
                System.out.println(valorUno + " * " + valorDos + " = " + (valorUno * valorDos));
                break;
            
            case '4':
                //División
                System.out.println(valorUno + " / " + valorDos + " = " + (valorUno / valorDos));
                break;
            
            default:
                //Error 
                System.out.println("Operación no encontrada. Por favor, Leer bien las opciones.");
                break;
        }
    }
    
}

package reto2piramidemetodo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reto2PiramideMetodo {
//Para leer y guardar datos ingresados en la consola.
public static BufferedReader entrada = new  BufferedReader(new InputStreamReader(System.in));
//Metodo para crear una piramide usando For y While. El parámetro debe ser Int.
public static int getPiramide(int pisosP){
     //Declaración de variables. X es auxiliar, pisosP número de pisos y tope en el For.
       int x;
       int filas = 0;
       for(x = 0; x <= pisosP; x++){
            //Iniciar en 1 para que salte la primera linea y no haga un piso de mas.
            int asteriscos = 1;
        
            //Produce los asteriscos, como asterisco es mayor a asterisco2, se saltara e incrementara asterisco a uno.
            //Asi se salta la primera linea.
            while(asteriscos <= filas){
                System.out.print("*");
                asteriscos++;
            }
            //Acomoda los asteriscos para hacer los pisos. soutln es para acomodarlos.
            filas++;
            System.out.println("");
            
        }
    return 0;
}
   
public static void main(String[] args) throws IOException {
     System.out.println("Bienvenido al programa Piramide.");
    char opcion;
    
    do{
        System.out.println("¿De cuantos pisos desea la piramide?");
         //Lee, guarda y convierte(Int) los datos ingresados.
         //Crear la variable local Int.
         int pisosP = Integer.parseInt(entrada.readLine());
        getPiramide(pisosP);
         
        System.out.println("¿Desea construir otra piramide? s/n");
        //Guarda y convierte la respuesta a char.
        opcion = entrada.readLine().charAt(0);
    }while(opcion == 's');
     System.out.println("Gracias por usar el programa Piramide.");
    }
    
}

package reto2_poo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reto2_POO {
public static BufferedReader entrada = new  BufferedReader(new InputStreamReader(System.in));
   
public static void main(String[] args) throws IOException {
    
    System.out.println("Bienvenido al programa Pirámide.");
    char opcion;
    do{
       
       int x;
       int pisosP;
       
        System.out.println("¿De cuántos pisos desea la pirámide?");
        pisosP = Integer.parseInt(entrada.readLine());
        
        int asteriscos2 = 0;
        for(x = 0; x <= pisosP; x++){
            //Iniciar en 1 para que salte la primera línea y no haga un piso de más.
            int asteriscos = 1;
        
            //Produce los asteriscos, como asterisco es mayor a asterisco2, se saltará e incrementara asterisco a uno.
            //Así se salta la primera línea.
            while(asteriscos <= asteriscos2){
                System.out.print("*");
                asteriscos++;
            }
            //Acomoda los asteriscos para hacer los pisos. soutln es para acomodarlos.
            asteriscos2++;
            System.out.println("");
            
        }
             
        System.out.println("¿Desea construir otra pirámide? s/n");
        //Guarda y convierte la respuesta a char.
        opcion = entrada.readLine().charAt(0);
       }while(opcion == 's');
    }
    
}

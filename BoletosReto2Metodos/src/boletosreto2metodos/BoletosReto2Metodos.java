package boletosreto2metodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoletosReto2Metodos {
public static BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));

public static double getPrecio(char opcion) throws IOException{
    double precio = 0;
    double Adulto = 100.00;
    double Niño = 70.00;
    double AdultoM_Credencial = 50.00;
    double AdultoM_Normal = 70.00;
      
         
    switch(opcion){
        case 'A':
            precio = Adulto;
            System.out.println("El precio del boleto es: $" + precio);
            break;
        case 'N': 
            precio = Niño;
           System.out.println("El precio del boleto es: $" + precio);
            break;
        case 'I':
            precio = AdultoM_Credencial;
           System.out.println("El precio del boleto es: $" + precio);
            break;
        case 'B':
            precio = AdultoM_Normal;
            System.out.println("El precio del boleto es: $" + precio);
            break;
        default:
            System.out.println("Error. Tipo de boleto no encontrado.");
            break;
    }
    return precio;
}
    public static void main(String[] args) throws IOException {
    
    char respuesta;
        
    do{
           char opcion;
            System.out.println("Bienvenido, ¿qué tipo de boleto desea comprar?\n Adulto: A\n Niño: N\n Adulto Mayor(INAPAM):I\n Adulto Mayor (Sin INAPAM): B");
            opcion = entrada.readLine().charAt(0);
         getPrecio(opcion);
         
         System.out.println("¿Desea comprar otro tipo boleto? \n Si: s\n No: n");
             respuesta = entrada.readLine().charAt(0);
        }while(respuesta == 's');
        System.out.println("Gracias por su compra.");
    
    }
    
}

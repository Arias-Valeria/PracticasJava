package reto3conversiones;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reto3Conversiones {
public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
public static String converBinario(int valor){
    String binario;
    binario = Integer.toBinaryString(valor);
    
    return binario;
}
public static String converOctal (int valor){
    String octal;
    octal = Integer.toOctalString(valor);
    return octal;
}
public static int converBinToDecimal (String valorD){
    int decimal;
    decimal = Integer.parseInt(valorD, 2);
    return decimal;
}
public static int converOctalToDecimal (String valorOc){
    int decimal;
    decimal = Integer.parseInt(valorOc, 8);
    return decimal;
}
public static int converHexToDecimal (String valorHex){
    int decimal;
    decimal = Integer.parseInt(valorHex, 16);
    return decimal;
}
public static String showConverMessage (char opcion){
    String message;
    switch(opcion){
        case 'a':
            message = "Ingrese el valor a convertir en Decimal.";
            break;
        case 'b':
            message = "Ingrese el valor a convertir en Decimal.";
            break;
        case 'c':
            message = "Ingrese el valor a convertir en Binario.";
            break;
        case 'd':
            message = "Ingrese el valor a convertir en Octal.";
            break;
        case 'e':
            message = "Ingrese el valor a convertir en Hexadecimal.";
            break;
        default:
            message = "ERROR";
            break;
    }
    return message;
}
    public static void main(String[] args) throws IOException {
        char continuar;
        do{
            char opcion;
            int valor;
            
            System.out.println("Seleccione el tipo de conversion:\n Decimal a Binario (a)\n Decimal a octal (b)\n Binario a decimal (c)\n Octal a decimal (d)\n Hexadecimal a decimal (e)."); 
            opcion = entrada.readLine().charAt(0);
            
            System.out.println(showConverMessage(opcion));
            valor = Integer.parseInt(entrada.readLine());
            
            switch(opcion){
                case 'a':
                    System.out.println(converBinario(valor));
                    break;
                case 'b':
                    System.out.println(converOctal(valor));
                    break;
                case 'c':
                    String valorD = String.valueOf(valor);
                    System.out.println(converBinToDecimal(valorD));
                    break;
                case 'd':
                    String valorOc = String.valueOf(valor);
                    System.out.println(converOctalToDecimal(valorOc));
                    break;
                case 'e':
                    String valorHex = String.valueOf(valor);
                    System.out.println(converHexToDecimal(valorHex));
                    break;
                default:
                    System.out.println("Opcion no encontrada.");
                    break;
            }
           
            System.out.println("¿Desea hacer otra conversión? \n Si: s\n No: n");
           
                     continuar = entrada.readLine().charAt(0);
          
           
        }while(continuar == 's');
        
    }
    
}

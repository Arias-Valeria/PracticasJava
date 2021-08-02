package reto2_boletos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reto2_Boletos {
public static BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));

//Programa para la venta de boletos en un parque de diversiones.
//Tipos de boletos: Adulto($100), Niños($70), Adulto mayor con credencial del INAPAM ($50).Adulto mayor sin credencial($70) 

public static void main(String[] args) throws IOException {
         //Declarar variables (boletos.)
         double Adulto = 100.00;
         double Niño = 70.00;
         double AdultoM_Credencial = 50.00;
         double AdultoM_Normal = 70.00;
         
         //Variables (auxiliares y de conteo)
         char opcion;
         double sumaBoletos = 0;
         int boletosComprados = 0;
         double totalPago = 0;
         int boletoA = 0;
         int boletoN = 0;
         int boletoI = 0;
         int boletoB = 0;
         
        
         do{
          System.out.println("Bienvenido, ¿qué tipo de boleto desea comprar?\n Adulto: A\n Niño: N\n Adulto Mayor(INAPAM):I\n Adulto Mayor (Sin INAPAM): B");
          opcion = entrada.readLine().charAt(0);
          switch(opcion){
              case 'A':
                  System.out.println("Adulto.\n El boleto cuesta: $" + Adulto);
                    boletosComprados ++;
                    boletoB += Adulto;
                  break;
              case 'N':
                  System.out.println("Niño.\n El boleto cuesta: $"+ Niño);
                    boletosComprados ++;
                    boletoN += Niño;
                  break;
              case 'I':
                  System.out.println("Adulto Mayor con INAPAM.\n El boleto cuesta: $" + AdultoM_Credencial);
                     boletosComprados ++;
                     boletoI += AdultoM_Credencial;
                  break;
              case 'B':
                  System.out.println("Adulto Mayor sin Credencial INAPAM.\n El boleto cuesta $" + AdultoM_Normal);
                    boletosComprados ++;
                    boletoB += AdultoM_Normal;
                  break;
              default:
                  System.out.println("ERROR\n Tipo de boleto no encontrado. Seleccione una opción diferente.");
                  break;
          }
             System.out.println("¿Desea comprar otro boleto? \n Si: s\n No: n");
             opcion = entrada.readLine().charAt(0);
         }while(opcion == 's');
        totalPago = boletoA + boletoN + boletoI + boletoB;
        System.out.println("El total de boletos comprados es: " + boletosComprados + "\n" + "Total a pagar: $" + totalPago);
        System.out.println("Gracias por su compra.");
    }
    
}

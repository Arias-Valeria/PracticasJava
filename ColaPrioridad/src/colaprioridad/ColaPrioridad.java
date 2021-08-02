
package colaprioridad;

import java.util.Scanner;

/**
 *
 * @author Roberto
 * Fuente: https://programar-java-android.blogspot.com/2017/05/colas-con-prioridad-ejemplo-java.html
 */
public class ColaPrioridad {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    int opc;
    int terminar = 0;
    Scanner leer = new Scanner (System.in);
    String opcion = leer.nextLine();;
    ListaSimple pacientes = new ListaSimple ();
    
    do{
        System.out.println("Hospital general de Los Santos.\nSeleccione una opción:");
        System.out.println("1) Ingresar paciente. \n2)Modificar prioridad de paciente. \n3)Dar de alta a paciente. \n4)Mostrar lista de pacientes. \n5)Terminar programa.");
        try{
        opc = Integer.parseInt(opcion);
        switch(opc){
            case 1:
                pacientes.ingresarPaciente();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                pacientes.imprimir();
                break;
            case 5:
                terminar = 1;
                break;
            default:
                System.out.println("\nOpción no encontrada, intente de nuevo. \n");
                break;
        }
        }catch(NumberFormatException ex){
            System.out.println("Valor no numérico ingresado, intente de nuevo.");
        }
    }while(terminar != 0);
    
    /*
    ListaSimple ls = new ListaSimple();
    System.out.println("Agrego nodo (100) cualquier prioridad (2)");
    ls.agregar(100, 2);
    System.out.println("Agrego nodo (200) prioridad igual al primer nodo (2)");
    ls.agregar(200, 2);
    ls.imprimir();
    System.out.println("Agrego nodo (300) prioridad 1");
    ls.agregar(300, 1);
    ls.imprimir();
    System.out.println("Agrego nodo (400) de prioridad final");
    ls.agregar(400, 3);
    ls.imprimir();
    */
  }
  
}


package cola_prioridad;
import java.util.LinkedList;
import java.util.Scanner;

public class Cola_Prioridad {

    public static void main(String[] args) {
        //Cola de pacientes.
        LinkedList <Cola> pacientes = new LinkedList <Cola> ();
        //Creación del objeto para acceder a métodos.
        Cola accion = new Cola();
        //Variable para terminar programa.
        int terminar = 0;
        //Objeto para leer.
        Scanner leer  = new Scanner (System.in);
        
        do{
            System.out.println("---- Hospital general de Los Santos ----.\nSeleccione una opción:");
        System.out.println("1) Ingresar paciente. \n2) Modificar prioridad de paciente. \n3) Dar de alta a paciente. \n4) Mostrar lista de pacientes. \n5) Terminar programa.");
        try{
        int opc = Integer.parseInt(leer.nextLine());
        switch(opc){
            case 1:
                //Ingresar paciente.
                //accion.agregar(pacientes);
                System.out.println("Ingrese el nombre del paciente: ");
                String n = leer.nextLine();
                System.out.println("\nIngrese el nivel de prioridad: \n1)Resucitación. \n2)Emergencia. \n3) Urgencia. \n4) Urgencia Menor. \n5) Sin Urgencia.");
                    try{
                        int p = Integer.parseInt(leer.next());
                        Cola nuevoPaciente = new Cola(p, n);
                        accion.prioridad(pacientes, nuevoPaciente);
                    }catch(NumberFormatException x){
                        System.out.println("Valor no numérico ingresado. Intente de nuevo.");
                    }
                break;
            case 2:
                //Modificar prioridad del paciente.
                accion.modificarPrioridad(pacientes);
                break;
            case 3:
                //Dar de alta a paciente.
                accion.altaPaciente(pacientes);
                break;
            case 4:
                //Mostrar lista de los pacientes.
                accion.imprimir(pacientes);
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
        }while(terminar != 1);
    }
    
}

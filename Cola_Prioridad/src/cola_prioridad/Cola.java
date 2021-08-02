
package cola_prioridad;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Cola {
    private int prioridad;
    private String nombre;
    //Queue<Cola> pacientes = new LinkedList <Cola> ();
    
    public Cola(){
    
}

    public Cola(int prioridad, String nombre) {
        this.prioridad = prioridad;
        this.nombre = nombre;
    }
    
    //Getters and setters.
    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Método de agregar paciente.
    Scanner leer  = new Scanner (System.in);
    public void agregar(LinkedList <Cola> pacientes){
        System.out.println("Ingrese el nombre del paciente: ");
        String n = leer.nextLine();
        System.out.println("\nIngrese el nivel de prioridad: \n1)Resucitación. \n2)Emergencia. \n3) Urgencia. \n4) Urgencia Menor. \n5) Sin Urgencia.");
            try{
                int p = Integer.parseInt(leer.next());
                Cola nuevoPaciente = new Cola(p, n);
                Cola determinar = new Cola();
                determinar.prioridad(pacientes, nuevoPaciente);
            }catch(NumberFormatException x){
                System.out.println("Valor no numérico ingresado. Intente de nuevo.");
            }
    }

    //Imprimir pacientes.
    public void imprimir(LinkedList <Cola> pacientes){
        int posicion = 0;
        for(Object pacienteActual: pacientes){
            Cola paciente = (Cola) pacienteActual;
            System.out.println("\n---------------------");
            System.out.println("Turno: " + (posicion +1));
            System.out.println("Nombre del paciente: " + paciente.getNombre());
            System.out.println("Nivel de prioridad: " + paciente.getPrioridad());
            posicion++;
        }
    }
    
    //Modificar la prioridad del paciente.
    public void modificarPrioridad (LinkedList <Cola> pacientes){
        System.out.println("Seleccione el turno del paciente que desea modificar.");
        int turno = Integer.parseInt(leer.nextLine());
        if(turno > pacientes.size() || turno <= 0){
            System.out.println("\nPaciente no encontrado\n.");
        }else{
            Cola pacienteEncontrado = (Cola) pacientes.get(turno -1);
            System.out.println("Ingrese la prioridad del paciente.");
            try{
                int nuevaPrioridad = Integer.parseInt(leer.nextLine());
                pacienteEncontrado.setPrioridad(nuevaPrioridad);
            }catch(NumberFormatException ex){
                System.out.println("Valor no numerico ingresado. Intente de nuevo. \n");
            }
            
            System.out.println("\nSe ha cambiado la prioridad del paciente.\n");
        }
        
    }
    
    //Dar de alta al paciente.
    
    public void altaPaciente(LinkedList <Cola> pacientes){
        Cola lista = new Cola();
        System.out.println("\nLa lista es: ");
        lista.imprimir(pacientes);
        System.out.println("\nSeleccione una acción: \n1) Dar de alta al primer paciente en cola. \n2) Seleccionar un paciente para dar de alta.");
        try{
            int seleccion = Integer.parseInt(leer.nextLine());
            switch(seleccion){
                case 1:
                    pacientes.remove();
                    System.out.println("Paciente dado de alta exitosamente.\n");
                    break;
                case 2:
                    System.out.println("Ingrese el turno del paciente que desea dar de alta.");
                    try{
                        int turnoS = Integer.parseInt(leer.nextLine());
                        pacientes.remove(turnoS);
                        System.out.println("Paciente dado de alta exitosamente.\n");
                    }catch(NumberFormatException exc){
                        System.out.println("Valor no numerico ingresado. Intente de nuevo. \n");
                    }
                    break;
                default:
                    System.out.println("\nOpción no encontrada, intente de nuevo.\n");
                    break;
            }
        }catch(NumberFormatException exc){
            System.out.println("Valor no numerico ingresado. Intente de nuevo. \n");
        }
        System.out.println("\nPaciente dado de alta.\n");
    }
    
    //Determinar prioridad.
    public void prioridad (LinkedList <Cola> pacientes, Cola nuevoPaciente){
        if(pacientes.isEmpty()){
            pacientes.offer(nuevoPaciente);
        }else if(nuevoPaciente.getPrioridad() <= pacientes.getFirst().prioridad){
            pacientes.offerFirst(nuevoPaciente);
        }else if (nuevoPaciente.getPrioridad() > pacientes.getFirst().prioridad){
            pacientes.offerLast(nuevoPaciente);
        }else if(nuevoPaciente.getPrioridad() >= pacientes.getLast().prioridad){
            pacientes.offerLast(nuevoPaciente);
        }
    }
}

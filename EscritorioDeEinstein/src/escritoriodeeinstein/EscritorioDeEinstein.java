
package escritoriodeeinstein;
import java.util.Stack;
import java.util.Random;

public class EscritorioDeEinstein {
    
    public static void main(String[] args){
        //Pilas de Einstein y del editor.
        Stack pilaEinstein = new Stack ();
        Stack pilaEditor = new Stack ();
        //Variable Random para elegir la cantidad de meses en que se envía.
        Random m = new Random();
        //Objeto Tiempo para los metodos del tiempo de envío.
        Tiempo tiempoEnvío = new Tiempo();
        
        //Mensajes de los libros de Einstein.
        System.out.println("Albert Einstein ha creado \"Cosmic Religion\".");
        pilaEinstein.add("Cosmic Religion");
        System.out.println("Albert Einstein ha creado \"The human side\".");
        pilaEinstein.add("The human side");
        System.out.println("Albert Einstein ha creado \"Sidelights on Relativity\".\n");
        pilaEinstein.add("Sidelights on Relativity");
        
        //Ciclo for para imprimir la lista en orden sin FILO (Firs in. Last out).
        int contador = 1;
        System.out.println("--- Lista de Einstein en orden de creación ---");
        for(int i = 0; i < 3; i++){
            System.out.println(contador +".- "+ pilaEinstein.get(i));
            contador++;
        }
        
        //Ciclo para enviar al editor.
        //Dado que es solo el editor que los publica en desorde, Einstein los enviará en orde.
        for(int e = 0; e < pilaEinstein.size(); e++){
            int meses = m.nextInt(3)+1;
            switch (meses) {
                case 1:
                    tiempoEnvío.enviarMeses2();
                    break;
                case 2:
                    tiempoEnvío.enviarMeses3();
                    break;
                case 3:
                    tiempoEnvío.enviarMeses4();
                    break;
                default:
                    break;
            }
            System.out.println("El editor recibió el libro.");
            pilaEditor.add(pilaEinstein.get(e));
            tiempoEnvío.enviarMeses3();
            
            System.out.println("Libro publicado.\n");
        }
        
        int count = 3;
        System.out.println("\n---- Lista del editor ----");
        for(int x = 0; x < 3; x++){
            System.out.println(count + ".-" + pilaEditor.pop());
            count--;
        }
        
        tiempoEnvío.terminarPrograma();
    }
    
}

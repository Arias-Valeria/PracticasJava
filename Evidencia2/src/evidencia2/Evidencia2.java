
package evidencia2;
import java.util.Scanner;

/**
 *Valeria Arias
 * Kevin D. Camacho
 * Christian E. Herrera.
 * @author Valea
 */
public class Evidencia2 {
  
    public static void main(String[] args) {
        int nivel = 0;
        int key = 0;
        int opc3= 0;
        int fin = 0;
        int indice = 0;
        Scanner leer = new Scanner (System.in);
        String msj;
        String pregunta;
        Arbol nuevo = new Arbol();
        Juego j = new Juego();
        
        
            System.out.println("¡Bienvenido a Scooby Doo Trivia! \nPiensa en un personaje de la pandilla del misterio.");
            msj = "¿Tu personaje es Hombre/Macho?";
            System.out.println("\n"+msj + "\n1) Si \n2) No");
            key = leer.nextInt();
            
           do{
               nuevo.insertar(key, msj, nivel, indice);
                System.out.println("\nRecuerda que: \n1) Si \n2) No");
                pregunta = j.determinarPregunta(key, nivel, msj);
                msj = pregunta;
                if(msj.equals("")){
                    System.out.println("¿Es correcto? \n1) Si \n2) No");
                    fin = leer.nextInt();
                    if(fin == 1){
                        opc3 = 10;
                    }else{
                        System.out.println("\nLo sentimos, quizás tu personaje no es parte de la Pandilla del misterio.");
                        opc3 = 10;
                    }
                }else{
                    System.out.println("\nPregunta: "+msj);
                    key = leer.nextInt();
                    indice ++;
                    nivel++;
                }
                
                
           }while (opc3 != 10);  
           
            System.out.println("\nTu recorrido con las respuestas acertadas es En Orden: ");
            nuevo.inOrder(nuevo.raiz);
            System.out.println("\nTu recorrido con las respuestas acertadas es en PostOrden: ");
            nuevo.postOrder(nuevo.raiz);
            System.out.println("\nTu recorrido con las respuestas acertadas es en PreOrden: ");
            nuevo.preOrder(nuevo.raiz);
            
    }

    
}

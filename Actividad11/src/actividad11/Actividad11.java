
package actividad11;
import java.util.Random;
import java.util.ArrayList;
/**
 * Valeria Arias
 * Kevin D. Camacho
 * Christian E. Herrera.
 */
public class Actividad11 {

    public static void main(String[] args) {
        ArrayList <Integer> lista = new ArrayList();
        Random r = new Random();
        Ordenamientos ordenar = new Ordenamientos();
        int num, x;
        int tope = 10;
        
        System.out.println("Numeros aleatorios arrojados: ");
        for(x = 0; x < tope; x++){
            num = r.nextInt(tope)+1;
            lista.add(num);
            System.out.println("["+num + "]");
        }
        System.out.println("\nOrdenamiento del arreglo [Burbuja]: ");
        ordenar.Burbuja(lista);
        System.out.println(" ");
        ordenar.imprimir(lista);
        
        System.out.println("\nOrdenamiento del arreglo [Seleccion]: ");
        ordenar.Seleccion(lista);
        System.out.println(" ");
        ordenar.imprimir(lista);
       
    }
    
}

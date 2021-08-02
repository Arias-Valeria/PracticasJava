
package actividad12;
import java.util.Random;
import java.util.ArrayList;
/**
 * Valeria Arias
 * Kevin D. Camacho
 * Christian E. Herrera.
 */
public class Actividad12 {

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList <Integer> datos = new ArrayList();
        Ordenar d = new Ordenar ();
        int tope = 590;
        int num, x;
        
        System.out.println("Numeros aleatorios arrojados: ");
        for(x = 0; x < tope; x++){
            num = r.nextInt(tope)+1;
            datos.add(num);
            System.out.println("["+num + "]");
        }
        
        System.out.println("\nOrdenamiento del arreglo [Inserción]: ");
        d.Insercion(datos);
        System.out.println(" ");
        d.imprimir(datos);
        
        System.out.println("\nOrdenamiento del arreglo [Shell]: ");
        d.Shell(datos, tope);
        System.out.println(" ");
        d.imprimir(datos);
    }
    
}

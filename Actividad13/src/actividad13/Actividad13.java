
package actividad13;
import java.util.ArrayList;
import java.util.Random;

public class Actividad13 {
    
    public static void main(String[] args) {
        ArrayList <Integer> lista = new ArrayList();
        int tope = 10;
        Random r = new Random();
        ArrayList <Integer> datos = new ArrayList();
        Organizar d = new Organizar ();
        int num, x;
        
        System.out.println("Numeros aleatorios arrojados: ");
        for(x = 0; x < tope; x++){
            num = r.nextInt(tope)+1;
            datos.add(num);
            System.out.println("["+num + "]");
        }
        
        System.out.println("\nOrdenamiento del arreglo [MERGE]: ");
        d.Merge(lista);
        System.out.println(" ");
        
        System.out.println("\nOrdenamiento del arreglo [QUICK]: ");
        d.Quick(lista, 0, tope-1);
    }
    
}

package actividad.pkg6;

import java.util.Hashtable;
import java.util.Scanner;


public class Actividad6 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nombre;
       
        //do{
        
        System.out.println("Bienvenido al buscador /n");
        System.out.println("1.- Ver si no hay elementos");
        System.out.println("2.- Ver cuantos elementos hay");
        System.out.println("3.- Buscar elemento");
        System.out.println("4.- Agregar un elemento");
        System.out.println("5.- Ver todos los elementos");
        int opc = entrada.nextInt();
        
        Hashtable<Integer, String> tabla = new Hashtable<Integer, String>();
        
        
        switch(opc){
            case 1:
                if(tabla.isEmpty() == true){
                    System.out.println("No hay elementos");
                }else{
                    System.out.println("Hay elementos");
                }
                break;
            case 2:
                System.out.println("Hay "+tabla.size()+ " elementos");
                break;
            case 3:
                System.out.println("Introduce un numero");
                int key = entrada.nextInt();
                System.out.println(tabla.get(key));
                break;
            case 4:
                 
                System.out.println("Introduce una etiqueta numerica y su nombre");
                System.out.println("Etiqueta: "); 
                int key2 = entrada.nextInt();
                System.out.println("Ingrese su nombre: ");
                nombre = entrada.toString();
                
                tabla.put(key2, nombre);
                System.out.println("Elemento incluido");
                System.out.println(tabla);
                break;
            case 5:
                System.out.println(tabla);
                break;
            default:
                break;
        }
        //}while()
       
        
    }
    
}

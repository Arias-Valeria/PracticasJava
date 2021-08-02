
package busquedabi;
import java.util.Scanner;
public class BusquedaBi {
    static int lista [] = {1,2,3,4,5,6,7,8,9,10};
    
    static int busquedaBinaria(int lista[], int numBuscar, int primero, int ultimo){
        int centro; //Variable que tomara el valor del indice del elemento en el medio de la lista.
        if(primero > ultimo){
            System.out.println("El elemento no se encuentra en el arreglo o está fuera de los parámetros.");
            return -1;
        }else{
            centro = (primero + ultimo) / 2; //Mediante esta operación le otorgamos un valor a la variable centro.
            System.out.println("\nPrimero: "+ primero + " // Ultimo: " + ultimo);
            if(numBuscar < lista[centro]){
                //Sí el numero a buscar es menor al numero ubicado en el centro, entonces buscará en la parte izquierda de la lista
                //Es por esto que al volver a invocar el metodo se agrega el parametro de cambio -1 indicando la sección a buscar.
                System.out.println("\nEntra en la Condicion 1.");
                System.out.println("Numero a buscar: " + numBuscar +" // centro: " +lista[centro]);
                return(busquedaBinaria(lista, numBuscar, primero, centro -1));
            }else{
                if(numBuscar > lista[centro]){
                    //Dado que si es mayor al numero del centro, entoces procedera a buscar en la parte derecha, por eso se agrega el 
                    //centro +1 en lugar de primero.
                    System.out.println("\nEntra en la Condicion 2.");
                    System.out.println("Numero a buscar: " + numBuscar +" // centro: " +lista[centro]);
                    return(busquedaBinaria(lista, numBuscar, centro +1, ultimo));
                }
                else{
                    System.out.println("\nEntra en la Condicion 3.");
                    System.out.println("Numero a buscar: " + numBuscar +" // centro: " +lista[centro]);
                    return centro+1;
                }
            }
        }
    }
    public static void main(String[] args) {
        int opcion = 0; //Inicializamos la variable para repetir el doWhile.
        do{
            int numBuscar; //Numero a buscar.
            int indice = -1; //Para tomar la posicion del numero a buscar.
            int primero = 0; //Indice del primer elemento del arreglo.
            int ultimo; //Indice del último elemento del arreglo.
            Scanner leer = new Scanner (System.in); //Variable para leer en consola.

            System.out.println("Ingrese el numero que desea buscar: ");
            numBuscar = leer.nextInt();
            ultimo = lista.length -1; //Inicializar la variable mediante el numero de elementos menos 1, ya que se cuentan los indices.
            indice = busquedaBinaria(lista, numBuscar, primero, ultimo); //Se declara al indice con el valor que retorne la recursividad.

            if(indice == -1){
                System.out.println("\nEl numero que has ingresado no se encuentra en la lista.");
                //Dado que por defecto el indice es -1, no cambia, por lo tanto el valor ingresado no se encuentra en la lista.
                
            }else{
                System.out.println("\nEl numero que has ingresado se encuentra en el indice: " + indice);
            }
            System.out.println("¿Deseas ver la lista? \n1) Si \n2) No");
            int ver = leer.nextInt();
            if(ver == 1){
                System.out.println("----Lista----");
            for(int i = 0; i < lista.length; i++){
                System.out.println("Indice " + i + ": " + lista[i]);
            }
            }
            
            System.out.println("\n¿Deseas intentar de nuevo? \n1) Si \n2) No.");
            opcion = leer.nextInt();    
        }while(opcion != 2);
        
    }
    
}

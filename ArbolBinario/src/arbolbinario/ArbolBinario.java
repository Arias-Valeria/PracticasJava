
package arbolbinario;
import java.util.Scanner;

/*Trabajo realizado por:
    Valeria Arias.
    Kevin D. Camacho.
    Christian E. Herrera.

*/
public class ArbolBinario {

    public static void main(String[] args) {
       Arbol arbol = new Arbol();
       
           arbol.insertar(2, "¿Tu personaje es Hombre? \nSi");
           arbol.insertar(2, "¿Tu personaje es cobarde? \nSi");
           arbol.insertar(1, "¿Es el lider del grupo? \nSi");
           arbol.insertar(1, "Tu personaje es Fred Jones");
          // arbol.insertar(7, "Rojo");
           
           System.out.println("------preOrder-----");
           arbol.preOrder(arbol.raiz);
          
           System.out.println("\n------inOrder-----");
           arbol.inOrder(arbol.raiz);
           
           System.out.println("\n------postOrder-----");
           arbol.postOrder(arbol.raiz);
           
    }
    
}

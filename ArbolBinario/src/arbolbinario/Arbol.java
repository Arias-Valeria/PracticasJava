
package arbolbinario;

/*Materiales de apoyo:
    https://www.youtube.com/watch?v=22AE6WklXBg
    https://www.youtube.com/watch?v=-BjHM8mPq9Y
    https://www.youtube.com/watch?v=ZKnwBJ8q2TE
*/
public class Arbol {
     Nodo raiz; //Declarar la raíz.
     
     public Arbol (){//Constructor para el arbol.
         raiz = null;
     }
     
     
     public void insertar (int llave, Object dato){//Metodo para insertar un nodo.
         Nodo nodo = new Nodo (llave);
         nodo.dato = dato;
         
         if (raiz == null){//Verificar que el arbol esté vacío. Sí está vacío, el primer nodo será la raíz.
             raiz = nodo;
         }else{
             Nodo auxiliar = raiz; //Nodo auxiliar para determinar en qué lado irá el nuevo nodo hijo.
             while (auxiliar !=null){ //Sí el nodo auxiliar no es nulo, el padre nodo se convertirá en auxiliar, de esta manera de escala o desciende en el arbol.
                 nodo.padre = auxiliar;
                 if(nodo.indice >= auxiliar.indice){ //Sí el indice del nodo es mayor o igual al indice del nodo auxiliar, irá a la derecha.
                     auxiliar = auxiliar.der;
                 }else{ //De lo contrario, irá a la izquierda.
                     auxiliar = auxiliar.izq;
                 }
             }
             if(nodo.indice < nodo.padre.indice){
                 nodo.padre.izq = nodo;
             }else{
                 nodo.padre.der =  nodo;
             }
         }
     }
     
     
     public void inOrder (Nodo nodo){//Ordenar los datos InOrder del menor al mayor, utilizamos recursion.
         if(nodo != null){
             inOrder(nodo.izq);//Nodo izquierdo.
             System.out.println("Indice: " + nodo.indice + " / /Dato: " + nodo.dato); //La raíz.
             inOrder(nodo.der); //Nodo derecho.
         }
     }
     
     public void preOrder(Nodo nodo){
         if(nodo != null){//Validar sí el nodo no es nulo, aquí utilizamos recursion.
             System.out.println("Indice: " + nodo.indice + " / /Dato: " + nodo.dato); //La raíz.
             preOrder(nodo.izq); //Nodo izquierdo.
             preOrder(nodo.der);// Nodo derecho.
         }
     }
     
     public void postOrder (Nodo nodo){
         if(nodo != null){//Validar sí el nodo no es nulo, aquí utilizamos recursion.
             postOrder(nodo.izq); //Nodo izquierdo.
             postOrder(nodo.der); //Nodo derecho
             System.out.println("Indice: " + nodo.indice + " / /Dato: " + nodo.dato); //La raíz
         }
     }
     
    
    private class Nodo{//Crear una clase privada para los nodos.
        public Nodo padre; //Nodo padre o raíz.
        public Nodo izq; //Nodo Izquierda
        public Nodo der; //Nodo derecha
        public int indice; //Numero que identifica a cada nodo.
        public Object dato; //El contenido de cada nodo.
        
        public Nodo (int llave){
            indice = llave;
            padre = null;
            izq = null;
            der = null;
            dato = null;
        }
        
    }
}

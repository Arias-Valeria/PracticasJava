/*
 
 */
package evidencia2;

public class Arbol {
    Nodo raiz; //Declarar la raíz.
     
     public Arbol (){//Constructor para el arbol.
         raiz = null;
     }
     
     
     public void insertar (int key,String msj, int nivel, int indice){//Metodo para insertar un nodo.
         Nodo nodo = new Nodo (key, msj, nivel, indice);
         
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
             System.out.println("Indice: " + nodo.indice + " / / Pregunta: " + nodo.pregunta + "/ / Tu respuesta: " + nodo.llave); //La raíz.
             inOrder(nodo.der); //Nodo derecho.
         }
     }
     
     public void preOrder(Nodo nodo){
         if(nodo != null){//Validar sí el nodo no es nulo, aquí utilizamos recursion.
             System.out.println("Indice: " + nodo.indice + " / / Pregunta: " + nodo.pregunta + "/ / Tu respuesta: " + nodo.llave); //La raíz.
             preOrder(nodo.izq); //Nodo izquierdo.
             preOrder(nodo.der);// Nodo derecho.
         }
     }
     
     public void postOrder (Nodo nodo){
         if(nodo != null){//Validar sí el nodo no es nulo, aquí utilizamos recursion.
             postOrder(nodo.izq); //Nodo izquierdo.
             postOrder(nodo.der); //Nodo derecho
             System.out.println("Indice: " + nodo.indice + " / / Pregunta: " + nodo.pregunta + "/ / Tu respuesta: " + nodo.llave); //La raíz
         }
     }
     
    
    private class Nodo{//Crear una clase privada para los nodos.
        public Nodo padre; //Nodo padre o raíz.
        public Nodo izq; //Nodo Izquierda
        public Nodo der; //Nodo derecha
        public int llave; //Numero que identifica a cada nodo.
        public String pregunta; //El contenido de cada nodo.
        public int indice;
        
        public Nodo (int key, String msj, int nivel, int i){
            llave = key;
            indice = i;
            padre = null;
            izq = null;
            der = null;
            pregunta = msj;
            
        }

        public Nodo getPadre() {
            return padre;
        }

        public void setPadre(Nodo padre) {
            this.padre = padre;
        }

        public Nodo getIzq() {
            return izq;
        }

        public void setIzq(Nodo izq) {
            this.izq = izq;
        }

        public Nodo getDer() {
            return der;
        }

        public void setDer(Nodo der) {
            this.der = der;
        }

        public int getLlave() {
            return llave;
        }

        public void setLlave(int llave) {
            this.llave = llave;
        }

        public String getPregunta() {
            return pregunta;
        }

        public void setPregunta(String pregunta) {
            this.pregunta = pregunta;
        }

        public int getIndice() {
            return indice;
        }

        public void setIndice(int indice) {
            this.indice = indice;
        }
        
        
    }
}

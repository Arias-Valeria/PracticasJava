
package actividad13;
import java.util.ArrayList;

public class Organizar {
    public Organizar(){
        
    }
    
    //Método Merge (mezclar).
    public ArrayList<Integer> Merge(ArrayList<Integer> lista) {
        ArrayList<Integer> resultado = lista; //Resultado
        if (resultado.size()== 1){//caso de salida, sí el tamaño de la lista llega 1, ya no se puede dividir, por lo tanto acaba el ciclo recursivo.
            resultado =lista;
        } else {//caso recursivo
            ArrayList<Integer> parcial1 = new ArrayList(), parcial2 = new ArrayList();
            int j = 0;
            //Separar el arreglo en 2 iguales
            for (int i = 0; i < (int)(resultado.size()/2); i++){
                parcial1.add(resultado.get(i));
                j++;
            }
            for(int i = j; i < (resultado.size()); i++){
                parcial2.add(resultado.get(i));
            }
            //Unir el ordenamiento de los 2 parciales
            resultado  = this.union(this.Merge(parcial1), this.Merge(parcial2));
        }
        return resultado;
    }

    //Merge (Unión)
       public ArrayList<Integer> union(ArrayList<Integer> parte1,ArrayList<Integer> parte2) {
        ArrayList<Integer> resultado = new ArrayList<>();
        int indice1 = 0, indice2 = 0;
        int maxIndice1 = parte1 != null? parte1.size():0, maxIndice2 = parte2 != null? parte2.size():0;
        while(indice1 < maxIndice1 || indice2 < maxIndice2 ){
            //si ya no hay en el arreglo 1
            if (indice1 == maxIndice1){
                //agrego en el resultado del arreglo2
                resultado.add(parte2.get(indice2++));
            } else if (indice2==maxIndice2){
                //ya no hay en el arreglo 2 pero si en el 1
                resultado.add(parte1.get(indice1++));
            } else {
                //hay en los 2 agrego el más pequeño
               resultado.add((parte1.get(indice1)<parte2.get(indice2))?
               parte1.get(indice1++):parte2.get(indice2++)); 
            }
        }
        return resultado;
    }
    
    
    
    //Metodo Quick
    public ArrayList<Integer> Quick(ArrayList<Integer> lista, int primero, int ultimo) {
        ArrayList<Integer> resultado = lista; //Resultado
        int pAux = primero, uAux = ultimo;
        if (primero >= ultimo){
            resultado =lista;
        }else {
            int delta = -1;
            do{//repite el ciclo. En caso de que se tenga que cambiar se multiplica por delta para saber el sentido de la comparación
                if (lista.get(pAux)*delta<delta*lista.get(uAux)){
                    Integer aux = lista.get(pAux); //intercambia
                    lista.set(pAux, lista.get(uAux));
                    lista.set(uAux, aux);
                    aux = pAux;//intercambia
                    pAux = uAux;
                    uAux = aux;
                    delta *= -1;//cambia el sentido
                }
                uAux +=delta;
            }while(pAux != uAux);
                resultado = Quick(lista, primero, pAux-1);//Ordena la parte menor.
                resultado = Quick(lista, pAux+1, ultimo);//Ordena la parte mayor.
        }
        return resultado;
    }
}

      


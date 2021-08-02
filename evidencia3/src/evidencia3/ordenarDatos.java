
package evidencia3;
import java.util.ArrayList;
public class ordenarDatos {
    
    public ArrayList<Integer> Burbuja (ArrayList<Integer> lista) {
            ArrayList resultado = lista; //dato a retornar.
            for(int f = 0; f < lista.size()-1; f++){ //primer ciclo for para saber cuantas vueltas debe dar.
                for(int s = 0; s < lista.size()-1; s++){//Segundo for para ordenar los valores del arreglo.
                    Integer numActual = lista.get(s);
                    Integer numSiguiente = lista.get(s+1);
                    if(numActual > numSiguiente){ //Condicional para saber sí el numero actual es mayor que el siguiente del arreglo.
                        lista.set(s, numSiguiente);
                        lista.set(s+1, numActual);
                    }
                }
            }
            return resultado;
        }
        
        public void imprimir (ArrayList<Integer> lista){
            for(int x = 0; x < lista.size(); x++){
                System.out.println("Posicion " + x + ": " + lista.get(x));
            }
        }
        
        public ArrayList<Integer> Seleccion(ArrayList<Integer> lista) {
        ArrayList<Integer> resultado = lista; //Resultdo     
        for(int i = 0; i < resultado.size()-1; i++){ 
            Integer numA = resultado.get(i);
            for (int j = i+1; j < resultado.size();j++){
                Integer numS = resultado.get(j);
                if(numA > numS){
                    resultado.set(i, numS);
                    resultado.set(j, numA);
                    numA = numS;
      
                }
            }
        }
        return resultado;
    }

        
  public ArrayList<Integer> insercion(ArrayList<Integer> data) {

    ArrayList<Integer> result = new ArrayList<>(); //Resultado
    result.add(0, data.get(0));//se crea la lista ordenada

    for (int i = 1; i < data.size(); i++) {//haremos n-1 pasos
      int index = 0;//el lugar tentativo donde acomodaremos el nuevo
      //elemento
      //mientras que no hayan acabado los elementos
      //y no el siguiente elemento no sea mayor que el i-esimo
      //sigue avanzando
      while (index < result.size() && result.get(index) < data.get(i)) {
        index++;
      }
      //al final agrega en el lugar que le corresponde
      result.add(index, data.get(i));
      System.out.println(result);
    }
    return result;
  }

     
    public ArrayList<Integer> Shell (ArrayList<Integer> data, int n) {
        ArrayList<Integer> result =data; //Resultado
        if (n==1){// Caso de salida
            result = Burbuja (data);
        } else {
            for (int i=0;i<n;i++){//dividimos en n segmentos 
                ArrayList<Integer> aux = new ArrayList<>();
                for (int j=i;j<data.size();j=j+n){// tomamos los elementos
                    aux.add(result.get(j));// lo guardamos en un arreglo auxiliar
                }
                aux = Burbuja(aux);//bubble de este arreglo
                //lo regresamos a sus lugares
                for (int j = i, index = 0 ; j < data.size(); j = j + n ,index++){
                    result.set(j, aux.get(index));
                }
            }  
            result = this.Shell(result, n-1); //llamada a un método recursivo
        } return result; 
    }
    
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


package actividad12;

import java.util.ArrayList;

public class Ordenar {
    //Ordenamiento de burbuja
    public ArrayList <Integer> Burbuja (ArrayList<Integer> datos) {
            ArrayList <Integer> resultado = datos; //dato a retornar.
            for(int f = 0; f < datos.size()-1; f++){ //primer ciclo for para saber cuantas vueltas debe dar.
                for(int s = 0; s < datos.size()-1; s++){//Segundo for para ordenar los valores del arreglo.
                    Integer numActual = datos.get(s);
                    Integer numSiguiente = datos.get(s+1);
                    if(numActual > numSiguiente){ //Condicional para saber sí el numero actual es mayor que el siguiente del arreglo.
                        datos.set(s, numSiguiente);
                        datos.set(s+1, numActual);
                    }
                }
            }
            return resultado;
        }
    
    //Ordenamiento de Insercion.
    public ArrayList <Integer> Insercion (ArrayList <Integer> datos){
        ArrayList<Integer> result = new ArrayList<>(); //Resultado
    result.add(0, datos.get(0));//se crea la lista ordenada

    for (int i = 1; i < datos.size(); i++) {//haremos n-1 pasos
      int index = 0;//el lugar tentativo donde acomodaremos el nuevo
      //elemento
      //mientras que no hayan acabado los elementos
      //y no el siguiente elemento no sea mayor que el i-esimo
      //sigue avanzando
      while (index < result.size() && result.get(index) < datos.get(i)) {
        index++;
      }
      //al final agrega en el lugar que le corresponde
      result.add(index, datos.get(i));
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
    
    public void imprimir (ArrayList<Integer> lista){
            for(int x = 0; x < lista.size(); x++){
                System.out.println("Posicion " + x + ": " + lista.get(x));
            }
        }
      
}

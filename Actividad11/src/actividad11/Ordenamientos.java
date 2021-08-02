
package actividad11;

import java.util.ArrayList;

public class Ordenamientos {
 
    
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
}

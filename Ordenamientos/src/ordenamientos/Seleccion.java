/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientos;

import java.util.ArrayList;

/**
 *
 * @author Roberto
 */
public class Seleccion {
  public ArrayList<Integer> ordenaSeleccion(ArrayList<Integer> data) {

    ArrayList<Integer> result = data; //Resultdo

    for (int i = 0; i < result.size() - 1; i++) { //se hacen n-1 iteraciones
      Integer pos = result.get(i);//se obtiene el mínimo supuesto
      for (int j = i + 1; j < result.size(); j++) {//compara desde la posición i 
        //hasta el fin del arreglo
        Integer next = result.get(j);
        if (pos > next) {//en caso de ser mayor se intercambia
          result.set(i, next);
          result.set(j, pos);
          pos = next;
        }
        System.out.println(result);
      }
    }
    return result;
  }
}

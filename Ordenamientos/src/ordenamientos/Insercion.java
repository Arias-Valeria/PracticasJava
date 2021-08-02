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
public class Insercion {
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
}

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
public class busquedaBinaria {
  
  public static boolean busquedaBinaria(ArrayList<Integer> data, int dato) {
    int centro = 0, //centro del arreglo
        inf = 0,//límite inferior
        sup = data.size() - 1; //límite superior
    boolean result = false;
    while (!result && inf <= sup) {//mientras no se cumplan las 2 condiciones
      centro = ((sup - inf) / 2) + inf;//se obtiene nuevo centro
      if (data.get(centro) == dato) {//si el dato es igual al centro se acaba
        result = true;
      } else if (dato < data.get(centro)) {//si no se recorren los límites
        sup = centro - 1;
      } else {
        inf = centro + 1;
      }
    }
    return result;
  }
}

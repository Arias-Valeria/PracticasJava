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
public class Shell {
  
  public ArrayList<Integer> ordenaShell(ArrayList<Integer> data, int n) {

    ArrayList<Integer> result = data; //Resultado
    
    if (n == 1) {// Caso de salida
      Burbuja b = new Burbuja();
      result = b.ordenaBurbuja(data);
    } else {
      for (int i = 0; i < n; i++) {//dividimos en n segmentos 
        ArrayList<Integer> aux = new ArrayList<>();
        for (int j = i; j < data.size(); j = j + n) {// tomamos los elementos
          aux.add(result.get(j));// lo guardamos en un arreglo auxiliar
        }
        Burbuja b = new Burbuja();
        aux = b.ordenaBurbuja(aux);//bubble de este arreglo
        //lo regresamos a sus lugares
        for (int j = i, index = 0; j < data.size(); j = j + n, index++) {
          result.set(j, aux.get(index));
        }
      }
      result = this.ordenaShell(result, n - 1); //llamada recursiva
    }
    System.out.println(result);
    return result;
  }
}

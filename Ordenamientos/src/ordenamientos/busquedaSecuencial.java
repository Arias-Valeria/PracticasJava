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
public class busquedaSecuencial {
  
  public static boolean busquedaSecuencial(ArrayList<Integer> data, Integer number) {
    boolean result = false;
    ArrayList <Integer> Objects= data;
    //for (int i = 0; i < Objects.size(); i++) {
    int i= 0;
    int n= Objects.size();
    while (result== true && i< n){
      int compara= Objects.get(i);
      if (compara== number) {
        result = true;
      }else{
        i++;
      }
    }
    return result;
  }
}

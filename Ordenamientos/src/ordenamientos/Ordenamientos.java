/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientos;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Roberto
 */
public class Ordenamientos {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Burbuja burb= new Burbuja();
    Seleccion selec= new Seleccion();
    Insercion ins= new Insercion();
    Shell shl= new Shell();
    Merge mrg= new Merge();
    Quick qck= new Quick();
    Random r= new Random();
    ArrayList <Integer> datos= new ArrayList <>();
    ArrayList <Integer> aux= new ArrayList<>();
    
    for (int i= 0; i< 10000; i++){
      int valor1 = (int) Math.floor(Math.random()*100+1);
      int valor2 = r.nextInt();
      datos.add(valor1);
      datos.add(valor2);
    }
    System.out.println ("Datos ingresados: "+datos);
    //aux=burb.ordenaBurbuja(datos);
    //aux= selec.ordenaSeleccion(datos);
    //aux= ins.ordenaInsercion(datos);
    //aux= shl.ordenaShell(datos, 590);
    //aux= mrg.ordenaMerge(datos);
    //aux= qck.ordenaQuick(datos, 0, 19);
    System.out.println ("Datos ordenados: "+aux);  
    
    InterfazGrafica ig= new InterfazGrafica();
    prueba p= new prueba();
    ig.setVisible(true);
    p.setVisible(true);
  }
}
// Tiempo Ordenamiento Insercion: 
// Tiempo Ordenamiento Shell: 
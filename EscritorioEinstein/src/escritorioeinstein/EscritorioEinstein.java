/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritorioeinstein;

import java.util.Observable;
import java.util.Observer;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.Date;

/**
 *
 * @author Roberto
 * Fuente= http://www.chuidiang.org/java/timer/ejemplotimer.php
 *         http://www.chuidiang.org/java/timer/RelojModeloSwing.java.txt
 */
public class EscritorioEinstein extends Observable{

  
  /* Lanza un timer cada segundo , avisando a los observadores de este
  * modelo del cambio.
  */
  public EscritorioEinstein() {
    Timer timer;
    timer = new Timer(
      1000, (ActionEvent e) -> {
        setChanged();
        notifyObservers(
          new Date()
        );
      }
    );
    
    Timer enviarArticulo, publicarArticulo;
    
    enviarArticulo = new Timer(
      2000, (ActionEvent e) -> {
        setChanged();
        notifyObservers(
          new Date()
        );
      }
    );
    
    publicarArticulo = new Timer(
      3000, (ActionEvent e) -> {
        setChanged();
        notifyObservers(
          new Date()
        );
      }
    );
    
    //timer.start();
    enviarArticulo.start();
    publicarArticulo.start();
    
    
  }

  /**
   * Main para prueba de esta clase.
   * @param args
   */
  public static void main(String[] args) {
    EscritorioEinstein modelo = new EscritorioEinstein();
   
    /*modelo.addObserver(
      new Observer(){
        public void update(Observable unObservable, Object timer) {
          System.out.println("\n"+timer);
        }
      }
    );*/
    
    modelo.addObserver(
      (Observable unObservable, Object enviarArticulo) -> {
        System.out.println ("Articulo enviado: "+enviarArticulo+"\n");
      }
    );

    modelo.addObserver(
      (Observable unObservable, Object publicarArticulo) ->{
        System.out.println ("Articulo publicado: "+publicarArticulo+"\n\n");
      }
    );
    
    // Espera de 10 segundos para que el programa no termine
    // inmediatamente
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      System.out.println("Funcionamiento Inesperado...");
    }
  }
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partido;

import java.util.Scanner;

/**
 *
 * @author Roberto
 */
public class Partido {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    String nom, pos;
    int no, total, i, j;
    boolean capt;
    jugadores Todos =new jugadores();
    Scanner sc =new Scanner(System.in);
    
    Todos.iniciarListas();
    i= 0;
    
    System.out.println ("Juego de Futbol");
    System.out.print ("Escribe cuantos jugadores se ingresaran (4 en adelante): ");
    total= Integer.parseInt(sc.nextLine());
    while (i< total){
      if (i< 2){
        System.out.println ("\nDatos del capitan del equipo "+(i+1)+": ");
        capt= true;
      }else{
        System.out.println ("\nDatos del jugador: ");
        capt= false;
      }
      System.out.print ("Nombre: ");
      nom= sc.nextLine();
      System.out.print ("Posicion en la que juega: ");
      pos= sc.nextLine();
      System.out.print ("Numero de la camiseta: ");
      no= Integer.parseInt(sc.nextLine());
      Todos.insertarJugador(nom, pos, no, capt);
      i++;
    }
    Todos.muestraLista(0);
    i= 0;
    //
    while (i< total){
      if (i< 2){
        System.out.print ("Ingresa el nombre del capitan para el equipo "+(i+1)+": ");
        nom= sc.nextLine();
        Todos.agregarJugadorEquipo(nom, i+1);
      }
      i++;
    }
    System.out.println ("\nJugadores del equipo 1: ");
    Todos.muestraLista(1);
    System.out.println ("\nJugadores del equipo 2: ");
    Todos.muestraLista(2);
    System.out.println ("\n\nFin!");
  }
}

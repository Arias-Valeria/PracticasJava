/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaprioridad;
import java.util.Scanner;
/**
 *
 * @author Roberto
 */
public class ListaSimple {

  private Nodo inicio;
  // Puntero que indica el final de la lista o el ultimo nodo.
  private Nodo ultimo;

  public void Lista() {
    inicio = null;
    ultimo = null;
  }

  public void agregar(int valor, int prioridad) {

    Nodo nuevo = new Nodo(valor, prioridad);

    if (inicio == null) {
      inicio = ultimo = nuevo;
    } else {
      if (inicio.prioridad > prioridad) {
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
      } else {
        Nodo ant = null;
        Nodo sig = inicio;
        while (sig != null && prioridad >= sig.prioridad) {
          ant = sig;
          sig = sig.getSiguiente();
        }
        nuevo.setSiguiente(sig);
        ant.setSiguiente(nuevo);
        if (sig == null) {
          ultimo = nuevo;
        }
      }
    }
  }

  void imprimir() {
    Nodo aux = inicio;
    int auxValor ;
    do {
        auxValor = aux.getValor();
        System.out.println("Paciente: " + auxValor + "-- Prioridad: " + aux.prioridad + "\n");
      //System.out.println("" + aux);
      aux = aux.getSiguiente();
    } while (aux != null);
  }
  
  public void ingresarPaciente(){
      Scanner leer  = new Scanner (System.in);
      int paciente, prioridad;
      System.out.println("Ingresar el número del paciente: ");
      paciente = Integer.parseInt(leer.next());
      System.out.println("\n");
      System.out.println("Ingrese la prioridad: ");
      prioridad = Integer.parseInt(leer.next());
      agregar (paciente, prioridad);
      System.out.println("\nPaciente ingresado correctamente.\n");
  }
}

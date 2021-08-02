/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaprioridad;

/**
 *
 * @author Roberto
 */
public class Nodo {
  
  private int valor;
  int prioridad;
  // Atributo para enlazar los nodos.
  private Nodo anterior, siguiente;

  Nodo(int valor, int prioridad) {
    this.valor = valor;
    this.prioridad = prioridad;
  }

  Nodo() {

  }

  public void Nodo() {
    this.valor = 0;
    this.anterior = null;
    this.siguiente = null;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }

  public int getValor() {
    return valor;
  }

  public void setAnterior(Nodo siguiente) {
    this.anterior = siguiente;
  }

  public Nodo getAnterior() {
    return anterior;
  }

  public void setSiguiente(Nodo siguiente) {
    this.siguiente = siguiente;
  }

  public Nodo getSiguiente() {
    return siguiente;
  }

  @Override
  public String toString() {
    return "Nodo{" + "valor=" + valor + ", prioridad=" + prioridad + '}';
  }

}

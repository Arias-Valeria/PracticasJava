/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partido;

import java.util.ArrayList;

/**
 *
 * @author Roberto
 */
public class jugadores {
  
  class jugador{
    String nombre;
    String posicion;
    int numero;
    boolean capitan;
    jugador ant, sig;
  }
  
  private jugador lista, equipoUno, equipoDos;
  
  public void iniciarListas(){
    lista= null;
    equipoUno= null;
    equipoDos= null;
  }
  
  public void insertarJugador(String nom, String pos, int no, boolean capt){
    jugador nuevo;
    nuevo= new jugador();
    nuevo.nombre= nom;
    nuevo.posicion= pos;
    nuevo.numero= no;
    nuevo.capitan=  capt;
    
    if (lista== null){
      nuevo.sig= null;
      lista= nuevo;
    }else{
      nuevo.sig= lista;
      lista= nuevo;
    }
  }
  
  public void agregarJugadorEquipo(String nom, int eq){
    
    jugador reco;
    int i, elementos, equipo;
    
    reco= lista;
    equipo= eq;
    elementos= cantidad(0);
    i= 0;
    
    while (i< elementos){
      if (reco.nombre.equals(nom)) {
        if (equipo== 1){
          if (equipoUno== null){
            equipoUno= reco;
            equipoUno.sig= null;
          }else{
            reco.sig= equipoUno;
            equipoUno= reco;
          }        
        }else{
          if (equipoDos== null){
            equipoDos= reco;
            equipoDos.sig= null;
          }else{
            reco.sig= equipoDos;
            equipoDos= reco;
          }
        }
      }else{
        reco = reco.sig;
      }
      i++;
    }
  }
  
  public void muestraLista(int opcion) {
    jugador reco;
    int i, opc, elementos;
    reco= null;
    elementos= 0;
    
    opc= opcion;
    if (opc== 0){
      reco= lista;
      elementos= cantidad(0);
    }
    if (opc== 1){
      reco= equipoUno;
      elementos= cantidad(1);
    }
    if (opc== 2){
      reco= equipoDos;
      elementos= cantidad(2);
    }
    
    i= 0;
    while (i< elementos) {
      if (reco.capitan==true){ 
        System.out.print("Jugador y Capitan de equipo: ");
      }else{
        System.out.print("Jugador: ");
      }
      System.out.println ("Nombre: "+reco.nombre + " ; Posicion: " + reco.posicion + " ; Numero: " + reco.numero);
      reco = reco.sig;
      i++;
    }
    System.out.println();
  }
  
  public int cantidad(int opcion) {
    jugador reco;
    int cant, opc;            
    cant= 0;
    opc= opcion;
    reco= null;
    
    if (opc== 0) reco= lista;
    if (opc== 1) reco= equipoUno;
    if (opc== 2) reco= equipoDos;
    while (reco!= null) {
      reco= reco.sig;
      cant++;
    }
    return cant;
  }
  
  /*
  jugador elemento= new jugador();
  ArrayList<jugador> jugadores= new ArrayList();
  ArrayList<jugador> equipo1= new ArrayList<>();
  ArrayList<jugador> equipo2= new ArrayList<>();
  
  public void agregarJugador(String nom, String pos, int no, boolean capt){
    elemento.nombre= nom;
    elemento.posicion= pos;
    elemento.numero= no;
    elemento.capitan=  capt;
    jugadores.add(elemento);
  }
  
  ArrayList<String> nombreArrayList = new ArrayList<String>();
  public void agregar(){
    nombreArrayList.add("Elemento");
  }
  
  */

  
}

package actividad3verano;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author salva
 */
public class Pila {
    private Nodo inicial;
    private int tamanio;

    public void Pila(){
        inicial = null;
        tamanio = 0;
    }
    
    public boolean pilaVacia(){
        return inicial == null;
    }
    
    public int tamanioTotal(){
        return tamanio;
    }
    
    public void agregarDatos(String valor) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setValor(valor);
        Timer timer = new Timer();
        TimerTask agregar;
        agregar = new TimerTask() {
            
            @Override
            public void run() {
                if (pilaVacia()) {
                    inicial = nuevoNodo;
                    System.out.println(inicial.getValor());
                } else {
                    nuevoNodo.setSig(inicial);
                    System.out.println(nuevoNodo.getValor());
                    inicial = nuevoNodo;   
                }
                tamanio++;
            }
        };
        timer.schedule(agregar, 2000);
        try
        {
        Thread.sleep(2500);
        }
    catch (Exception e)
        {
        }
    agregar.cancel();
    }
    
    
    public void eliminarDato(){
        inicial = inicial.getSig();
        tamanio--;
    }
    /*
    
    */
    public void mostrarListado() {
        Nodo nodoAux = inicial;
        
       while (nodoAux != null) {
            System.out.println(nodoAux.getValor());
            System.out.println("-----------------");      
            nodoAux = nodoAux.getSig();
        }
    }

    
    
    
    public void imprimirUltimo(){
        //Nodo aux = inicial;
        //System.out.println(aux.getValor());
    
        Nodo aux = inicial;
        Timer timer = new Timer();
        TimerTask print;
        print = new TimerTask() {
            
            @Override
            public void run() {
               
               System.out.println(aux.getValor());
            }
        };
        timer.schedule(print, 3000);
        try{
        Thread.sleep(3100);
        }catch (Exception e){
        }
    print.cancel();
    }
}
    
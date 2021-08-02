
package evidencia1_;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class Tiempo {
    
    //Constructor.
    public Tiempo(){
        
    }
    //Seleccionar el tiempo aleatorio.
    public void esperarAleatorio(int nano){
        Timer timer = new Timer();
        TimerTask tarea = new TimerTask(){
            @Override
            public void run() {
                System.out.println("\nTiempo arrojado: " + nano +" milisegundos.");
                System.out.println("El archivo se esta enviando al servidor...\n");
            }

        };
        timer.schedule(tarea, 0, nano);      
        
        try{
           Thread.sleep((nano + 500));
        }catch(InterruptedException pause){
            System.out.println("Ha ocurrido un error.");
        }
        tarea.cancel();
        
    }
    
    //Tiempo de servicio.
     public void tiempoServicio(int servicio){
        Timer timer = new Timer();
        TimerTask tarea = new TimerTask(){
            @Override
            public void run() {
                System.out.println("\nTiempo arrojado: " + servicio +" milisegundos.");
                System.out.println("El archivo se está procesando...\n");
            }

        };
        timer.schedule(tarea, 0, servicio);      
        
        try{
           Thread.sleep((servicio + 500));
        }catch(InterruptedException pause){
            System.out.println("Ha ocurrido un error.");
        }
        tarea.cancel();
        
    }
    
    //Terminar programa.
     public void terminarPrograma(){
          System.out.println("\nPrograma terminado.");
          System.exit(0);
      }
     
     //Imprimir cada segundo.
     
}

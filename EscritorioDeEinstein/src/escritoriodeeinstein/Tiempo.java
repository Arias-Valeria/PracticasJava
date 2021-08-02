
package escritoriodeeinstein;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Tiempo {
    
    //Constructor vacío
    public Tiempo() {
    }
    
    //Para un envío de 4 meses
    public void enviarMeses4(){
        Timer timer = new Timer();
        TimerTask tarea = new TimerTask(){
            @Override
            public void run() {
                System.out.println("Se ha enviado el artículo. \nFecha: " + new Date());
                System.out.println("El envío tardará: 4 meses.\n");
            }

        };
        timer.schedule(tarea, 0, 4000);      
        
        try{
           Thread.sleep(4500);
        }catch(InterruptedException pause){
            System.out.println("Ha ocurrido un error.");
        }
        tarea.cancel();
        
    }
   
    //Para un envío de 3 meses
      public void enviarMeses3(){
        Timer timer = new Timer();
        TimerTask tarea = new TimerTask(){
            @Override
            public void run() {
                System.out.println("Se ha enviado el artículo. \nFecha: " + new Date());
                System.out.println("El envío tardará: 3 meses.\n");
            }

        };
        timer.schedule(tarea, 0, 3000);  
        
        try{
           Thread.sleep(3500);
        }catch(InterruptedException pause){
            System.out.println("Ha ocurrido un error.");
        }
        tarea.cancel();
    }
      
      //Para un envío de 2 meses
        public void enviarMeses2(){
        Timer timer = new Timer();
        TimerTask tarea = new TimerTask(){
            @Override
            public void run() {
                System.out.println("Se ha enviado el artículo. \nFecha: " + new Date());
                System.out.println("El envío tardará: 2 meses.\n");
            }

        };
        timer.schedule(tarea, 0, 2000);   
        
        try{
           Thread.sleep(2500);
        }catch(InterruptedException pause){
            System.out.println("Ha ocurrido un error.");
        }
        tarea.cancel();
    }
        //Terimar programa.
      public void terminarPrograma(){
          System.out.println("\nPrograma terminado.");
          System.exit(0);
      }
}

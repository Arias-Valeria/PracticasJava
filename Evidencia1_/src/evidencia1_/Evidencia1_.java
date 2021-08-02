
package evidencia1_;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Random;

public class Evidencia1_ {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int maximo;
        int minimo;
        int tope;
        int dw = 0;
        int nano;
        int servicio = 0;
        int turno = 0;
        int limite = 0;
        int rechazados;
        //Para el tiempo de servicio.
        Random s = new Random();
        //Para la prioridad aleatoria.
        int p;
        //Para el tiempo.
        Random r = new Random(); 
        //Para la prioridad.
        Random pri = new Random();
        Scanner leer = new Scanner(System.in);
        LinkedList <Archivos> colaP = new LinkedList ();
        Tiempo tiempo = new Tiempo();
        Archivos accion =  new Archivos();
        
        //Pedir tope al usuario.
        System.out.println("***[Bienvenido al gestor de archivos del CNP: Los Santos, D-12, USA.]***");
            System.out.println("Ingrese el tope o límite de elementos de la cola: ");
            tope = Integer.parseInt(leer.nextLine());
      
        do{
            //Pedir minímo al usuario.
            System.out.println("Ingrese el tiempo minimo de espera: ");
            minimo = Integer.parseInt(leer.nextLine());
            
            //Pedir máximo al usuario.
            System.out.println("Ingrese el tiempo máximo de espera: ");
            maximo = Integer.parseInt(leer.nextLine());
            
            //Pedir el maximo de archivos rechazados.
            System.out.println("Ingrese el límite de achivos rechazados por el servidor: ");
            rechazados = Integer.parseInt(leer.nextLine());
            //Validar sí el máximo es mayor al minimo.
            if(minimo < maximo){
                dw = 5;
            }else if(minimo >= maximo || minimo == maximo){
                System.out.println("\nEl valor mínimo debe ser menor al valor máximo.");
            }else{
                System.out.println("\nHa ocurrido un contratiempo, verifique los datos ingresados en consola.");
            }
        }while(dw != 5);
        
        
        while(limite < rechazados){
            System.out.println("\nTURNO: " + turno);
            //Crear el tiempo aleatorio de envio.
            nano = (r.nextInt(maximo) + minimo)*1000;
            
            //Crear el objeto con prioridad aleatoria.
            p = pri.nextInt(5)+ 1;
            Archivos nuevoArchivo = new Archivos(p);
            accion.mensaje(nuevoArchivo);
            
            //Esperar a el tiempo de envío.
            tiempo.esperarAleatorio(nano);
            
            System.out.println("...\n");
            
            //Determinar sí la cola está llena.
            if(colaP.size() != tope){
                accion.agregar(colaP, nuevoArchivo, tope);
            }else{
              System.out.println("\nLa cola está en su máxima capacidad.\nEl archivo ha sido rechazado.\n");
                limite++;
                colaP.pop();
               //System.out.println("\nSe ha realizado un [POP] en la cola.");

            }
            
            System.out.println("\nTamaño de la cola: " + colaP.size());
            System.out.println("Numero de archivos rechazados: " + limite);
            //Tiempo de procesamiento (servicio)
            servicio = (s.nextInt(maximo) + minimo)*1000;
            tiempo.tiempoServicio(servicio);
            
            
            turno ++;
            
            System.out.println("\n--- Actualización de archivos ----");
              accion.imprimir(colaP);
        }
        
         
        
         tiempo.terminarPrograma();
         
       }
    
}

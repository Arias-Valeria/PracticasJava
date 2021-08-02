
package evidencia1_;

import java.util.LinkedList;

public class Archivos {
    int prioridad;

    public Archivos(int prioridad) {
        this.prioridad = prioridad;
    }
    
    public Archivos(){
        
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    //Mensaje segun la prioridad del archivo.
    public void mensaje(Archivos nuevoArchivo){
   
        switch(nuevoArchivo.getPrioridad()){
            case 1:
                System.out.println("\nHa recibido una archivo de prioridad [BAJA] Nivel: 1.");;
                break;
            case 2: 
                System.out.println("\nHa recibido un archivo de prioridad [BAJA] Nivel: 2.");
                break;
            case 3:
                System.out.println("\nHa recibido un archivo de prioridad [MEDIA] Nivel: 3");
                break;
            case 4:
                System.out.println("\nHa recibido un archivo de prioridad [MEDIA] Nivel: 4.");
                break;
            case 5:
                System.out.println("\nHa recibido un archivo con prioridad [ALTA] Nivel: 5.");
                break;
            default:
                System.out.println("\nLa prioridad de este archivo no ha sido especificada.");
                break;
        }
    }
    
    //Agregar Archivo.
    public void agregar (LinkedList<Archivos> colaP, Archivos nuevoArchivo, int tope) {
       if(colaP.isEmpty()){
            colaP.offer(nuevoArchivo);
        }else if(nuevoArchivo.getPrioridad() <= colaP.getFirst().getPrioridad()){
            colaP.offerFirst(nuevoArchivo);
        }else if (nuevoArchivo.getPrioridad() > colaP.getFirst().getPrioridad()){
            colaP.offerLast(nuevoArchivo);
        }else if(nuevoArchivo.getPrioridad() >= colaP.getLast().getPrioridad()){
            colaP.offerLast(nuevoArchivo);
        }else{
            colaP.offer(nuevoArchivo);
        }
       
   } 
    
    //Imprimir lista de archivos.
      public void imprimir(LinkedList <Archivos> colaP){
        int numero = 0;
        for(Object archivoActual: colaP){
            Archivos arch = (Archivos) archivoActual;
            System.out.println("\n---------------------");
            System.out.println("numero: " + (numero +1));
            System.out.println("Nivel de prioridad: " + arch.getPrioridad());
            numero++;
        }
    }
      
}

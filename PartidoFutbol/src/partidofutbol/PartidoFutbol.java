
package partidofutbol;
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayList;

public class PartidoFutbol {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
    
    public static String posicionJugador (char op){
        String posicion = "";
        switch(op){
                 case 'a':
                     posicion = "Portero";
                     break;
                 case 'b':
                     posicion = "Defensa";
                     break;
                 case 'c':
                     posicion = "Centrocampista";
                     break;
                 case 'd':
                     posicion = "Delantero";
                     break;
                 default:
                     System.out.println("Opción no encontrada, intente de nuevo.");
                     break;
             }
        return posicion;
    }
    public static void main(String[] args) throws IOException {
     //Lista de equipos abierta y jugadores.
     ArrayList equipo1 = new ArrayList();
     ArrayList equipo2 = new ArrayList ();
     ArrayList jugadores = new ArrayList();
     //Lista de capitanes.
     ArrayList capitanes = new ArrayList ();
     
     //Variable para terminar el programa
     int terminar = 0;
     //Variable para repetir el programa. 
     int opcion = 0;
     //Variable del numero de integrantes de cada equipo. Por motivos prácticos se optó por 2.
     int JugadoresEquipo1= 2;
     int JugadoresEquipo2 = 2;
     //Suma de los integrantes de cada equipo.
     int integrantes = JugadoresEquipo1 + JugadoresEquipo2;
     
        System.out.println("Bienvenido a la selección de jugadores de la FIFA 2020.");
     do{
         System.out.println("Seleccion de capitanes.");
         //Ciclo para crear a los capitanes, se estableció como límite 2 en el ciclo for.
         for(int i = 1; i <= 2; i++){
             System.out.println("--- Capitán equipo " + i + "---");
             System.out.println("\nIngrese el nombre: ");
             String nombre = entrada.readLine();
             String posicion = "Capitan";
             System.out.println("\nIngrese el numero de jugador: ");
             int numeroJugador = Integer.parseInt(entrada.readLine());
             int equipo = i;
             //Se crea un objeto con las variables preguntadas en consola, para agregarlo a la lista con el .add
             Jugador nuevoCapitan = new Jugador(nombre, posicion, numeroJugador, equipo);
             capitanes.add(nuevoCapitan); 
         }
         
         //Ciclo para crear a los jugadores, el tope sera la variable "integrantes", que se obtuvo de la suma de ambos equipos.
         System.out.println("Seleccion de jugadores del equipo 1.");
          for(int i = 1; i <= integrantes; i++){
             System.out.println("---- Jugador " + i +"----\n");
             System.out.println("Ingrese el nombre: \n");
             String nombre = entrada.readLine();
             
             System.out.println("Seleccione la posicion: \na) Portero. \nb) Defensa. \nc) Centrocampista. \nd) Delantero.");
             String posicion;
             char op =  entrada.readLine().charAt(0);            
             //Metodo para obtener la posicion del jugador.
             posicion = posicionJugador(op);
             
             System.out.println("Ingrese el numero de jugador: \n");
             int numJugador = Integer.parseInt(entrada.readLine());
             //Se crea un objeto con las variables preguntadas en consola, para agregarlo a la lista con el .add
             Jugador nuevoJugador = new Jugador (nombre, posicion, numJugador, 1);
             jugadores.add(nuevoJugador);
         }
          
          //Anexo de jugadores a los equipos.
          //Para que fuera equitativo, se optó por una condicional sobre sí la variable turno era impar o par.
               int turno = 1;
               for(int x = 0; x < jugadores.size(); x++){       
                    if(turno %2 == 0){
                        System.out.println("Capitan del equipo 1 elige.");
                        Jugador enTurno = (Jugador) jugadores.get(x);
                        equipo1.add(enTurno);
                        
                    }else{
                        System.out.println("Capitan del equipo 2 elige.");
                        Jugador enTurno2 = (Jugador) jugadores.get(x);
                        equipo2.add(enTurno2);
                        
                    }
                    turno++;
               }
               
         //Imprimir lista de jugadores del equipo 1.
         System.out.println("---- Jugadores del equipo 1 ----");
         Jugador team1 = (Jugador) capitanes.get(0);
         System.out.println("Capitan del equipo 1: "+ team1.getNombre());
         for(Object jugadorActual : equipo1){
             Jugador player = (Jugador) jugadorActual;
             System.out.println("Nombre: " + player.getNombre());
             System.out.println("Equipo: " + player.getEquipo());
             System.out.println("Numero jugador: " + player.getNumeroJugador());
             System.out.println("Posicion: " + player.getPosicion() + "\n");
         }
         
         System.out.println("---- Jugadores del equipo 2 ----");
         Jugador team2 = (Jugador) capitanes.get(1);
         System.out.println("Capitan del equipo 2: "+ team2.getNombre());
          for(Object jugadorActual : equipo2){
             Jugador player = (Jugador) jugadorActual;
             System.out.println("Nombre: " + player.getNombre());
             System.out.println("Equipo: " + player.getEquipo());
             System.out.println("Numero jugador: " + player.getNumeroJugador());
             System.out.println("Posicion: " + player.getPosicion() + "\n");
         }
         
         System.out.println("¿Desea volver a iniciar? \n1) Continuar. \n2) Finalizar.");
         try{
             opcion = Integer.parseInt(entrada.readLine());
         }catch(IOException | NumberFormatException ex){
             System.out.println("Valor no numerico ingresado, intente de nuevo.");
         }
         if(opcion == 1){
             terminar = 0;
         }else if(opcion == 2){
             terminar = 5;
         }
     }while(terminar != 5);
    }
    
}

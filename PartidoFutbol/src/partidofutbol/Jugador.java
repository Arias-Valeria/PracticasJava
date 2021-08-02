
package partidofutbol;

public class Jugador {
    //Atributos del juagor. 
    private String nombre;
    private String posicion;
    private int numeroJugador;
    //
    private int equipo;
    
    //Constructor con atributos.
    public Jugador (String nombre, String posicion, int numeroJugador, int equipo){
        this.nombre = nombre;
        this.posicion = posicion;
        this.numeroJugador = numeroJugador;
        this.equipo = equipo;
    }

    public Jugador() {
    }
    
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }

    public void setEquipo(int equipo) {
        this.equipo = equipo;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }

    public int getEquipo() {
        return equipo;
    }
    
}

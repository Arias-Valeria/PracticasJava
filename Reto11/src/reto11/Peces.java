
package reto11;

public class Peces extends Animales {
    private String orden;
    private String colores;
    private String oceanos;

    public Peces(String orden, String colores, String oceanos, String nombreCientifico, String nombreComun, int promedioVida, String dieta) {
        super(nombreCientifico, nombreComun, promedioVida, dieta);
        this.orden = orden;
        this.colores = colores;
        this.oceanos = oceanos;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public String getOceanos() {
        return oceanos;
    }

    public void setOceanos(String oceanos) {
        this.oceanos = oceanos;
    }
    
    
}

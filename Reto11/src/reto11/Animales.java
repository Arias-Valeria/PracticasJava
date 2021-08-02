
package reto11;

public class Animales {
    private String nombreCientifico;
    private String nombreComun;
    private int promedioVida;
    private String dieta;

    public Animales(String nombreCientifico, String nombreComun, int promedioVida, String dieta) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
        this.promedioVida = promedioVida;
        this.dieta = dieta;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public int getPromedioVida() {
        return promedioVida;
    }

    public void setPromedioVida(int promedioVida) {
        this.promedioVida = promedioVida;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
   
    
}

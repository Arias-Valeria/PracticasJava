
package reto11;

public class Mamiferos extends Animales {
    private int altura;
    private int masaCorporal;
    private String habitat;

    public Mamiferos(int altura, int masaCorporal, String habitat, String nombreCientifico, String nombreComun, int promedioVida, String dieta) {
        super(nombreCientifico, nombreComun, promedioVida, dieta);
        this.altura = altura;
        this.masaCorporal = masaCorporal;
        this.habitat = habitat;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getMasaCorporal() {
        return masaCorporal;
    }

    public void setMasaCorporal(int masaCorporal) {
        this.masaCorporal = masaCorporal;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    
}

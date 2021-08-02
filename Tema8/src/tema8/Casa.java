
package tema8;

public class Casa {
    private String color;
    private int numeroRecamaras;
    private String direccion;
    private int numeroBanios;
    private int numeroHabitantes;
    private int numeroCasa;
    private puerta puertaEntrada;
    
    
    public Casa(){
        color = "azul";
        numeroHabitantes = 5;
        direccion = "villahermosa";
    }
    
    public Casa(int numeroCasa){
         this.numeroCasa = numeroCasa;
    }

    public Casa(String color, int numeroRecamaras, String direccion, int numeroBanios, int numeroHabitantes, int numeroCasa, puerta puertaEntrada) {
        this.color = color;
        this.numeroRecamaras = numeroRecamaras;
        this.direccion = direccion;
        this.numeroBanios = numeroBanios;
        this.numeroHabitantes = numeroHabitantes;
        this.numeroCasa = numeroCasa;
        this.puertaEntrada = puertaEntrada;
    }
    
    public Casa(puerta puertaEntrada){
        this.puertaEntrada = puertaEntrada;
    }
    
    public Casa(String direccion){
        this.direccion = direccion;
        puertaEntrada = new puerta("metal");
    }
    
    public Casa (Casa copiaCasa){
        this.color = copiaCasa.getColor();
        this.numeroRecamaras = copiaCasa.getNumeroRecamaras();
        this.direccion = copiaCasa.getDireccion();
        this.numeroBanios = copiaCasa.getNumeroBanios();
        this.numeroHabitantes = copiaCasa.getNumeroHabitantes();
        this.numeroCasa = copiaCasa.getNumeroCasa();
        this.puertaEntrada = copiaCasa.getPuertaEntrada();
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroRecamaras() {
        return numeroRecamaras;
    }

    public void setNumeroRecamaras(int numeroRecamaras) {
        this.numeroRecamaras = numeroRecamaras;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroBanios() {
        return numeroBanios;
    }

    public void setNumeroBanios(int numeroBanios) {
        this.numeroBanios = numeroBanios;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public puerta getPuertaEntrada() {
        return puertaEntrada;
    }

    public void setPuertaEntrada(puerta puertaEntrada) {
        this.puertaEntrada = puertaEntrada;
    }
    
}

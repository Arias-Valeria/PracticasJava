package Entity;

/*
 Entidades empleadas en la base de datos AUTORES.
 */
public class Autor {
    private int autor_id;
    private String autor_nombre;
    private String autor_apellidoP;
     
    //Constructor vacío
    public Autor (){
        
    }
    
    //Constructor con todos los parámetros.
    public Autor(int autor_id, String autor_nombre, String autor_apellidoP) {
        this.autor_id = autor_id;
        this.autor_nombre = autor_nombre;
        this.autor_apellidoP = autor_apellidoP;
    }
    
    //Getters and Setters (obtener y establecer información)

    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }

    public String getAutor_nombre() {
        return autor_nombre;
    }

    public void setAutor_nombre(String autor_nombre) {
        this.autor_nombre = autor_nombre;
    }

    public String getAutor_apellidoP() {
        return autor_apellidoP;
    }

    public void setAutor_apellidoP(String autor_apellidoP) {
        this.autor_apellidoP = autor_apellidoP;
    }
    
    //Convertir cualquier objeto a String.

    @Override
    public String toString() {
        return "Autor{" + "autor_id=" + autor_id + ", autor_nombre=" + autor_nombre + ", autor_apellidoP=" + autor_apellidoP + '}';
    }
    
}

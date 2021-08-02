
package temaherencia;

public class Folleto extends Publicacion{
    private String tema;

    public Folleto(String editor, int edicion, String fecha_publicacion,String tema) {
        super(editor, edicion, fecha_publicacion);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    // sobre-escribiendo
    @Override
    public void imprimeDatos(){
        super.imprimeDatos(); // imprimeDatos --> Publicacion (Padre)
        System.out.println("Se ha creado un folleto");
    }
}
//Reto 11
//Parte 1.
//Dos listas. Una de animales, cada uno de los animales vienen de la clase animal (clase padre)
// de esa clase definir tres clases hijo. Puede ser reptiles, aves, mamiferos, etc. Todos tienen nombres científicos.
//comparten ciertos atributos pero no todos.

//Parte 2. Lista de electrodomesticos.
//electrodomesticos, clase padre. Definir dos clases hijo, lavadora, plancha, etc. Definir atributos y metodos comunes.
//ArrayList e instanceOf

//Parte 3. Lista de usuarios. 
//Usuarios, clase padre. Dos clases hijos, Usuarios clientes y usuarios empleados.
//Tienda en línea.

//DOMINGO 12:00 AM.
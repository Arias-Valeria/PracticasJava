
package temaherencia;

public class Revista extends Publicacion{
    
    // codigo_barra, editorial
    private String codigo_barra;
    private String editorial;
    
    public Revista(String editor, int edicion, String fecha_publicacion, String codigo_barra,String editorial){
        super(editor,edicion,fecha_publicacion); // invocando al constructor de mi clase Publicacion
        this.codigo_barra = codigo_barra;
        this.editorial = editorial;
    }
    
    public Revista(String editor, int edicion, String fecha_publicacion){
        super(editor,edicion,fecha_publicacion);
    }
 
    
    public Revista(){}

    public String getCodigo_barra() {
        return codigo_barra;
    }

    public void setCodigo_barra(String codigo_barra) {
        this.codigo_barra = codigo_barra;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
}

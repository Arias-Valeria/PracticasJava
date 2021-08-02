
package temaherencia;

public class Publicacion {
    private String editor;
    private int edicion;
    private String fecha_publicacion;

    public Publicacion(String editor, int edicion, String fecha_publicacion) {
        this.editor = editor;
        this.edicion = edicion;
        this.fecha_publicacion = fecha_publicacion;
    }
    
    public Publicacion(){
    }
    
    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }
    
    public void imprimeDatos(){
        System.out.println("Se ha creado una publicación");
    }
}


package Test;

import Bussines_Object.AutorBO;
import Entity.Autor;

/**
 *
 * @author Valeria
 */
public class Test {
    AutorBO autBo = new AutorBO();
    Autor aut = new Autor();
    String mensaje = "";
    
    public void insertarAutor(){
        aut.setAutor_nombre("Tulio");
        aut.setAutor_apellidoP("Triviño");
        mensaje = autBo.agregarAutor(aut);
        System.out.println(mensaje);
    }
    
     public void modificarAutor(){
         aut.setAutor_id(2);
        aut.setAutor_nombre("Juanin");
        aut.setAutor_apellidoP("Harry");
        mensaje = autBo.modificarAutor(aut);
        System.out.println(mensaje);
    }
     
     public void eliminarAutor(){
        mensaje = autBo.eliminarAutor(1);
        System.out.println(mensaje);
    }
    
    public static void main(String[] args) {
        Test prueba = new Test();
        //prueba.insertarAutor();
        //prueba.modificarAutor();
        prueba.eliminarAutor();
    }
}

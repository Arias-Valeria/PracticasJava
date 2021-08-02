
package Bussines_Object;

import Data_Access_Object.AutorDAO;
import Data_Base.Conection;
import Entity.Autor;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author Valeria
 */
public class AutorBO {
    private String mensaje = "";
    private AutorDAO autDao = new AutorDAO();
    
    public String agregarAutor(Autor aut){
        Connection conn = Conection.getConnection();
        try {
            mensaje = autDao.agregarAutor(conn, aut);
            conn.rollback();
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
     
    public String modificarAutor(Autor aut){
        Connection conn = Conection.getConnection();
        try {
            mensaje = autDao.modificarAutor(conn, aut);
            conn.rollback();
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public String eliminarAutor(int id_autor){
        Connection conn = Conection.getConnection();
        try {
            mensaje = autDao.eliminarAutor(conn, id_autor);
            conn.rollback();
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
     
    public void listarAutores(JTable tabla){
        Connection conn = Conection.getConnection();
        autDao.listarAutores(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public int getAutorId (){
        Connection conn = Conection.getConnection();
        int id = autDao.getAutorId(conn);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id;
    }
}

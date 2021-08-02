
package Data_Access_Object;

import Entity.Autor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Valeria
 */
public class AutorDAO {
    private String mensaje = "";
    public String agregarAutor(Connection con, Autor aut){
        PreparedStatement pst = null;
        String sql = "INSERT INTO AUTORES (ID_AUTOR, NOMBRE, APELLIDO_PATERNO) "
                    + "VALUES (?, ?, ?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, aut.getAutor_id());
            pst.setString(2, aut.getAutor_nombre());
            pst.setString(3, aut.getAutor_apellidoP());
            mensaje = "Los datos han sido guardados correctamente.";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "Error, los datos no se guardaron. \n " + e.getMessage();
        }
        return mensaje;
    }
     
    public String modificarAutor(Connection con, Autor aut){
        PreparedStatement pst = null;
        String sql = "UPDATE AUTORES SET NOMBRE = ?, APELLIDO_PATERNO = ? "
                + "WHERE ID_AUTOR = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, aut.getAutor_nombre());
            pst.setString(2, aut.getAutor_apellidoP());
            pst.setInt(3, aut.getAutor_id());
            mensaje = "Los datos han sido modificados.";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "No se ha podido modificar los datos. \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String eliminarAutor(Connection con, int id_autor){
        PreparedStatement pst = null;
        String sql = "DELETE FROM AUTORES WHERE ID_AUTOR = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id_autor);
            mensaje = "Los datos se eliminaron";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "No se ha podido eliminar los datos. \n " + e.getMessage();
        }
        return mensaje;
    }
     
    public void listarAutores(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID_AUTOR", "NOMBRE", "APELLIDO_PATERNO"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM AUTORES ORDER BY ID_AUTOR";
        String [] filas = new String [3];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {                
                for (int i = 0; i < 3; i++) {
                    filas[i] = rs.getNString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pueden mostrar los datos.");
        }
    }
    
    public int getAutorId (Connection con){
        int id = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT MAX(ID_AUTOR+1) as id FROM AUTORES";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                id = rs.getInt(1);
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error al mostrar el id. "+e.getMessage());
        }
        return id;
    }
}

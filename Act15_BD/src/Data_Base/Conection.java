package Data_Base;
//Conexión a la base de datos AUTORES.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conection {
    private static Connection conn = null;
    private static String nombre_usuario = "SYSTEM";
    private static String contraseña = "Wuxian";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    
    //Método de la representación de la conexión
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, nombre_usuario, contraseña);
            conn.setAutoCommit(false);
            if(conn != null){
                System.out.println("Se ha establecido la conexión de manera exitosa.");
            }else{
                System.out.println("La conexión no ha podido establecerse.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido establecer la conexion: " + e.getMessage());
        }
        return conn;
    }
    
    //Desconectarse de la bsse de datos.
    public void desconexion (){
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error, no es posible desconectarse de la base de datos." + e.getMessage());
        }
    }
    
    //Probar la conexión.
    public static void main(String[] args) {
        Conection c = new Conection();
        c.getConnection();
    }
}

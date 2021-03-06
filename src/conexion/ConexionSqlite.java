package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSqlite {
    String url = "C:\\Users\\intel\\Documents\\Tarea de Objetos\\personas.db";
    Connection connect;
    
    public Connection getConnect(){
    try {
        connect = DriverManager.getConnection("jdbc:sqlite:"+url);
        if (connect!=null) {
            System.out.println("Conectado");
        }
    }catch (SQLException ex) {
        System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
    }
    return connect;
    }
    
    
    
    public void close(){
           try {
               connect.close();
           } catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
    }
    
    public static void main(String[] args) {
        ConexionSqlite c= new  ConexionSqlite();
        c.getConnect();
        
    }
    
    
    
}
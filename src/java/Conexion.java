package modelo;


import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    Connection con;
    public Connection getConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:1527/DIEGOMAXTER","diegomaxter","98060259887");
        } catch (Exception e) {
        
        }
    return con;
    }

}

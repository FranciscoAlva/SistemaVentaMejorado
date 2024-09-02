package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author maygr
 */
public class Conexion {
    
    Connection con;

    //conexion local
    public static Connection conectar (){    
        try{            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistemaventamejorado", "sistemaventa1", "sistemaventa1");
            return cn;            
        }catch (SQLException e) {
            System.out.println("ERROR EN LA CONEXION LOCAL " + e);
        }
        return null;
    }
}

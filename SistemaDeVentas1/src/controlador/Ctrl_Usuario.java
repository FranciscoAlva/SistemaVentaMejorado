package controlador;

import conexion.Conexion;
import java.sql.Connection;
import modelo.Usuario;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author maygr
 */
public class Ctrl_Usuario {

    //METODO PARA INICIAR SESION
    public boolean loginUser(Usuario objeto) {

        boolean respuesta = false;
        Connection cn = Conexion.conectar();
         String sql = "SELECT * FROM usuario WHERE usuario = '" + objeto.getUsuario() + "' AND password = '" + objeto.getPassword() + "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("ERROR AL INICIAR SESION");
            JOptionPane.showMessageDialog(null, "ERROR AL INICIAR SESION");
        }        
        return respuesta;
    }
}

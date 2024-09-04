package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Categoria;

/**
 *
 * @author maygr
 */
public class Ctrl_Categoria {

    /**
     * **************************************************
     * metodo para guardar una nueva categoria
     * **************************************************
     */
    public boolean guardar(Categoria objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("INSERT INTO categoria VALUES(?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("ERROR AL GUARDAR: " + e);
        }

        return respuesta;
    }

    /**
     * ********************************************************************
     * metodo para consultar si la categoria registrado ya existe
     * ********************************************************************
     */
    public boolean existeCategoria(String categoria) {
        boolean respuesta = false;
        String sql = "SELECT descripcion FROM categoria WHERE descripcion = '" + categoria + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar cartegoria: " + e);
        }
        return respuesta;
    }

}

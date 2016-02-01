
package pe.egcc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class AccesoDB {

    public AccesoDB() {
    }
    
    public final static Connection getConnection() throws SQLException{
        // Objeto Connection
        Connection cn=null;
        // Parametros para la conexión JDBC
        String driver = "oracle.jdbc.OracleDriver";
        String urlDB = "jdbc:oracle:thin:@172.17.3.126:1521:XE";
        String user = "uni";
        String pass = "uni";
        // Proceso
        try {
        //cargar el driver
            Class.forName(driver).newInstance();
        //Realizar la conexion
            cn = DriverManager.getConnection(urlDB, user, pass);
        } 
        catch (ClassNotFoundException e){
            throw new SQLException("No se ha encontrado el driver.");
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("No se tiene acceso al servidor.");
        }
        
        // Retornar conexión
        return cn;
    }
}


package pe.egcc.eurekaapp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class AccesoDB {

    public AccesoDB() {
    }
    /*
    Retorna un objeto Connection con la conexion establecida a la base de datos.
    SQLException Si se produce un error lanza el mensaje con el mensaje respectivo
    */
    public final static Connection getConnection() throws SQLException{
        // Objeto Connection
        Connection cn=null;
        // Parametros para la conexión JDBC
        String driver = "oracle.jdbc.OracleDriver";
        String urlDB = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "eureka";
        String pass = "admin";
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

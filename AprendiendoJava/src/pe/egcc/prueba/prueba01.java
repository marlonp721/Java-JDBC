
package pe.egcc.prueba;

import java.sql.Connection;
import java.sql.DriverManager;

public class prueba01 {

    public static void main(String[] args) {
        // Parametros para la conexion con JDBC
        String driver = "oracle.jdbc.OracleDriver";
        String urlDB = "jdbc:oracle:thin:@172.17.3.126:1521:XE";
        String user = "uni";
        String pass = "uni";
        
        try {
        //cargar el driver
            Class.forName(driver).newInstance();
        //realizar la conexion
            Connection cn;
            cn = DriverManager.getConnection(urlDB, user, pass);
        //Mensaje
            System.out.println("Conexión correcta");
            cn.close();
        } 
        catch (ClassNotFoundException e){
            System.out.println("ERROR: No se encontro el driver. ");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

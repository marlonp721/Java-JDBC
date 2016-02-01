
package pe.egcc.eurekaapp.controller;

public class LogonController {

    public void validar(String usuario, String clave) {
        if (!usuario.equals("gustavo")) {
            throw new RuntimeException("Datos incorrectos. ");
        }
    }
    
}

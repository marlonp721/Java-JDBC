
package pe.egcc.eurekaapp.controller;

import pe.egcc.eurekaapp.service.LogonService;

public class LogonController {

    public void validar(String usuario, String clave) {
        LogonService logonService;
        logonService = new LogonService();
        logonService.validar(usuario, clave);
    }
    
}

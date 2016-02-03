/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eurekaapp.controller;

import pe.egcc.eurekaapp.domain.EmpleadoBean;
import pe.egcc.eurekaapp.service.CuentaService;
import pe.egcc.eurekaapp.util.Memoria;

/**
 *
 * @author Alumno
 */
public class CuentaController {
    public void registrarDeposito(String cuenta, double importe){
        // Empleado
        EmpleadoBean bean = (EmpleadoBean) Memoria.get("usuario");
        CuentaService service = new CuentaService();
        service.registrarDeposito(cuenta, importe,bean.getCodigo());
    }
}

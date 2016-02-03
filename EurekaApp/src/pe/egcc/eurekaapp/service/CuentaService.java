/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eurekaapp.service;

import pe.egcc.eurekaapp.dao.espec.CuentaDaoEspec;
import pe.egcc.eurekaapp.dao.impl.CuentaDaoImpl;

/**
 *
 * @author Alumno
 */
public class CuentaService {
    
    public void registrarDeposito(String cuenta, double importe, String codEmp){
        if (cuenta == null || cuenta.isEmpty()) {
            throw new RuntimeException("La cuenta no puede esta vacía.");
        }
        if (codEmp == null || codEmp.isEmpty()) {
            throw new RuntimeException("Falta el codigo del empleado.");
        }
        if (importe<= 0) {
            throw new RuntimeException("El import es incorrecto.");
        }
        CuentaDaoEspec cuentaDao;
        cuentaDao = new CuentaDaoImpl();
        cuentaDao.registrarDeposito(cuenta, importe, codEmp);
    }
    
}

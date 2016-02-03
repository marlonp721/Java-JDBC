
package pe.egcc.eurekaapp.dao.espec;

/**
 *
 * @author Alumno
 */
public interface CuentaDaoEspec {
    //definimos los servicios
    /*
    
    Este meotodo implemente el servicio para registrar un deposito
    
    cuenta Código de la cuenta
    importe Importe a depositar
    codEmp Codigo del empleado que ejecuta la operacion
    */
    
    void registrarDeposito(String cuenta,double importe,String codEmp);
    
}

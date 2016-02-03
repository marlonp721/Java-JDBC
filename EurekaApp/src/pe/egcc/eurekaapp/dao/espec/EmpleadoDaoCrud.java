
package pe.egcc.eurekaapp.dao.espec;

import pe.egcc.eurekaapp.domain.EmpleadoBean;

//Definicion del CRUD para la tabla EMPLEADO

public interface EmpleadoDaoCrud extends AbstractCrud<EmpleadoBean>{
    /*
    Se trata de un metodo adicional a los definidos en el CRUD.
    Valida un usario en la base de datos. Usuario y Clave
    @param usuario Cuenta de usuario
    @param clave Clave del usuario
    @return si los parámetros son correctos retorna el bean el empleado, caso contrario
    
    */
    
    EmpleadoBean validar(String usuario, String clave);
}

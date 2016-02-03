/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eurekaapp.dao.espec;

import java.util.List;

/**
 *Definicion generica del crud
 * @author Alumno
 */
public interface AbstractCrud<T>{
    T traerPorCodigo(String codigo);
    
    List<T> traerLista(T bean);
    
    void insertar(T bean);
    
    void actualizar(T bean);
    
    void eliminar(String codigo);
    
    
    
}

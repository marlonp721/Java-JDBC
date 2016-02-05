/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eurekaapp.dao.impl;

import java.util.List;
import pe.egcc.eurekaapp.dao.espec.ClienteDaoCrud;
import pe.egcc.eurekaapp.domain.ClienteBean;

/**
 *Esta clase implementa el CRUD de la tabla cliente
 * @author Alumno
 */
public class ClienteDaoImpl implements ClienteDaoCrud{

    @Override
    public ClienteBean traerPorCodigo(String codigo) {
        return null;
    }

    @Override
    public List<ClienteBean> taerLista(ClienteBean bean) {
        return null;
    }

    @Override
    public void insertar(ClienteBean bean) {
        
    }

    @Override
    public void actualizar(ClienteBean bean) {
        
    }

    @Override
    public void eliminar(String codigo) {
        
    }
    
}

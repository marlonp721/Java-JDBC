/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eurekaapp.service;

import java.util.List;
import pe.egcc.eurekaapp.dao.espec.ClienteDaoCrud;
import pe.egcc.eurekaapp.dao.impl.ClienteDaoImpl;
import pe.egcc.eurekaapp.domain.ClienteBean;

/**
 *
 * @author Alumno
 */
public class ClienteService {

    private ClienteDaoCrud clienteDao;

  public ClienteService() {
    clienteDao = new ClienteDaoImpl();
  }
  
  public List<ClienteBean> traerClientes(ClienteBean bean) {
    return clienteDao.taerLista(bean);
  }
    
}

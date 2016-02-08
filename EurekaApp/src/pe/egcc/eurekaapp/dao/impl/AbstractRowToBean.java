/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eurekaapp.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public abstract class AbstractRowToBean<T> {
    protected abstract T rowToBean(ResultSet rs) throws SQLException;
}

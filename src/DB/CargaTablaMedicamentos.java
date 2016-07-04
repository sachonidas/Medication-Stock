/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import medicationstock.tablaMedicamentos;

/**
 *
 * @author Usuario
 */
public class CargaTablaMedicamentos {
    
    public tablaMedicamentos tabla = new tablaMedicamentos();
    
    public void cargaTabla(){
        
        Conexion conectar = new Conexion();        
        Statement st;
        try {
            st = conectar.getConnection().createStatement();
            String sql = "create table if not exists medicamentos "
                    + "(id      )";
        } catch (SQLException ex) {
        }
    }
    
}

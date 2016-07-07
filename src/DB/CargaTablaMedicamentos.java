/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Acciones.Medicamento;
import java.sql.SQLException;
import java.sql.Statement;
import Vista.tablaMedicamentos;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
            String sql = "create table if not exists medicamentos"+
                    "(ID    INTEGER PRIMARY KEY NOT NULL,"+
                    " MEDICAMENTO       TEXT    NOT NULL,"+
                    " DOSIS             TEXT    NOT NULL,"+
                    " CANTIDAD          TEXT    NOT NULL,"+
                    " MAXIMO            TEXT    NOT NULL,"+
                    " MINIMO            TEXT    NOT NULL)";
            st.executeQuery(sql);
            st.close();
            conectar.desconexion();
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(tabla, "Error tabla medicamentos \n"+ex);
            
        }
    }
    
    public void insertaMedicamento(Medicamento medicamento){
        
        Conexion conectar = new Conexion();        
        Statement st;
        
        try {
            conectar.conectarBD();
            st = conectar.getConnection().createStatement();
            String sql = "insert into medicamentos (nombre, dosis, cantidad, maximo, minimo) "
                    + "values('"+medicamento.getNombreMedicamento()+"'"
                    + ",'"+medicamento.getDosisMedicamento()+"'"
                    + ",'"+medicamento.getCantidadMedicamento()+"'"
                    + ",'"+medicamento.getMaximoMedicamento()+"'"
                    + ",'"+medicamento.getMinimoMedicamento()+"')";
                
            st.executeUpdate(sql);
            st.close();
            conectar.desconexion();
            
        } catch (SQLException ex) {
            Logger.getLogger(CargaTablaMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void modificaMedicamento(Medicamento medicamento){
        
        Conexion conectar = new Conexion();        
        Statement st;
        
        try {
            conectar.conectarBD();
            st = conectar.getConnection().createStatement();
            //int cantidad = comando.executeUpdate("UPDATE articulos SET nombre='"+producto.getDescripcionProducto()+"',precio='"+producto.getPrecioProducto()+"' WHERE codigo='"+producto.getCodigoProducto()+"'");

            int cantidad = st.executeUpdate("update medicamentos set nombre = '"+medicamento.getNombreMedicamento()+"'"
                    + ", dosis = '"+medicamento.getDosisMedicamento()+"'"
                    + ", cantidad = '"+medicamento.getCantidadMedicamento()+"'"
                    + ", maximo = '"+medicamento.getMaximoMedicamento()+"'"
                    + ", minimo = '"+medicamento.getMinimoMedicamento()+"'"
                    + " where nombre = '"+medicamento.getNombreMedicamento()+"'");
            if (cantidad == 1) {
                JOptionPane.showMessageDialog(tabla, "Medicamento modificado");
            }else{
                JOptionPane.showMessageDialog(tabla, "Medicamento NO modificado");
            }
                
            st.close();
            conectar.desconexion();
            
        } catch (SQLException ex) {
            Logger.getLogger(CargaTablaMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

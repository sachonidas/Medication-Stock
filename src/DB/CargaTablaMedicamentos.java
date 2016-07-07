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
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CargaTablaMedicamentos {
    
    
    public void cargaTabla(){
        
        Conexion conectar = new Conexion();        
        Statement st;
        try {
            conectar.conectarBD();
            st = conectar.getConnection().createStatement();
            //PONER VALOR AUTOINCREMENT EN EL ID!
            String sql = "create table if not exists medicamentos"+
                    "(ID    INTEGER PRIMARY KEY NOT NULL,"+
                    " NOMBRE            TEXT    NOT NULL,"+
                    " DOSIS             TEXT    NOT NULL,"+
                    " CANTIDAD          TEXT    NOT NULL,"+
                    " MAXIMO            TEXT    NOT NULL,"+
                    " MINIMO            TEXT    NOT NULL)";
            st.execute(sql);
            st.close();
            conectar.desconexion();
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error tabla medicamentos \n"+ex);
            
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
            
            JOptionPane.showMessageDialog(null, "Medicamento creado");
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
                JOptionPane.showMessageDialog(null, "Medicamento modificado");
            }else{
                JOptionPane.showMessageDialog(null, "Medicamento NO modificado");
            }
                
            st.close();
            conectar.desconexion();
            
        } catch (SQLException ex) {
            Logger.getLogger(CargaTablaMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void modificaLimites(Medicamento medicamento){
        
        Conexion conectar = new Conexion();        
        Statement st;
        
        try {
            conectar.conectarBD();
            st = conectar.getConnection().createStatement();
            //int cantidad = comando.executeUpdate("UPDATE articulos SET nombre='"+producto.getDescripcionProducto()+"',precio='"+producto.getPrecioProducto()+"' WHERE codigo='"+producto.getCodigoProducto()+"'");

            int cantidad = st.executeUpdate("update medicamentos set maximo = '"+medicamento.getMaximoMedicamento()+"'"
                    + ", minimo = '"+medicamento.getMinimoMedicamento()+"'"
                    + " where nombre = '"+medicamento.getNombreMedicamento()+"'");
            if (cantidad == 1) {
                JOptionPane.showMessageDialog(null, "Medicamento modificado");
            }else{
                JOptionPane.showMessageDialog(null, "Medicamento NO modificado");
            }
                
            st.close();
            conectar.desconexion();
            
        } catch (SQLException ex) {
            Logger.getLogger(CargaTablaMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void borraMedicamento(Medicamento medicamento){
        
        Conexion conectar = new Conexion();        
        Statement st;
        
        try {
            conectar.conectarBD();
            st = conectar.getConnection().createStatement();
            st.executeUpdate("delete from medicamentos where nombre = '"+medicamento.getNombreMedicamento()+"'");
            JOptionPane.showMessageDialog(null, "Medicamento borrado!");
            st.close();
            conectar.desconexion();
            
        } catch (SQLException ex) {
            Logger.getLogger(CargaTablaMedicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void consultaMedicamentos(){
        
        tablaMedicamentos medicamentos = new tablaMedicamentos();
        
        Conexion conectar = new Conexion();        
        Statement st;
        try {
            conectar.conectarBD();
            st = conectar.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM medicamentos");
        while(rs.next()){
            medicamentos.datos[0]=rs.getString(1);
            medicamentos.datos[1]=rs.getString(2);
            medicamentos.datos[2]=rs.getString(3);
            medicamentos.datos[3]=rs.getString(4);
            medicamentos.modelo.addRow(medicamentos.datos);
        }
        medicamentos.tblMedicamentos.setModel(medicamentos.modelo);
        conectar.desconexion();
        rs.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, null, WIDTH);
            
        }
    }
    
}
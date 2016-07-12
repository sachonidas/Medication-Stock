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
            String sql = "create table if not exists medicamentos"+
                    "(ID    INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,"+
                    " NOMBRE            TEXT    NOT NULL,"+
                    " DOSIS             TEXT    NOT NULL,"+
                    " CANTIDAD          TEXT    NOT NULL,"+
                    " MAXIMO            TEXT    NOT NULL,"+
                    " MINIMO            TEXT    NOT NULL,"+
                    " COMENTARIO        TEXT    NOT NULL,"+
                    " CADUCIDAD         TEXT    NOT NULL)";
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
            String sql = "insert into medicamentos (nombre, dosis, cantidad, maximo, minimo,comentario, caducidad)"
                    + "values('"+medicamento.getNombreMedicamento()+"'"
                    + ",'"+medicamento.getDosisMedicamento()+"'"
                    + ",'"+medicamento.getCantidadMedicamento()+"'"
                    + ",'"+medicamento.getMaximoMedicamento()+"'"
                    + ",'"+medicamento.getMinimoMedicamento()+"'"
                    + ",'"+medicamento.getComentarioMedicamento()+"'"
                    + ",'"+medicamento.getFechaCaducidad()+"')";
                
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
                    + ", caducidad = '"+medicamento.getFechaCaducidad()+"'"
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
            
            medicamentos.datos[0]=rs.getString(1); //ID
            medicamentos.datos[1]=rs.getString(2); //NOMBRE
            medicamentos.datos[2]=rs.getString(3); //DOSIS
            medicamentos.datos[3]=rs.getString(4); //CANTIDAD
            medicamentos.datos[4]=rs.getString(5); //MAXIMO
            medicamentos.datos[5]=rs.getString(6); //MINIMO
            medicamentos.datos[6]=rs.getString(7); //COMENTARIO
            medicamentos.datos[6]=rs.getString(7); //CADUCIDAD

            medicamentos.modelo.addRow(medicamentos.datos);
        }
        
        medicamentos.tblMedicamentos.setModel(medicamentos.modelo);
        conectar.desconexion();
        rs.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, null, WIDTH);
            
        }
    }
    
    Medicamento medicamento;
    
    public void entradaMedicamentos(String cantidad, String nombre){
        
        medicamento = new Medicamento();
        Conexion conectar = new Conexion();        
        Statement st;
        
        try {
            conectar.conectarBD();
            st = conectar.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM medicamentos where nombre='"+nombre+"'");
        while(rs.next()){
            
            medicamento.setNombreMedicamento(rs.getString(2));//NOMBRE
            medicamento.setDosisMedicamento(rs.getString(3)); //DOSIS
            medicamento.setCantidadMedicamento(rs.getString(4)); //CANTIDAD
            medicamento.setMaximoMedicamento(rs.getString(5)); //MAXIMO
            medicamento.setMinimoMedicamento(rs.getString(6)); //MINIMO
            break;
        }
        
        
        int cantidadActual = Integer.valueOf(medicamento.getCantidadMedicamento());
        JOptionPane.showMessageDialog(null, cantidadActual);
        int cantidadEntrada = Integer.valueOf(cantidad);
        JOptionPane.showMessageDialog(null, cantidadEntrada);
        int cantidadFinal = cantidadActual + cantidadEntrada;
        String cantidadActualizada = String.valueOf(cantidadFinal);
        JOptionPane.showMessageDialog(null, cantidadFinal);
        medicamento.setCantidadMedicamento(cantidadActualizada);
        
        
        st = conectar.getConnection().createStatement();
        String sql = "update medicamentos set cantidad = '"+medicamento.getCantidadMedicamento()+"'"
                    + " where nombre = '"+medicamento.getNombreMedicamento()+"'";
        st.executeUpdate(sql);
//            modificaMedicamento(medicamento);
        
        conectar.desconexion();
        rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, null, WIDTH);
            
        }
    }
    
    public void salidaMedicamentos(){
        
        String []datos = new String[6];
        Conexion conectar = new Conexion();        
        Statement st;
        try {
            conectar.conectarBD();
            st = conectar.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM medicamentos");
        while(rs.next()){
            
            datos[0]=rs.getString(1); //ID
            datos[1]=rs.getString(2); //NOMBRE
            datos[2]=rs.getString(3); //DOSIS
            datos[3]=rs.getString(4); //CANTIDAD
            datos[4]=rs.getString(5); //MAXIMO
            datos[5]=rs.getString(6); //MINIMO
        }
        
        conectar.desconexion();
        rs.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, null, WIDTH);
            
        }
    }
    
    /*public void verificaCaducidad(String fechaComprueba){
        String []datos = new String[6];
        Conexion conectar = new Conexion();        
        Statement st;
        
        try {
            conectar.conectarBD();
            st = conectar.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM medicamentos");
            while(rs.next()){
                for (int i = 1; i < datos.length; i++) {
                    datos[i-1] = rs.getString("CADUCIDAD");
                }
                
            }
            conectar.desconexion();
            rs.close();
        } catch (Exception e) {
        }
        for (int i = 0; i < datos.length; i++) {
            if (datos[i].equals(fechaComprueba)) {
                JOptionPane.showMessageDialog(null, "Medicamento a punto de caducar");
            }
        }
    }*/
    
}

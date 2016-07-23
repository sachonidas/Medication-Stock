/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Acciones.Entradas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author l.arancibia
 */
public class TablaEntradas {
    
    public void cargaTabla(){
        
        Conexion conectar = new Conexion();        
        Statement st;
        try {
            conectar.conectarBD();
            st = conectar.getConnection().createStatement();
            //PONER VALOR AUTOINCREMENT EN EL ID!
            String sql = "create table if not exists entradas"+
                    "(ID    INTEGER PRIMARY KEY NOT NULL,"+
                    " FECHA             TEXT    NOT NULL,"+
                    " NOMBRE            TEXT    NOT NULL,"+
                    " CANTIDAD          TEXT    NOT NULL,"+
                    " CADUCIDAD         TEXT    NOT NULL)";
            st.execute(sql);
            st.close();
            conectar.desconexion();
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error tabla medicamentos \n"+ex);
            
        }
    }
    
    public void insertaEntrada(Entradas entradas){
        
        Conexion conectar = new Conexion();
        Statement st;
        try {
            conectar.conectarBD();
            st = conectar.getConnection().createStatement();
            String sql = "insert into entradas (FECHA, NOMBRE, CANTIDAD, CADUCIDAD)  values ('"+entradas.getFechaEntrada()+"','"+entradas.getNombreMediamento()+"','"+entradas.getCantidadEntrada()+"', '"+entradas.getFechaCaducidad()+"')";
            st.executeUpdate(sql);
            st.close();
            conectar.desconexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Entradas: "+e);
        }
        
    }
    public void verificaCaducidad(String fechaComprueba){
        String []datos = new String[6];
        String []caducados = new String[60];
        Conexion conectar = new Conexion();        
        Statement st;
        
        try {
            conectar.conectarBD();
            st = conectar.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM entradas");
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
            if (datos[i].equals("mes")) {
                
                JOptionPane.showMessageDialog(null, "Medicamento a punto de caducar");
            }
        }
    }
    
    
}

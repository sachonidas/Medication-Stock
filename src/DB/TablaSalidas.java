/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Acciones.Salidas;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author l.arancibia
 */
public class TablaSalidas {
    
    public void cargaTabla(){
        
        Conexion conectar = new Conexion();        
        Statement st;
        try {
            conectar.conectarBD();
            st = conectar.getConnection().createStatement();
            //PONER VALOR AUTOINCREMENT EN EL ID!
            String sql = "create table if not exists salidas"+
                    "(ID    INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,"+
                    " FECHA             TEXT    NOT NULL,"+
                    " NOMBRE            TEXT    NOT NULL,"+
                    " CANTIDAD          TEXT    NOT NULL,"+
                    " COMENTARIO        TEXT    NOT NULL)";
            st.execute(sql);
            st.close();
            conectar.desconexion();
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error tabla medicamentos \n"+ex);
            
        }
    }
    
    public void insertaSalida(Salidas salidas){
        
        Conexion conectar = new Conexion();
        Statement st;
        try {
            conectar.conectarBD();
            st = conectar.getConnection().createStatement();
            String sql = "insert into salidas (FECHA, NOMBRE, CANTIDAD, COMENTARIO)  values ('"+salidas.getFechaSalida()+"','"+salidas.getNombreMediamento()+"','"+salidas.getCantidadSalida()+"','"+salidas.getComentarioSalida()+"')";
            st.executeUpdate(sql);
            st.close();
            conectar.desconexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Saldias: "+e);
        }
        
    }
    
}

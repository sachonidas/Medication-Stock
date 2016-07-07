/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;


import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



/**
 *
 * @author Luis Sacha Arancibia Bazan
 */
public class Conexion {

    Connection conectar;
    
    
    public Conexion(){
    }
    
    public void conectarBD(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bd1","root","");
            //Mensaje opcional que certifica que te has conectado a la base de datos.
//            JOptionPane.showMessageDialog(null, "Conectado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        }
        
    }
    public Connection getConnection(){
        return conectar;
    }
    public void desconexion(){
        conectar = null;
    }
    
}

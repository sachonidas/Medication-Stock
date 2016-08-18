/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;


import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Luis Sacha Arancibia Bazan
 */
public class Conexion {

    Connection conectar = null;
    Statement st = null;    
    String PASS = "";
    public Conexion(){
    }
    
    public void conectarBD(){
        
       try {
            Class.forName("org.sqlite.JDBC");
        
        }
        catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }	 
        try {
            conectar = DriverManager.getConnection("jdbc:sqlite:medicacion.db;create = true");
            st = conectar.createStatement();
            System.out.println("Conexion");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    public Connection getConnection(){
        return conectar;
    }
    public void desconexion(){
        conectar = null;
    }
    
}

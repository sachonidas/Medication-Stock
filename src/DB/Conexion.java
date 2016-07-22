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

    Connection conectar = null;
    Statement st = null;    
    String PASS = "";
    public Conexion(){
    }
    
    public void conectarBD(){
        
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306","root",PASS);
            //Mensaje opcional que certifica que te has conectado a la base de datos.
//            JOptionPane.showMessageDialog(null, "Conectado!");
            st = conectar.createStatement();
            String sql = "CREATE DATABASE IF NOT EXISTS bd1";
            st.executeUpdate(sql);
            String sql1 = "USE bd1";
            st.executeUpdate(sql1);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+ e);
            e.printStackTrace();
        }
        
    }
    public Connection getConnection(){
        return conectar;
    }
    public void desconexion(){
        conectar = null;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo01
 */
    abstract public class Conexion {
    
    Connection connect= null; 

    public static String URL = "jdbc:mysql://localhost:3306/proyecto";
    public static String USER = "root";
    public static String CLAVE = "";

    public Connection getConexion() {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL,USER,CLAVE);
            System.out.println("Conexion exitosa");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error" + e.getMessage());
        
        } catch (ClassNotFoundException x){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,x);
        }
        return con;
    }
}


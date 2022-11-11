/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.sql.CallableStatement;
import Conector.Conexion;
import interfaz.CRUD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;

/**
 *
 * @author SENA
 */
public class crudpersona extends Conexion implements CRUD {

    
    @Override
    public boolean mostrar(int id, String nombre, String apellidos, String Cargo, String fecha, String Hr_entrada, String Hr_salida) {

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call mostrar()}";
        boolean response = false;

        try {
            cst = con.prepareCall(sql);
            rs = cst.executeQuery();
            response = rs.next();
            if (response) {
                do {
                    System.out.println("Id: " + rs.getString(1));
                    System.out.println("Nombre: " + rs.getString(2));
                    System.out.println("Apellidos: " + rs.getString(3));
                    System.out.println("fecha: " + rs.getString(4));
                    System.out.println("entrada: " + rs.getString(5));
                    System.out.println("salida: " + rs.getString(6));
                } while (rs.next());
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {

            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    @Override
    public boolean registro_1(int Id, String Nombres,String Apellidos,String Cargo,String Fecha,String Hora) {

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call Registro(?,?,?,?,?,?)}";

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, Id);
            cst.setString(2, Nombres);
            cst.setString(3, Apellidos);
            cst.setString(4, Cargo);
            cst.setString(5, Fecha);
            cst.setString(6, Hora);
            cst.execute();

            return true;

        } catch (SQLException e) {

            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
                return false;
            }
        }

    }

    @Override
    public boolean registro_2(int Id, String Hora) {
        
        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call Registro_2(?,?)}";

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, Id);
            cst.setString(2, Hora);
            cst.execute();

            return true;

        } catch (SQLException e) {

            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
                return false;
            }
        }
    }

}

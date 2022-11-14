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
    public boolean registro_entrada(int Id, String Nombres, String Apellidos, String Rol, String Fecha, String Hora) {

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call entrada_de_personas(?,?,?,?,?,?)}";

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, Id);
            cst.setString(2, Nombres);
            cst.setString(3, Apellidos);
            cst.setString(4, Rol);
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
    public boolean registro_Estudiantes(int Id, String Nombres, String Apellidos, String Rol) {
        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call Guardar_estudiantes(?,?,?,?)}";

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, Id);
            cst.setString(2, Nombres);
            cst.setString(3, Apellidos);
            cst.setString(4, Rol);
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
    public boolean registro_Profesores(int Id, String Nombres, String Apellidos, String Rol) {
        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call Guardar_Profesores(?,?,?,?)}";

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, Id);
            cst.setString(2, Nombres);
            cst.setString(3, Apellidos);
            cst.setString(4, Rol);
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
    public boolean registro_Per_Aseo(int Id, String Nombres, String Apellidos, String Rol) {

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call Guardar_Per_Aseo(?,?,?,?)}";

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, Id);
            cst.setString(2, Nombres);
            cst.setString(3, Apellidos);
            cst.setString(4, Rol);
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
    public boolean mostrar_Estudiante(int Id, String Nombre, String Apellidos, String Rol) {

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call mostrar(?)}";
        boolean response = false;

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, Id);
            rs = cst.executeQuery();
            response = rs.next();
            if (response) {
                do {
                    rs.getString(2);
                    rs.getString(3);
                    rs.getString(4);

                    Controllador.Controllador.Validacion.txtNombres.setText(rs.getString(2));
                    Controllador.Controllador.Validacion.txtApellidos.setText(rs.getString(3));
                    Controllador.Controllador.Validacion.txtRol.setText(rs.getString(4));
                } while (rs.next());

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
        return false;
    }

    @Override
    public boolean registro_entrada_2(int Id, String Nombres, String Apellidos, String Rol, String Fecha, String Hora) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.sql.CallableStatement;
import Conector.Conexion;
import static Controllador.Controllador.Reporte;
import interfaz.CRUD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.util.ArrayList;
import Modelos.Profesores;

/**
 *
 * @author SENA
 */
public class crudpersona extends Conexion implements CRUD {

    /*
    REGISTRO DE INFORMACION EN LA BASE DE DATOS
     */
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
    public boolean registro_Extras(int Id, String Nombres, String Apellidos, String Rol) {

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call Guardar_Extras(?,?,?,?)}";

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
    public boolean registro_entrada(int Id, String Fecha, String Hora) {
        boolean sw = false;
        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call entrada_de_personas(?,?,?)}";

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, Id);
            cst.setString(2, Fecha);
            cst.setString(3, Hora);
            cst.execute();

            sw = true;

        } catch (SQLException e) {

            System.err.println(e);
            sw = true;
        } finally {
            try {
                con.close();

            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return sw;
    }

    @Override
    public boolean registro_salida(int Id, String Fecha, String Hora) {

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call salida_de_personas(?,?,?)}";

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, Id);
            cst.setString(2, Fecha);
            cst.setString(3, Hora);
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

    /*
    MOSTRAR INFORMACION DE LA BASE DE DATOS
     */
    @Override
    public boolean mostrar_Profesores(int Id) {

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call mostrar_profesores(?)}";
        boolean response = false;

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, Id);
            rs = cst.executeQuery();
            response = rs.next();
            if (response) {
                do {
                    Reporte.txtNombres.setText(rs.getString(2));
                    Reporte.txtApellidos.setText(rs.getString(3));
                    Reporte.txtRol.setText(rs.getString(4));
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
    public boolean mostrar_Estudiante(int Id) {

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call mostrar_estudiantes(?)}";
        boolean response = false;

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, Id);
            rs = cst.executeQuery();
            response = rs.next();
            if (response) {
                do {
                    Controllador.Controllador.Reporte.txtNombres.setText(rs.getString(2));
                    Controllador.Controllador.Reporte.txtApellidos.setText(rs.getString(3));
                    Controllador.Controllador.Reporte.txtRol.setText(rs.getString(4));
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
    public boolean mostrar_Extras(int Id) {

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call mostrar_Extras(?)}";
        boolean response = false;

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, Id);
            rs = cst.executeQuery();
            response = rs.next();
            if (response) {
                do {
                    Controllador.Controllador.Reporte.txtNombres.setText(rs.getString(2));
                    Controllador.Controllador.Reporte.txtApellidos.setText(rs.getString(3));
                    Controllador.Controllador.Reporte.txtRol.setText(rs.getString(4));
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

    /*
    LLENAR TABLAS DEL FORMULARIO CON LA INFORMACION DE LA BASE DE DATOS
     */
    @Override
    public ArrayList<Profesores> Llenar_Tabla_Profesores() {

        ArrayList<Profesores> listaprofesores = new ArrayList<>();

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call Tabla_Profesores()}";

        try {
            cst = con.prepareCall(sql);
            rs = cst.executeQuery();
            boolean response = rs.next();
            if (response) {
                do {
                    listaprofesores.add(new Profesores(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
                } while (rs.next());

            }

        } catch (SQLException e) {

            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return listaprofesores;
    }

    @Override
    public ArrayList<Estudiantes> Llenar_Tabla_Estudiantes() {

        ArrayList<Estudiantes> listaestudiantes = new ArrayList<>();

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call Tabla_Estudiantes()}";
        try {
            cst = con.prepareCall(sql);
            rs = cst.executeQuery();
            boolean response = rs.next();
            if (response) {
                do {
                    listaestudiantes.add(new Estudiantes(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
                } while (rs.next());

            }

        } catch (SQLException e) {

            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return listaestudiantes;
    }

    public ArrayList<Extras> Llenar_Tabla_Extras() {
        ArrayList<Extras> listaextras = new ArrayList<>();

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call Tabla_Extras()}";
        try {
            cst = con.prepareCall(sql);
            rs = cst.executeQuery();
            boolean response = rs.next();
            if (response) {
                do {
                    listaextras.add(new Extras(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
                } while (rs.next());

            }

        } catch (SQLException e) {

            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return listaextras;
    }

    @Override
    public ArrayList<Entrada> Llenar_Tabla_Entrada() {
        ArrayList<Entrada> listaentrada = new ArrayList<>();

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call Tabla_Entrada()}";
        try {
            cst = con.prepareCall(sql);
            rs = cst.executeQuery();
            boolean response = rs.next();
            if (response) {
                do {
                    listaentrada.add(new Entrada(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
                } while (rs.next());

            }

        } catch (SQLException e) {

            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return listaentrada;
    }

    @Override
    public ArrayList<Salida> Llenar_Tabla_Salida() {
        ArrayList<Salida> listasalida = new ArrayList<>();

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call Tabla_Salida()}";
        try {
            cst = con.prepareCall(sql);
            rs = cst.executeQuery();
            boolean response = rs.next();
            if (response) {
                do {
                    listasalida.add(new Salida(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
                } while (rs.next());

            }

        } catch (SQLException e) {

            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return listasalida;
    }

    @Override
    public ArrayList<Entrada> buscar_Tabla_entrada(String Buscar) {

        ArrayList<Entrada> listaentrada = new ArrayList<>();

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call buscar_persona_entrada(?)}";
        try {
            cst = con.prepareCall(sql);
            cst.setString(1, Buscar);
            rs = cst.executeQuery();
            boolean response = rs.next();
            if (response) {
                do {
                    listaentrada.add(new Entrada(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
                } while (rs.next());

            }

        } catch (SQLException e) {

            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return listaentrada;
    }

    @Override
    public ArrayList<Salida> buscar_Tabla_salida(String Buscar) {
        ArrayList<Salida> listasalida = new ArrayList<>();

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call buscar_persona_salida(?)}";
        try {
            cst = con.prepareCall(sql);
            cst.setString(1, Buscar);
            rs = cst.executeQuery();
            boolean response = rs.next();
            if (response) {
                do {
                    listasalida.add(new Salida(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
                } while (rs.next());

            }

        } catch (SQLException e) {

            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return listasalida;
    }

    @Override
    public ArrayList<Profesores> buscar_Tabla_profesores(String Buscar) {

        ArrayList<Profesores> listaprofesores = new ArrayList<>();

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call buscar_profesores(?)}";
        try {
            cst = con.prepareCall(sql);
            cst.setString(1, Buscar);
            rs = cst.executeQuery();
            boolean response = rs.next();
            if (response) {
                do {
                    listaprofesores.add(new Profesores(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
                } while (rs.next());

            }

        } catch (SQLException e) {

            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return listaprofesores;
    }

    @Override
    public ArrayList<Estudiantes> buscar_Tabla_estudiantes(String Buscar) {

        ArrayList<Estudiantes> listaestudiantes = new ArrayList<>();

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call buscar_estudiantes(?)}";
        try {
            cst = con.prepareCall(sql);
            cst.setString(1, Buscar);
            rs = cst.executeQuery();
            boolean response = rs.next();
            if (response) {
                do {
                    listaestudiantes.add(new Estudiantes(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
                } while (rs.next());

            }

        } catch (SQLException e) {

            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return listaestudiantes;
    }

    @Override
    public ArrayList<Extras> buscar_Tabla_extras(String Buscar) {
        ArrayList<Extras> listaextras = new ArrayList<>();

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call buscar_extras(?)}";
        try {
            cst = con.prepareCall(sql);
            cst.setString(1, Buscar);
            rs = cst.executeQuery();
            boolean response = rs.next();
            if (response) {
                do {
                    listaextras.add(new Extras(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
                } while (rs.next());

            }

        } catch (SQLException e) {

            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return listaextras;
    }

    @Override
    public boolean actualizar_informacion(int Id, String Nombres, String Apellidos) {
        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call Actualizar_informacion(?,?,?)}";

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, Id);
            cst.setString(2, Nombres);
            cst.setString(3, Apellidos);
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
    public boolean eliminar_profesores(int filas) {

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call eliminar_profesores(?)}";

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, filas);
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
    public boolean eliminar_estudiantes(int filas) {
        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call eliminar_estudiantes(?)}";

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, filas);
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
    public boolean eliminar_extras(int filas) {
        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call eliminar_extras(?)}";

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, filas);
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
    public void limpiar_tabla_entrada() {

        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call limpiar_tabla_entrada()}";

        try {
            cst = con.prepareCall(sql);
            rs = cst.executeQuery();
        } catch (SQLException e) {

            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    @Override
    public void limpiar_tabla_salida() {
        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call limpiar_tabla_salida()}";

        try {
            cst = con.prepareCall(sql);
            rs = cst.executeQuery();
        } catch (SQLException e) {

            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
}

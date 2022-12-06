/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;

import Modelos.Estudiantes;
import Modelos.Profesores;
import Modelos.crudpersona;
import Vistas.Login;
import Vistas.Menu;
import Vistas.Registros;
import Vistas.Reporte_Asistencia;
import Vistas.Tabla_Reportes;
import Vistas.Tablas_Registros;
import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.SystemColor;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author SENA
 */
public class Controllador implements ActionListener, Runnable {

    private int Id;
    private String Nombres, Apellidos, Rol, Fecha, Hora, horac, ampm, buscar;
    int filas;
    private String user, pass;
    Calendar calendario;
    Thread h1;
    /*
    LLAMADO DE OBJETOS A UTILIZAR DE LAS DIFERENTES CLASES Y JFRAME
     */

    Login log;
    Menu menu = new Menu();
    Registros reg = new Registros();
    Tablas_Registros tabla_reg = new Tablas_Registros();
    Tabla_Reportes tabla_reportes = new Tabla_Reportes();
    public static Reporte_Asistencia Reporte = new Reporte_Asistencia();
    JScrollPane scrollpane;

    /*
    Clases de Modelos
     */
    crudpersona crp = new crudpersona();

    public Controllador(Login log) {

        /*BOTONES DEL FORMULARIO LOGIN*/
        this.log = log;
        this.Validar();
        this.log.Inciar.addActionListener(this);

        /**
         * BOTONES DEL FORMULARIO MENU
         */
        this.menu.Reg_asistencia.addActionListener(this);
        this.menu.MItemregistros.addActionListener(this);
        this.menu.MenuItemtabla_reg.addActionListener(this);
        this.menu.jMenuItemtabla_reportes.addActionListener(this);
        this.menu.jMenuItemCerrarSesion.addActionListener(this);

        /*
        BOTONES DEL FORMULARIO DE REPORTES 
         */
        this.Reporte.Btn_Entrada.addActionListener(this);
        this.Reporte.Btn_Salida.addActionListener(this);
        h1 = new Thread(this);
        h1.start();

        /*
        BOTONES DEL FORMULARIOS REGISTROS
         */
        this.reg.btnguardar.addActionListener(this);
        this.reg.btnactualizar.addActionListener(this);

        /*
        BOTONES DEL FORMULARIO DE TABLAS DE REPORTE 
         */
        this.tabla_reportes.btn_eliminar_entrada.addActionListener(this);
        this.tabla_reportes.btn_eliminar_salida.addActionListener(this);
        /*
        BOTONES DEL FORMULARIO DE TABLAS DE REGISTROS
         */
        this.tabla_reg.btneliminar_profe.addActionListener(this);
        this.tabla_reg.btneliminar_estu.addActionListener(this);
        this.tabla_reg.btneliminar_extras.addActionListener(this);

        KeyListener listener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                Buscar_Registros_entrada(buscar);
                Buscar_Registros_salida(buscar);
                Buscar_Registros_profesores(buscar);
                Buscar_Registros_Estudiantes(buscar);
                Buscar_Registros_Extras(buscar);

            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                Buscar_Registros_entrada(buscar);
                Buscar_Registros_salida(buscar);
                Buscar_Registros_profesores(buscar);
            }
        };
        this.tabla_reportes.txtbuscarentrada.addKeyListener(listener);
        this.tabla_reg.txtbuscar_profesores.addKeyListener(listener);
        this.tabla_reg.txtbuscar_estudiante.addKeyListener(listener);
        this.tabla_reg.txtbuscar_extras.addKeyListener(listener);
    }

    public void Validar() {
        this.log.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == log.Inciar) {
            Login();
        }
        /*
        FUNCIONES DE LOS BOTONES DE EL MENU
         */
        if (e.getSource() == menu.Reg_asistencia) {
            this.menu.Panel.add(Reporte);
            Reporte.show();

            reg.doDefaultCloseAction();
            tabla_reg.doDefaultCloseAction();
            tabla_reportes.doDefaultCloseAction();
        }

        if (e.getSource() == menu.MItemregistros) {
            menu.Panel.add(reg);
            reg.show();

            tabla_reg.doDefaultCloseAction();
            Reporte.doDefaultCloseAction();
            tabla_reportes.doDefaultCloseAction();
        }

        if (e.getSource() == menu.MenuItemtabla_reg) {
            menu.Panel.add(tabla_reg);
            tabla_reg.show();
            Mostrar_Registros_en_tablas();

            reg.doDefaultCloseAction();
            tabla_reportes.doDefaultCloseAction();
            Reporte.doDefaultCloseAction();
        }

        if (e.getSource() == menu.jMenuItemtabla_reportes) {
            menu.Panel.add(tabla_reportes);
            tabla_reportes.show();
            mostrar_informacion_reporte();

            reg.doDefaultCloseAction();
            Reporte.doDefaultCloseAction();
            tabla_reg.doDefaultCloseAction();
        }

        if (e.getSource() == menu.jMenuItemCerrarSesion) {

            reg.doDefaultCloseAction();
            tabla_reg.doDefaultCloseAction();
            Reporte.doDefaultCloseAction();
            menu.setVisible(false);
            log.setVisible(true);
        }
        /*
        BOTONES DE REGISTRO DE LAS PERSONAS
         */
        if (e.getSource() == reg.btnguardar) {
            Registro_personas(Id, Nombres, Apellidos, Rol);
        }
        if (e.getSource() == reg.btnactualizar) {

            Id = Integer.parseInt(reg.txtID.getText());

            boolean actualizar = crp.actualizar_informacion(Id, Nombres, Apellidos);

            if (actualizar == true) {
                JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Actualizacion Exitosa!</p></html>");

            } else {
                JOptionPane.showMessageDialog(null, "<html><p style = \"color: red \">¡Error al Actualizar Informacion!</p></html>");
            }
        }
        /*BOTONES DE VALIDACION DE ASISTENCIA Y SUS COMPONENTES*/

        if (e.getSource() == Reporte.Btn_Entrada) {
            reporte_entrada(Id);
        }
        if (e.getSource() == Reporte.Btn_Salida) {
            reporte_salida(Id, Fecha, Hora);
        }
        /*BOTONES DE TABLA DE REPORTES*/
        if (e.getSource() == tabla_reportes.btn_eliminar_entrada) {
            limpiar_tabla_entrada();
            mostrar_informacion_reporte();
            crp.limpiar_tabla_entrada();
        }
        if (e.getSource() == tabla_reportes.btn_eliminar_salida) {
            limpiar_tabla_salida();
        }
        /*BOTONES DE TABLA DE REGISTROS*/
        if (e.getSource() == tabla_reg.btneliminar_profe) {
        }
        if (e.getSource() == tabla_reg.btneliminar_estu) {

        }
        if (e.getSource() == tabla_reg.btneliminar_extras) {

        }
    }

    public void Login() {

        if (log.User.getText().equals("admin") && log.Pass.getText().equals("123")) {

            menu.setVisible(true);
            log.setVisible(false);

            log.User.setText("");
            log.Pass.setText("");
        } else if (log.User.getText().equals("vigi") && log.Pass.getText().equals("345")) {

            menu.setVisible(true);
            log.setVisible(false);

            log.User.setText("");
            log.Pass.setText("");

            menu.Menuregistrosusuarios.setVisible(false);
            menu.jMenuItemtabla_reportes.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "<html><p style = \"color: red \">¡Usuario y Password Incorrectos!</p></html>");
        }
    }

    public void Registro_personas(int Id, String Nombres, String Apellidos, String Rol) {

        Id = Integer.parseInt(reg.txtID.getText());
        Nombres = reg.txtNombre.getText();
        Apellidos = reg.txtApellidos.getText();
        Rol = reg.ComboBoxRol.getSelectedItem().toString();

        switch (Rol) {
            case "Profesor/a":
                boolean profe = crp.registro_Profesores(Id, Nombres, Apellidos, Rol);
                if (profe == true) {

                    JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro Exitoso!</p></html>" + "\n" + Rol);

                    reg.txtID.setText("");
                    reg.txtNombre.setText("");
                    reg.txtApellidos.setText("");
                    reg.ComboBoxRol.setSelectedIndex(0);
                } else {
                    JOptionPane.showMessageDialog(null, "<html><p style = \"color: red \">¡Error al Registrar Usuario Ya Existe!</p></html>" + "\n");
                }
                break;
            case "Estudiante":
                boolean estu = crp.registro_Estudiantes(Id, Nombres, Apellidos, Rol);
                if (estu == true) {

                    JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro Exitoso!</p></html>" + "\n" + Rol);

                    reg.txtID.setText("");
                    reg.txtNombre.setText("");
                    reg.txtApellidos.setText("");
                    reg.ComboBoxRol.setSelectedIndex(0);
                } else {
                    JOptionPane.showMessageDialog(null, "<html><p style = \"color: red \">¡Error al Registrar Usuario Ya Existe!</p></html>" + "\n");
                }
                break;
            case "Extras":
                boolean per = crp.registro_Extras(Id, Nombres, Apellidos, Rol);
                if (per == true) {

                    JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro Exitoso!</p></html>" + "\n" + Rol);

                    reg.txtID.setText("");
                    reg.txtNombre.setText("");
                    reg.txtApellidos.setText("");
                    reg.ComboBoxRol.setSelectedIndex(0);

                } else {
                    JOptionPane.showMessageDialog(null, "<html><p style = \"color: red \">¡Error al Registrar Usuario Ya Existe!</p></html>" + "\n");
                }
                break;
        }
    }

    public void actualizar_informacion() {

        Id = Integer.parseInt(reg.txtID.getText());

        boolean actualizar = crp.actualizar_informacion(Id, Nombres, Apellidos);

        if (actualizar == true) {
            JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Actualizacion Exitosa!</p></html>");

        } else {
            JOptionPane.showMessageDialog(null, "<html><p style = \"color: red \">¡Error al Actualizar Informacion!</p></html>");
        }
    }

    public void reporte_entrada(int Id) {

        Id = Integer.parseInt(Reporte.txtID.getText());
        Fecha = Reporte.date.getText();
        Hora = Reporte.hour.getText();
//vamos a validar que el usuario exista con el procedimiento mostrar estudiante

        boolean validar1 = crp.mostrar_Profesores(Id);
        boolean validar2 = crp.mostrar_Estudiante(Id);
        boolean validar3 = crp.mostrar_Extras(Id);

        if (validar1 == true) {
            crp.registro_entrada(Id, Fecha, Hora);
            JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro de Entrada Exitoso!</p></html>" + "\n");

            Reporte.txtID.setText("");
            Reporte.txtNombres.setText("");
            Reporte.txtApellidos.setText("");
            Reporte.txtRol.setText("");

        } else if (validar2 == true) {
            crp.registro_entrada(Id, Fecha, Hora);
            JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro de Entrada Exitoso!</p></html>" + "\n");

            Reporte.txtID.setText("");
            Reporte.txtNombres.setText("");
            Reporte.txtApellidos.setText("");
            Reporte.txtRol.setText("");

        } else if (validar3 == true) {
            crp.registro_entrada(Id, Fecha, Hora);
            JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro de Entrada Exitoso!</p></html>" + "\n");

            Reporte.txtID.setText("");
            Reporte.txtNombres.setText("");
            Reporte.txtApellidos.setText("");
            Reporte.txtRol.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "<html><p style = \"color: Red \">¡Error Al Validar!</p></html>");
        }
    }

    public void reporte_salida(int Id, String Fecha, String Hora) {

        Id = Integer.parseInt(Reporte.txtID.getText());
        Fecha = Reporte.date.getText();
        Hora = Reporte.hour.getText();

        boolean validar1 = crp.mostrar_Profesores(Id);
        boolean validar2 = crp.mostrar_Estudiante(Id);
        boolean validar3 = crp.mostrar_Extras(Id);

        if (validar1 == true) {
            crp.registro_salida(Id, Fecha, Hora);
            JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro de Salida Exitoso!</p></html>");

            Reporte.txtID.setText("");
            Reporte.txtNombres.setText("");
            Reporte.txtApellidos.setText("");
            Reporte.txtRol.setText("");

        } else if (validar2 == true) {
            crp.registro_salida(Id, Fecha, Hora);
            JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro de Salida Exitoso!</p></html>");

            Reporte.txtID.setText("");
            Reporte.txtNombres.setText("");
            Reporte.txtApellidos.setText("");
            Reporte.txtRol.setText("");

        } else if (validar3 == true) {
            crp.registro_salida(Id, Fecha, Hora);
            JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro de Salida Exitoso!</p></html>");

            Reporte.txtID.setText("");
            Reporte.txtNombres.setText("");
            Reporte.txtApellidos.setText("");
            Reporte.txtRol.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "<html><p style = \"color: Red \">¡Error Al Validar!</p></html>");
        }
    }

    /*
        REGISTRO DE TABLAS DE LAS PERSONAS
     */
    public boolean Mostrar_Registros_en_tablas() {

        for (int i = 0; i < crp.Llenar_Tabla_Profesores().size(); i++) {

            tabla_reg.jTable_profesores.setValueAt(crp.Llenar_Tabla_Profesores().get(i).getId(), i, 0);
            tabla_reg.jTable_profesores.setValueAt(crp.Llenar_Tabla_Profesores().get(i).getNombres(), i, 1);
            tabla_reg.jTable_profesores.setValueAt(crp.Llenar_Tabla_Profesores().get(i).getApellidos(), i, 2);
            tabla_reg.jTable_profesores.setValueAt(crp.Llenar_Tabla_Profesores().get(i).getRol(), i, 3);
        }

        for (int i = 0; i < crp.Llenar_Tabla_Estudiantes().size(); i++) {

            tabla_reg.jTable_student.setValueAt(crp.Llenar_Tabla_Estudiantes().get(i).getId(), i, 0);
            tabla_reg.jTable_student.setValueAt(crp.Llenar_Tabla_Estudiantes().get(i).getNombres(), i, 1);
            tabla_reg.jTable_student.setValueAt(crp.Llenar_Tabla_Estudiantes().get(i).getApellidos(), i, 2);
            tabla_reg.jTable_student.setValueAt(crp.Llenar_Tabla_Estudiantes().get(i).getRol(), i, 3);
        }

        for (int i = 0; i < crp.Llenar_Tabla_Extras().size(); i++) {

            tabla_reg.jTable_extras.setValueAt(crp.Llenar_Tabla_Extras().get(i).getId(), i, 0);
            tabla_reg.jTable_extras.setValueAt(crp.Llenar_Tabla_Extras().get(i).getNombres(), i, 1);
            tabla_reg.jTable_extras.setValueAt(crp.Llenar_Tabla_Extras().get(i).getApellidos(), i, 2);
            tabla_reg.jTable_extras.setValueAt(crp.Llenar_Tabla_Extras().get(i).getRol(), i, 3);
        }
        return false;
    }

    /*
        REGISTRO DE LA TABLA DE LOS REPORTES
     */
    public boolean mostrar_informacion_reporte() {

        for (int i = 0; i < crp.Llenar_Tabla_Entrada().size(); i++) {

            tabla_reportes.jTableEntrada.setValueAt(crp.Llenar_Tabla_Entrada().get(i).getId(), i, 0);
            tabla_reportes.jTableEntrada.setValueAt(crp.Llenar_Tabla_Entrada().get(i).getNombres(), i, 1);
            tabla_reportes.jTableEntrada.setValueAt(crp.Llenar_Tabla_Entrada().get(i).getApellidos(), i, 2);
            tabla_reportes.jTableEntrada.setValueAt(crp.Llenar_Tabla_Entrada().get(i).getRol(), i, 3);
            tabla_reportes.jTableEntrada.setValueAt(crp.Llenar_Tabla_Entrada().get(i).getFecha(), i, 4);
            tabla_reportes.jTableEntrada.setValueAt(crp.Llenar_Tabla_Entrada().get(i).getHora(), i, 5);
        }

        for (int i = 0; i < crp.Llenar_Tabla_Salida().size(); i++) {

            tabla_reportes.jTableSalida.setValueAt(crp.Llenar_Tabla_Salida().get(i).getId(), i, 0);
            tabla_reportes.jTableSalida.setValueAt(crp.Llenar_Tabla_Salida().get(i).getNombres(), i, 1);
            tabla_reportes.jTableSalida.setValueAt(crp.Llenar_Tabla_Salida().get(i).getApellidos(), i, 2);
            tabla_reportes.jTableSalida.setValueAt(crp.Llenar_Tabla_Salida().get(i).getRol(), i, 3);
            tabla_reportes.jTableSalida.setValueAt(crp.Llenar_Tabla_Salida().get(i).getFecha(), i, 4);
            tabla_reportes.jTableSalida.setValueAt(crp.Llenar_Tabla_Salida().get(i).getHora(), i, 5);
        }
        return false;
    }

    public boolean Buscar_Registros_entrada(String buscar) {
        buscar = tabla_reportes.txtbuscarentrada.getText();

        for (int i = 0; i < crp.buscar_Tabla_entrada(buscar).size(); i++) {

            tabla_reportes.jTableEntrada.setValueAt(crp.buscar_Tabla_entrada(buscar).get(i).getId(), i, 0);
            tabla_reportes.jTableEntrada.setValueAt(crp.buscar_Tabla_entrada(buscar).get(i).getNombres(), i, 1);
            tabla_reportes.jTableEntrada.setValueAt(crp.buscar_Tabla_entrada(buscar).get(i).getApellidos(), i, 2);
            tabla_reportes.jTableEntrada.setValueAt(crp.buscar_Tabla_entrada(buscar).get(i).getRol(), i, 3);
            tabla_reportes.jTableEntrada.setValueAt(crp.buscar_Tabla_entrada(buscar).get(i).getFecha(), i, 4);
            tabla_reportes.jTableEntrada.setValueAt(crp.buscar_Tabla_entrada(buscar).get(i).getHora(), i, 5);
        }
        return false;
    }

    public boolean Buscar_Registros_salida(String buscar) {
        buscar = tabla_reportes.txtbuscarsalida.getText();

        for (int i = 0; i < crp.buscar_Tabla_salida(buscar).size(); i++) {

            tabla_reportes.jTableSalida.setValueAt(crp.buscar_Tabla_salida(buscar).get(i).getId(), i, 0);
            tabla_reportes.jTableSalida.setValueAt(crp.buscar_Tabla_salida(buscar).get(i).getNombres(), i, 1);
            tabla_reportes.jTableSalida.setValueAt(crp.buscar_Tabla_salida(buscar).get(i).getApellidos(), i, 2);
            tabla_reportes.jTableSalida.setValueAt(crp.buscar_Tabla_salida(buscar).get(i).getRol(), i, 3);
            tabla_reportes.jTableSalida.setValueAt(crp.buscar_Tabla_salida(buscar).get(i).getFecha(), i, 4);
            tabla_reportes.jTableSalida.setValueAt(crp.buscar_Tabla_salida(buscar).get(i).getHora(), i, 5);
        }
        return false;
    }

    public void limpiar_tabla_entrada() {
        /*int fil = tabla_reportes.jTableEntrada.getSelectedRow();
        
        for (int i = fil; i >= 0; i--) {
            tabla_reportes.jTableEntrada.remove(i);
        }*/

        int cantidaddefilas = tabla_reportes.jTableEntrada.getRowCount();

        for (int i = cantidaddefilas - 1; i >= 0; i--) {
            tabla_reportes.jTableEntrada.removeAll();
        }
        JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Datos Eliminados!</p></html>");
    }

    public void remover_tabla_profesores() {
        JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Dato Eliminado!</p></html>");
    }

    public void limpiar_tabla_salida() {
        tabla_reportes.jTableSalida.removeAll();
        crp.limpiar_tabla_salida();
        JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Datos Eliminados!</p></html>");
    }

    public boolean Buscar_Registros_profesores(String buscar) {
        buscar = tabla_reg.txtbuscar_profesores.getText();

        for (int i = 0; i < crp.buscar_Tabla_profesores(buscar).size(); i++) {

            tabla_reg.jTable_profesores.setValueAt(crp.buscar_Tabla_profesores(buscar).get(i).getId(), i, 0);
            tabla_reg.jTable_profesores.setValueAt(crp.buscar_Tabla_profesores(buscar).get(i).getNombres(), i, 1);
            tabla_reg.jTable_profesores.setValueAt(crp.buscar_Tabla_profesores(buscar).get(i).getApellidos(), i, 2);
            tabla_reg.jTable_profesores.setValueAt(crp.buscar_Tabla_profesores(buscar).get(i).getRol(), i, 3);
        }
        return false;
    }

    public boolean Buscar_Registros_Estudiantes(String buscar) {
        buscar = tabla_reg.txtbuscar_estudiante.getText();

        for (int i = 0; i < crp.buscar_Tabla_estudiantes(buscar).size(); i++) {

            tabla_reg.jTable_student.setValueAt(crp.buscar_Tabla_estudiantes(buscar).get(i).getId(), i, 0);
            tabla_reg.jTable_student.setValueAt(crp.buscar_Tabla_estudiantes(buscar).get(i).getNombres(), i, 1);
            tabla_reg.jTable_student.setValueAt(crp.buscar_Tabla_estudiantes(buscar).get(i).getApellidos(), i, 2);
            tabla_reg.jTable_student.setValueAt(crp.buscar_Tabla_estudiantes(buscar).get(i).getRol(), i, 3);
        }
        return false;
    }

    public boolean Buscar_Registros_Extras(String buscar) {
        buscar = tabla_reg.txtbuscar_extras.getText();

        for (int i = 0; i < crp.buscar_Tabla_extras(buscar).size(); i++) {

            tabla_reg.jTable_extras.setValueAt(crp.buscar_Tabla_extras(buscar).get(i).getId(), i, 0);
            tabla_reg.jTable_extras.setValueAt(crp.buscar_Tabla_extras(buscar).get(i).getNombres(), i, 1);
            tabla_reg.jTable_extras.setValueAt(crp.buscar_Tabla_extras(buscar).get(i).getApellidos(), i, 2);
            tabla_reg.jTable_extras.setValueAt(crp.buscar_Tabla_extras(buscar).get(i).getRol(), i, 3);
        }
        return false;
    }

    public void Eliminar_profesores(int filas) {

        filas = tabla_reg.jTable_profesores.getSelectedRow();

        crp.eliminar_profesores(filas);
        JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Informacion Eliminada con Exito!</p></html>");
    }

    @Override
    public void run() {
        Thread ct = Thread.currentThread();

        while (ct == h1) {
            calcula();
            Reporte.hour.setText(Hora);
            Reporte.LblAmPm.setText(" " + ampm);
            horac = Hora;
            Reporte.date.setText(Fecha);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }

    private void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechahora = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat forhora = new SimpleDateFormat("hh:mm:ss");
        calendario.setTime(fechahora);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        Fecha = formato.format(fechahora);

        Hora = forhora.format(fechahora);
    }
}

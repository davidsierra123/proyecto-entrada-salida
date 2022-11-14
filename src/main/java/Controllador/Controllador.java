/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;

import Modelos.Estudiantes;
import Modelos.Reloj;
import Modelos.crudpersona;
import Vistas.Login;
import Vistas.Validar;
import Vistas.Menu;
import Vistas.Registros;
import Vistas.Tablas_Registros;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vistas.Validar;
import java.awt.SystemColor;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author SENA
 */
public class Controllador implements ActionListener {

    private int Id;
    private String Nombres, Apellidos, Rol, Fecha, Hora;

    private String user, pass;

    Login log;
    Menu menu = new Menu();
    Registros reg = new Registros();
    Tablas_Registros tabla_reg = new Tablas_Registros();
    public static Validar Validacion = new Validar();

    /*
    Clases de Modelos
     */
    crudpersona crp = new crudpersona();
    Reloj rel = new Reloj();
    Estudiantes estudent;

    public Controllador(Login log) {

        /*BOTONES DEL FORMULARIO LOGIN*/
        this.log = log;
        this.Validar();
        this.log.Inciar.addActionListener(this);
        /**
         * Botone de el formulario de menus
         */

        this.menu.Reg_asistencia.addActionListener(this);
        this.menu.MItemregistros.addActionListener(this);
        this.menu.MenuItemtabla_reg.addActionListener(this);

        /*
        botones del formulario de validacion
         */
        this.Validacion.B_Validar.addActionListener(this);
        this.Validacion.Regresar.addActionListener(this);
        this.Validacion.B_Salida.addActionListener(this);
        this.rel.run();

        /*
        BOTONES DEL FORMULARIOS REGISTROS
         */
        this.reg.btnguardar.addActionListener(this);
    }

    public void Validar() {
        this.log.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == log.Inciar) {

            if (log.User.getText().equals("admin") && log.Pass.getText().equals("123")) {

                menu.setVisible(true);
                log.setVisible(false);
            } else if (log.User.getText().equals("345") && log.Pass.getText().equals("vigi")) {

                menu.setVisible(true);
                log.setVisible(false);

                menu.Menuregistrosusuarios.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(null, "<html><p style = \"color: red \">¡Error De Autenticacion!</p></html>");
            }

        }

        /*
        FUNCIONES DE LOS BOTONES DE EL MENU
         */
        if (e.getSource() == menu.Reg_asistencia) {
            menu.setVisible(false);
            Validacion.setVisible(true);
        }
        if (e.getSource() == Validacion.Regresar) {
            menu.setVisible(true);
            Validacion.setVisible(false);

        }
        if (e.getSource() == menu.MItemregistros) {
            menu.Panel.add(reg);
            reg.show();
            tabla_reg.doDefaultCloseAction();
        }
        /*
        BOTONES DE REGISTRO DE LOS ALUMNOS
         */
        if (e.getSource() == reg.btnguardar) {
            Id = Integer.parseInt(reg.txtID.getText());
            Nombres = reg.txtNombre.getText();
            Apellidos = reg.txtApellidos.getText();
            Rol = (String) reg.ComboBoxRol.getSelectedItem();

            Boolean profes = crp.registro_Profesores(Id, Nombres, Apellidos, Rol);
            Boolean estu = crp.registro_Estudiantes(Id, Nombres, Apellidos, Rol);
            Boolean per = crp.registro_Per_Aseo(Id, Nombres, Apellidos, Rol);

            if (Rol.equals("Profesor/a") && profes == true) {

                JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro Exitoso!</p></html>" + "\n");

                reg.txtID.setText("");
                reg.txtNombre.setText("");
                reg.txtApellidos.setText("");
                reg.ComboBoxRol.setSelectedItem(1);
            } else if (Rol.equals("Estudiante") && estu == true) {

                JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro Exitoso!</p></html>" + "\n");

                reg.txtID.setText("");
                reg.txtNombre.setText("");
                reg.txtApellidos.setText("");
                reg.ComboBoxRol.setSelectedItem(1);
            } else if (Rol.equals("Personal de Aseo") && per == true) {

                JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro Exitoso!</p></html>" + "\n");

                reg.txtID.setText("");
                reg.txtNombre.setText("");
                reg.txtApellidos.setText("");
                reg.ComboBoxRol.setSelectedItem(1);

            } else {
                JOptionPane.showMessageDialog(null, "<html><p style = \"color: red \">¡Error al Registrar Usuario Ya Existe!</p></html>" + "\n");

            }
        }
        /*BOTON DE VALIDACION DE ASISTENCIA Y SUS COMPONENTES*/

        if (e.getSource() == this.Validacion.B_Validar) {

            Id = Integer.parseInt(Validacion.txtID.getText());
            Nombres = Validacion.txtNombres.getText();
            Apellidos = Validacion.txtNombres.getText();
            Rol = Validacion.txtRol.getText();
            Fecha = Validacion.date.getText();
            Hora = Validacion.hour.getText();
            
            crp.mostrar_Estudiante(Id, Nombres, Apellidos, Rol);

            boolean save = crp.registro_entrada(Id, Nombres, Apellidos, Rol, Fecha, Hora);

            if (save = true) {

                /*this.Validacion.txtNombres.setText(Nombres + " ");
                this.Validacion.txtApellidos.setText(Apellidos + " ");
                this.Validacion.txtRol.setText(Rol + " ");*/

                JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro De Asitencia Exitoso!</p></html>" + "\n");

                this.Validacion.txtID.setText("");
                this.Validacion.txtNombres.setText("");
                this.Validacion.txtApellidos.setText("");
                this.Validacion.txtRol.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Error Al Validar!</p></html>");

            }
        }

        if (e.getSource() == Validacion.B_Salida) {
            Id = Integer.parseInt(Validacion.txtID.getText());
            Hora = Validacion.hour.getText();

            JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro De Salida Exitoso!</p></html>" + "\n");
        }
    }
}

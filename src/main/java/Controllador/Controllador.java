/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;

import Modelos.Guardar_Asistencia;
import Modelos.Reloj;
import Modelos.crudpersona;
import Vistas.Alumnos;
import Vistas.Login;
import Vistas.Validar;
import Vistas.Menu;
import Vistas.Per_Aseo;
import Vistas.Profesores;
import Vistas.Registros;
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
    Per_Aseo aseo = new Per_Aseo();
    Alumnos alu = new Alumnos();
    Profesores profe = new Profesores();
    Registros reg = new Registros();
    public static Validar Validacion = new Validar();
    crudpersona crp = new crudpersona();
    Reloj rel = new Reloj();

    public Controllador(Login log) {

        /*BOTONES DEL FORMULARIO LOGIN*/
        this.log = log;
        this.Validar();
        this.log.Inciar.addActionListener(this);
        /**
         * Botone de el formulario de menus
         */

        this.menu.Reg_asistencia.addActionListener(this);
        this.menu.Reg_Alumnos.addActionListener(this);
        this.menu.Reg_Profesores.addActionListener(this);
        this.menu.Reg_Personal_Aseo.addActionListener(this);
        this.menu.MItemregistros.addActionListener(this);

        /*
        botones del formulario de validacion
         */
        this.Validacion.B_Validar.addActionListener(this);
        this.Validacion.Regresar.addActionListener(this);
        this.Validacion.B_Salida.addActionListener(this);
        this.rel.run();

        /*
        BOTONES DEL FORMULARIOS ESTUDIANTES
         */
        this.alu.Guardar.addActionListener(this);
        /*
        BOTONES DEL FORMULARIOS PROFESORES
         */
        this.profe.btnguardar.addActionListener(this);
        /*
        BOTONES DEL FORMULARIOS PERSONAL DE ASEO
         */
        this.aseo.btnguardar.addActionListener(this);
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

                menu.Menu_Alum.setVisible(false);
                menu.Menu_Pro.setVisible(false);
                menu.Menu_aseo.setVisible(false);
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
        if (e.getSource() == menu.Reg_Alumnos) {
            menu.Panel.add(alu);
            alu.show();
            profe.doDefaultCloseAction();
            aseo.doDefaultCloseAction();
        }
        if (e.getSource() == menu.Reg_Profesores) {
            menu.Panel.add(profe);
            profe.show();
            alu.doDefaultCloseAction();
            aseo.doDefaultCloseAction();
        }
        if (e.getSource() == menu.Reg_Personal_Aseo) {
            menu.Panel.add(aseo);
            aseo.show();
            alu.doDefaultCloseAction();
            profe.doDefaultCloseAction();
        }
        if (e.getSource() == menu.MItemregistros) {
            menu.Panel.add(reg);
            reg.show();

            alu.doDefaultCloseAction();
            profe.doDefaultCloseAction();
            aseo.doDefaultCloseAction();

        }

        /*
        BOTONES DE REGISTRO DE LOS ALUMNOS
         */
        if (e.getSource() == alu.Guardar) {
            Id = Integer.parseInt(alu.Id_Alumnos.getText());
            Nombres = alu.Nom_Alumnos.getText();
            Apellidos = alu.Ape_Alumnos.getText();
            Rol = alu.txtrol.getText();

            boolean save = crp.registro_Estudiantes(Id, Nombres, Apellidos, Rol);

            if (save == true) {
                JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro Exitoso!</p></html>" + "\n");

                alu.Id_Alumnos.setText("");
                alu.Nom_Alumnos.setText("");
                alu.Ape_Alumnos.setText("");
                alu.txtrol.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "<html><p style = \"color: red \">¡Error al Registrar!</p></html>" + "\n");

            }

        }
        if (e.getSource() == profe.btnguardar) {
            Id = Integer.parseInt(profe.Id_Profe.getText());
            Nombres = profe.Nom_Profe.getText();
            Apellidos = profe.Ape_Profe.getText();
            Rol = profe.txtrol.getText();
            boolean save = crp.registro_Profesores(Id, Nombres, Apellidos, Rol);

            if (save == true) {
                JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro Exitoso!</p></html>" + "\n");

                profe.Id_Profe.setText("");
                profe.Nom_Profe.setText("");
                profe.Ape_Profe.setText("");
                profe.txtrol.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "<html><p style = \"color: red \">¡Error al Registrar!</p></html>" + "\n");

            }

        }
        if (e.getSource() == aseo.btnguardar) {
            Id = Integer.parseInt(aseo.Id_Aseo.getText());
            Nombres = aseo.Nom_Aseo.getText();
            Apellidos = aseo.Ape_Aseo.getText();
            Rol = aseo.txtrol.getText();
            boolean save = crp.registro_Per_Aseo(Id, Nombres, Apellidos, Rol);

            if (save == true) {
                JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro Exitoso!</p></html>" + "\n");

                aseo.Id_Aseo.setText("");
                aseo.Nom_Aseo.setText("");
                aseo.Ape_Aseo.setText("");
                aseo.txtrol.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "<html><p style = \"color: red \">¡Error al Registrar!</p></html>" + "\n");

            }

        }
        /*BOTON DE VALIDACION DE ASISTENCIA Y SUS COMPONENTES*/

        if (e.getSource() == this.Validacion.B_Validar) {

            Id = Integer.parseInt(Validacion.Identificacion.getText());
            Nombres = "Gonzalo";
            Apellidos = "Araujo";
            Rol = "Estudiante";
            this.Validacion.Rol_Text.setText(Validacion.Rol_Text.getText());
            this.Validacion.Nombres1.setText(Validacion.Nombres1.getText());
            this.Validacion.Apellido_Text.setText(Validacion.Nombres1.getText());
            Fecha = Validacion.date.getText();
            Hora = Validacion.hour.getText();

            boolean save = crp.registro_entrada(Id, Nombres, Apellidos, Rol, Fecha, Hora);

            if (save = true) {

                this.Validacion.Nombres1.setText(Nombres + " ");
                this.Validacion.Rol_Text.setText(Rol + " ");
                this.Validacion.Apellido_Text.setText(Apellidos + " ");

                JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro De Asitencia Exitoso!</p></html>" + "\n");

                this.Validacion.Identificacion.setText("");
                this.Validacion.Rol_Text.setText("");
                this.Validacion.Nombres1.setText("");
                this.Validacion.Apellido_Text.setText("");

            } else {
                JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Error Al Validar!</p></html>");

            }
        }

        if (e.getSource() == Validacion.B_Salida) {
            Id = Integer.parseInt(Validacion.Identificacion.getText());
            Hora = Validacion.hour.getText();

            JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro De Salida Exitoso!</p></html>" + "\n");
        }
    }
}
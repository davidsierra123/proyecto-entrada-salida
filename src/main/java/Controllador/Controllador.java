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
    private String Nombres, Apellidos, Cargo, Fecha, Hora;

    private String user;
    private String pass;

    Login log;
    Menu menu = new Menu();
    Per_Aseo aseo = new Per_Aseo();
    Alumnos alu = new Alumnos();
    Profesores profe = new Profesores();
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

        /*
        botones del formulario de validacion
         */
        this.Validacion.B_Validar.addActionListener(this);
        this.Validacion.Regresar.addActionListener(this);
        this.Validacion.B_Salida.addActionListener(this);
        this.rel.run();
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
                JOptionPane.showMessageDialog(null, "Error de autenticacion");
            }

        }
        if (e.getSource() == log.Inciar) {

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

        /*
        BOTONES DE REGISTRO DE LOS ALUMNOS
         */
        if (e.getSource() == alu.Guardar) {

        }
        /*BOTON DE VALIDACION DE ASISTENCIA Y SUS COMPONENTES*/

        if (e.getSource() == this.Validacion.B_Validar) {

            Id = Integer.parseInt(Validacion.Identificacion.getText());
            Nombres = "Gonzalo";
            Apellidos = "Araujo";
            Cargo = "Estudiante";
            Fecha = Validacion.date.getText();
            Hora = Validacion.hour.getText();

            boolean save = crp.registro_1(Id, Nombres, Apellidos, Cargo, Fecha, Hora);

            if (save = true) {

                this.Validacion.Nombres.setText(Nombres + " " + Apellidos + " " + Cargo);

                JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro De Asitencia Exitoso!</p></html>" + "\n");

                this.Validacion.Identificacion.setText("");
                this.Validacion.Nombres.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");

            }
        }

        if (e.getSource()
                == Validacion.B_Salida) {
            Id = Integer.parseInt(Validacion.Identificacion.getText());
            Hora = Validacion.hour.getText();
            crp.registro_2(Id, Hora);

            JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Registro De Salida Exitoso!</p></html>" + "\n");
        }
    }
}

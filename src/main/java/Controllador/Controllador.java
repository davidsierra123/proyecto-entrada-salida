/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;

import Modelos.Guardar_Asistencia;
import Modelos.Reloj;
import Modelos.crudpersona;
import Vistas.Alumnos;
import Vistas.Asistencias;
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

            user = "admin";
            pass = "123";

            if (log.User.getText().equals(user) && log.Pass.getText().equals(pass)) {

                /*Validacion.setVisible(true);*/
                menu.setVisible(true);
                log.setVisible(false);

            }
        }

        if (e.getSource() == log.Inciar) {
            user = "vigi";
            pass = "345";
            if (log.User.getText().equals(user) && log.Pass.getText().equals(pass)) {

                menu.setVisible(true);
                log.setVisible(false);

                menu.Menu_Alum.setVisible(false);
                menu.Menu_Pro.setVisible(false);
                menu.Menu_aseo.setVisible(false);
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

        /*
        BOTONES DE REGISTRO DE LOS ALUMNOS
         */
        if (e.getSource() == alu.Guardar) {

        }
        /*BOTON DE VALIDACION DE ASISTENCIA Y SUS COMPONENTES*/

        if (e.getSource() == this.Validacion.B_Validar) {

            Id = Integer.parseInt(Validacion.Identificacion.getText());
            Nombres = Validacion.Nombres.getText();
//            Validacion.Nombres.setText(Nombres);
            Hora = Validacion.hour.getText();
            crp.guardar_usuario(Id, Nombres, Hora);
            Cargo = "Estudiante";
            JOptionPane.showMessageDialog(null, "<html><p style = \"color: green \">¡Acceso Permitido!</p></html>" + "\n" + "Cargo: " + Cargo);

//
            this.Validacion.Identificacion.setText("");
            this.Validacion.Nombres.setText("");
//            } else {
//                JOptionPane.showMessageDialog(null, "Error al Guardar");
//            }
//                JOptionPane.showMessageDialog(null, "Acceso Permitido" + "\n" + this.Nombres);
        }
    }
}

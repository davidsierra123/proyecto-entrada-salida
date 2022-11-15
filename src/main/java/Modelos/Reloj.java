/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Vistas.Validar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gonzalo01
 */
public class Reloj implements Runnable {

    public String hora, ampm, fecha, horac;
    Calendar calendario;
    Thread h1;

    /**
     * Creates new form RegistrarAsistencia
     */
    public Reloj() {
        h1 = new Thread(this);
        h1.start();
    }

    public void run() {
        Thread ct = Thread.currentThread();

        while (ct == h1) {
            calcula();
            Controllador.Controllador.Validacion.hour.setText(hora /*+ " " + ampm*/);
            Controllador.Controllador.Validacion.LblAmPm.setText(" " + ampm);
            horac = hora;
            Controllador.Controllador.Validacion.date.setText(fecha);
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
        fecha = formato.format(fechahora);

        hora = forhora.format(fechahora);
    }
}

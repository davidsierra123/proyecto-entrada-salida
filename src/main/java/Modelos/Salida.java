/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Gonzalo01
 */
public class Salida extends Personas {

    private String Fecha;
    private String Hora;

    public Salida(int Id, String Nombres, String Apellidos, String Rol, String Fecha, String Hora) {
        super(Id, Nombres, Apellidos, Rol);
        this.Fecha = Fecha;
        this.Hora = Hora;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

}

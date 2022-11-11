/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author SENA
 */
public class Guardar_Asistencia extends Modelo_Validacion{
    
private String Fecha;
private String Hora;

    public Guardar_Asistencia(String Fecha, String Hora, int Id, String Nombres, String Apellidos, String Cargo) {
        super(Id, Nombres, Apellidos, Cargo);
        this.Fecha = Fecha;
        this.Hora = Hora;
    }
}
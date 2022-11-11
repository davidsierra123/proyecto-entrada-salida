/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author SENA
 */
abstract public class Modelo_Validacion {
    protected int Id;
    protected String Nombres;
    protected String Apellidos;
    protected String Cargo;

    public Modelo_Validacion(int Id, String Nombres, String Apellidos, String Cargo) {
        this.Id = Id;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Cargo = Cargo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
}
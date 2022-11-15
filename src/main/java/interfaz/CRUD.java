/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

/**
 *
 * @author SENA
 */
public interface CRUD {

    public boolean mostrar_Estudiante(int Id, String Nombre, String Apellidos, String Rol);

    public boolean registro_entrada(int Id, String Nombres, String Apellidos, String Rol, String Fecha, String Hora);

    public boolean registro_entrada_2(int Id, String Nombres, String Apellidos, String Rol, String Fecha, String Hora);

    public boolean registro_Estudiantes(int Id, String Nombres, String Apellidos, String Rol);

    public boolean registro_Profesores(int Id, String Nombres, String Apellidos, String Rol);

    public boolean registro_Per_Aseo(int Id, String Nombres, String Apellidos, String Rol);

    public boolean validar_Entrada(int Id, String Fecha, String Hora);
}

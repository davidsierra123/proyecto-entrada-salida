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
    public boolean mostrar(int Id, String Nombre, String Apellidos,String Cargo, String Fecha, String Hr_Entrada, String Hr_salida);
    public boolean guardar_usuario(int Id, String Nombres,String Hora);
}

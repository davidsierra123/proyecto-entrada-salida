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
    public boolean registro_1(int Id, String Nombres,String Apellidos,String Cargo,String Fecha,String Hora);
    public boolean registro_2(int Id,String Hora);
}

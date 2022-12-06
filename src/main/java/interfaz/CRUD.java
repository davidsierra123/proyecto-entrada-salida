/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import Modelos.Entrada;
import Modelos.Estudiantes;
import Modelos.Extras;
import javax.swing.JTable;
import java.util.ArrayList;
import Modelos.Profesores;
import Modelos.Salida;

/**
 *
 * @author SENA
 */
public interface CRUD {

    /*
    REGISTRO DE INFORMACION EN LA BASE DE DATOS
     */
    public boolean registro_Estudiantes(int Id, String Nombres, String Apellidos, String Rol);

    public boolean registro_Profesores(int Id, String Nombres, String Apellidos, String Rol);

    public boolean registro_Extras(int Id, String Nombres, String Apellidos, String Rol);

    public boolean registro_entrada(int Id, String Fecha, String Hora);

    public boolean registro_salida(int Id, String Fecha, String Hora);

    /*
    MOSTRAR INFORMACION DE LA BASE DE DATOS
     */
    public boolean mostrar_Profesores(int Id);

    public boolean mostrar_Estudiante(int Id);

    public boolean mostrar_Extras(int Id);

    /*
    LLENAR TABLAS DEL FORMULARIO CON LA INFORMACION DE LA BASE DE DATOS
     */
    public ArrayList<Profesores> Llenar_Tabla_Profesores();

    public ArrayList<Estudiantes> Llenar_Tabla_Estudiantes();

    public ArrayList<Extras> Llenar_Tabla_Extras();

    public ArrayList<Entrada> Llenar_Tabla_Entrada();

    public ArrayList<Salida> Llenar_Tabla_Salida();

    /*
    BUSCAR INFORMACION EN TABLAS
     */
    public ArrayList<Entrada> buscar_Tabla_entrada(String Buscar);

    public ArrayList<Salida> buscar_Tabla_salida(String Buscar);

    public ArrayList<Profesores> buscar_Tabla_profesores(String Buscar);

    public ArrayList<Estudiantes> buscar_Tabla_estudiantes(String Buscar);

    public ArrayList<Extras> buscar_Tabla_extras(String Buscar);

    /*
    ACTUALIZAR INFORMACION
     */
    public boolean actualizar_informacion(int Id, String Nombres, String Apellidos);

    /*
    ELIMINAR INFORMACION
     */
    public boolean eliminar_profesores(int filas);

    public boolean eliminar_estudiantes(int filas);

    public boolean eliminar_extras(int filas);

    public void limpiar_tabla_entrada();

    public void limpiar_tabla_salida();

}

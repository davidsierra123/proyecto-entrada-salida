/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Iniciar;
import Controllador.Controllador;
import Vistas.Asistencias;
import Vistas.Login;

/**
 *
 * @author SENA
 */
public class Iniciar_Proyecto {

    public static void main(String[] args) {
        Login ejecutar = new Login();
        Controllador cp = new Controllador(ejecutar);
    }
}

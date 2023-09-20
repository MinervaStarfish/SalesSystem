/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

import java.io.BufferedReader;
import java.io.FileReader;

public class login {

    public boolean autenticar(String usuario, String contrasena, byte tipoEmpleado) {
        try {
            String Linea = "";

            if (tipoEmpleado == 1) {
                FileReader archivo = new FileReader("C:\\Users\\samue\\OneDrive\\Documents\\NetBeansProjects\\sistemaGestion\\src\\achivosTexto\\usuarioContrasenaEmpleado.txt");
                BufferedReader datos = new BufferedReader(archivo);



                while ((Linea = datos.readLine()) != null) {

                    if (Linea.equals(usuario)) {
                        Linea = datos.readLine();
                        if (Linea.equals(contrasena)) {
                            return true;
                        }
                    } else {
                        Linea = datos.readLine();
                    }
                    Linea = datos.readLine();
                }
                datos.close();
                archivo.close();
            } else if (tipoEmpleado == 2) {
                FileReader archivo = new FileReader("C:\\Users\\samue\\OneDrive\\Documents\\NetBeansProjects\\sistemaGestion\\src\\achivosTexto\\usuarioContrasenaAdmin.txt");
                BufferedReader datos = new BufferedReader(archivo);

                Linea = datos.readLine();

                while (Linea != null) {

                    if (Linea.equals(usuario)) {
                        Linea = datos.readLine();
                        if (Linea.equals(contrasena)) {
                            return true;
                        }
                    } else {
                        Linea = datos.readLine();
                    }
                    Linea = datos.readLine();
                }
                datos.close();
                archivo.close();

            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }
        return false;
    }
}

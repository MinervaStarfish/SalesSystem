/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class gestionarClientes {

    Scanner sca = new Scanner(System.in);

    public void LeerAchivos() {
        try {
            String linea = "";

            FileReader archivo = new FileReader("");
            BufferedReader datos = new BufferedReader(archivo);

            while ((linea = datos.readLine()) != null) {

            }
            archivo.close();
            datos.close();

        } catch (Exception ex) {
            System.out.println("error: " + ex);
        }

    }

    public void EscribirArchivos() {
        try {
            FileWriter fileWriter = new FileWriter("", true);

            String contenido = "Este es un nuevo contenido que se agrega al final del archivo.\n";
            fileWriter.write(contenido);

            fileWriter.close();

            System.out.println("Contenido agregado al archivo exitosamente.");
        } catch (Exception ex) {
            System.out.println("error: " + ex);
        }

    }

    public void imprimirClientes() {
        try {
            String linea = "";

            FileReader archivo = new FileReader("C:\\Users\\osori\\Desktop");
            BufferedReader datos = new BufferedReader(archivo);

            while ((linea = datos.readLine()) != null) {
                System.out.println("Cliente: " + linea);
            }
            archivo.close();
            datos.close();

        } catch (Exception ex) {
            System.out.println("error: " + ex);
        }

    }

    public void escribirClientes() {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\samue\\OneDrive\\Documents\\NetBeansProjects\\sistemaGestion\\src\\achivosTexto\\listaClientes", true);

            System.out.println("Ingresa el nuevo cliente: ");
            String nombre = sca.nextLine() + "\n";

            fileWriter.write(nombre);

            fileWriter.close();

            System.out.println("Contenido agregado al archivo exitosamente.\n");
        } catch (Exception ex) {
            System.out.println("error: " + ex);
        }

    }

}

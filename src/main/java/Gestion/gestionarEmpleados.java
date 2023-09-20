/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

import Modelo.empleado;
import Modelo.producto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author osori
 */
public class gestionarEmpleados {

    Scanner scanner = new Scanner(System.in);

    public void InscribirNuevoEmpleado(String dni, String nombre) {
        try {
            FileWriter archivo = new FileWriter("C:\\Users\\osori\\Desktop\\empleados.txt", true);
            BufferedWriter datos = new BufferedWriter(archivo);

            datos.write(dni);
            datos.newLine();
            datos.write(nombre);
            datos.newLine();

            datos.close();
            archivo.close();
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo: " + ex.getMessage());
        }
        System.out.println("Empleado inscrito exitosamente.");
    }
    
        public List<empleado> imprimirEmpleados() {
        List<empleado> empleados = new ArrayList<>();

        try {
            FileReader archivo = new FileReader("C:\\Users\\osori\\Desktop\\empleados.txt");
            BufferedReader datos = new BufferedReader(archivo);
            String nombre, dni;

            while ((dni = datos.readLine()) != null) {
                nombre = datos.readLine();
                empleados.add(new empleado(dni, nombre));
            }
          
            archivo.close();
            datos.close();
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }

        return empleados;
        
    }
}

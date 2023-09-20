/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

import Modelo.empleado;
import Modelo.producto;
import Modelo.proveedor;
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
public class gestionarProveedores {
    Scanner scanner = new Scanner(System.in);
    
    public void escribirNuevoProveedor(String nit, String nombre, String telefono, String direccion) {
        try {
            FileWriter archivo = new FileWriter("C:\\Users\\osori\\Desktop\\proveedores.txt", true);
            BufferedWriter datos = new BufferedWriter(archivo);

            datos.write(nit);
            datos.newLine();
            datos.write(nombre);
            datos.newLine();
            datos.write(telefono);
            datos.newLine();
            datos.write(direccion);
            datos.newLine();

            datos.close();
            archivo.close();
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo: " + ex.getMessage());
        }
        System.out.println("Proveedor inscrito exitosamente.");
    }

    public List<proveedor> imprimirProveedores() {
        List<proveedor> proveedores = new ArrayList<>();

        try {
            FileReader archivo = new FileReader("C:\\Users\\osori\\Desktop\\proveedores.txt");
            BufferedReader datos = new BufferedReader(archivo);
            String nit, nombre, telefono, direccion;

            while ((nit = datos.readLine()) != null) {
                nombre = datos.readLine();
                telefono = datos.readLine();
                direccion = datos.readLine();
                proveedores.add(new proveedor(nit, nombre, telefono, direccion));
            }
          
            archivo.close();
            datos.close();
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }

        return proveedores;
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

import Modelo.producto;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author osori
 */
public class gestionarProductos {

    Scanner scanner = new Scanner(System.in);

    /*public void leerProductos() {
        try {
            FileReader archivo = new FileReader("C:\\Users\\osori\\Desktop\\productos.txt");
            BufferedReader datos = new BufferedReader(archivo);
            String linea;

            while ((linea = datos.readLine()) != null) {
                System.out.println(linea);
            }

            archivo.close();
            datos.close();
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }
    }*/

    public void escribirNuevoProducto(String id, String nombre, double precio, int stock, String proveedor) {
        try {
            FileWriter archivo = new FileWriter("C:\\Users\\osori\\Desktop\\productos.txt", true);
            BufferedWriter datos = new BufferedWriter(archivo);

            datos.write(id);
            datos.newLine();
            datos.write(nombre);
            datos.newLine();
            datos.write(String.valueOf(precio));
            datos.newLine();
            datos.write(String.valueOf(stock));
            datos.newLine();
            datos.write(proveedor);
            datos.newLine();

            datos.close();
            archivo.close();
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo: " + ex.getMessage());
        }
        System.out.println("Producto inscrito exitosamente.");
    }

    public List<producto> imprimirProductos() {
        List<producto> productos = new ArrayList<>();

        try {
            FileReader archivo = new FileReader("C:\\Users\\osori\\Desktop\\productos.txt");
            BufferedReader datos = new BufferedReader(archivo);
            String codigo, nombre, proveedor;
            double precio;
            int stock;

            while ((codigo = datos.readLine()) != null) {
                nombre = datos.readLine();
                precio = Double.parseDouble(datos.readLine());
                stock = Integer.parseInt(datos.readLine());
                proveedor = datos.readLine();
                productos.add(new producto(codigo, nombre, precio, stock, proveedor));
            }
          
            archivo.close();
            datos.close();
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo: " + ex.getMessage());
        }

        return productos;
        
    }
}

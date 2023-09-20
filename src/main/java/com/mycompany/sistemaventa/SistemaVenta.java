/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.sistemaventa;

import Gestion.gestionarClientes;
import Gestion.gestionarEmpleados;
import Gestion.gestionarProductos;
import Gestion.gestionarProveedores;
import Modelo.empleado;
import Modelo.producto;
import Modelo.proveedor;
import java.util.List;

/**
 *
 * @author osori
 */
public class SistemaVenta {

    public static void main(String[] args) {
        // Productos
        gestionarProductos gestionar = new gestionarProductos();

        //gestionar.leerProductos();
        List<producto> listaProductos = gestionar.imprimirProductos();

        // Imprimir la lista de productos (SE NECESITA PARA LA EJECUCIÓN)
        for (producto producto : listaProductos) {
            System.out.println(producto);
            System.out.println("Inventario impreso exitosamente.");
        }

        // Empleados
        gestionarEmpleados gestionar2 = new gestionarEmpleados();
        List<empleado> listaEmpleados = gestionar2.imprimirEmpleados();

        // Imprimir la lista de empleados (SE NECESITA PARA LA EJECUCIÓN)
        for (empleado empleado : listaEmpleados) {
            System.out.println(empleado);
            System.out.println("Lista de empleados impresa exitosamente.");
        }
        
        // Proveedores
        gestionarProveedores gestionar3 = new gestionarProveedores();
        List<proveedor> listaProveedores = gestionar3.imprimirProveedores();

        // Imprimir la lista de empleados (SE NECESITA PARA LA EJECUCIÓN)
        for (proveedor proveedor : listaProveedores) {
            System.out.println(proveedor);
            System.out.println("Lista de proveedores impresa exitosamente.");
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author osori
 */
public class producto {

    // Atributos
    private String id;
    private String nombre;
    private String proveedor;
    private int stock;
    private double precio;

    // Constructor
    // public Productos() {}
    public producto(String id, String nombre, double precio, int stock, String proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.proveedor = proveedor;
    }

    // Métodos
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString() {
        return "Codigo: " + id + "\n"
                + "Nombre: " + nombre + "\n"
                + "Precio: " + precio + "\n"
                + "Stock: " + stock + "\n"
                + "Proveedor: " + proveedor + "\n";
    }
}

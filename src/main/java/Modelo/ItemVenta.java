/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author osori
 */
public class itemVenta {
    
    // Atributos
    private int id_venta;
    private int id_pro;
    private int cantidad;
    private double precio;

    // Constructor
    public itemVenta() {

    }
    
    public itemVenta(int id_venta, int id_pro, int cantidad, double precio) {
        this.id_venta = id_venta;
        this.id_pro = id_pro;
        this.cantidad = cantidad;
        this.precio = precio;

    }

    // Métodos
    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_pro() {
        return id_pro;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author osori
 */
public class proveedor {

    // Atributos
    private String nit;
    private String nombre;
    private String telefono;
    private String direccion;

    // Constructor
    public proveedor() {

    }

    public proveedor(String nit, String nombre, String telefono, String direccion) {
        this.nit = nit;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Métodos
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String toString() {
        return "NIT: " + nit + "\n"
                + "Nombre: " + nombre + "\n"
                + "Telefono: " + telefono + "\n"
                + "Direccion: " + direccion + "\n";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author osori
 */
public class empleado {
    
    // Atributos
    private String dni;
    private String nombre;

    // Constructor
    public empleado(){}

    public empleado (String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    // Métodos
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString() {
        return "CC: " + dni + "\n"
                + "Nombre: " + nombre + "\n";
    }
}

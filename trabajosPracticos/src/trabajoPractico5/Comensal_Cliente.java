/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico5;

/**
 *
 * @author Usuario
 */
public class Comensal_Cliente {
    private String nombre; 
    private String telefono; 
    public Comensal_Cliente(String nombre, String telefono) { this.nombre = nombre; this.telefono = telefono; } 
    public String getNombre() { return nombre; } 
    public String getTelefono() { return telefono; } 

    @Override
    public String toString() {
        return "nombre=" + nombre + ", telefono=" + telefono + '}';
    }

    
} 


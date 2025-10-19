/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico8;

/**
 *
 * @author Usuario
 */
public class Producto implements Pagable{
    private String nombre;
    private Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {return nombre;}
    public Double getPrecio() {return precio;}
    
    
    public double calcularTotal(){
        return this.precio;
    }
}

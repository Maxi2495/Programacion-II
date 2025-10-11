/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico6;

/**
 *
 * @author Usuario
 */
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getId() {return id;}
    public String getNombre() {return nombre;}
    public String getNacionalidad() {return nacionalidad;}
    
    public void mostrarInfo(){
        System.out.println("Datos del autor: ");
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Nacionalidad: " + this.nacionalidad);
    }
    
}

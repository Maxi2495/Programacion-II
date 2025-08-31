/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico3;

/**
 *
 * @author Usuario
 */
public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "\n" + "Especie: " + especie + "\n" + "Edad: " + edad);        
    }
    
    public void cumplirAnios() {
        edad += 1;
    }
    
    public void setDatosMascota(String nombre_mascota,String especie_mascota,int edad_mascota){
        nombre = nombre_mascota;
        especie = especie_mascota;
        edad = edad_mascota;}
        }

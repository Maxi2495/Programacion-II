/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico8;

/**
 *
 * @author Usuario
 */
public class Cliente implements Notificable {
    
    private String nombre;
    
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    // Implementación del método de la interfaz Notificable
    @Override
    public void cambioDeEstado(String mensaje) {
        System.out.println("Notificación para el cliente " + nombre + ": " + mensaje);}
} //Fin clase


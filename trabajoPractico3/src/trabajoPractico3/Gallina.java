/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico3;

/**
 *
 * @author Usuario
 */
import java.util.Random; //Importe para generar un id aleatorio de gallina

public class Gallina {
    
    Random random = new Random();
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public void ponerHuevo(int cantidad) {
        huevosPuestos += cantidad;
    }
    
    public void envejecer() {
        edad += 1;
    }
    
    public void idGallina() {
        idGallina = random.nextInt(1000); //Genero id aleatorio de gallina
    }
    
    public void mostrarEstado() {
        System.out.println("ID gallina: " + idGallina + "\n" + "Edad: " + edad + "\n" + "Huevos puestos: " + huevosPuestos);
    }
}

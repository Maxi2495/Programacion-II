/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico5;

/**
 *
 * @author Usuario
 */
public class Reproductor {
    public void Reproducir(Cancion cancion){
        System.out.print("Reproduciendo cancion " + cancion.getTitulo() + " " +cancion.getArtista().getNombre());
    }
}

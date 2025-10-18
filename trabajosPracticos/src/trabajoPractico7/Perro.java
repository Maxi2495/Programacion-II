/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico7;

/**
 *
 * @author Usuario
 */
public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau! Guau!");
    }
    
    @Override
    public void describirAnimal(){
        System.out.println("""
                           Tipo: mamifero
                           Raza: Boxer
                           Edad: 3 años""");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico7;

/**
 *
 * @author Usuario
 */
public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau! Miau!");
    }
    
    @Override
    public void describirAnimal(){
        System.out.println("""
                           Tipo: mamifero
                           Raza: Siames
                           Edad: 5 años""");
    }
}


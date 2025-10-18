/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico7;

/**
 *
 * @author Usuario
 */
public class Vaca extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Muuu! Muuu!");
    }
    
    @Override
    public void describirAnimal(){
        System.out.println("""
                           Tipo: mamifero
                           Raza: Holando Argentino
                           Edad: 8 años""");
    }
}

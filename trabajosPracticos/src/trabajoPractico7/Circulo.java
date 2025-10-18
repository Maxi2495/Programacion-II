/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico7;

import static java.lang.Math.PI;

/**
 *
 * @author Usuario
 */
public class Circulo extends FiguraGeometrica {

    private double radio;
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    
    
    
    @Override
    public void calcularArea(){
        System.out.println("Area calculada del " + super.nombre + ": " + (Math.PI * radio * radio));
    }
}

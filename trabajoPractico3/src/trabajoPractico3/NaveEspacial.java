/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico3;

/**
 *
 * @author Usuario
 */
public class NaveEspacial {
    
    private String nombre;
    private int combustible = 50;
    
    public int recargarCombustible(int unidades) {
        if ((combustible + unidades) <= 100) {
          combustible += unidades;}
        else {
             System.out.println("Su recarga supera el limite del tanque. Cargue menos");   
        }
        return combustible;
    }
    
    public void despegar() {
        if(combustible < 20){
            System.out.println("Combustible insuficiente. Por favor recargue");
        }
        else {
            System.out.println("Combustible suficiente. ¡¡¡DESPEGUE!!!");
        }
    }
    
    public void avanzar(int distancia) {
        if (combustible > 10) {
            System.out.println("Avanzando " + distancia + " unidades de distancia");
            combustible -= 10;} //Establezco que consume 10 unidades de combustible por cualquier distancia que recorra
            else{
                System.out.println("Combustible insuficiente. No se puede avanzar");
        }            
    }
    public void nombreNave(String nombreNave){
        nombre = nombreNave;
    }
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible " + combustible);
    }
}

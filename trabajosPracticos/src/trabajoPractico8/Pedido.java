/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico8;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Pedido implements Pagable {
     private ArrayList<Producto> productos;
     private double montoMaximo = 750.5; //Establezco un monto maximo que se pretende gastar por pedido. Es arbitrario
    private String estado = "PENDIENTE"; //Estado para el envio del mensaje
    private ArrayList<Notificable> observadores; //lista de clientes
    
    public Pedido(ArrayList<Producto> productos) {
        this.productos = productos;
        this.observadores = new ArrayList<>();
    }
    
    //Agrego el cliente al pedido
    public void agregarObservador(Notificable n) {
        this.observadores.add(n);
    } 
    
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("\nEstado del Pedido actualizado a: " + nuevoEstado);       
        notificarObservadores("El estado de su pedido ha cambiado a: " + nuevoEstado);
    }
    
    private void notificarObservadores(String mensaje) {
        for (Notificable observador : observadores) {
            observador.cambioDeEstado(mensaje);
        }
    }
    
     public void agregarProductos(Producto p){        
        this.productos.add(p);       
     }   
     
     @Override
     public double calcularTotal(){
         double totalAcumulado = 0.0;
         for (Producto producto : productos) {
            totalAcumulado += producto.calcularTotal();
         } //Fin for        
         return totalAcumulado; }//Fin del metodo
     
         public void cambioDeEstado(Cliente c){
             System.out.println("Usted ha hecho un consumo en su cuenta bancaria");
         }

} //Fin de la clase
     
     

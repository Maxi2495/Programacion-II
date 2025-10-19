/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico8;

/**
 *
 * @author Usuario
 */
public class TarjetaDeCredito implements Pago, PagoConDescuento {
    private double saldo = 75000.0;
    public double aplicarDescuento(double montoBase) {
        
        double descuento = montoBase * 0.10;
        return montoBase - descuento;
    }
    
    @Override
    public double procesarPago(double monto){
        if(this.saldo <= 1500.0){
            System.out.println("Pago procesado");
            this.saldo -= monto;
        } //Fin if
        else{
            System.out.println("Saldo insuficiente");
        }
        return saldo;        
    }
}

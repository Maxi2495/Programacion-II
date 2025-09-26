/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico5;

/**
 *
 * @author Usuario
 */
public class Reserva {
    private String fecha; 
    private String hora; 
    private Comensal_Cliente consumidor; // unidireccional 
    private Mesa mesa;             // agregación 
 
    public Reserva(String fecha, String hora, Comensal_Cliente consumidor) { 
        this.fecha = fecha; 
        this.hora = hora; 
        this.consumidor = consumidor; 
    } 
 
    public void setMesa(Mesa mesa) { this.mesa = mesa; } 
 
    public String getFecha() { return fecha; } 
    public String getHora() { return hora; } 
    public Comensal_Cliente getConsumidor() { return consumidor; } 
 
    public Mesa getMesa() { return mesa; } 

}

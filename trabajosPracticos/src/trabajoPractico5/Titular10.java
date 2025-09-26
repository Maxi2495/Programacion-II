/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico5;

/**
 *
 * @author Usuario
 */
public class Titular10 {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public Titular10(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setCuenta(CuentaBancaria cuenta){
        this.cuentaBancaria = cuenta;
        if(cuenta != null && cuenta.getTitular10() != this) {
            cuenta.setTitular10(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    @Override
    public String toString() {
        return "Titular10{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
    
}

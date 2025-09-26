/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico5;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    private String cbu;
    private  int saldo;
    private Titular10 titular;
    private ClaveSeguridad clave;
    

    public CuentaBancaria(String cbu, int saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
    }
    
    public void setTitular10(Titular10 titular){
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this){
            titular.setCuenta(this);
        }
    }

    public String getCbu() {
        return cbu;
    }

    public int getSaldo() {
        return saldo;
    }

    public Titular10 getTitular10() {
        return titular;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    @Override
    public String toString() {
        return "cbu= " + cbu + ", saldo= " + saldo + ", titular= " + titular + ", clave= " + clave + '}';
    }
    
    
    
    
    
}

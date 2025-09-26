/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico5;

/**
 *
 * @author Usuario
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private Propietario propietario;
    private PlacaMadre placamadre;
    private String modelo;
    private String chipset;

    public Computadora(String marca, String numeroSerie, Propietario propietario, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.propietario = propietario;
        this.placamadre = new PlacaMadre(this.modelo,this.chipset);
    }
    
    public void setPropietario(Propietario propietario){
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public PlacaMadre getPlacamadre() {
        return placamadre;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", propietario=" + propietario + ", placamadre=" + placamadre + ", modelo=" + modelo + ", chipset=" + chipset + '}';
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico5;

/**
 *
 * @author Usuario
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    
    private Bateria bateria; //Aca hago la agregacion
    private Usuario usuario; //Aca hago la doble asociacion con usuario

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this ) {
            usuario.setCelular(this);}
    }
    
    public Usuario getUsuario() {return usuario;}
    public String getImei() {return imei;}
    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public Bateria getBateria() {return bateria;}    
}

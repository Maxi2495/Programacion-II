/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico5;

/**
 *
 * @author Usuario
 */
public class FirmaDigital {
    private String codigoHash; 
    private String fecha; 
    private UsuarioFirma usuario; 
 
    public FirmaDigital(String codigoHash, String fecha) { 
        this.codigoHash = codigoHash; 
        this.fecha = fecha; 
    } 
 
    public void setUsuario(UsuarioFirma usuario) { this.usuario = usuario; } 
    public UsuarioFirma getUsuario() { return usuario; } 
    public String getCodigoHash() { return codigoHash; } 
    public String getFecha() { return fecha; }
}

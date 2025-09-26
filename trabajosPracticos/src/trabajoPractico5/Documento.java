/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico5;

/**
 *
 * @author Usuario
 */
public class Documento {
    private String titulo; 
    private String contenido; 
    private FirmaDigital firma;  
    private String codigoHash;
    private String fecha;
 
    public Documento(String titulo, String contenido,String codigoHash, String fecha ) { 
        this.titulo = titulo; 
        this.contenido = contenido; 
        this.firma = new FirmaDigital(codigoHash, fecha); 
    } 
 
    public String getTitulo() { return titulo; } 
    public String getContenido() { return contenido; } 
    public FirmaDigital getFirma() { return firma; } 

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico5;

/**
 *
 * @author Usuario
 */
public class GeneradorQR {
    public void generarQR(String valor, Usuario12 usuario12 ){
        CodigoQR codigoQR = new CodigoQR(valor, usuario12);
        System.out.println("QR generado para " + usuario12.getNombre() + ": " + codigoQR.getValor()); 
    }
}


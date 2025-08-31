/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico3;

/**
 *
 * @author Usuario
 */
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    public String nombreLibro(String nombre) {
        return titulo = nombre;
    }
    
    public String autorLibro(String autor_libro){
        return autor = autor_libro;
    }
    
    public void añoLibro(int añoActual, int añoPublicado) {
        if (añoActual < añoPublicado) {
            System.out.println("Debe indicarse una fecha valida de publicacion");
            //Esto es por si se intenta ingresar fecha de publicacion 2030 cuadno estamos en 2025
        }
        else {
            añoPublicacion = añoPublicado ;
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Titulo " + titulo);
        System.out.println("Autor " + autor);
        System.out.println("Fecha de publicación " + añoPublicacion);
    }
}

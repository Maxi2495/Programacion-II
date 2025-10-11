/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico6;
import java.util.ArrayList;


/**
 *
 * @author Usuario
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
        Libro libro = new Libro(isbn,titulo,anioPublicacion,autor);
        if(libro != null && !libros.contains(libro)){
            libros.add(libro);
        }//Cierre del if
        else {
            System.out.println("Error: el libro de ISBN " + libro.getIsbn() + " ya existe en la biblioteca");;
        } //Cierre else
    } //Cierre clase agregarLibro 
    
    public void listarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInfo();
            System.out.println("\n");
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if(libro.getIsbn().equals(isbn)){
                libro.mostrarInfo();
                return libro; //Para cortar el for
            }//Cierre if            
        } //Cierre for
       System.out.println("No se encontro el libro"); 
       return null;
    }
    
    public void eliminarLibro(String isbn) {
        Libro libroEliminar = this.buscarLibroPorIsbn(isbn);
        if (libroEliminar != null){
            libros.remove(libroEliminar);
            System.out.println("Se eliminó el libro correctamente. Título: " + libroEliminar.getTitulo());
        }
        else {
            System.out.println("No se encontro el libro");
        }
  }//Fin de la clase
    
    public int obtenerCantidadLibros() {
        int cantidad = libros.size();
        return cantidad;
    }
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> librosFiltrados = new ArrayList<>();
        for (Libro libro : libros) {
            if(libro.getAnioPublicacion() == anio){
                librosFiltrados.add(libro);
            } //Fin if
        } //Fin for
       
        return librosFiltrados;
    }
    
    public ArrayList<Autor> mostrarAutoresDisponibles() {
        ArrayList<Autor> autoresDisponibles = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor() != null && !autoresDisponibles.contains(libro.getAutor())){
                autoresDisponibles.add(libro.getAutor());
            }       
        }
        return autoresDisponibles;
    }
    
    
}//Fin de clase

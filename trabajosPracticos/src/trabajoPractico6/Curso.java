/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico6;

/**
 *
 * @author Usuario
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void setProfesor(Profesor nuevoProfesor) {
        if(this.profesor != null){
            this.profesor.eliminarCurso(this);}
        this.profesor = nuevoProfesor;
        if(nuevoProfesor != null){
            nuevoProfesor.agregarCurso(this);}
    }
    
    public void mostrarInfo(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Profesor: " + this.getNombreProfesor());
        }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    public String getNombreProfesor(){
        return profesor.getNombre();
    }
    
    
    
    
    } //Cierre de clase
    

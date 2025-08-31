/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico3;

/**
 *
 * @author Usuario
 */
public class Estudiantes {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Curso: " + curso + "\n" + "Calificacion: " + calificacion);
    }
    
    public void subirCalificacion(double puntos) {
        if (calificacion + puntos > 10) {
            System.out.println("La nota no puede superar el valor de 10");}
        else {
            calificacion += puntos;}
    }
    
    public void bajarCalificacion(double puntos) {
        if (calificacion - puntos < 1) {
            System.out.println("La nota no puede ser menor a 0");}
        else {
            calificacion -= puntos;}
    }
    
    public void setDatosEstudiante(String nombre_estudiante,String apellido_estudiante,String curso_estudiante, double calificacion_estudiante) {
        nombre = nombre_estudiante;
        apellido = apellido_estudiante;
        curso = curso_estudiante;
        calificacion = calificacion_estudiante;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<Curso>();
    }
    
    
    
    public void agregarCurso(Curso c){
        if(!cursos.contains(c)){
         cursos.add(c);}
        else {System.out.println("El profesor " + this.nombre + " ya tiene el curso asignado");}
    }
    
    public void eliminarCurso(Curso c){
        if(cursos.contains(c)){
            cursos.remove(c);}
        else{System.out.println("El curso no esta asignado");}
        }
    public void listarCursos() {
        if(!cursos.isEmpty()){
        for (Curso curso : cursos) {
            System.out.println(curso.getCodigo());
            System.out.println(curso.getNombre());
            System.out.println("\n");
        }}
        else {System.out.println("El profesor no tiene cursos asignados");}
    }
    
    public void mostrarInfo(){
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
        }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    //Esto es para completar eliminarProfesor en la clase universidad
    public ArrayList<Curso> getCursosDictados() {
     return cursos;}
     
    
} //Cierre de clase

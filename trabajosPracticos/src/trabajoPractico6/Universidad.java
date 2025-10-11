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
public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public Profesor buscarProfesorPorId(String id){
        for (Profesor profesor : profesores) {
            if(profesor.getId().equals(id)){
                return profesor;
            }
        }       
        return null;
    }
    
    public void agregarProfesor(Profesor p) {
            if(this.buscarProfesorPorId(p.getId()) == null){
                profesores.add(p);}
            else{
               System.out.println("El profesor ya está agregado en la universidad");}
    }
    
    public void agregarCurso(Curso c){
        if(this.buscarCursoPorCodigo(c.getCodigo()) == null){
            cursos.add(c);
        }
        else{System.out.println("No se puedo agregar el curso");}
    } 
    
    public Curso buscarCursoPorCodigo(String codigo){
        for (Curso curso : cursos) {
            if(curso.getCodigo().equals(codigo)){
                return curso;}
        }
        return null;
    }
    
    public Curso asignarProfesorACurso(String codigoCurso, String idProfesor){
        Profesor profesorAAsignar = this.buscarProfesorPorId(idProfesor);
        Curso cursoAAsignar = this.buscarCursoPorCodigo(codigoCurso);
        if(profesorAAsignar != null && cursoAAsignar != null){
            cursoAAsignar.setProfesor(profesorAAsignar);
            System.out.println("Profesor asignado: " + profesorAAsignar.getNombre() + "\n" + "Curso asignado: " + cursoAAsignar.getNombre());
            return cursoAAsignar;}
        else{System.out.println("No se pudo asignar el profesor y/o curso");}
        return null;}  
       
    public void listarProfesores(){
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
            System.out.println("\n");
        }
    }
    
    public void eliminarProfesor(String id){
        Profesor profesorAeliminar = this.buscarProfesorPorId(id);
        if(profesorAeliminar != null){
         ArrayList<Curso> cursosDictados = new ArrayList<>(profesorAeliminar.getCursosDictados());
         for (Curso curso : new ArrayList<>(cursosDictados)) { 
            curso.setProfesor(null);
        } //Fin for 
        profesores.remove(profesorAeliminar);
        System.out.println("Profesor " + profesorAeliminar.getNombre() + 
        " eliminado y sus cursos han sido desasignados.");}//Fin if
    }//Fin metodo
    
    public void eliminarCurso(String codigo) {
    Curso cursoAeliminar = this.buscarCursoPorCodigo(codigo);
    if (cursoAeliminar != null) {     
        Profesor profesorActual = cursoAeliminar.getProfesor();        
        if (profesorActual != null) {            
            profesorActual.eliminarCurso(cursoAeliminar);}       

        cursos.remove(cursoAeliminar);
        System.out.println("El curso con código " + codigo + " ha sido eliminado de la Universidad.");        
    } else {
        System.out.println("No se pudo completar la eliminación.");}
}//Fin metodo
    
} //Fin clase

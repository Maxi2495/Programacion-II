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

        public class main {
    public static void main(String[] args) {
        System.out.println("1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.");
        //(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria)
        Producto p1 = new Producto("1", "Afeitadora",25.0,2,CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("2", "Camisa",7.0,5,CategoriaProducto.ROPA);
        Producto p3 = new Producto("3", "Cocina",100.0,1,CategoriaProducto.HOGAR);
        Producto p4 = new Producto("4", "Heladera",125.0,1,CategoriaProducto.HOGAR);
        Producto p5 = new Producto("5", "Leche",2.0,12,CategoriaProducto.ALIMENTOS);
        
        Inventario inventario = new Inventario(); //Creo el inventario
        Producto[] productosAAgregar = {p1,p2,p3,p4,p5}; //Para facilitar la carga  al inventario
        for (Producto producto : productosAAgregar) {
            inventario.agregarProducto(producto);}
        
        System.out.println("\n"); //Separador
        System.out.println("2. Listar todos los productos mostrando su información y categoría.");
        inventario.listarProductos();
        
        System.out.println("\n"); //Separador
        System.out.println("3. Buscar un producto por ID y mostrar su información.");
        inventario.buscarProductoPorId("4");
        
        System.out.println("\n"); //Separador
        System.out.println("4. Filtrar y mostrar productos que pertenezcan a una categoría específica.");
        inventario.filtrarPorCategoria(CategoriaProducto.HOGAR);
        
        System.out.println("\n"); //Separador
        System.out.println("5. Eliminar un producto por su ID y listar los productos restantes.");
        inventario.eliminarProducto("4");
        inventario.listarProductos();
        
        System.out.println("\n"); //Separador
        System.out.println("6. Actualizar el stock de un producto existente.");
        inventario.buscarProductoPorId("2"); //Previo a actualizar
        inventario.actualizarStock("2", 9);
        inventario.buscarProductoPorId("2"); //Post actualizacion
        
        System.out.println("\n"); //Separador
        System.out.println("7. Mostrar el total de stock disponible.");
        System.out.println(inventario.obtenerTotalStock());
        
        System.out.println("\n"); //Separador
        System.out.println("8. Obtener y mostrar el producto con mayor stock.");
        inventario.obtenerProductoConMayorStock();
        
        System.out.println("\n"); //Separador
        System.out.println("9. Filtrar productos con precios entre $1000 y $3000.");
        System.out.println(inventario.filtrarProductosPorPrecio(1000.0, 3000.0));
        
        System.out.println("\n"); //Separador
        System.out.println("10. Mostrar las categorías disponibles con sus descripciones.");
        System.out.println(inventario.mostrarCategoriasDisponibles());
        
        //PARTE 2 Nuevo Ejercicio Propuesto 2: Biblioteca y Libros
        System.out.println("--------------------------------PARTE 2-------------------------------------------");
        System.out.println("1. Creamos una biblioteca.");
        Biblioteca biblioteca = new Biblioteca("Biblioteca popular Córdoba");
        System.out.println("\n"); //Separador
        
        System.out.println("2. Crear al menos tres autores ");
        Autor a1 = new Autor("1","Felipe Pigna","Argentino");
        Autor a2 = new Autor("2","Norberto Galasso","Argentino");
        Autor a3 = new Autor("3","Guadalupe Nogues","Argentina");

        System.out.println("\n"); //Separador
        System.out.println("3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.");
        //(String isbn, String titulo, int anioPublicacion, Autor autor)
        biblioteca.agregarLibro("1","La voz del gran jefe",2014,a1);
        biblioteca.agregarLibro("2","Pensa con otros",2022,a3);
        biblioteca.agregarLibro("3","Don Hipolito",2015,a2);
        biblioteca.agregarLibro("4","Belgrano",2020,a1);
        biblioteca.agregarLibro("5","Seamos libres",2001,a2);     
        
 
        System.out.println("\n"); //Separador
        System.out.println("4. Listar todos los libros con su información y la del autor.");
        biblioteca.listarLibros();
        

        System.out.println("\n"); //Separador
        System.out.println("5. Buscar un libro por su ISBN y mostrar su información.");
        biblioteca.buscarLibroPorIsbn("4");

        System.out.println("\n"); //Separador
        System.out.println("6. Filtrar y mostrar los libros publicados en un año específico.");
        ArrayList<Libro> librosDelAnio = biblioteca.filtrarLibrosPorAnio(2001);
        for (Libro libro : librosDelAnio) {
            libro.mostrarInfo();
        }

        System.out.println("\n"); //Separador
        System.out.println("7. Eliminar un libro por su ISBN y listar los libros restantes.");
        System.out.println("Cantidad de libros en biblioteca antes de eliminar el libro " + biblioteca.obtenerCantidadLibros());
        biblioteca.eliminarLibro("2");
        System.out.println("Cantidad de libros en biblioteca después de eliminar el libro " + biblioteca.obtenerCantidadLibros() );

        System.out.println("\n"); //Separador
        System.out.println("8. Mostrar la cantidad total de libros en la biblioteca.");
        System.out.println(biblioteca.obtenerCantidadLibros());
        
        System.out.println("\n"); //Separador
        System.out.println("9. Listar todos los autores de los libros disponibles en la biblioteca.");
        ArrayList<Autor> autoresDisponibles = biblioteca.mostrarAutoresDisponibles();
        for (Autor autoresDisponible : autoresDisponibles) {
            autoresDisponible.mostrarInfo();
        }
        System.out.println("\n"); //Separador

        // PARTE 3 Ejercicio: Universidad, Profesor y Curso (bidireccional 1 a N) 
        System.out.println("--------------------------------PARTE 3-------------------------------------------");
        System.out.println("\n"); //Separador
        System.out.println("1. Crear al menos 3 profesores y 5 cursos.");
        Profesor pr1 = new Profesor("1","Gustavo Perez","Quimica");
        Profesor pr2 = new Profesor("2","Maria Becerra","Matematica");
        Profesor pr3 = new Profesor("3","Maximiliano Niemiec","Fisica");
        
        Curso c1 = new Curso("101","Quimica I");
        Curso c2 = new Curso("102","Fisica I");
        Curso c3 = new Curso("103","Matematicaa I");
        Curso c4 = new Curso("104","Quimica II");
        Curso c5 = new Curso("105","Laboratorio I");
        
        System.out.println("\n"); //Separador        
        System.out.println("2. Agregar profesores y cursos a la universidad.");
        Universidad UNC = new Universidad("Universidad Nacional de Córdoba");
        //Para facilitar la garga
        Profesor[] profesoresAAgregar = {pr1,pr2,pr3};
        Curso[] cursosAAgregar = {c1,c2,c3,c4,c5};
        for (Curso curso : cursosAAgregar) { //Agrego los cursos a la universidad
            UNC.agregarCurso(curso);}
        for (Profesor profesor : profesoresAAgregar) { //Agrego los profesores
            UNC.agregarProfesor(profesor);}
        
        System.out.println("\n"); //Separador        
        System.out.println("3. Asignar profesores a cursos usando asignarProfesorACurso(...).");
        UNC.asignarProfesorACurso("101", "1");
        UNC.asignarProfesorACurso("102", "3");
        UNC.asignarProfesorACurso("103", "2");
        UNC.asignarProfesorACurso("104", "1");
        UNC.asignarProfesorACurso("105", "3");
        
        System.out.println("\n"); //Separador 
        System.out.println("4. Listar cursos con su profesor y profesores con sus cursos. ");  
        System.out.println("Listado de cursos");
        c1.mostrarInfo();  
        c2.mostrarInfo();  
        c3.mostrarInfo();  
        c4.mostrarInfo();  
        c5.mostrarInfo();  
        
        System.out.println("Listado de profesores");
        pr1.mostrarInfo();
        pr2.mostrarInfo();
        pr3.mostrarInfo();
        
        System.out.println("\n"); //Separador
        System.out.println("5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.");
        System.out.println("Profesor antes del cambio " + "\n" );
        pr1.mostrarInfo();
        System.out.println("Curso antes del cambio" + "\n");
        c1.mostrarInfo();
        pr1.eliminarCurso(c1);  
//      c1.setProfesor(null); Descomentar para ver bien
        System.out.println("\n" + "Profesor despues de la modificacion");
        pr1.mostrarInfo();
//      System.out.println("\n" + "Curso despues de la modificacion"); Descomentar para ver bien
//      c1.mostrarInfo(); Descomentar para ver bien

        System.out.println("\n"); //Separador
        System.out.println("5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.");
        System.out.println("Curso antes de ser modificado ");
        c3.mostrarInfo();
        System.out.println("");
        
        System.out.println("Profesor antes de ser modificado ");
        pr2.mostrarInfo();
        System.out.println("");
        
        System.out.println("curso despues de ser modificado");
        c3.setProfesor(pr3);
        c3.mostrarInfo();
        System.out.println("");

        
        System.out.println("Profesor despues de ser modificado ");
        pr2.mostrarInfo();
        System.out.println("");
        
        System.out.println("\n");
        System.out.println("6. Remover un curso y confirmar que ya no aparece en la lista del profesor. ");
        System.out.println("Cursos del profesor antes de remover el curso");
        pr3.listarCursos();
        
        pr3.eliminarCurso(c2);
        System.out.println("");
        
        System.out.println("Cursos del profesor despues de remover el curso");
        pr3.listarCursos();
        
        System.out.println("\n"); //Separador
        System.out.println("7. Remover un profesor y dejar profesor = null,");
        UNC.eliminarProfesor("1");
        
        System.out.println("\n"); //Separador
        System.out.println("8. Mostrar un reporte: cantidad de cursos por profesor. ");
        System.out.println("Cantidad de cursos de " + pr1.getNombre());
        System.out.println(pr1.getCursosDictados().size());
        System.out.println("");
        
        System.out.println("Cantidad de cursos de " + pr2.getNombre());
        System.out.println(pr2.getCursosDictados().size());
        System.out.println("");
        
        System.out.println("Cantidad de cursos de " + pr3.getNombre());
        System.out.println(pr3.getCursosDictados().size());
        

        
        
        
        

        
        


        


        
 /* 
 Tareas a realizar  

  

 
 */
        

        

        
        
        
    }//Cierre del main
    
}//Cierre de la clase

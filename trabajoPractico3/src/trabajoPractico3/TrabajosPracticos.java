/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoPractico3;

/**
 *
 * @author Usuario
 */
public class TrabajosPracticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instancio un objeto a partir la clase estudiantes
        Estudiantes estudiante1 = new Estudiantes();
        estudiante1.setDatosEstudiante("Maximiliano", "Niemiec", "Tecnicatura Universitaria en Programacion", 7);
        estudiante1.mostrarInfo();
        System.out.println("---------------------------------------------------------------------");
        estudiante1.subirCalificacion(8);
        estudiante1.bajarCalificacion(5);
        estudiante1.mostrarInfo();
        
        
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Mascota");
        Mascota mascota1 = new Mascota();
        mascota1.setDatosMascota("Bobby", "Delmo",5);
        mascota1.mostrarInfo();
        System.out.println("Paso un año");
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();
        
        
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Libro");
        Libro libro1 = new Libro();
        libro1.autorLibro("Pigna");
        libro1.nombreLibro("San Martin");
        libro1.añoLibro(2025, 2060);
        libro1.añoLibro(2025,2014);
        libro1.mostrarInfo();
        
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Granja digital");
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        System.out.println("-----Gallina 1-----");
        gallina1.mostrarEstado();
        System.out.println("-----Gallina 2-----");
        gallina2.mostrarEstado();
        System.out.println("-----Cambios en los estados-----");
        gallina1.idGallina(); //Genero ID's a cada una
        gallina2.idGallina();
        gallina1.ponerHuevo(5); //Las gallinas ponen huevos
        gallina2.ponerHuevo(2);
        for (int i = 0; i < 3; i++){ //Envejezco la gallinas
            gallina1.envejecer();}
        gallina2.envejecer();
        System.out.println("-----Gallina 1-----");
        gallina1.mostrarEstado();
        System.out.println("-----Gallina 2-----");
        gallina2.mostrarEstado();

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Nave espacial");
        NaveEspacial nave1 = new NaveEspacial();
        nave1.nombreNave("ARSAT-1");
        nave1.mostrarEstado();
        System.out.println("¿Despegara?");
        nave1.despegar();
        for (int i = 0; i < 4; i++) {
            nave1.avanzar(2);} //Avanzo la nave para disminuir 40 unidades de combustible
        nave1.avanzar(1); //Fuerzo el avance para tener un error
        nave1.recargarCombustible(180); //Cargo mucho para que me de error
        nave1.recargarCombustible(60); //Cargo suficiente y vuelvo a avanzar
        nave1.avanzar(5);
    }
}

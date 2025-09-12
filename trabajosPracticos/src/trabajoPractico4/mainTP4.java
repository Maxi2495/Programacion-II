/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico4;

/**
 *
 * @author Usuario
 */
public class mainTP4 {
    public static void main(String[] args) {
//Instancie varios objetos usando ambos constructores.

    // Constructor completo
    Empleado empleado1 = new Empleado(1, "Maximiliano Niemiec", "Bioquimico", 150000);
    Empleado empleado2 = new Empleado(2, "Juan Lopez", "Martillero", 150000);

    //Constructor con nombre y puesto
    Empleado empleado3 = new Empleado("Angel Ponce", "Deportista");
    Empleado empleado4 = new Empleado("Maria Lizarte", "Nutricionista");
    
//Aplique los métodos actualizarSalario() sobre distintos empleados.     

    System.out.println("Salario del Empleado 1: " + "\n" + empleado1.getSalario());
    empleado1.actualizarSalario(10.0);
    System.out.println("Empleado 1 se le actualizo en un %10 su salario. Ahora es: " + "\n" + empleado1.getSalario());

    System.out.println(""); //Linea separadora
    
    System.out.println("Actualizacion fija de 50.000 a empleado 2: ");
    System.out.println("Salario Empleado2: " + empleado2.getSalario());
    empleado2.actualizarSalario(50000);
    System.out.println("Salario actualizado: " + empleado2.getSalario());
    
    System.out.println(""); //Linea separadora
    
//Imprima la información de cada empleado con toString().     

    System.out.println("Lista de empleados: " + "\n" + empleado1.toString() + "\n" + empleado2.toString() + "\n" + empleado3.toString() + "\n" + empleado4.toString());
    System.out.println(""); //Linea separadora
    
// Muestro cantidad de empleados
    System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());

}
}

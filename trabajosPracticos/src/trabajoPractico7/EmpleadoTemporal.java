/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico7;

/**
 *
 * @author Usuario
 */
public class EmpleadoTemporal extends Empleado {
    
    private int diasTrabajados;
    private double salarioPorDia;

    public EmpleadoTemporal(int diasTrabajados, double salarioPorDia, String nombre) {
        super(nombre);
        this.diasTrabajados = diasTrabajados;
        this.salarioPorDia = salarioPorDia * 1.4; //Como es por temporada, cobra mas
    }
    
    public void calcularSueldo(){
         double salario = this.diasTrabajados * this.salarioPorDia;
         System.out.println("El empleado " + super.nombre + " tiene un salario de " + salario);
     }
    
    
}

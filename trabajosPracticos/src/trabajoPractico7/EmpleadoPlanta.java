/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico7;

/**
 *
 * @author Usuario
 */
public class EmpleadoPlanta extends Empleado {
    private int diasTrabajados;
    private double salarioPorDia;

    public EmpleadoPlanta(int diasTrabajados, double salarioPorDia, String nombre) {
        super(nombre);
        this.diasTrabajados = diasTrabajados;
        this.salarioPorDia = salarioPorDia;
    }
        
     public void calcularSueldo(){
         double salario = this.diasTrabajados * this.salarioPorDia;
         System.out.println("El empleado " + super.nombre + " tiene un salario de " + salario);
     }
}

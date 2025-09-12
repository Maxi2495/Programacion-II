/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico4;

/**
 *
 * @author Usuario
 */
public class Empleado {
    //Atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    // Atributos estaticos 
    private static int totalEmpleados = 0; 
    private static int secuenciaId = 1; // para IDs automaticos 
    private static final double SALARIO_POR_DEFECTO = 100000.0; 
 
    // Constructor con todos los atributos como parametro
    public Empleado(int id, String nombre, String puesto, double salario) { 
        this.id = id;                // uso de this para distinguir atributo vs parametro 
        this.nombre = nombre; 
        this.puesto = puesto; 
        this.salario = salario; 
 
        totalEmpleados++; //Incremento del total de empleados
 
        // Si me dan un id alto, aseguro que los IDs que vendran salgan desde ahi 
        if (id >= secuenciaId) { 
            secuenciaId = id + 1; 
        } 
    } 
 
    // Constructor con nombre y puesto (ID automatico - salario por defecto) 
    public Empleado(String nombre, String puesto) { 
        this.id = secuenciaId++;     // ID automático 
        this.nombre = nombre; 
        this.puesto = puesto; 
        this.salario = SALARIO_POR_DEFECTO; 
 
        totalEmpleados++; //Incremento del total de empleados
    } 
 
    // Metodos sobrecargados actualizarSalario: 
    // 1) Por porcentaje (ej: 10 => +10%) 
    public void actualizarSalario(double porcentaje) { 
        this.salario += this.salario * (porcentaje / 100.0); 
    } 
 
    // 2) Por cantidad fija 
    public void actualizarSalario(int cantidadFija) { 
        this.salario += cantidadFija; 
    } 
 
    // toString legible 
    @Override 
    public String toString() { 
        return "nombre " + nombre + "\n" + "Puesto: " + puesto + "\n" + "Salario: " + salario + "\n" + "ID: " + id;
    } 
 
    // Metodo estatico para mostrar el total de empleados 
    public static int mostrarTotalEmpleados() { 
        return totalEmpleados; 
    } 
 
    // Getters & Setters
    public int getId() { return id; } 
    public String getNombre() { return nombre; } 
    public String getPuesto() { return puesto; } 
    public double getSalario() { return salario; } 
 
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    } 
 
    public void setPuesto(String puesto) { 
        this.puesto = puesto; 
    } 
 
    public void setSalario(double salario) { 
        if (salario < 0) throw new IllegalArgumentException("El salario no puede ser negativo"); 
        this.salario = salario; 
    } 
} 

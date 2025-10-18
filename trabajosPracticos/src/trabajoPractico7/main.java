/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico7;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class main {
    public static void main(String[] args) {
        
System.out.println("1) Tarea: Instanciar un auto y mostrar su información completa.  ");       
Vehiculo auto = new Auto(5,"Chevrolet","Celta");
auto.mostrarInfo();
System.out.println("");

System.out.println("2. Figuras geométricas y métodos abstractos");
ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
Circulo circulo = new Circulo("Circulo",5.0);
Rectangulo rectangulo = new Rectangulo(8.5,9.0,"Rectangulo");
figuras.add(circulo);
figuras.add(rectangulo);

        for (FiguraGeometrica figura : figuras) {
            figura.calcularArea();
        }
        
System.out.println("");
System.out.println("3. Empleados y polimorfismo");

ArrayList<Empleado> empleados = new ArrayList<>();
EmpleadoPlanta ep = new EmpleadoPlanta(28,20546.65,"Matias");
EmpleadoTemporal et = new EmpleadoTemporal(15,19543.20,"Tamara");
empleados.add(ep);
empleados.add(et);
        for (Empleado empleado : empleados) {
            if(empleado instanceof EmpleadoPlanta){
                empleado.calcularSueldo();
            }
            else{
                empleado.calcularSueldo();} //Fin else
        } //Fin for   
        
System.out.println("");
        
System.out.println("4. Animales y comportamiento sobrescrito");
Animal gato = new Gato();
Animal perro = new Perro();
Animal vaca = new Vaca();
ArrayList<Animal> animales = new ArrayList<>();
animales.add(vaca);
animales.add(perro);
animales.add(gato);

        for (Animal animal : animales) {
            if(animal instanceof Vaca){
                animal.hacerSonido();
                System.out.println("La vaca esta mugiendo!" + "\n");
            }
            else if(animal instanceof Gato){
                animal.hacerSonido();
                System.out.println("El gato esta maullando!" + "\n");
            }
            else if(animal instanceof Perro){
                animal.hacerSonido();
                System.out.println("El perro esta ladrando!" + "\n");
            }
        }
    } //Fin main
} //Fin clase

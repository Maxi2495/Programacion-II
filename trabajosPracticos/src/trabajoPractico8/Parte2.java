/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Parte2 {
Scanner sc = new Scanner(System.in);
    public void divisor(){        
        System.out.println("Ingrese el divisor: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("");
        System.out.println("Ingrese el dividendo: ");
        int b = Integer.parseInt(sc.nextLine());
        try {
             double c = (a / b);
             System.out.println("Resultado: " + c);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");            
        } //Fin catch         
    } //Fin metodo
    
    public void conversor(){
    String nombre;
    System.out.println("Ingrese un nombre por favor");
    nombre = sc.nextLine();
        try {
            int numConvertido = Integer.parseInt(nombre);
        } catch (NumberFormatException nfe) {
            System.out.println("No se puede convertir un String a un numero!");
        } //Fin catch
    } //Fin metodo
    
    public void leerTexto() throws FileNotFoundException {
        System.out.println("Cargue la ruta del archivo");
        String ruta = sc.nextLine();
        File elArchivo = new File(ruta);
        try {
            BufferedReader br = new BufferedReader(new FileReader(elArchivo));
            System.out.println(br.lines()); //Leo las lineas del archivo
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontro la ruta de el archivo: " + ruta);
        } //Fin catch
        }
    
    public void validarEdad() {
    int edad = 0;
    System.out.println("Ingrese su edad por favor:");
    String input = sc.nextLine(); // Leer la entrada como texto    
    try {
        edad = Integer.parseInt(input);  
      
        if (edad < 0 || edad > 120) {
            
            String mensajeError = "La edad ingresada (" + edad + ") es inválida. Debe estar entre 0 y 120.";
            throw new EdadInvalidaException(mensajeError); 
        }        
      
        System.out.println("Edad validada correctamente: " + edad);
        
    } catch (NumberFormatException nfe) {
        
        System.out.println("ERROR: La entrada no es un número entero válido.");
        
    } catch (EdadInvalidaException eie) {
        
        System.out.println("?ERROR de Validación: " + eie.getMessage()); 
        
    } //Fin catch
} //Fin metodo
    
    public void TryWithResources() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la ruta del archivo: ");
        String ruta = sc.nextLine();        
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {            
            String linea;
            System.out.println("\n--- Contenido del Archivo ---");            
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }            
            System.out.println("");
                    } catch (IOException e) {            
            System.out.println("\nERROR al manejar el archivo.");
            System.out.println("Mensaje de error: " + e.getMessage());
        } //Fin catch
        
    }

} //Fin clase


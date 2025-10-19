/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico8;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PrincipalTP8 {
    
    public static void main(String[] args) throws FileNotFoundException {
//Creo un cliente
Cliente cliente1 = new Cliente("Maxi Niemiec");

//Creo el Pedido 
Pedido miPedido = new Pedido(new ArrayList<>());
// Agrego el cliente a la lista de notificación del pedido
miPedido.agregarObservador(cliente1); 

//Cambio de estado
miPedido.cambiarEstado("PROCESADO"); 

//Otro cambio de estado
miPedido.cambiarEstado("ENVIADO");

System.out.println("------------------------PARTE2------------------------");
System.out.println("1. División segura") ;
System.out.println("Solicitar dos números y dividirlos. Manejar ArithmeticException si el divisor es cero.");
Parte2 calculos = new Parte2();
calculos.divisor();
System.out.println("");

System.out.println("2. Conversión de cadena a número ");
System.out.println("Leer texto del usuario e intentar convertirlo a int. Manejar NumberFormatException si no es válido. ");
calculos.conversor();
System.out.println("");

System.out.println("3. Lectura de archivo");
System.out.println("Leer un archivo de texto y mostrarlo. Manejar FileNotFoundException si el archivo no existe");
calculos.leerTexto();

System.out.println("");
System.out.println("4. Excepción personalizada");
System.out.println("Crear EdadInvalidaException. Lanzarla si la edad es menor a 0 o mayor a 120. Capturarla y mostrar mensaje");
calculos.validarEdad();

System.out.println("");
System.out.println("5. Uso de try-with-resources");
System.out.println("Leer un archivo con BufferedReader usando try-with-resources Manejar IOException correctamente");
calculos.TryWithResources();
} //Fin main
}//Fin clase

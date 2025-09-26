/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico5;

/**
 *
 * @author Usuario
 */
public class main {
 public static void main(String[] args) {
// Pasaporte - Foto - Titular 
System.out.println("\nEjercicio 1: Pasaporte - Foto - Titular "); 

Foto foto = new Foto("Juan.jpg", "jpg"); 
Pasaporte pasaporte = new Pasaporte("AR0303456", "1995-12-25", foto); 
Titular titular = new Titular("Juan Lopez", "12548742");  
pasaporte.setTitular(titular); 

System.out.println("El pasaporte de "+ titular.getNombre() + " es " + titular.getPasaporte());
System.out.println("\n---------------------------------------------------------------------");     
 
System.out.println("\nEjercicio 2: Usuario - Celular - Bateria "); 
Usuario usuario1 = new Usuario("Maxi","38.985.326");
Bateria bateria1 = new Bateria("Li-on",5000);
Celular celuMaxi = new Celular("0123456","Xiaomi","Redmi 11",bateria1);
 
usuario1.setCelular(celuMaxi);
System.out.println("El usuario " + usuario1.getNombre() + " tiene un celular marca " + celuMaxi.getMarca());

System.out.println("\n---------------------------------------------------------------------");     
System.out.println("\nEjercicio 3: Libro - Editorial - Autor "); 

Autor autor1 = new Autor("Felipe Pigna", "Argentino");
Editorial editorial1 = new Editorial("Plante","Cordoba");
Libro libro1 = new Libro("Belgrano","12345",autor1,editorial1);
System.out.println("El libro nuevo adquirido es " + "\n" + libro1);

System.out.println("\n---------------------------------------------------------------------");     
System.out.println("\nEjercicio 4: TarjetaDeCredito - Cliente - Banco"); 
Banco banco = new Banco("Santander","985326985");
Cliente cliente = new Cliente("Maximiliano","38985326");
TarjetaDeCredito tarjeta = new TarjetaDeCredito("852963","0935",banco);
tarjeta.setCliente(cliente);
System.out.println("Señor cliente "+ cliente.getNombre() + ", usted tiene una cuenta abierta en " + banco.getNombre() + ". Su nueva tarjeta tiene estos numeros. Anotelos "+ "\n" + tarjeta.toString());

System.out.println("\n---------------------------------------------------------------------");     
System.out.println("\nEjercicio 5: Placamadre - Computadora - Propietario"); 
Propietario propietario = new Propietario("Jose","0303456");
Computadora computadora = new Computadora("Dell","325478",propietario,"Gygabyte","A520M");
System.out.println("Enhorabuena " + propietario.getNombre() + ", acabas de comprar tu primera computadora. Estos son los datos necesarios " + "\n" + computadora.toString());

System.out.println("\n---------------------------------------------------------------------");     
System.out.println("\nEjercicio 6: Comensal-cliente - Reserva - Mesa");
Comensal_Cliente clientE = new Comensal_Cliente("Esteban","351-5656987");
Mesa mesa = new Mesa(1,4);
Reserva reserva = new Reserva("02/10/2025","21:30",clientE);
System.out.println("Bienvenido! su reserva es " + reserva.getFecha() + " " + reserva.getHora()+ "\n" + clientE.toString());

System.out.println("\n---------------------------------------------------------------------");     
System.out.println("\nEjercicio 7: Motor-Conductor-Vechiculo");
Motor m7 = new Motor("Nafta 1.6", "MTR-001"); 
Vehiculo v7 = new Vehiculo("ABC123", "Fiesta"); 
Conductor cond7 = new Conductor("Diego Perez", "B12345678"); 
v7.setMotor(m7); 
v7.setConductor(cond7); 
System.out.println("Conductor del vehiculo: " + v7.getConductor().getNombre()); 
System.out.println("Vehiculo del conductor: " + cond7.getVehiculo().getPatente()); 
System.out.println("Motor: " + v7.getMotor().getTipo() + " (" + v7.getMotor().getNumeroSerie() + ")"); 

System.out.println("\n---------------------------------------------------------------------");     
System.out.println("\nEjercicio 8: Documento-FirmaDigital-Usuario");

UsuarioFirma usuario8 = new UsuarioFirma("Maxi","maxi@hotmail.com");
FirmaDigital firma = new FirmaDigital("HASH-AH!","02-10-2025");
firma.setUsuario(usuario8); //Aca lo agregue
Documento documento8 = new Documento("Escritura","Este documento consta...","HASH-AH!","02-10-2025"); //Aca es una composicion
System.out.println("Doc: " + documento8.getTitulo()); 
System.out.println("Firmado por: " + usuario8.getNombre()); 
System.out.println("Hash: " + documento8.getFirma().getCodigoHash()); 

System.out.println("\n---------------------------------------------------------------------");     
System.out.println("\nEjercicio 9: CitaMédica - Paciente - Profesional");
Paciente paciente = new Paciente("Maximiliano","GEA");
Profesional profesional = new Profesional("Claudio","Clinico");
CitaMedica citaMedica = new CitaMedica("02/10/2026","16:00");
citaMedica.setPaciente(paciente);
citaMedica.setProfesional(profesional);
System.out.println("Su cita medica esta lista señor " + paciente.getNombre() + "\n" + citaMedica.toString());

System.out.println("\n---------------------------------------------------------------------");     
System.out.println("\nEjercicio 10: ClaveSeguridad - CuentaBancaria - Titular9");
Titular10 titular10 = new Titular10("Ezequiel Lopez","38.985.326");
CuentaBancaria cuenta = new CuentaBancaria("00000011101",50000,"0303456","12-10-2025");
cuenta.setTitular10(titular10);
System.out.println("El titular " + titular10.getNombre()+ " tiene la siguiente cuenta: "+ "\n" + titular10.getCuentaBancaria());

System.out.println("\n---------------------------------------------------------------------");     
System.out.println("\nEjercicio 11: Reproductor-Artista-Cancion");
Reproductor reproductor = new Reproductor();
Artista artista = new Artista("Jose Luis Aguirre","Folklore");
Cancion cancion = new Cancion("La vuelta larga",artista);
reproductor.Reproducir(cancion);

System.out.println("\n---------------------------------------------------------------------");     
System.out.println("\nEjercicio 12: Impuesto-Contribuyente-Calculadora");
Contribuyente contribuyente = new Contribuyente("Maria","38326985");
Impuesto impuesto = new Impuesto(255.4,contribuyente);
Calculadora calculadora = new Calculadora();
calculadora.calcular(impuesto);

System.out.println("\n---------------------------------------------------------------------");     
System.out.println("\nEjercicio 13: GeneradorQR-CodigoQR-Persona ");
Usuario12 usuario12 = new Usuario12("Laura","Laura@gmail.com");
//CodigoQR codigoQR = new CodigoQR("1995",usuario12);
GeneradorQR generadorQR = new GeneradorQR();
generadorQR.generarQR("1995", usuario12);
        
System.out.println("\n---------------------------------------------------------------------");     
System.out.println("\nEjercicio 14: EditorVideo-Proyecto-Render");
EditorVideo editorVideo = new EditorVideo();
Proyecto proyecto = new Proyecto("Titanic","360 min");
editorVideo.exportar(".MP4", proyecto);


 } 
 }


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoPractico6;
import java.util.ArrayList;
import javax.xml.transform.Source;

/**
 *
 * @author Usuario
 */
public class Inventario {
ArrayList<Producto> productos;  

//Constructor
public Inventario (){
    this.productos = new ArrayList<>();
}

public void agregarProducto(Producto p)  {
    if(p != null && !productos.contains(p))
        productos.add(p);
}

public void listarProductos()  {
    for (Producto producto : productos) {
        producto.mostrarInfo();
        System.out.println("\n");}
}

public Producto buscarProductoPorId(String id){
    for (Producto producto : productos) {
        if (producto.getId().equals(id)){
            producto.mostrarInfo();
            return producto;}}
    System.out.print("No se encontro el producto");
    return null;
    }   

public void eliminarProducto(String id)  {
    Producto p = this.buscarProductoPorId(id);
    if (p != null){
    productos.remove(p);
    System.out.println("El producto " + p.getNombre() + " ha sido eliminado");}
    else {
        System.out.println("No se ha encontrado el producto");}   
}
    

public void actualizarStock(String id, int nuevaCantidad){
    Producto p = this.buscarProductoPorId(id);
    if (p != null){
        p.setCantidad(nuevaCantidad);}
    else{
        System.out.println("Producto no encontrado");}
    }

public void filtrarPorCategoria(CategoriaProducto categoria)  {
    boolean bandera = false;
    for (Producto producto : productos) {
        if (producto.getCategoria().equals(categoria)){
            producto.mostrarInfo();
            bandera = true;}
        }
    if (!bandera){
        System.out.println("No se encontraron productos de esa categoria");}
    }

public int obtenerTotalStock()  {
    int stock = 0;
    for (Producto producto : productos) {
        stock += producto.getCantidad();}
    return stock;
    }
    

public Producto obtenerProductoConMayorStock()  {
    int maxStock = 0;
    String idMaxStock = "0";
    for (Producto producto : productos) {
        if (producto.getCantidad() > maxStock) {
            maxStock = producto.getCantidad();
            idMaxStock = producto.getId();}
    }
    Producto p = this.buscarProductoPorId(idMaxStock);
    return p;
}
public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
    ArrayList<Producto> productosPorPrecio = new ArrayList<>();
    double precioMin = min;
    double precioMax = max;
        
    for (Producto producto : productos) {
        if (precioMin <= producto.getPrecio() && precioMax >= producto.getPrecio()) {
            productosPorPrecio.add(producto); //Agrego el producto al array
        } //Cierra el if
    } //Cierra el for
    return productosPorPrecio; 
}  
public ArrayList<CategoriaProducto> mostrarCategoriasDisponibles()   {
    ArrayList<CategoriaProducto> categoriasDisponibles = new ArrayList<>();
    for (Producto producto : productos) {
        if (producto.getCategoria() != null && !categoriasDisponibles.contains(producto.getCategoria())) {
            categoriasDisponibles.add(producto.getCategoria());
        } //Cierre del if
    } //Cierre del for
    return categoriasDisponibles;
}
        
        } //Cierre de la clase


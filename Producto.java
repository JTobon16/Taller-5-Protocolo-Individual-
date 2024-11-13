/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5;

/**
 *
 * @author altoc
 */
public class Producto {
    
    //defini los atributos con acceso (default)
    String nombre;
    double precio;
    int stock;

    // constructor
    Producto(String nombre, double precio, int stock){
        this.nombre= nombre;
        this.precio= precio;
        this.stock= stock;
    }
    
    //metodo para mostrar y que sera llamado en la clase de prueba
    void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
        System.out.println("Stock: "+stock);
    }
    
    
    
}

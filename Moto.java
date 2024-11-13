/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5_1_Vehiculos;

import Taller5_1_Vehiculos.vehiculo;

/**
 *
 * @author altoc
 */

// cree la clase con herencia a otra clase
public class Moto extends vehiculo{
    
    // contructor que llama la clase vehiculo 
        public Moto(String tipo) {
             super(tipo);
    }
    
    public void mostrarInfo(){
        System.out.println("El tipo de moto es: "+tipo);
    }
    
}

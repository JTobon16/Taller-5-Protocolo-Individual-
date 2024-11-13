/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller5_2_Prueba;


// hice la importacion del otro paquete
import Taller5_1_Vehiculos.Moto;


public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        //creo la instancia
        Moto moto = new Moto("clasica");
        

        //si trato de ver el atriputo tipo no me permite porque tiene el modificadorr de accesso default
        // solo puede ser accedido desde su propio paquete, no se puede llamar desde otro paquete
        
        //System.out.println("Tipo de vehiculo es: "+moto.tipo);
        
        //usando el metodo mostrarInfo si me permitio visualizar el atributo, pero tuve que cambiar el atributo y el metodo a public
        moto.mostrarInfo();
    }
   
}

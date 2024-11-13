/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller5;

/**
 *
 * @author altoc
 */
public class PersonaPrueba {

    public static void main(String[] args) {
        
        
        Persona persona = new Persona();
        
        // aqui hice un intento de acceder al atributo pero me genera error porque esta privado
        //System.out.println("Nombre:"+persona.nombre);
        
        //se hace uso de get y set para poder acceder a un atributo privado
        persona.setNombre("Jonathan");
            System.out.println("Nombre: "+persona.getNombre());
        
            
        //puedo acceder sin problema al atributo edad por el uso de default (desde que este en el mismo paquete)    
          persona.edad = 24;
            System.out.println("Edad: "+persona.edad);
    }
    
}

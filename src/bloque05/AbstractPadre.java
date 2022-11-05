/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloque05;

/**
 *
 * @author Juan José Estévez González
 */
abstract class HijoAbstracto extends AbstractPadre {}
abstract class HijaAbstracta extends AbstractPadre {}
abstract class AbstractPadre {
    
    String nombre = "Abstracto";
          
    public static void main(String[] args) {
        
        AbstractPadre a = new AbstractPadre() {} ;
        HijoAbstracto b = new HijoAbstracto() {} ;
        HijaAbstracta c = new HijaAbstracta() {} ;
        
        b.nombre = "Lucas";
        c.nombre = "Manuela";
        
        System.out.println(a.nombre);        
        System.out.println(b.nombre);      
        System.out.println(c.nombre);
    }  
}
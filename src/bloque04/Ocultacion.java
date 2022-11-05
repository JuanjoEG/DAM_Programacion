
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Ocultacion {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                    
                    
                    
                    
                    *************************************************************************************************
                    *         PRINCIPIOS BÁSICOS DE LA ORIENTACIÓN A OBJETOS / OCULTACIÓN DE LA INFORMACIÓN         *
                    *************************************************************************************************
                    *    Ocultación de la información:                                                              *
                    *    Este principio se basa en que cada objeto ha de estar aislado del exterior,                *
                    *    es decir, desde fuera no se puede conocer cómo está compuesto un objeto por dentro.        *
                    *************************************************************************************************
                    *  0. ATRÁS.                                                                                    *
                    *************************************************************************************************
                    
                      """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();            
            switch(menu){
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
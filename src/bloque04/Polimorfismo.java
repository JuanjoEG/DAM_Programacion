
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Polimorfismo {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                    
                    
                    
                    
                    *************************************************************************************************
                    *              PRINCIPIOS BÁSICOS DE LA ORIENTACIÓN A OBJETOS / POLIMORFISMO                    *
                    *************************************************************************************************
                    *    Polimorfismo:                                                                              *
                    *    El polimorfismo proporciona a un objeto la posibilidad                                     *
                    *    de tener diferentes comportamientos que están asociados a diferentes objetos.              *
                    *    Este concepto va ligado al de herencia.                                                    *
                    *************************************************************************************************
                    *  1. RELACIÓN ENTRE CLASES / POLIMORFISMO.                                                     *
                    *************************************************************************************************
                    *  0. ATRÁS.                                                                                    *
                    *************************************************************************************************
                              
                                """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();            
            switch(menu){
                case "1" -> bloque05.RelacionClasesPolimorfismo.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
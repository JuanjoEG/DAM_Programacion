
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Herencia {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *************************************************************************************************
                    *              PRINCIPIOS BÁSICOS DE LA ORIENTACIÓN A OBJETOS / HERENCIA                        *
                    *************************************************************************************************
                    *    Herencia:                                                                                  *
                    *    El concepto de herencia se basa en las relaciones existentes entre las clases,             *
                    *    pudiendo éstas formar una relación jerárquica,                                             *
                    *    donde haya clases que heredan comportamiento de otras.                                     *
                    *************************************************************************************************
                    *  1. RELACIÓN ENTRE CLASES / HERENCIA.                                                         *
                    *************************************************************************************************
                    *  0. ATRÁS.                                                                                    *
                    *************************************************************************************************
                              
                                """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque05.RelacionClasesHerencia.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
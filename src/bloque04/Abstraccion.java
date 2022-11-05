
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Abstraccion {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *************************************************************************************************
                    *              PRINCIPIOS BÁSICOS DE LA ORIENTACIÓN A OBJETOS / ABSTRACCIÓN                     *
                    *************************************************************************************************
                    *    Abstracción:                                                                               *
                    *    Con la abstracción la programación dirigida a objetos                                      *
                    *    consigue que cada objeto utilizado funcione como un único agente,                          *
                    *    teniendo sus propias caracterÃ­sticas y funciones,                                          *
                    *    independientemente de cómo esté construido.                                                *
                    *************************************************************************************************
                    *  1. RELACIÓN ENTRE CLASES / CLASES Y MÉTODOS ABSTRACTOS.                                      *
                    *************************************************************************************************
                    *  0. ATRÁS.                                                                                    *
                    *************************************************************************************************
                              
                                """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque05.RelacionClasesAbstractas.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
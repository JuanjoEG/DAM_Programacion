
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Abstraccion {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *************************************************************************************************
                    *              PRINCIPIOS B�SICOS DE LA ORIENTACI�N A OBJETOS / ABSTRACCI�N                     *
                    *************************************************************************************************
                    *    Abstracci�n:                                                                               *
                    *    Con la abstracci�n la programaci�n dirigida a objetos                                      *
                    *    consigue que cada objeto utilizado funcione como un �nico agente,                          *
                    *    teniendo sus propias características y funciones,                                          *
                    *    independientemente de c�mo est� construido.                                                *
                    *************************************************************************************************
                    *  1. RELACI�N ENTRE CLASES / CLASES Y M�TODOS ABSTRACTOS.                                      *
                    *************************************************************************************************
                    *  0. ATR�S.                                                                                    *
                    *************************************************************************************************
                              
                                """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque05.RelacionClasesAbstractas.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
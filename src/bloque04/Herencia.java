
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Herencia {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *************************************************************************************************
                    *              PRINCIPIOS B�SICOS DE LA ORIENTACI�N A OBJETOS / HERENCIA                        *
                    *************************************************************************************************
                    *    Herencia:                                                                                  *
                    *    El concepto de herencia se basa en las relaciones existentes entre las clases,             *
                    *    pudiendo �stas formar una relaci�n jer�rquica,                                             *
                    *    donde haya clases que heredan comportamiento de otras.                                     *
                    *************************************************************************************************
                    *  1. RELACI�N ENTRE CLASES / HERENCIA.                                                         *
                    *************************************************************************************************
                    *  0. ATR�S.                                                                                    *
                    *************************************************************************************************
                              
                                """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque05.RelacionClasesHerencia.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
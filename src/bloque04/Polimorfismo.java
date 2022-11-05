
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Polimorfismo {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                    
                    
                    
                    
                    *************************************************************************************************
                    *              PRINCIPIOS B�SICOS DE LA ORIENTACI�N A OBJETOS / POLIMORFISMO                    *
                    *************************************************************************************************
                    *    Polimorfismo:                                                                              *
                    *    El polimorfismo proporciona a un objeto la posibilidad                                     *
                    *    de tener diferentes comportamientos que est�n asociados a diferentes objetos.              *
                    *    Este concepto va ligado al de herencia.                                                    *
                    *************************************************************************************************
                    *  1. RELACI�N ENTRE CLASES / POLIMORFISMO.                                                     *
                    *************************************************************************************************
                    *  0. ATR�S.                                                                                    *
                    *************************************************************************************************
                              
                                """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();            
            switch(menu){
                case "1" -> bloque05.RelacionClasesPolimorfismo.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
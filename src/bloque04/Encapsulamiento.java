
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Encapsulamiento {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *************************************************************************************************
                    *              PRINCIPIOS BÁSICOS DE LA ORIENTACIÓN A OBJETOS / ENCAPSULAMIENTO                 *
                    *************************************************************************************************
                    *    Encapsulamiento:                                                                           *
                    *    El encapsulamiento proporciona cohesión en los datos que forman un objeto,                 *
                    *    ya que esos datos estarán encapsulados dentro del objeto,                                  *
                    *    aunque no los veamos.                                                                      *
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
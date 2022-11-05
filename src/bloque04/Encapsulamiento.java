
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Encapsulamiento {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *************************************************************************************************
                    *              PRINCIPIOS B�SICOS DE LA ORIENTACI�N A OBJETOS / ENCAPSULAMIENTO                 *
                    *************************************************************************************************
                    *    Encapsulamiento:                                                                           *
                    *    El encapsulamiento proporciona cohesi�n en los datos que forman un objeto,                 *
                    *    ya que esos datos estar�n encapsulados dentro del objeto,                                  *
                    *    aunque no los veamos.                                                                      *
                    *************************************************************************************************
                    *  0. ATR�S.                                                                                    *
                    *************************************************************************************************
                              
                                """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
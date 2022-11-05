
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Ocultacion {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                    
                    
                    
                    
                    *************************************************************************************************
                    *         PRINCIPIOS B�SICOS DE LA ORIENTACI�N A OBJETOS / OCULTACI�N DE LA INFORMACI�N         *
                    *************************************************************************************************
                    *    Ocultaci�n de la informaci�n:                                                              *
                    *    Este principio se basa en que cada objeto ha de estar aislado del exterior,                *
                    *    es decir, desde fuera no se puede conocer c�mo est� compuesto un objeto por dentro.        *
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
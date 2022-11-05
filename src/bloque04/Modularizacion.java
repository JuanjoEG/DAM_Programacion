
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Modularizacion {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                    
                    
                    
                    
                    *************************************************************************************************
                    *              PRINCIPIOS BÁSICOS DE LA ORIENTACIÓN A OBJETOS / MODULARIZACIÓN                  *
                    *************************************************************************************************
                    *    Modularización:                                                                            *
                    *    Mediante la modularización podemos dividir un problema en otros problemas más pequeños,    *
                    *    esto es uno de los aspectos fundamentales                                                  *
                    *    que proporciona la programación dirigida a objetos.                                        *
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

package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Modularizacion {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                    
                    
                    
                    
                    *************************************************************************************************
                    *              PRINCIPIOS B�SICOS DE LA ORIENTACI�N A OBJETOS / MODULARIZACI�N                  *
                    *************************************************************************************************
                    *    Modularizaci�n:                                                                            *
                    *    Mediante la modularizaci�n podemos dividir un problema en otros problemas m�s peque�os,    *
                    *    esto es uno de los aspectos fundamentales                                                  *
                    *    que proporciona la programaci�n dirigida a objetos.                                        *
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
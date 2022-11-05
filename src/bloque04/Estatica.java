
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Estatica {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    ******************************************************
                    *                    LA EST�TICA                     *
                    ******************************************************
                    * 1. VARIABLES EST�TICAS.                            *
                    * 2. M�TODOS EST�TICOS.                              *
                    * 3. BLOQUES EST�TICOS.                              *
                    ******************************************************
                    *  0. ATR�S.                                         *
                    ******************************************************
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque04.AtributosEstaticos.main(args);
                case "2" -> bloque04.MetodosEstaticos.main(args);
                case "3" -> bloque04.BloqueEstatico.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
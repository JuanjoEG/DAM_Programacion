
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                        **************************************************
                        *              OPERADORES L�GICOS                *
                        **************************************************
                        *   &&  -->  AND.                                *
                        *   ||  -->  OR.                                 *
                        *   !   -->  NOT.                                *
                        **************************************************
                        * PRINCIPAL UTILIDAD --> CONDICIONES M�LTIPLES.  *
                        **************************************************
                        *  1. TABLA DE LA VERDAD.                        *
                        **************************************************
                        *  0. ATR�S.                                     *
                        **************************************************
                        
                          """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();            
            switch(menu){
                case "1" -> bloque01.TablaDeLaVerdad.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
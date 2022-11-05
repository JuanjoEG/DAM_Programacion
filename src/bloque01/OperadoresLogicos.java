
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                        **************************************************
                        *              OPERADORES LÓGICOS                *
                        **************************************************
                        *   &&  -->  AND.                                *
                        *   ||  -->  OR.                                 *
                        *   !   -->  NOT.                                *
                        **************************************************
                        * PRINCIPAL UTILIDAD --> CONDICIONES MÚLTIPLES.  *
                        **************************************************
                        *  1. TABLA DE LA VERDAD.                        *
                        **************************************************
                        *  0. ATRÁS.                                     *
                        **************************************************
                        
                          """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();            
            switch(menu){
                case "1" -> bloque01.TablaDeLaVerdad.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
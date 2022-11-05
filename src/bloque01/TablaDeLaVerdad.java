
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class TablaDeLaVerdad {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                        **********************************
                        *       TABLA DE LA VERDAD       *
                        **********************************
                        * TRUE   AND  TRUE   -->  TRUE   *
                        * FALSE  AND  TRUE   -->  FALSE  *
                        * TRUE   AND  FALSE  -->  FALSE  *
                        * FALSE  AND  FALSE  -->  FALSE  *
                        **********************************
                        * TRUE   OR   TRUE   -->  TRUE   *
                        * FALSE  OR   TRUE   -->  TRUE   *
                        * TRUE   OR   FALSE  -->  TRUE   *
                        * FALSE  OR   FALSE  -->  FALSE  *
                        **********************************
                        * TRUE   NOT         -->  FALSE  *
                        * FALSE  NOT         -->  TRUE   *
                        **********************************
                        *  0. ATRÁS.                     *
                        **********************************
                        
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
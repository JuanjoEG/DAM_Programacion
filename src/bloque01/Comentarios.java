
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Comentarios {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                                        
                     *************************************
                     *           COMENTARIOS             *
                     *************************************
                     *  //   -->  DE UNA L�NEA.          *
                     *************************************
                     *  /*                               *
                     *       -->   MULTIL�NEA.           *
                     *  */                               *
                     *************************************
                     *  /**                              *
                     *   *                               *
                     *   *  --> DE DOCUMENTACI�N.        *
                     *   *                               *
                     *   * @author                       *
                     *   * @deprecated                   *
                     *   * @hidden                       *
                     *   * @param                        *
                     *   * @see                          *
                     *   * @serial                       *
                     *   * @since                        *
                     *   * @version                      *
                     *   * ...                           *
                     *   */                              *
                     *************************************
                     * 1. DOCUMENTACI�N DE UNA CLASE.    *
                     *************************************
                     * 0. ATR�S.                         *
                     *************************************
                    
                    """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque04.DocumentacionClase.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
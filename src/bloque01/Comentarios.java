
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
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
                     *  //   -->  DE UNA LÍNEA.          *
                     *************************************
                     *  /*                               *
                     *       -->   MULTILÍNEA.           *
                     *  */                               *
                     *************************************
                     *  /**                              *
                     *   *                               *
                     *   *  --> DE DOCUMENTACIÓN.        *
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
                     * 1. DOCUMENTACIÓN DE UNA CLASE.    *
                     *************************************
                     * 0. ATRÁS.                         *
                     *************************************
                    
                    """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque04.DocumentacionClase.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}

package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Clases {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    ******************************************************
                    *                      CLASES                        *
                    ******************************************************
                    *     ES LA REPRESENTACIÓN DE ALGO DEL MUNDO REAL.   *
                    ******************************************************
                    * public class Clases {                              *
                    *        1.  ATRIBUTOS.  -->  SUS PROPIEDADES.       *
                    *        2.  MÉTODOS.    -->  SUS ACCIONES.          *
                    *  }                                                 *
                    ******************************************************
                    *  3. CREACIÓN DE OBJETOS.                           *
                    ******************************************************
                    *  0. ATRÁS.                                         *
                    ******************************************************
                    
                      """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque04.Atributos.main(args);
                case "2" -> bloque04.Metodos.main(args);
                case "3" -> bloque04.CreacionObjetos.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
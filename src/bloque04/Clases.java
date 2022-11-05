
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
                    *     ES LA REPRESENTACI�N DE ALGO DEL MUNDO REAL.   *
                    ******************************************************
                    * public class Clases {                              *
                    *        1.  ATRIBUTOS.  -->  SUS PROPIEDADES.       *
                    *        2.  M�TODOS.    -->  SUS ACCIONES.          *
                    *  }                                                 *
                    ******************************************************
                    *  3. CREACI�N DE OBJETOS.                           *
                    ******************************************************
                    *  0. ATR�S.                                         *
                    ******************************************************
                    
                      """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque04.Atributos.main(args);
                case "2" -> bloque04.Metodos.main(args);
                case "3" -> bloque04.CreacionObjetos.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
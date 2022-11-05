
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Listas {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    ******************************************
                    *            LISTAS DIN�MICAS            *
                    ******************************************
                    *  List --> ES UNA INTERFAZ              *
                    *       --> NECESITA UNA IMPLEMENTACI�N  *
                    ******************************************
                    *        IMPLEMENTACIONES DE List:       *
                    *  1. ArrayList.                         *
                    *  2. LinkedList.                        *
                    *  3. Vector.                            *
                    ******************************************
                    *  4. M�TODOS DE LA INTERFAZ List.       *
                    ******************************************
                    *  0. ATR�S.                             *
                    ******************************************
                    
                      """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque03.ArrayList.main(args);
                case "2" -> {System.out.println("EN PROCESO DE CONSTRUCCI�N");}
                case "3" -> {System.out.println("EN PROCESO DE CONSTRUCCI�N");}
                case "4" -> bloque03.MetodosList.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}

package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Conjuntos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    **********************************************
                    *                  CONJUNTOS                 *
                    **********************************************
                    *   NECESITAMOS  -->  import java.util.set;  *
                    **********************************************
                    *  NO PUEDE HABER ELEMENTOS REPETIDOS        *
                    **********************************************
                    *  1. HashSet.                               *
                    *  2. TreeSet.                               *
                    *  3. LinkedHashSet.                         *
                    **********************************************
                    *  0. ATRÁS.                                 *
                    **********************************************
                    
                      """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> {System.out.println("EN PROCESO DE CONSTRUCCIÓN");}
                case "2" -> {System.out.println("EN PROCESO DE CONSTRUCCIÓN");}
                case "3" -> {System.out.println("EN PROCESO DE CONSTRUCCIÓN");}
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
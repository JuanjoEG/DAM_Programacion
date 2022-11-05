
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Listas {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    ******************************************
                    *            LISTAS DINÁMICAS            *
                    ******************************************
                    *  List --> ES UNA INTERFAZ              *
                    *       --> NECESITA UNA IMPLEMENTACIÓN  *
                    ******************************************
                    *        IMPLEMENTACIONES DE List:       *
                    *  1. ArrayList.                         *
                    *  2. LinkedList.                        *
                    *  3. Vector.                            *
                    ******************************************
                    *  4. MÉTODOS DE LA INTERFAZ List.       *
                    ******************************************
                    *  0. ATRÁS.                             *
                    ******************************************
                    
                      """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque03.ArrayList.main(args);
                case "2" -> {System.out.println("EN PROCESO DE CONSTRUCCIÓN");}
                case "3" -> {System.out.println("EN PROCESO DE CONSTRUCCIÓN");}
                case "4" -> bloque03.MetodosList.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
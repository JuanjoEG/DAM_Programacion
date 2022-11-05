
package bloque02;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class ContinueBreak {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                            
                    
                    
                    
                    
                    *****************************************************************
                    *                   continue  /  break                          *
                    *****************************************************************
                    * USOS EN -->     for / while / if else / switch                *
                    *****************************************************************
                    * break     --> SALIR COMPLETAMENTE DEL BUCLE.                  *
                    *               NO SE EJECUTA EL RESTO DEL BLOQUE.              *
                    *                                                               *
                    * continue  --> SALIR DE LA ITERACIÓN ACTUAL.                   *
                    *               SALTAR A LA SIGUIENTE ITERACIÓN.                *
                    *                                                               *
                    *****************************************************************
                    * 0. ATRÁS.                                                     *
                    *****************************************************************
                            
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
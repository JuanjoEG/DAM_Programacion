
package bloque02;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
                    * continue  --> SALIR DE LA ITERACI�N ACTUAL.                   *
                    *               SALTAR A LA SIGUIENTE ITERACI�N.                *
                    *                                                               *
                    *****************************************************************
                    * 0. ATR�S.                                                     *
                    *****************************************************************
                            
                                    """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));        
    }
}
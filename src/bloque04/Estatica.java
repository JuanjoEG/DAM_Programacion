
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Estatica {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    ******************************************************
                    *                    LA ESTÁTICA                     *
                    ******************************************************
                    * 1. VARIABLES ESTÁTICAS.                            *
                    * 2. MÉTODOS ESTÁTICOS.                              *
                    * 3. BLOQUES ESTÁTICOS.                              *
                    ******************************************************
                    *  0. ATRÁS.                                         *
                    ******************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque04.AtributosEstaticos.main(args);
                case "2" -> bloque04.MetodosEstaticos.main(args);
                case "3" -> bloque04.BloqueEstatico.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}

package bloque03;

import java.util.Scanner;

/**
 *
 * @author JJuan Jos� Est�vez Gonz�lez
 */
public class Mapas {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    **********************************************
                    *                      MAPAS                 *
                    **********************************************
                    *  Map  --> ES UNA INTERFAZ                  *
                    *       --> NECESITA UNA IMPLEMENTACI�N      *
                    **********************************************
                    *  ELEMENTOS PARES CLAVE-VALOR.              *
                    *  NO PUEDE HABER CLAVES REPETIDAS.          *
                    **********************************************
                    *        IMPLEMENTACIONES DE Map:            *
                    *  1. HashMap.                               *
                    *  2. TreeMap.                               *
                    *  3. LinkedTreeMap.                         *
                    **********************************************
                    *  4. EJEMPLO  -->  USANDO MAPS.             *
                    *  5. M�TODOS DE LA INTERFAZ Map.            *
                    **********************************************
                    *  0. ATR�S.                                 *
                    **********************************************
                    
                    """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque03.HashMap.main(args);
                case "2" -> {System.out.println("EN PROCESO DE CONSTRUCCI�N");}
                case "3" -> {System.out.println("EN PROCESO DE CONSTRUCCI�N");}
                case "4" -> ejemplos.tramo05.UsandoMaps.main(args);
                case "5" -> bloque03.MetodosMap.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
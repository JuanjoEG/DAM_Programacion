
package bloque03;

import java.util.Scanner;

/**
 *
 * @author JJuan José Estévez González
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
                    *       --> NECESITA UNA IMPLEMENTACIÓN      *
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
                    *  5. MÉTODOS DE LA INTERFAZ Map.            *
                    **********************************************
                    *  0. ATRÁS.                                 *
                    **********************************************
                    
                    """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque03.HashMap.main(args);
                case "2" -> {System.out.println("EN PROCESO DE CONSTRUCCIÓN");}
                case "3" -> {System.out.println("EN PROCESO DE CONSTRUCCIÓN");}
                case "4" -> ejemplos.tramo05.UsandoMaps.main(args);
                case "5" -> bloque03.MetodosMap.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
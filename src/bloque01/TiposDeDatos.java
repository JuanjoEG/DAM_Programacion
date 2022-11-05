
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class TiposDeDatos {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                    **************************************************************
                    *                       TIPOS DE DATOS                       *
                    **************************************************************
                    *             DATOS PRIMITIVOS:                              *
                    *  1. TIPOS DE DATOS ENTEROS.                                *
                    *  2. TIPOS DE DATOS REALES.                                 *
                    *  3. TIPOS DE DATOS ALFANUMÉRICOS.                          *
                    *  4. TIPOS DE DATOS BOOLEANOS.                              *
                    **************************************************************
                    *             DATOS ENVOLTORIO:                              *
                    *  5. TIPOS DE DATOS GENÉRICOS. PARAMETRIZADOS.              *
                    **************************************************************
                    *  0. ATRÁS.                                                 *
                    **************************************************************
                               
                                                                                  """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque01.DatosEnteros.main(args);
                case "2" -> bloque01.DatosReales.main(args);
                case "3" -> bloque01.DatosAlfanumericos.main(args);
                case "4" -> bloque01.DatosBooleanos.main(args);
                case "5" -> bloque05.ClasesGenericas.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
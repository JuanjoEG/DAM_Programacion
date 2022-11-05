
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
                    *  3. TIPOS DE DATOS ALFANUM�RICOS.                          *
                    *  4. TIPOS DE DATOS BOOLEANOS.                              *
                    **************************************************************
                    *             DATOS ENVOLTORIO:                              *
                    *  5. TIPOS DE DATOS GEN�RICOS. PARAMETRIZADOS.              *
                    **************************************************************
                    *  0. ATR�S.                                                 *
                    **************************************************************
                               
                                                                                  """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque01.DatosEnteros.main(args);
                case "2" -> bloque01.DatosReales.main(args);
                case "3" -> bloque01.DatosAlfanumericos.main(args);
                case "4" -> bloque01.DatosBooleanos.main(args);
                case "5" -> bloque05.ClasesGenericas.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
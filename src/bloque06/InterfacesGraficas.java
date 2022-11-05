
package bloque06;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class InterfacesGraficas {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                               *************************************************************************
                               *                        INTERFACES GR�FICAS                            *
                               *************************************************************************
                               *  1. CREACI�N DE UN NUEVO PROYECTO CON INTERFAZ GR�FICA.               *
                               *  2. ELEMENTOS PRINCIPALES.                                            *
                               *  3. ELEMENTOS GR�FICOS.                                               *
                               *  4. VENTANAS DE DI�LOGO PREDEFINIDAS.                                 *
                               *************************************************************************
                               *  0. ATR�S.                                                            *
                               *************************************************************************
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                case "1" -> bloque06.NuevoProyecto.main(args);
                case "2" -> bloque06.ElementosPrincipales.main(args);
                case "3" -> bloque06.ElementosGraficos.main(args);
                case "4" -> System.out.println("EN PROCESO DE CONSTRUCCI�N");
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
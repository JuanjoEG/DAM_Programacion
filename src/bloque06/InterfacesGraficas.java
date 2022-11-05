
package bloque06;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class InterfacesGraficas {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                               *************************************************************************
                               *                        INTERFACES GRÁFICAS                            *
                               *************************************************************************
                               *  1. CREACIÓN DE UN NUEVO PROYECTO CON INTERFAZ GRÁFICA.               *
                               *  2. ELEMENTOS PRINCIPALES.                                            *
                               *  3. ELEMENTOS GRÁFICOS.                                               *
                               *  4. VENTANAS DE DIÁLOGO PREDEFINIDAS.                                 *
                               *************************************************************************
                               *  0. ATRÁS.                                                            *
                               *************************************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                case "1" -> bloque06.NuevoProyecto.main(args);
                case "2" -> bloque06.ElementosPrincipales.main(args);
                case "3" -> bloque06.ElementosGraficos.main(args);
                case "4" -> System.out.println("EN PROCESO DE CONSTRUCCIÓN");
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
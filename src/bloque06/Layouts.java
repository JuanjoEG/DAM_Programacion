
package bloque06;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Layouts {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                               **************************************************************************************
                               *         INTERFACES GRÁFICAS / ELEMENTOS GRÁFICOS / LAYOUTS                         *
                               **************************************************************************************
                               *             BIBLIOTECA SWING INTEGRADA EN LA JDK DE JAVA.                          *
                               **************************************************************************************
                               *  Absolute Layout --> POSICIONES ABSOLUTAS. DISEÑO LIBRE. NO ESCALABLE.             *
                               **************************************************************************************
                               *  Border Layout   --> NORTE / SUR / IZQUIERDA / DERECHA / CENTRO.                   *
                               **************************************************************************************
                               *  Box Layout      --> CENTRADOS EN EL PANÉL, EN HORIZONTÁL Y VERTICÁL.              *
                               **************************************************************************************
                               *  Card Layout     --> COMPONENTES SUPERPUESTOS. UNO VISIBLE. USADO CON JTabbedPane. *                                  *
                               **************************************************************************************
                               *  Flow Layout     --> CENTRADOS EN EL PANÉL, EN HORIZONTÁL. USO EN BARRA DE BOTONES.*
                               **************************************************************************************
                               *  Grid Bag Layout --> Grid Layout CON ELEMENTOS DE DISTINTO TAMAÑO.                 *
                               **************************************************************************************
                               *  Grid Layout     --> EN FORMA DE TABLA. MATRIZ DE BOTONES. MISMO TAMAÑO.           *
                               **************************************************************************************
                               *  Null Layout     --> NO USAR LAYOUT. NO RECOMENDADO.                               *
                               **************************************************************************************
                               *  Overlay Layout  --> COMPONENTES SUPERPUESTOS EN ORDEN DE TAMAÑO.                  *
                               **************************************************************************************
                               *  0. ATRÁS.                                                                         *
                               **************************************************************************************
                               
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
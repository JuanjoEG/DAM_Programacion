
package bloque06;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Layouts {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                               **************************************************************************************
                               *         INTERFACES GR�FICAS / ELEMENTOS GR�FICOS / LAYOUTS                         *
                               **************************************************************************************
                               *             BIBLIOTECA SWING INTEGRADA EN LA JDK DE JAVA.                          *
                               **************************************************************************************
                               *  Absolute Layout --> POSICIONES ABSOLUTAS. DISE�O LIBRE. NO ESCALABLE.             *
                               **************************************************************************************
                               *  Border Layout   --> NORTE / SUR / IZQUIERDA / DERECHA / CENTRO.                   *
                               **************************************************************************************
                               *  Box Layout      --> CENTRADOS EN EL PAN�L, EN HORIZONT�L Y VERTIC�L.              *
                               **************************************************************************************
                               *  Card Layout     --> COMPONENTES SUPERPUESTOS. UNO VISIBLE. USADO CON JTabbedPane. *                                  *
                               **************************************************************************************
                               *  Flow Layout     --> CENTRADOS EN EL PAN�L, EN HORIZONT�L. USO EN BARRA DE BOTONES.*
                               **************************************************************************************
                               *  Grid Bag Layout --> Grid Layout CON ELEMENTOS DE DISTINTO TAMA�O.                 *
                               **************************************************************************************
                               *  Grid Layout     --> EN FORMA DE TABLA. MATRIZ DE BOTONES. MISMO TAMA�O.           *
                               **************************************************************************************
                               *  Null Layout     --> NO USAR LAYOUT. NO RECOMENDADO.                               *
                               **************************************************************************************
                               *  Overlay Layout  --> COMPONENTES SUPERPUESTOS EN ORDEN DE TAMA�O.                  *
                               **************************************************************************************
                               *  0. ATR�S.                                                                         *
                               **************************************************************************************
                               
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
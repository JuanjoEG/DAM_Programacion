
package bloque06;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class ElementosPrincipales {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                               *************************************************************************
                               *             INTERFACES GRÁFICAS / ELEMENTOS PRINCIPALES               *
                               *************************************************************************
                               *             BIBLIOTECA SWING INTEGRADA EN LA JDK DE JAVA.             *
                               *************************************************************************
                               *  VISTA PREVIA DE NUESTRA VENTANA:                                     *
                               *             SOURCE  --> FUENTE                                        *
                               *             DESIGN  --> DISEÑO                                        *
                               *             HISTORY --> HISTORIAL                                     *
                               *************************************************************************
                               *  ÁRBOL DEL PROYECTO --> PAQUETES / CLASES / BIBLIOTECAS               *
                               *            PROJECTS --> PROYECTOS                                     *
                               *            FILES    --> ARCHIVOS                                      *
                               *            SERVICES --> SERVICIOS                                     *
                               *************************************************************************
                               *  ÁRBOL DE COMPONENTES --> BOTONES / PANELES / ETIQUETAS               *
                               *************************************************************************
                               *  PALETA DE COMPONENTES --> TODOS LOS ELEMENTOS - PALETTE              *
                               *************************************************************************
                               *  PROPIEDADES DE LOS ELEMENTOS                                         *
                               *************************************************************************
                               *  0. ATRÁS.                                                            *
                               *************************************************************************
                               
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
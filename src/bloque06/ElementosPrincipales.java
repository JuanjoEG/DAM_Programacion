
package bloque06;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class ElementosPrincipales {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                               *************************************************************************
                               *             INTERFACES GR�FICAS / ELEMENTOS PRINCIPALES               *
                               *************************************************************************
                               *             BIBLIOTECA SWING INTEGRADA EN LA JDK DE JAVA.             *
                               *************************************************************************
                               *  VISTA PREVIA DE NUESTRA VENTANA:                                     *
                               *             SOURCE  --> FUENTE                                        *
                               *             DESIGN  --> DISE�O                                        *
                               *             HISTORY --> HISTORIAL                                     *
                               *************************************************************************
                               *  �RBOL DEL PROYECTO --> PAQUETES / CLASES / BIBLIOTECAS               *
                               *            PROJECTS --> PROYECTOS                                     *
                               *            FILES    --> ARCHIVOS                                      *
                               *            SERVICES --> SERVICIOS                                     *
                               *************************************************************************
                               *  �RBOL DE COMPONENTES --> BOTONES / PANELES / ETIQUETAS               *
                               *************************************************************************
                               *  PALETA DE COMPONENTES --> TODOS LOS ELEMENTOS - PALETTE              *
                               *************************************************************************
                               *  PROPIEDADES DE LOS ELEMENTOS                                         *
                               *************************************************************************
                               *  0. ATR�S.                                                            *
                               *************************************************************************
                               
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
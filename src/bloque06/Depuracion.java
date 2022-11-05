
package bloque06;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Depuracion {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                               *************************************************************************
                               *              DEPURACIÓN DE PROGRAMAS EN NetBeans                      *
                               *************************************************************************
                               *  PULSAR Debug Project --> COMPILA Y EJECUTA CON EL DEPURADOR ABIETO   *
                               *************************************************************************
                               *  PUNTO DE RUPTURA --> PULSAR NÚMERO DE LÍNEA. SE PARA EN LA LÍNEA.    *
                               *  RASTREO --> VER EL CÓDIGO FUENTE.                                    *
                               *  VENTANAS DE SEGUIMIENTO --> VER VALORES DE VARIABLES                 *
                               *  REINICIALIZACIÓN --> REINICIA LA EJECUCIÓN DEL PROGRAMA.             *
                               *  MODIFICACIÓN DE VARIABLES --> CAMBIAR VALORES.                       *
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
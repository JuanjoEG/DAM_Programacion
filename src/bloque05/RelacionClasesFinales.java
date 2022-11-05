
package bloque05;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class RelacionClasesFinales {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                    *************************************************************************
                    *              RELACIÓN ENTRE CLASES / FINALES                          *
                    *************************************************************************
                    * LAS CLASES FINALES --> NO SE PUEDEN CREAR CLASES QUE HEREDEN DE ELLAS.*
                    *************************************************************************
                    *                                                                       *
                    *  public final class Cuadrado {                                        *
                    *       private double lado;                                            *
                    *                                                                       *
                    *       public Cuadrado() {                                             *
                    *            this.lado = 0;                                             *
                    *       }                                                               *
                    *                                                                       *
                    *       public final double area() {                                    *
                    *             return Math.pow(lado, 2.0);                               *
                    *       }                                                               *
                    *  }                                                                    *
                    *                                                                       *
                    *************************************************************************
                    *  final SE PUEDE USAR EN:                                              *
                    *           VARIABLES      -->    SON CONSTANTES.                       *
                    *           CLASES         -->    NO SE CREAN CLASES HIJAS.             *
                    *           MÉTODOS        -->    NO SE SOBREESCRIBEN.                  *
                    *           PARÁMETROS     -->    SON CONSTANTES.                       *
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
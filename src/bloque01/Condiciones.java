
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Condiciones {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                            
                               
                               
                               
                               
                        *******************************************************************************
                        *                        CONDICIONES                                          *
                        *******************************************************************************
                        *  a==b  --> ES true CUANDO a Y b TENGAN EL MISMO VALOR.                      *
                        *  a!=b  --> ES true CUANDO a Y b TENGAN DISTINTO VALOR.                      *
                        *  a>b   --> ES true CUANDO a SEA MAYOR QUE b.                                *
                        *  a<b   --> ES true CUANDO a SEA MENOR QUE b.                                *
                        *  ...                                                                        *
                        *  a>b && c>d   --> ES true CUANDO (a SEA MAYOR QUE b) Y (c SEA MAYOR QUE d). *
                        *  a>b || c>d   --> ES true CUANDO (a SEA MAYOR QUE b) O (c SEA MAYOR QUE d). *
                        *  ...                                                                        *
                        *  ...  SE PODRÁN CONCATENAR TANTAS CONDICIONES COMO SE NECESITE.             *
                        *******************************************************************************
                        * true  --> SE CUMPLE LA CONDICIÓN.                                           *
                        * false --> NO SE CUMPLE LA CONDICIÓN.                                        *
                        *******************************************************************************
                        *  1. TABLA DE LA VERDAD.                                                     *
                        *******************************************************************************
                        *  0. ATRÁS.                                                                  *
                        *******************************************************************************
                        
                          """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque01.TablaDeLaVerdad.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
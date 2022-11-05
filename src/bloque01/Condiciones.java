
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
                        *  ...  SE PODR�N CONCATENAR TANTAS CONDICIONES COMO SE NECESITE.             *
                        *******************************************************************************
                        * true  --> SE CUMPLE LA CONDICI�N.                                           *
                        * false --> NO SE CUMPLE LA CONDICI�N.                                        *
                        *******************************************************************************
                        *  1. TABLA DE LA VERDAD.                                                     *
                        *******************************************************************************
                        *  0. ATR�S.                                                                  *
                        *******************************************************************************
                        
                          """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque01.TablaDeLaVerdad.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
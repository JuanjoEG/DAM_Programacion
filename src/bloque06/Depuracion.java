
package bloque06;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Depuracion {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                               *************************************************************************
                               *              DEPURACI�N DE PROGRAMAS EN NetBeans                      *
                               *************************************************************************
                               *  PULSAR Debug Project --> COMPILA Y EJECUTA CON EL DEPURADOR ABIETO   *
                               *************************************************************************
                               *  PUNTO DE RUPTURA --> PULSAR N�MERO DE L�NEA. SE PARA EN LA L�NEA.    *
                               *  RASTREO --> VER EL C�DIGO FUENTE.                                    *
                               *  VENTANAS DE SEGUIMIENTO --> VER VALORES DE VARIABLES                 *
                               *  REINICIALIZACI�N --> REINICIA LA EJECUCI�N DEL PROGRAMA.             *
                               *  MODIFICACI�N DE VARIABLES --> CAMBIAR VALORES.                       *
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
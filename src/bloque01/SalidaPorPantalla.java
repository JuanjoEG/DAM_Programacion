
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class SalidaPorPantalla {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    ***************************************************
                    *              SALIDA POR PANTALLA                *
                    ***************************************************
                    * sout + (TABULADOR)  -->  ATAJO.                 *
                    ***************************************************
                    *  TEXTO CON SALTO DE L�NEA:                      *
                    *  System.out.println(\" TEXTO \");                 *
                    **************************************************
                    *  TEXTO SIN SALTO DE L�NEA:                      *
                    *  System.out.print(\" TEXTO \");                   *
                    ***************************************************
                    *  SALIDA DE VARIABLE:                            *
                    *  System.out.println(variable);                  *
                    ***************************************************
                    *  SALIDA DE TEXTO Y VARIABLE:                    *
                    *  System.out.println(\" TEXTO \" + variable);      *
                    ***************************************************
                    * 1. USOS DE printf. Dar formato a los datos.     *
                    * 2. SALIDA POR PANTALLA DE UN OBJETO - GETTERS.  *
                    * 3. SALIDA POR PANTALLA DE UN OBJETO - toString. *
                    ***************************************************
                    * 0. ATR�S.                                       *
                    ***************************************************
                    
                    """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque01.UsosDePrintF.main(args);
                case "2" -> bloque04.MetodosGetters.main(args);
                case "3" -> bloque04.MetodotoString.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
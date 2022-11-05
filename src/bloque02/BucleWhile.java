
package bloque02;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class BucleWhile {
    
    public static void main(String[] args){
    
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *****************************************************************
                    *                      BUCLE while                              *
                    *****************************************************************
                    * SI NO SE CUMPLE LA CONDICI�N  --> NO SE ENTRA AL BLOQUE.      *
                    * SI SE CUMPLE LA CONDICI�N  --> SE EJECUTA EL BLOQUE.          *
                    * SE REPITE EL BLOQUE HASTA QUE NO SE CUMPLA LA CONDICI�N.      *
                    * DENTRO DEL BLOQUE SE TIENE QUE PODER CAMBIAR LA CONDICI�N.    *
                    * SE PUEDEN AGRUPAR CONDICIONES USANDO OPERADORES L�GICOS.      *
                    * EN LUGAR DE UNA CONDICI�N SE PUEDE USAR UN BOOLEANO.          *
                    *                                                               *
                    *  while (CONDICI�N) {                                          *
                    *         BLOQUE;                                               *
                    *  }                                                            *
                    *                                                               *
                    *****************************************************************
                    *                      BUCLE do-while                           *
                    *****************************************************************
                    * SE ENTRA SIEMPRE AL BLOQUE.                                   *
                    * SI SE CUMPLE LA CONDICI�N  --> SE REPITE EL BLOQUE.           *
                    * SE REPITE EL BLOQUE HASTA QUE NO SE CUMPLA LA CONDICI�N.      *
                    * DENTRO DEL BLOQUE SE TIENE QUE PODER CAMBIAR LA CONDICI�N.    *
                    *                                                               *
                    *  do {                                                         *
                    *         BLOQUE;                                               *
                    *  } while (CONDICI�N)                                          *
                    *                                                               *
                    *****************************************************************
                    * 1. CONTINUE  /  BREAK.                                        *
                    *****************************************************************
                    * 0. ATR�S.                                                     *
                    *****************************************************************
                            
                            """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque02.ContinueBreak.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
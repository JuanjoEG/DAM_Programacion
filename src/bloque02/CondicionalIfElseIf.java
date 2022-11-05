
package bloque02;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class CondicionalIfElseIf {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *****************************************************************
                    *                   CONDICIONAL if-else-if                      *
                    *****************************************************************
                    * SI SE CUMPLE LA CONDICI�N --> SE EJECUTA EL BLOQUE.           *
                    * SI NO SE CUMPLE LA CONDICI�N  --> NO SE EJECUTA NADA.         *
                    *                                                               *
                    * if (CONDICI�N){                                               *
                    *     BLOQUE;                                                   *
                    * }                                                             *
                    *****************************************************************
                    * SI SE CUMPLE LA CONDICI�N  --> SE EJECUTA EL BLOQUE_A.        *
                    * SI NO SE CUMPLE LA CONDICI�N  --> SE EJECUTA EL BLOQUE_Z.     *
                    * SOLO SE PUEDE EJECUTAR UN BLOQUE.                             *
                    * SE PUEDEN AGRUPAR CONDICIONES USANDO OPERADORES L�GICOS.      *
                    * EN LUGAR DE UNA CONDICI�N SE PUEDE USAR UN BOOLEANO.          *
                    *                                                               *
                    * if (CONDICI�N){                                               *
                    *     BLOQUE_A;                                                 *
                    * } else {                                                      *
                    *     BLOQUE_Z;                                                 *
                    * }                                                             *
                    *****************************************************************
                    * SI SE CUMPLE LA CONDICI�N_A --> SE EJECUTA EL BLOQUE_A.       *
                    * SI SE CUMPLE LA CONDICI�N_B --> SE EJECUTA EL BLOQUE_B.       *
                    * SI SE CUMPLE LA CONDICI�N_C --> SE EJECUTA EL BLOQUE_C.       *
                    * ...                                                           *
                    * SI NO SE CUMPLE NINGUNA CONDICI�N --> SE EJECUTA EL BLOQUE_Z. *
                    * SOLO SE PUEDE EJECUTAR UN BLOQUE.                             *
                    *                                                               *
                    * if (CONDICI�N_A){                                             *
                    *     BLOQUE_A;                                                 *
                    * } else if (CONDICI�N_B) {                                     *
                    *     BLOQUE_B;                                                 *
                    * } else if (CONDICI�N_C) {                                     *
                    *     BLOQUE_C;                                                 *
                    * } else {                                                      *
                    *     BLOQUE_Z;                                                 *
                    * }                                                             *
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
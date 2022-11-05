
package bloque02;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
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
                    * SI SE CUMPLE LA CONDICIÓN --> SE EJECUTA EL BLOQUE.           *
                    * SI NO SE CUMPLE LA CONDICIÓN  --> NO SE EJECUTA NADA.         *
                    *                                                               *
                    * if (CONDICIÓN){                                               *
                    *     BLOQUE;                                                   *
                    * }                                                             *
                    *****************************************************************
                    * SI SE CUMPLE LA CONDICIÓN  --> SE EJECUTA EL BLOQUE_A.        *
                    * SI NO SE CUMPLE LA CONDICIÓN  --> SE EJECUTA EL BLOQUE_Z.     *
                    * SOLO SE PUEDE EJECUTAR UN BLOQUE.                             *
                    * SE PUEDEN AGRUPAR CONDICIONES USANDO OPERADORES LÓGICOS.      *
                    * EN LUGAR DE UNA CONDICIÓN SE PUEDE USAR UN BOOLEANO.          *
                    *                                                               *
                    * if (CONDICIÓN){                                               *
                    *     BLOQUE_A;                                                 *
                    * } else {                                                      *
                    *     BLOQUE_Z;                                                 *
                    * }                                                             *
                    *****************************************************************
                    * SI SE CUMPLE LA CONDICIÓN_A --> SE EJECUTA EL BLOQUE_A.       *
                    * SI SE CUMPLE LA CONDICIÓN_B --> SE EJECUTA EL BLOQUE_B.       *
                    * SI SE CUMPLE LA CONDICIÓN_C --> SE EJECUTA EL BLOQUE_C.       *
                    * ...                                                           *
                    * SI NO SE CUMPLE NINGUNA CONDICIÓN --> SE EJECUTA EL BLOQUE_Z. *
                    * SOLO SE PUEDE EJECUTAR UN BLOQUE.                             *
                    *                                                               *
                    * if (CONDICIÓN_A){                                             *
                    *     BLOQUE_A;                                                 *
                    * } else if (CONDICIÓN_B) {                                     *
                    *     BLOQUE_B;                                                 *
                    * } else if (CONDICIÓN_C) {                                     *
                    *     BLOQUE_C;                                                 *
                    * } else {                                                      *
                    *     BLOQUE_Z;                                                 *
                    * }                                                             *
                    *****************************************************************
                    * 1. CONTINUE  /  BREAK.                                        *
                    *****************************************************************
                    * 0. ATRÁS.                                                     *
                    *****************************************************************
                    
                      """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque02.ContinueBreak.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
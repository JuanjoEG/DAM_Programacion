
package bloque02;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class CondicionalRuleSwitch {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *****************************************************************
                    *                    CONDICIONAL RULE switch                    *
                    *****************************************************************
                    * SI TODOS LOS BLOQUES DE UN switch TIENEN break ...            *
                    *         PODEMOS COVERTIR A RULE switch.                       *
                    *****************************************************************
                    * SI SE CUMPLE VARIABLE == VALOR_A  --> SE EJECUTA EL BLOQUE_A. *
                    * SI SE CUMPLE VARIABLE == VALOR_A  --> SE EJECUTA EL BLOQUE_B. *
                    * SI SE CUMPLE VARIABLE == VALOR_A  --> SE EJECUTA EL BLOQUE_C. *
                    *...                                                            *
                    * SI NO SE CUMPLE NINGUNA CONDICI�N --> SE EJECUTA EL BLOQUE_Z. *
                    *                                                               *
                    *****************************************************************
                    *  switch (VARIABLE) {                                          *
                    *                                                               *
                    *      case VALOR_A -> {                                        *
                    *         BLOQUE_A;                                             *
                    *         }                                                     *
                    *                                                               *
                    *      case VALOR_B -> {                                        *
                    *         BLOQUE_B;                                             *
                    *         }                                                     *
                    *                                                               *
                    *      case VALOR_C -> {                                        *
                    *         BLOQUE_C;                                             *
                    *         }                                                     *
                    *...                                                            *
                    *      default -> {                                             *
                    *         BLOQUE_Z;                                             *
                    *         }                                                     *
                    *  }                                                            *
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
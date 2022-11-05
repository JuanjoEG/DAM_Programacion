
package bloque02;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class CondicionalSwitch {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *****************************************************************
                    *                      CONDICIONAL switch                       *
                    *****************************************************************
                    * SI SE CUMPLE VARIABLE == VALOR_A  --> SE EJECUTA EL BLOQUE_A. *
                    * SI SE CUMPLE VARIABLE == VALOR_A  --> SE EJECUTA EL BLOQUE_B. *
                    * SI SE CUMPLE VARIABLE == VALOR_A  --> SE EJECUTA EL BLOQUE_C. *
                    * SE PUEDE ENTRAR EN VARIOS BLOQUES PRESCINDIENDO DEL break.    *
                    *...                                                            *
                    * SI NO SE CUMPLE NINGUNA CONDICIÓN --> SE EJECUTA EL BLOQUE_Z. *
                    *                                                               *
                    *****************************************************************
                    *  switch (VARIABLE) {                                          *
                    *                                                               *
                    *      case VALOR_A:                                            *
                    *         BLOQUE_A;                                             *
                    *         break;                                                *
                    *                                                               *
                    *      case VALOR_B:                                            *
                    *         BLOQUE_B;                                             *
                    *         break;                                                *
                    *                                                               *
                    *      case VALOR_C:                                            *
                    *         BLOQUE_C;                                             *
                    *         break;                                                *
                    *...                                                            *
                    *      default:                                                 *
                    *         BLOQUE_Z;                                             *
                    *         break;                                                *
                    *  }                                                            *
                    *                                                               *
                    *****************************************************************
                    * SI TODOS LOS BLOQUES DE UN switch TIENEN break ...            *
                    *         PODEMOS COVERTIR A RULE switch.                       *
                    *****************************************************************
                    * 1. CONTINUE  /  BREAK.                                        *
                    * 2. RULE SWITCH                                                *
                    *****************************************************************
                    * 0. ATRÁS.                                                     *
                    *****************************************************************
                    
                      """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1":
                    bloque02.ContinueBreak.main(args);
                    break;
                case "2":
                    bloque02.CondicionalRuleSwitch.main(args);
                    break;
                case "0":
                    break;
                default:
                    System.out.println("La opción no es correcta.");
                    break;
            }
        } while (!"0".equals(menu));
    }
}
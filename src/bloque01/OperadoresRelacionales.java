
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class OperadoresRelacionales {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                        *******************************************
                        *        OPERADORES RELACIONALES          *
                        *******************************************
                        *   ==  -->  IGUAL QUE...                 *
                        *   !=  -->  DISTINTO QUE...              *
                        *   >   -->  MAYOR QUE...                 *
                        *   <   -->  MENOR QUE...                 *
                        *   >=  -->  MAYOR O IGUAL QUE...         *
                        *   <=  -->  MENOR O IGUAL QUE...         *
                        *******************************************
                        *  1. PRINCIPAL UTILIDAD --> CONDICIONES. *
                        *******************************************
                        *  0. ATR�S.                              *
                        *******************************************
                                 
                                    """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque01.Condiciones.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
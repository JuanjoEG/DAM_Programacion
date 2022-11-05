
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class ExpresionesRegulares {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                               
                    **************************************************************
                    *                    EXPRESIONES REGULARES                   *
                    **************************************************************
                    *         NECESITAMOS  -->  import java.util.regex;          *
                    **************************************************************
                    *  Pattern Class   -->   M�TODO compile ()                   *
                    *  Matcher Class   -->   M�TODO matcher ()                   *
                    *  PatternSyntaxExeption Class                               *
                    *  MatchResult interface                                     *
                    **************************************************************
                    *  1. EJEMPLOS DE EXPRESIONES REGULARES.                     *
                    **************************************************************
                    *  0. ATR�S.                                                 *
                    **************************************************************
            
                               
            """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> ejemplos.tramo05.UsandoExpresionesRegulares.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
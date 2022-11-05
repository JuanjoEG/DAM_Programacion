
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
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
                    *  Pattern Class   -->   MÉTODO compile ()                   *
                    *  Matcher Class   -->   MÉTODO matcher ()                   *
                    *  PatternSyntaxExeption Class                               *
                    *  MatchResult interface                                     *
                    **************************************************************
                    *  1. EJEMPLOS DE EXPRESIONES REGULARES.                     *
                    **************************************************************
                    *  0. ATRÁS.                                                 *
                    **************************************************************
            
                               
            """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> ejemplos.tramo05.UsandoExpresionesRegulares.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
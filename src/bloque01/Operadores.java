
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Operadores {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    **************************************************************
                    *                         OPERADORES                         *
                    **************************************************************
                    *  1. OPERADORES ARITM�TICOS.                                *
                    *  2. OPERADORES L�GICOS.         /  CONDICIONALES M�LTIPLES *
                    *  3. OPERADORES RELACIONALES.    /  CONDICIONALES           *
                    *  4. OPERADORES DE ASIGNACI�N.                              *
                    **************************************************************
                    *  5. CONDICIONES.                                           *
                    *  6. TABLA DE LA VERDAD.                                    *
                    **************************************************************
                    *  0. ATR�S.                                                 *
                    **************************************************************
                                          
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque01.OperadoresAritmeticos.main(args);
                case "2" -> bloque01.OperadoresLogicos.main(args);
                case "3" -> bloque01.OperadoresRelacionales.main(args);
                case "4" -> bloque01.OperadoresDeAsignacion.main(args);
                case "5" -> bloque01.Condiciones.main(args);
                case "6" -> bloque01.TablaDeLaVerdad.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
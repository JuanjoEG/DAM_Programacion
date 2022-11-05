
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class DatosAlfanumericos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                              
                    
                    
                    
                    
                    ************************************************
                    *        TIPOS DE DATOS / ALFANUM�RICOS        *
                    ************************************************
                    * char    -->   ' '  UN CARACTER.              *
                    * String  -->   \" \"  UNA CADENA DE CARACTERES. *
                    ************************************************
                    * TIPO IDENTIFICADOR;                          *
                    * IDENTIFICADOR = VALOR;                       *
                    ************************************************
                    * TIPO IDENTIFICADOR = VALOR;                  *
                    ************************************************
                    * LOS TIPOS PRIMITIVOS                         *
                    * NO PUDEN VALER null.                         *
                    * String --> NO ES PRIMITIVO.                  *
                    ************************************************
                    * LOS IDENTIFICADORES DE LAS                   *
                    * VARIABLES EMPIEZAN CON MINUSCULAS            *
                    ************************************************
                    * 1. SECUENCIAS DE ESCAPE.                     *
                    * 2. OPERACIONES CON CADENAS DE CARACTERES.    *
                    ************************************************
                    * 0. ATR�S.                                    *
                    ************************************************
            
            
            """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque01.SecuenciasDeEscape.main(args);
                case "2" -> bloque01.OperacionesConCadenas.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
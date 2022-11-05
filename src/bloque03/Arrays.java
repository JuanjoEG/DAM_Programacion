
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Arrays {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *****************************************************************
                    *                    ARRAYS DE UNA DIMENSI�N                    *
                    *****************************************************************
                    *                                                               *
                    *  TIPO[] nombrevariable = new TIPO[] {X0, X1, X2, X3,...,Xn};  *
                    *                                                               *
                    *****************************************************************
                    *  TIPO[] nombrevariable = new TIPO[TAMA�O];                    *
                    *                                                               *
                    *  nombrevariable [0] = X0;                                     *
                    *  nombrevariable [1] = X1;                                     *
                    *  nombrevariable [2] = X2;                                     *
                    *  nombrevariable [3] = X3;                                     *
                    *  ...                                                          *
                    *  nombrevariable [n] = Xn;                                     *
                    *                                                               *
                    *****************************************************************
                    *  OJO --> LOS �NDICES EMPIEZAN EN CERO.                        *
                    *  OJO --> EL TAMA�O SER� UN VALOR MAYOR DE CERO.               *
                    *****************************************************************
                    * 1. ARRAYS DE DOS DIMENSIONES  -->  MATRICES.                  *
                    * 2. EJEMPLO  -->  USANDO  ARRAYS  DE  MATRICES.                *
                    * 3. EJEMPLO  -->  USANDO  ARRAYS.                              *
                    * 4. ARRAY LIST.                                                *
                    * 5. ITERADORES.                                                *
                    *****************************************************************
                    * 0. ATR�S.                                                     *
                    *****************************************************************
                    
                      """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){                
                case "1" -> bloque03.ArraysDosDimensiones.main(args);
                case "2" -> ejemplos.tramo04.UsandoArraysMatriz.main(args);
                case "3" -> ejemplos.tramo04.UsandoArrays.main(args);                
                case "4" -> bloque03.ArrayList.main(args);
                case "5" -> bloque03.Iteradores.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
        
    }
}
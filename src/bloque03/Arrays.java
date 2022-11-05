
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Arrays {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *****************************************************************
                    *                    ARRAYS DE UNA DIMENSIÓN                    *
                    *****************************************************************
                    *                                                               *
                    *  TIPO[] nombrevariable = new TIPO[] {X0, X1, X2, X3,...,Xn};  *
                    *                                                               *
                    *****************************************************************
                    *  TIPO[] nombrevariable = new TIPO[TAMAÑO];                    *
                    *                                                               *
                    *  nombrevariable [0] = X0;                                     *
                    *  nombrevariable [1] = X1;                                     *
                    *  nombrevariable [2] = X2;                                     *
                    *  nombrevariable [3] = X3;                                     *
                    *  ...                                                          *
                    *  nombrevariable [n] = Xn;                                     *
                    *                                                               *
                    *****************************************************************
                    *  OJO --> LOS ÍNDICES EMPIEZAN EN CERO.                        *
                    *  OJO --> EL TAMAÑO SERÁ UN VALOR MAYOR DE CERO.               *
                    *****************************************************************
                    * 1. ARRAYS DE DOS DIMENSIONES  -->  MATRICES.                  *
                    * 2. EJEMPLO  -->  USANDO  ARRAYS  DE  MATRICES.                *
                    * 3. EJEMPLO  -->  USANDO  ARRAYS.                              *
                    * 4. ARRAY LIST.                                                *
                    * 5. ITERADORES.                                                *
                    *****************************************************************
                    * 0. ATRÁS.                                                     *
                    *****************************************************************
                    
                      """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){                
                case "1" -> bloque03.ArraysDosDimensiones.main(args);
                case "2" -> ejemplos.tramo04.UsandoArraysMatriz.main(args);
                case "3" -> ejemplos.tramo04.UsandoArrays.main(args);                
                case "4" -> bloque03.ArrayList.main(args);
                case "5" -> bloque03.Iteradores.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
        
    }
}
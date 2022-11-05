
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class ArraysDosDimensiones {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *******************************************************************************************************
                    *       ARRAYS DE DOS DIMENSIONES  -->  MATRICES                                                      *
                    *******************************************************************************************************
                    *                                                                                                     *
                    *  TIPO[][] nombrevariable = {{X00,X01,X02,...,X0m},{X10,X11,X12,...,X1m},...,{Xn0,Xn1,Xn2,...,Xnm};  *
                    *                                                                                                     *
                    *******************************************************************************************************
                    *  TIPO[][] nombrevariable = new TIPO[TAMA�OFILAS][TAMA�OCOLUMNAS];                                   *
                    *                                                                                                     *
                    *  nombrevariable [0][0] = X00;                                                                       *
                    *  nombrevariable [0][1] = X01;                          MATRIZ [n][m]                                *
                    *  nombrevariable [0][2] = X02;                      ---------------------                            *
                    *  ...                                              | X00,X01,X02,...,X0m |                           *
                    *  nombrevariable [1][0] = X10;                     | X10,X11,X12,...,X1m |                           *
                    *  nombrevariable [1][1] = X11;                     | ...                 |                           *
                    *  nombrevariable [1][2] = X12;                     | Xn0,Xn1,Xn2,...,Xnm |                           *
                    *  ...                                               ---------------------                            *
                    *  nombrevariable [2][0] = X20;                                                                       *
                    *  nombrevariable [2][1] = X21;                                                                       *
                    *  nombrevariable [2][2] = X22;                                                                       *
                    *  ...                                                                                                *
                    *******************************************************************************************************
                    *  OJO --> LOS �NDICES EMPIEZAN EN CERO.                                                              *
                    *  OJO --> LOS TAMA�OS SER�N VALORES MAYORES DE CERO.                                                 *
                    *******************************************************************************************************
                    * 0. ATR�s.                                                                                           *
                    *******************************************************************************************************
                    
                      """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
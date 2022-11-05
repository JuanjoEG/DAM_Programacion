
package bloque02;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class BucleFor {
    
    public static void main(String[] args){

        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                              
                    
                    
                    
                    
                        *****************************************************************
                        *                      BUCLE for                                *
                        *****************************************************************
                        * CONTADOR   --> NORMALMENTE -->  int i=0  -->  INICIO          *
                        * CONDICI�N  --> NORMALMENTE -->  i<VALOR  -->  PARADA          *
                        * INCREMENTO --> NORMALMENTE -->  i++      -->  PASOS           *
                        * SE REPITE EL BLOQUE HASTA QUE NO SE CUMPLA LA CONDICI�N.      *
                        * SE PUEDEN AGRUPAR CONDICIONES USANDO OPERADORES L�GICOS.      *
                        * EN LUGAR DE UNA CONDICI�N SE PUEDE USAR UN BOOLEANO.          *
                        *                                                               *
                        *  for (CONTADOR; CONDICI�N; INCREMENTO) {                      *
                        *         BLOQUE;                                               *
                        *  }                                                            *
                        *                                                               *
                        *****************************************************************
                        *                      BUCLE foreach                            *
                        *****************************************************************
                        * ITERADOR   --> NORMALMENTE -->  int i      O   String nombre  *
                        * COLECCI�N  --> NORMALMENTE -->  Array      O      ArrayList   *
                        * SE RECORRE LA COLECCI�N COMPLETA.                             *
                        * EL ITERADOR TOMAR� TODOS LOS VALORES DE LA COLECCI�N.         *
                        *                                                               *
                        *  for (ITERADOR: COLECCI�N) {                                  *
                        *         BLOQUE;                                               *
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
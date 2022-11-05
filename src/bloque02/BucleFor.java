
package bloque02;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
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
                        * CONDICIÓN  --> NORMALMENTE -->  i<VALOR  -->  PARADA          *
                        * INCREMENTO --> NORMALMENTE -->  i++      -->  PASOS           *
                        * SE REPITE EL BLOQUE HASTA QUE NO SE CUMPLA LA CONDICIÓN.      *
                        * SE PUEDEN AGRUPAR CONDICIONES USANDO OPERADORES LÓGICOS.      *
                        * EN LUGAR DE UNA CONDICIÓN SE PUEDE USAR UN BOOLEANO.          *
                        *                                                               *
                        *  for (CONTADOR; CONDICIÓN; INCREMENTO) {                      *
                        *         BLOQUE;                                               *
                        *  }                                                            *
                        *                                                               *
                        *****************************************************************
                        *                      BUCLE foreach                            *
                        *****************************************************************
                        * ITERADOR   --> NORMALMENTE -->  int i      O   String nombre  *
                        * COLECCIÓN  --> NORMALMENTE -->  Array      O      ArrayList   *
                        * SE RECORRE LA COLECCIÓN COMPLETA.                             *
                        * EL ITERADOR TOMARÁ TODOS LOS VALORES DE LA COLECCIÓN.         *
                        *                                                               *
                        *  for (ITERADOR: COLECCIÓN) {                                  *
                        *         BLOQUE;                                               *
                        *  }                                                            *
                        *                                                               *
                        *****************************************************************
                        * 1. CONTINUE  /  BREAK.                                        *
                        *****************************************************************
                        * 0. ATRÁS.                                                     *
                        *****************************************************************
                        
                                    """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque02.ContinueBreak.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
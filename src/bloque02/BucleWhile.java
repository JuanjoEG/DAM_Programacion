
package bloque02;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class BucleWhile {
    
    public static void main(String[] args){
    
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *****************************************************************
                    *                      BUCLE while                              *
                    *****************************************************************
                    * SI NO SE CUMPLE LA CONDICIÓN  --> NO SE ENTRA AL BLOQUE.      *
                    * SI SE CUMPLE LA CONDICIÓN  --> SE EJECUTA EL BLOQUE.          *
                    * SE REPITE EL BLOQUE HASTA QUE NO SE CUMPLA LA CONDICIÓN.      *
                    * DENTRO DEL BLOQUE SE TIENE QUE PODER CAMBIAR LA CONDICIÓN.    *
                    * SE PUEDEN AGRUPAR CONDICIONES USANDO OPERADORES LÓGICOS.      *
                    * EN LUGAR DE UNA CONDICIÓN SE PUEDE USAR UN BOOLEANO.          *
                    *                                                               *
                    *  while (CONDICIÓN) {                                          *
                    *         BLOQUE;                                               *
                    *  }                                                            *
                    *                                                               *
                    *****************************************************************
                    *                      BUCLE do-while                           *
                    *****************************************************************
                    * SE ENTRA SIEMPRE AL BLOQUE.                                   *
                    * SI SE CUMPLE LA CONDICIÓN  --> SE REPITE EL BLOQUE.           *
                    * SE REPITE EL BLOQUE HASTA QUE NO SE CUMPLA LA CONDICIÓN.      *
                    * DENTRO DEL BLOQUE SE TIENE QUE PODER CAMBIAR LA CONDICIÓN.    *
                    *                                                               *
                    *  do {                                                         *
                    *         BLOQUE;                                               *
                    *  } while (CONDICIÓN)                                          *
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
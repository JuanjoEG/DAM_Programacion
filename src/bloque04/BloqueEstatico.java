
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class BloqueEstatico {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                              
                    ***********************************************************************
                    *                 CLASES / BLOQUES EST�TICOS                          *
                    ***********************************************************************
                    *  ES EL LUGAR CORRECTO PARA INICIALIZAR LAS VARIABLES EST�TICAS.     *
                    *  SE EJECUTAN SOLO UNA VEZ.                                          *
                    *  REALIZAN LA FUNCI�N DE CONSTRUCTOR PARA VARIABLES EST�TICAS.       *
                    ***********************************************************************
                    *  public class Demo {                                                *
                    *       static int a;                                                 *
                    *       static int b;                                                 *
                    *                                                                     *
                    *       static {                                                      *
                    *            a = 10;                                                  *
                    *            b = 20;                                                  *
                    *            }                                                        *
                    *  }                                                                  *
                    ***********************************************************************
                    *  0. ATR�S.                                                          *
                    ***********************************************************************
                               
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
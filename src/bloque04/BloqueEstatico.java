
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class BloqueEstatico {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                              
                    ***********************************************************************
                    *                 CLASES / BLOQUES ESTÁTICOS                          *
                    ***********************************************************************
                    *  ES EL LUGAR CORRECTO PARA INICIALIZAR LAS VARIABLES ESTÁTICAS.     *
                    *  SE EJECUTAN SOLO UNA VEZ.                                          *
                    *  REALIZAN LA FUNCIÓN DE CONSTRUCTOR PARA VARIABLES ESTÁTICAS.       *
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
                    *  0. ATRÁS.                                                          *
                    ***********************************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
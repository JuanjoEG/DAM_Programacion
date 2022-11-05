
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class MetodosPasoValorReferencia {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                             
                    ***********************************************************************
                    *                 CLASES / MÉTODOS / PASO POR VALOR                   *
                    ***********************************************************************
                    *  A LOS MÉTODOS SE LE PUEDEN PASAR PARÁMETROS.                       *
                    *  SI EL PARÁMETRO ES UNA VARIABLE PRIMITIVA --> PASO POR VALOR.      *
                    *  SE PASA SÓLO EL VALOR.                                             *
                    *  LA VARIABLE ORIGINAL NO SE MODIFICA DENTRO DEL MÉTODO.             *
                    ***********************************************************************
                               
                    ***********************************************************************
                    *                 CLASES / MÉTODOS / PASO POR REFERENCIA              *
                    ***********************************************************************
                    *  A LOS MÉTODOS SE LE PUEDEN PASAR PARÁMETROS.                       *
                    *  SI EL PARÁMETRO ES UN OBJETO --> PASO POR REFERENCIA.              *
                    *  SE PASA EL OBJETO.                                                 *
                    *  EL OBJETO ORIGINAL SI SE MODIFICA DENTRO DEL MÉTODO.               *
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
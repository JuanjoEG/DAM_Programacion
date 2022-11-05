
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class MetodosPasoValorReferencia {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                             
                    ***********************************************************************
                    *                 CLASES / M�TODOS / PASO POR VALOR                   *
                    ***********************************************************************
                    *  A LOS M�TODOS SE LE PUEDEN PASAR PAR�METROS.                       *
                    *  SI EL PAR�METRO ES UNA VARIABLE PRIMITIVA --> PASO POR VALOR.      *
                    *  SE PASA S�LO EL VALOR.                                             *
                    *  LA VARIABLE ORIGINAL NO SE MODIFICA DENTRO DEL M�TODO.             *
                    ***********************************************************************
                               
                    ***********************************************************************
                    *                 CLASES / M�TODOS / PASO POR REFERENCIA              *
                    ***********************************************************************
                    *  A LOS M�TODOS SE LE PUEDEN PASAR PAR�METROS.                       *
                    *  SI EL PAR�METRO ES UN OBJETO --> PASO POR REFERENCIA.              *
                    *  SE PASA EL OBJETO.                                                 *
                    *  EL OBJETO ORIGINAL SI SE MODIFICA DENTRO DEL M�TODO.               *
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
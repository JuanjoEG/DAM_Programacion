
package ejemplos.tramo06;

import Clases.Cuadrilatero;
import Clases.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class CalculadoraDeFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        String menu;
        
        do {
        System.out.println("""
                           
                           
                           
                           
                           
                ********************************************
                *          CALCULADORA DE FIGURAS          *
                ********************************************
                *   1. TRIANGULOS.                         *
                *   2. CUADRIL�TEROS.                      *
                *                                          *
                *   0. SALIR.                              *
                ********************************************
                
                """);
        
        System.out.print("Eliga su opci�n: ");
        menu = teclado.nextLine();           
                
        switch(menu){
            case "1" -> Triangulo.mostrarMenu();
            case "2" -> Cuadrilatero.mostrarMenu();
            case "0" -> {}
            default -> System.out.println("La opci�n no es correcta.");
        } 
        }while (!menu.equals("0"));
    }    
}
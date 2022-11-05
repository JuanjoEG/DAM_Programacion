
package ejemplos.tramo01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class IntercambiandoVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // DECLARACIÓN DE VARIABLES
        Scanner teclado_valor = new Scanner (System.in);
        int a, b, c;
        
        System.out.println("Selecciona un valor para la variable a= ");
        a = teclado_valor.nextInt();
        System.out.println("Selecciona un valor para la variable b= ");
        b = teclado_valor.nextInt();
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        System.out.println("Ahora intercambio variables");
        c=a;
        a=b;
        b=c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
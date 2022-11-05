
package ejemplos.tramo01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class CafeteriaFacultad {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        // DECLARACIÓN DE VARIABLES
        Scanner teclado_valor = new Scanner (System.in);
        int n_cafes = 0 , n_tostadas = 0 , n_zumos = 0;
        double prec_cafes = 1.25 , prec_tostadas = 1.55 , prec_zumos = 2.15;
        double cuenta, total_cafes, total_tostadas, total_zumos;
        
        System.out.println("¿Cúantos Cafés va a tomar?");
        n_cafes = teclado_valor.nextInt();
        System.out.println("¿Cuántas Tostados va a tomar?");
        n_tostadas = teclado_valor.nextInt();
        System.out.println("¿Cuántos Zumos va a tomar?");
        n_zumos = teclado_valor.nextInt();
        
        total_cafes = n_cafes * prec_cafes ;
        total_tostadas = n_tostadas * prec_tostadas ;
        total_zumos = n_zumos * prec_zumos ;
        cuenta = total_cafes + total_tostadas + total_zumos;
        
        System.out.println("CAFES     " + n_cafes + " * " + prec_cafes + " = " + total_cafes);
        System.out.println("TOSTADAS  " + n_tostadas + " * " + prec_tostadas + " = " + total_tostadas);
        System.out.println("ZUMOS     " + n_zumos + " * " + prec_zumos + " = " + total_zumos);
        System.out.println("La Cuenta Total asciende a " + cuenta + " ?. " );
    }    
}
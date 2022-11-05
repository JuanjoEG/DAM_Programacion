
package ejemplos.tramo02;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class SumaRestaProductoResto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // DECLARACIÓN DE VARIABLES
        Scanner teclado_valor = new Scanner (System.in);
        double a, b, suma, resta, producto, division, resto;
        
        System.out.println("Selecciona un valor para la variable a= ");
        a = teclado_valor.nextDouble();
        System.out.println("Selecciona un valor para la variable b= ");
        b = teclado_valor.nextDouble();
        
        System.out.println("SUMA");
        suma=a+b;
        System.out.println(a+" + "+b+" = "+suma);
        
        System.out.println("RESTA");
        resta=a-b;
        System.out.println(a+" - "+b+" = "+resta);
        
        System.out.println("PRODUCTO");
        producto=a*b;
        System.out.println(a+" * "+b+" = "+producto);
        
        System.out.println("DIVISIÓN");
        division=a/b;
        System.out.println(a+" / "+b+" = "+division);
        
        System.out.println("RESTO");
        resto=a%b;
        System.out.println(a+" % "+b+" = "+resto);
    }    
}
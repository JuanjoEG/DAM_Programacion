
package ejemplos.tramo01;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada_tecla = new Scanner(System.in);
        int numero;
        System.out.print ("Elija un n�mero:");
        numero = entrada_tecla.nextInt();
        
        if (numero%2 == 0) {
            System.out.println("El n�mero " +numero+ " es par.");
        } else {
            System.out.println("El n�mero " +numero+ " es impar.");}
    }
}
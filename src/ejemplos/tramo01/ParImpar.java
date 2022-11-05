
package ejemplos.tramo01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada_tecla = new Scanner(System.in);
        int numero;
        System.out.print ("Elija un número:");
        numero = entrada_tecla.nextInt();
        
        if (numero%2 == 0) {
            System.out.println("El número " +numero+ " es par.");
        } else {
            System.out.println("El número " +numero+ " es impar.");}
    }
}
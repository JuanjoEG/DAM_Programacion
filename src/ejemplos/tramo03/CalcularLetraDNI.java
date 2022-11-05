
package ejemplos.tramo03;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class CalcularLetraDNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\nA PARTIR DEL NÚMERO DE UN DNI\n"
                + "SE CALCULA LA LETRA ASOCIADA A ÉL.\n");
        int dni=0;
        int posicion=0;
        System.out.println("");
        String tabla="TRWAGMYFPDXBNJZSQVHLCKE";
        System.out.print("Introduce tu número de DNI : ");
        Scanner sc= new Scanner(System.in);
        dni = sc.nextInt();
        posicion=dni%23;
        System.out.println("Su Letra es la --> "+tabla.charAt(posicion));
        System.out.println("");
    }
}

package ejemplos.tramo02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class DescomponerNumeroFactoresPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int i=2;
        ArrayList<Integer> factores = new ArrayList<>();
        System.out.println("DESCOMPONER UN NÚMERO EN FACTORES PRIMOS.\n");
        Scanner tecla=new Scanner(System.in);
        System.out.println("Introduzca un Número Entero:");
        System.out.print("Para Descomponer :");
        numero = tecla.nextInt();
        System.out.println("");
            while (i<=numero){
                if (numero%i==0){
                    factores.add(i);
                    System.out.println("  -->  "+numero+" entre "+i);
                    numero=numero/i;
                    i=1;
                }
            i=i+1;
            }
        System.out.println("  -->  1");
        System.out.println("RESULTADO: ");
        for (int iterador:factores){
            System.out.print(iterador+" * ");
        }
        System.out.println("1\n");
    }
}
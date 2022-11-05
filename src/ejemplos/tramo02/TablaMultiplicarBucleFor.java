
package ejemplos.tramo02;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class TablaMultiplicarBucleFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero;
        Scanner valor_tecla = new Scanner(System.in);
        
        System.out.println("Elige un número");
        numero = valor_tecla.nextInt();
        
        for (int i=0; i<=10; i++){
            int resultado = i*numero;
            System.out.println(i +" * "+ numero +" = "+ resultado);
        }
    }    
}
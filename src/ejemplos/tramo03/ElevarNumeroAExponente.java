
package ejemplos.tramo03;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class ElevarNumeroAExponente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada_tecla = new Scanner(System.in);
        int base , producto, exponente;
        
        System.out.print ("Elija un número entero:");
        base = entrada_tecla.nextInt();
        producto = base;
        
        System.out.print ("Elija un exponente entero positivo:");
        exponente = entrada_tecla.nextInt();
        
        if (exponente>0) {
            for(int i=1;i<exponente;i++){
                producto = producto * base;
            }
            System.out.println("");
            System.out.println("El resultado de "+base+" elevado a "+exponente+" es =" +producto);
            System.out.println("");
        } else {
            System.out.println("El exponente no es correcto.");
        }
    }
}
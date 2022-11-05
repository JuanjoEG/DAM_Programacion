
package ejemplos.tramo02;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class PongaSuPeso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float extra=2.35f;
        char letra;
        
        Scanner entrada_letra = new Scanner(System.in);
        Scanner entrada_numero = new Scanner(System.in);
        int peso_var;
        
        System.out.print("Ponga su peso : ");
        peso_var = entrada_numero.nextInt();
        
        float peso=peso_var+extra;
        System.out.println ("No puedo creer que peses "+peso+" kilos");
        
        System.out.print("Ponga una palabra: ");
        letra = entrada_letra.next().charAt(2);
        
        System.out.println("La tercera letra es: "+letra);
        
    }
}
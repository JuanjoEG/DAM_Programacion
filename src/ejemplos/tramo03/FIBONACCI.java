
package ejemplos.tramo03;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int terminos, a=0, b=1;
        Scanner teclaInt = new Scanner(System.in);
        System.out.print("\nLA SUCESI�N DE FIBONACCI.\n"
                + "La sucesi�n comienza con los n�meros 0 y 1,\n"
                + "a partir de estos,\n"
                + "�cada t�rmino es la suma de los dos anteriores�\n\n"
                + "�C�antos t�rminos deseas calcular?  :");
        terminos = teclaInt.nextInt();
        if (terminos>1){
            System.out.println("");
            System.out.println("0 --> "+a);
            System.out.println("1 --> "+b);
            for (int i=1;i<=(terminos-2);i++){
            int suma=a+b;
                System.out.println((i+1)+" --> "+suma);
                a=b;
                b=suma;
            }
        } else {
            System.out.println("El valor seleccionado es muy peque�o.");
        }
    }
}
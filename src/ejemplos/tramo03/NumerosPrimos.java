
package ejemplos.tramo03;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class NumerosPrimos 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
     int numero=-1;
     int resto;
     int contador=2;
     while(numero<3){
            System.out.println("");
        System.out.println("Escriba un ENTERO mayor de 2");
        System.out.println("Y te mostrar� TODOS");
        System.out.println("Los N�meros Primos");
        System.out.print("Inferiores a �l  :");
        Scanner sc=new Scanner(System.in);
        numero= sc.nextInt();
            System.out.println("");
        }
            for (int j=numero; j>2; --j){
                for (int i=(j-1); i>1; --i){
                    resto = j%i;
                    //System.out.println("j="+j+" % i="+i+"  Resto="+resto);
                    if (resto==0){
                        //System.out.println("El nº "+j+" No es Primo. BREACK");
                        break;
                    } else if (i==2){
                        System.out.println("El n� "+j+"  es Primo");
                        contador=contador+1;
                        }
                }
            }
        System.out.println("El n� 2  es Primo");
        System.out.println("El n� 1  es Primo");
        System.out.println("Hemos encontrado "+contador+" n�meros Primos");
        System.out.println("");
    }
}
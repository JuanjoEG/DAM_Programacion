
package ejemplos.tramo01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class HortalizasUnionEuropea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //DECLARACIÓN DE VARIABLES
        char pais=0;
        char hortaliza=0;
        int toneladas=0;
        int total_esp=0;
        int total_fra=0;
        int total_ale=0;
        Scanner valor_teclado = new Scanner(System.in);
        
        System.out.println("@ PARA TERMINAR");
        System.out.println("Introduce Pais (E, F, A)");
        System.out.println("Introduce Hortaliza (T, P, E)");
        System.out.println("Introduce Toneladas");
        
        do {   
            pais = valor_teclado.next().charAt(0);
            
            if (pais !='@') {
                hortaliza = valor_teclado.next().charAt(0);
                toneladas = valor_teclado.nextInt();
            }
            
            switch (pais) {
                case 'E':
                    if (hortaliza == 'T' || hortaliza == 'P' || hortaliza == 'E')
                        total_esp = total_esp + toneladas;
                    break;
                case 'F':
                    if (hortaliza == 'T' || hortaliza == 'P' || hortaliza == 'E')
                        total_fra = total_fra + toneladas;
                    break;
                case 'A':
                    if (hortaliza == 'T' || hortaliza == 'P' || hortaliza == 'E')
                        total_ale = total_ale + toneladas;
                    break;
                default:
                    break;
            
            }
            
        } while (pais !='@');
        
        if (total_esp>total_fra && total_esp>total_ale){
            System.out.println("El Paí­s que más vende es ESPAÑA");
            System.out.println("Con un TOTAL de "+total_esp+" Toneladas.");
        } else if ( total_fra>total_esp && total_fra>total_ale){
                System.out.println("El Paí­s que más vende es FRANCIA");
                System.out.println("Con un TOTAL de "+total_fra+" Toneladas.");
            } else {
                    System.out.println("El Paí­s que más vende es ALEMANIA");
                }        
    }    
}
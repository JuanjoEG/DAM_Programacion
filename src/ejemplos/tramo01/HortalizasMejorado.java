
package ejemplos.tramo01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class HortalizasMejorado {

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
        int total_esp_t=0;
        int total_esp_p=0;
        int total_esp_e=0;
        int total_fra_t=0;
        int total_fra_p=0;
        int total_fra_e=0;
        int total_ale_t=0;
        int total_ale_p=0;
        int total_ale_e=0;
        Scanner valor_teclado = new Scanner(System.in);         
        do {             
            System.out.println("Introduce Pais (E, F, A, @, #)");
            pais = valor_teclado.next().charAt(0);                     
            if (pais !='@' && pais !='#') {                
                System.out.println("Introduce Hortaliza (T, P, E)");
                hortaliza = valor_teclado.next().charAt(0);                
                System.out.println("Introduce Toneladas");
                toneladas = valor_teclado.nextInt();               
            }            
            switch (pais) {                
                case 'E':
                    switch (hortaliza){
                        case 'T':
                            total_esp = total_esp + toneladas;
                            total_esp_t = total_esp_t + toneladas;
                            break;
                        case 'P':
                            total_esp = total_esp + toneladas;
                            total_esp_p = total_esp_p + toneladas;
                            break;
                        case 'E':
                            total_esp = total_esp + toneladas;
                            total_esp_e = total_esp_e + toneladas;
                            break;
                        default:
                            System.out.println("¡¡¡ ERROR DE DATO !!!");
                            break;
                    }
                        System.out.println("ESPAÑA "+total_esp);
                        System.out.println("Tom.="+total_esp_t+" Pim.="+total_esp_p+" Esp.="+total_esp_e); 
                        System.out.println("");
                    break;                
                case 'F':                    
                    switch (hortaliza){
                        case 'T':
                            total_fra = total_fra + toneladas;
                            total_fra_t = total_fra_t + toneladas;
                            break;
                        case 'P':
                            total_fra = total_fra + toneladas;
                            total_fra_p = total_fra_p + toneladas;
                            break;
                        case 'E':
                            total_fra = total_fra + toneladas;
                            total_fra_e = total_fra_e + toneladas;
                            break;
                        default:
                            System.out.println("¡¡¡ ERROR DE DATO !!!");
                            break;
                    }
                        System.out.println("FRANCIA "+total_fra);
                        System.out.println("Tom.="+total_fra_t+" Pim.="+total_fra_p+" Esp.="+total_fra_e);
                        System.out.println("");
                    break;                    
                case 'A':
                    switch (hortaliza){
                        case 'T':
                            total_ale = total_ale + toneladas;
                            total_ale_t = total_ale_t + toneladas;
                            break;
                        case 'P':
                            total_ale = total_ale + toneladas;
                            total_ale_p = total_ale_p + toneladas;
                            break;
                        case 'E':
                            total_ale = total_ale + toneladas;
                            total_ale_e = total_ale_e + toneladas;
                            break;
                        default:
                            System.out.println("¡¡¡ ERROR DE DATO !!!");
                            break;
                    }
                        System.out.println("ALEMANIA "+total_ale);
                        System.out.println("Tom.="+total_ale_t+" Pim.="+total_ale_p+" Esp.="+total_ale_e);
                        System.out.println("");
                    break;                
                case '@':                          
                        if (total_esp>total_fra && total_esp>total_ale){
                            System.out.println("El Paí­s que más vende es ESPAÑA");
                            System.out.println("Con un TOTAL de "+total_esp+" Toneladas.");
                        } else if ( total_fra>total_esp && total_fra>total_ale){
                            System.out.println("El Paí­s que más vende es FRANCIA");
                            System.out.println("Con un TOTAL de "+total_fra+" Toneladas.");
                        } else if ( total_ale>total_esp && total_ale>total_fra){
                            System.out.println("El Paí­s que más vende es ALEMANIA");
                            System.out.println("Con un TOTAL de "+total_ale+" Toneladas.");
                        } else if (total_esp==total_fra && total_esp>total_ale){
                            System.out.println("Los Paises que más venden son ESPAÑA y FRANCIA");
                            System.out.println("Con un TOTAL de "+total_esp+" Toneladas cada uno.");
                        } else if ( total_esp==total_ale && total_esp>total_fra){
                            System.out.println("Los Paises que más venden son ESPAÑA y ALEMANIA");
                            System.out.println("Con un TOTAL de "+total_esp+" Toneladas cada uno.");
                        } else if (total_fra==total_ale && total_fra>total_esp){
                            System.out.println("Los Paises que más venden son ALEMANIA y FRANCIA");
                            System.out.println("Con un TOTAL de "+total_ale+" Toneladas cada uno.");
                        } else if ( total_fra==total_ale && total_esp==total_fra){
                            System.out.println("Los Paises que más venden son ESPAÑA, FRANCIA y ALEMANIA");
                            System.out.println("Con un TOTAL de "+total_esp+" Toneladas cada uno.");
                        } else {
                            System.out.println("¡¡¡ ERROR DE DATO !!!");
                        } 
                        System.out.println("");
                        System.out.println("   ESPAÑA "+total_esp);
                        System.out.println("Tomates = "+total_esp_t+" Pimientos ="+total_esp_p+" Espinacas ="+total_esp_e);
                        System.out.println("   FRANCIA "+total_fra);
                        System.out.println("Tomates = "+total_fra_t+" Pimientos ="+total_fra_p+" Espinacas ="+total_fra_e);
                        System.out.println("   ALEMANIA "+total_ale);
                        System.out.println("Tomates = "+total_ale_t+" Pimientos ="+total_ale_p+" Espinacas ="+total_ale_e);
                        System.out.println("");
                    break;                    
                case '#':
                    System.out.println("");
                    System.out.println("  ¡ ¡ ¡    G R A C I A S   P O R   U S A R   E S T E   P R O G R A M A    ! ! !  ");
                    System.out.println("");
                    break;                
                default:
                    System.out.println("¡¡¡ ERROR DE DATO !!!");
                    break;            
            }            
        } while (pais !='#');        
    }        
}

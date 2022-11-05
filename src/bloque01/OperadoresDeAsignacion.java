
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class OperadoresDeAsignacion {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                        ****************************************
                        *      OPERADORES DE ASIGNACIÓN        *
                        ****************************************
                        * =   -->  int a=b;                    *
                        * +=  -->  int a+=b;  -->  int a=a+b;  *
                        * -=  -->  int a-=b;  -->  int a=a-b;  *
                        * *=  -->  int a*=b;  -->  int a=a*b;  *
                        * /=  -->  int a/=b;  -->  int a=a/b;  *
                        * %=  -->  int a%=b;  -->  int a=a%b;  *
                        ****************************************
                        *       INCREMENTO / DECREMENTO        *
                        * ++  -->  int a++;   -->  int a=a+1;  *
                        * --  -->  int a--;   -->  int a=a-1;  *
                        * ++  -->  int ++a;   -->  int a=1+a;  *
                        * --  -->  int --a;   -->  int a=1-a;  *
                        ****************************************
                        *  0. ATRÁS.                           *
                        ****************************************
                                  
                                    """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
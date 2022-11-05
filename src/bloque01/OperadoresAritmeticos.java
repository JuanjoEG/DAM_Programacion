
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                        ****************************************
                        *       OPERADORES ARITMÉTICOS         *
                        ****************************************
                        *  +  -->  SUMA. -->  CONCATENACIÓN.   *
                        *  -  -->  RESTA.                      *
                        *  *  -->  PRODUCTO.                   *
                        *  /  -->  DIVISIÓN.                   *
                        *  %  -->  RESTO DE DIVISIÓN.          *
                        ****************************************
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
                case "0":
                    break;
                default:
                    System.out.println("La opción no es correcta.");
                    break;
            }
        } while (!"0".equals(menu));
    }
}
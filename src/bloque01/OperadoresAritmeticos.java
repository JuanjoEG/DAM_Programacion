
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                        ****************************************
                        *       OPERADORES ARITM�TICOS         *
                        ****************************************
                        *  +  -->  SUMA. -->  CONCATENACI�N.   *
                        *  -  -->  RESTA.                      *
                        *  *  -->  PRODUCTO.                   *
                        *  /  -->  DIVISI�N.                   *
                        *  %  -->  RESTO DE DIVISI�N.          *
                        ****************************************
                        * ++  -->  int a++;   -->  int a=a+1;  *
                        * --  -->  int a--;   -->  int a=a-1;  *
                        * ++  -->  int ++a;   -->  int a=1+a;  *
                        * --  -->  int --a;   -->  int a=1-a;  *
                        ****************************************
                        *  0. ATR�S.                           *
                        ****************************************
            
           
            """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0":
                    break;
                default:
                    System.out.println("La opci�n no es correcta.");
                    break;
            }
        } while (!"0".equals(menu));
    }
}

package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class MetodosSobrecarga {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                    
                    
                    
                    
                    ******************************************************************
                    *             SOBRECARGA DE M�TODOS Y CONSTRUCTORES              *
                    ******************************************************************
                    * EN LOS M�TODOS --> FUNCIONES / PROCEDIMIENTOS / CONSTRUCTORES  *
                    * SE PUEDEN USAR EL MISMO NOMBRE PERO CON ARGUMENTOS DIFERENTES. *
                    ******************************************************************
                    * SE DIFERENCIAN  --> POR EL TIPO DE PARAM�METROS.               *
                    *                     POR EL N�MERO DE PAR�METROS.               *
                    ******************************************************************
                    * NO SE DIFERENCIAN --> EN EL NOMBRE.                            *
                    *                       EN EL TIPO DE RETORNO.                   *
                    ******************************************************************
                    *  0. ATR�S.                                                     *
                    ******************************************************************
                    
                      """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();            
            switch(menu){
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
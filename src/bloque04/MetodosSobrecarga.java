
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class MetodosSobrecarga {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                    
                    
                    
                    
                    ******************************************************************
                    *             SOBRECARGA DE MÉTODOS Y CONSTRUCTORES              *
                    ******************************************************************
                    * EN LOS MÉTODOS --> FUNCIONES / PROCEDIMIENTOS / CONSTRUCTORES  *
                    * SE PUEDEN USAR EL MISMO NOMBRE PERO CON ARGUMENTOS DIFERENTES. *
                    ******************************************************************
                    * SE DIFERENCIAN  --> POR EL TIPO DE PARAMÁMETROS.               *
                    *                     POR EL NÚMERO DE PARÁMETROS.               *
                    ******************************************************************
                    * NO SE DIFERENCIAN --> EN EL NOMBRE.                            *
                    *                       EN EL TIPO DE RETORNO.                   *
                    ******************************************************************
                    *  0. ATRÁS.                                                     *
                    ******************************************************************
                    
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
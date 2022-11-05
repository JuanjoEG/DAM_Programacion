
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class DatosBooleanos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *************************************
                    *   TIPOS DE DATOS / BOOLEAN        *
                    *************************************
                    * boolean -->   8 Bytes.            *
                    * RANGOS  -->  true/false.          *
                    *************************************
                    * TIPO IDENTIFICADOR;               *
                    * IDENTIFICADOR = VALOR;            *
                    *************************************
                    * TIPO IDENTIFICADOR = VALOR;       *
                    *************************************
                    * LOS TIPOS PRIMITIVOS              *
                    * NO PUDEN VALER null.              *
                    *************************************
                    * LOS IDENTIFICADORES DE LAS        *
                    * VARIABLES EMPIEZAN CON MINUSCULAS *
                    *************************************
                    * 0. ATRÁS.                         *
                    *************************************
            
            
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
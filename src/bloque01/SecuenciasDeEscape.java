
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class SecuenciasDeEscape {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""                            
                    
                    
                    
                    
                    
                    ******************************
                    *    SECUENCIAS DE ESCAPE    *
                    ******************************
                    *  \\n   -->   SALTO DE LÍNEA *
                    *  \\\"   -->   COMILLAS DOBL. *
                    *  \\\'   -->   COMILLAS SIMPL.*
                    *  \\t   -->   TABULADOR      *
                    *  \\b   -->   BORRADO A IZQ. *
                    *  \\r   -->   RETORNO CARRO  *
                    *  \\\\   -->   CONTRABARRA    *
                    *******************************
                    * 0. ATRÁS.                   *
                    *******************************                            
                          
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
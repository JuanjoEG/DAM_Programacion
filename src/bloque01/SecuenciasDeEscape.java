
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
                    *  \\n   -->   SALTO DE L�NEA *
                    *  \\\"   -->   COMILLAS DOBL. *
                    *  \\\'   -->   COMILLAS SIMPL.*
                    *  \\t   -->   TABULADOR      *
                    *  \\b   -->   BORRADO A IZQ. *
                    *  \\r   -->   RETORNO CARRO  *
                    *  \\\\   -->   CONTRABARRA    *
                    *******************************
                    * 0. ATR�S.                   *
                    *******************************                            
                          
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
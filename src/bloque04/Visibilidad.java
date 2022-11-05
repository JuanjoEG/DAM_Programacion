
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Visibilidad {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                    
                    
                    
                    
                    ******************************************************
                    *                    VISIBILIDAD                     *
                    ******************************************************
                    * 1. EST�NDAR.    (PREDETERMINADO)                   *
                    * 2. P�BLICO.      -->   public                      *
                    * 3. PROTEGIDO.    -->   protected                   *
                    * 4. PRIVADO.      -->   private                     *                    
                    ******************************************************
                    *  0. ATR�S.                                         *
                    ******************************************************
                    
                      """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();            
            switch(menu){
                case "1" -> bloque04.VisibilidadEstandar.main(args);
                case "2" -> bloque04.VisibilidadPublico.main(args);
                case "3" -> bloque04.VisibilidadProtegido.main(args);
                case "4" -> bloque04.VisibilidadPrivado.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
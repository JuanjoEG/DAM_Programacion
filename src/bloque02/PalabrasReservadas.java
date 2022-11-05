
package bloque02;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class PalabrasReservadas {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                            
                    
                    
                    
                    
                    *****************************************************************************************************
                    *                                  PALABRAS RESERVADAS EN JAVA                                      *
                    *****************************************************************************************************              
                    *  abstract            continue            for                 new                 switch           *
                    *  assert              default             goto                package             synchronized     *
                    *  boolean             do                  if                  private             this             *
                    *  break               double              implements          protected           throw            *
                    *  byte                else                import              public              throws           *
                    *  case                enum                instanceof          return              transient        *
                    *  catch               extends             int                 short               try              *
                    *  char                final               interface           static              void             *
                    *  class               finally             long                strictfp            volatile         *
                    *  const               float               native              super               while            *
                    *****************************************************************************************************
                    * 0. ATRÁS.                                                                                         *
                    *****************************************************************************************************
                            
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
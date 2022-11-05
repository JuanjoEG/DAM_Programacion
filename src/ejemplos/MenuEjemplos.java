
package ejemplos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

/**
 *
 * @author Juan José Estévez González
 */
public class MenuEjemplos {
    
    public static void main(String[] args) throws TransformerException, TransformerConfigurationException, ParserConfigurationException, IOException, FileNotFoundException, ClassNotFoundException, Exception {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    ******************************
                    *          EJEMPLOS          *
                    ******************************
                    *  1.  EJEMPLOS TRAMO 01.    *
                    *  2.  EJEMPLOS TRAMO 02.    *
                    *  3.  EJEMPLOS TRAMO 03.    *
                    *  4.  EJEMPLOS TRAMO 04.    *
                    *  5.  EJEMPLOS TRAMO 05.    *
                    *  6.  EJEMPLOS TRAMO 06.    *
                    *  7.  EJEMPLOS TRAMO 07.    *
                    *  8.  EJEMPLOS TRAMO 08.    *
                    *  9.  EJEMPLOS TRAMO 09.    *
                    * 10.  EJEMPLOS TRAMO 10.    *
                    * 11.  EJEMPLOS TRAMO 11.    *
                    ******************************
                    * 0. ATRÁS.                  *
                    ******************************
                                                  
                                                  """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> ejemplos.tramo01.MenuTramo01.main(args);
                case "2" -> ejemplos.tramo02.MenuTramo02.main(args);
                case "3" -> ejemplos.tramo03.MenuTramo03.main(args);
                case "4" -> ejemplos.tramo04.MenuTramo04.main(args);
                case "5" -> ejemplos.tramo05.MenuTramo05.main(args);
                case "6" -> ejemplos.tramo06.MenuTramo06.main(args);
                case "7" -> ejemplos.tramo07.MenuTramo07.main(args);
                case "8" -> ejemplos.tramo08.MenuTramo08.main(args);
                case "9" -> ejemplos.tramo09.MenuTramo09.main(args);
                case "10" -> ejemplos.tramo10.MenuTramo10.main(args);
                case "11" -> ejemplos.tramo11.MenuTramo11.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
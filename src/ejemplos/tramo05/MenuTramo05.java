
package ejemplos.tramo05;

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
public class MenuTramo05 {
    
    public static void main(String[] args) throws TransformerException, TransformerConfigurationException, ParserConfigurationException, IOException, FileNotFoundException, ClassNotFoundException {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    **************************************************
                    *              EJEMPLOS TRAMO 05                 *
                    **************************************************
                    * 21. USANDO MAPS.                               *
                    * 22. USANDO EXPRESIONES REGULARES.              *
                    * 23. USANDO ITERADORES.                         *
                    * 24. USANDO PRINT-F.                            *
                    * 25. ZODIACO.                                   *
                    **************************************************
                    * 0. ATRÁS.                                      *
                    **************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "21" -> ejemplos.tramo05.UsandoMaps.main(args);
                case "22" -> ejemplos.tramo05.UsandoExpresionesRegulares.main(args);
                case "23" -> ejemplos.tramo05.UsandoIteradores.main(args);
                case "24" -> ejemplos.tramo05.UsandoPrintf.main(args);
                case "25" -> ejemplos.tramo05.Zodiaco.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
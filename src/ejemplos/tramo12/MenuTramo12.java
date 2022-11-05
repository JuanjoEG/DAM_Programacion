
package ejemplos.tramo12;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

/**
 * ESPAÑA / SEVILLA / 2022
 * APACHE NET BEANS IDE 14
 * TOOLS --> TEMPLATES --> SETTINGS --> BORRAR # DE ÚLTIMA LÍNEA --> USER=Juan José Estévez González
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> SOURCE/BINARY FORMAT --> JDK 18
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> PROFILE --> FULL JRE
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> ENCODING --> ISO-8859-1
 * TOOLS --> OPTIONS --> FONTS & COLOR --> PROFILE: FLATLAF DARK
 * TOOLS --> OPTIONS --> FONTS & COLOR --> FONT --> MONOSPACED 18
 * TOOLS --> OPTIONS --> APPEARANCE --> LOOK AND FEEL --> FLATLAF DARK
 * @author Juan José Estévez González
 */
public class MenuTramo12 {
    
    public static void main(String[] args) throws TransformerException, TransformerConfigurationException, ParserConfigurationException, IOException, FileNotFoundException, ClassNotFoundException, Exception {
        
        String menu;
        do {            
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                **************************************************
                *              EJEMPLOS TRAMO 12                 *
                **************************************************
                * 58. USANDO this / super.                       *
                * 59. .                                          *
                * 60. .                                          *
                * 61. .                                          *
                * 62. .                                          *
                **************************************************
                * 0. ATRÁS.                                      *
                **************************************************
                
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            if (null == menu){
                    System.out.println("\nLa opción no es correcta.");
                } else switch(menu){
                            case "58" -> ejemplos.tramo12.UsandoThisSuper.main(args);
                            case "59" -> {}
                            case "60" -> {}
                            case "61" -> {}
                            case "62" -> {}
                            case "0" -> {}
                            default -> System.out.println("\nLa opción no es correcta.");
                        }
        } while (!"0".equals(menu));
    }
}
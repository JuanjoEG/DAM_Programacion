
package ejemplos.tramo09;

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
public class MenuTramo09 {
    
    public static void main(String[] args) throws TransformerException, TransformerConfigurationException, ParserConfigurationException, IOException, FileNotFoundException, ClassNotFoundException, Exception {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                               **************************************************
                               *              EJEMPLOS TRAMO 09                 *
                               **************************************************
                               * 43. NÚMEROS COMPLEJOS.                         *
                               * 44. TIPOS DE DATOS. MÉTODOS ESTÁTICOS.         *
                               * 45. BARAJA DE CARTAS.                          *
                               * 46. CAJA DE AHORROS.                           *
                               * 47. TIENDA.                                    *
                               **************************************************
                               * 0. ATRÁS.                                      *
                               **************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            if (null == menu){
                    System.out.println("\nLa opción no es correcta.");
                } else switch(menu){
                    case "43" -> ejemplos.tramo09.NumerosComplejos.main(args);
                    case "44" -> ejemplos.tramo09.TiposDeDatos.main(args);
                    case "45" -> ejemplos.tramo09.BarajaDeCartas.main(args);
                    case "46" -> ejemplos.tramo09.CajaDeAhorros.main(args);
                    case "47" -> ejemplos.tramo09.Tienda.main(args);
                    case "0" -> {}
                    default -> System.out.println("La opción no es correcta.");
                }
        } while (!"0".equals(menu));
    }
}
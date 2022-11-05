
package ejemplos.tramo10;

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
public class MenuTramo10 {
    
    public static void main(String[] args) throws TransformerException, TransformerConfigurationException, ParserConfigurationException, IOException, FileNotFoundException, ClassNotFoundException, Exception {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                               **************************************************
                               *              EJEMPLOS TRAMO 10                 *
                               **************************************************
                               * 48. COMPOSICION. MÉTODO PUENTE.                *
                               * 49. CONSTRUCTORES Y HERENCIA.                  *
                               * 50. ALQUILER DE VEHÍCULOS.                     *
                               * 51. CLASES GENÉRICAS.                          *
                               * 52. INSTACEOF / POLIMORFISMO / CASTING.        *
                               **************************************************
                               * 0. ATRÁS.                                      *
                               **************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            if (null == menu){
                    System.out.println("\nLa opción no es correcta.");
                } else switch(menu){
                    case "48" -> ejemplos.tramo10.Composicion.main(args);
                    case "49" -> ejemplos.tramo10.ConstructoresHerencia.main(args);
                    case "50" -> ejemplos.tramo10.AlquilerDeVehiculos.main(args);
                    case "51" -> ejemplos.tramo10.ClaseGenericaMain.main(args);
                    case "52" -> ejemplos.tramo10.InstaceofPolimorfismoCasting.main(args);
                    case "0" -> {}
                    default -> System.out.println("La opción no es correcta.");
                }
        } while (!"0".equals(menu));
    }
}

package ejemplos.tramo11;

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
public class MenuTramo11 {
    
    public static void main(String[] args) throws TransformerException, TransformerConfigurationException, ParserConfigurationException, IOException, FileNotFoundException, ClassNotFoundException, Exception {
        
        String menu;
        do {            
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                **************************************************
                *              EJEMPLOS TRAMO 11                 *
                **************************************************
                * 53. CASTING ENTRE OBJETOS.                     *
                * 54. VALIDAR D.N.I.  EXCEPCIONES.               *
                * 55. TERMÓMETRO.     EXCEPCIONES.               *
                * 56. USANDO BLOQUES try-catch.                  *
                * 57. SUCURSAL BANCARIA.                         *
                **************************************************
                * 0. ATRÁS.                                      *
                **************************************************
                               
                """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            if (null == menu){
                    System.out.println("\nLa opción no es correcta.");
                } else switch(menu){
                            case "53" -> ejemplos.tramo11.CastingObjetos.main(args);
                            case "54" -> ejemplos.tramo11.Excepciones_DNI.main(args);
                            case "55" -> ejemplos.tramo11.TermometroMain.main(args);
                            case "56" -> ejemplos.tramo11.UsandoBloqueTryCatch.main(args);
                            case "57" -> ejemplos.tramo11.SucursalBancaria.main(args);
                            case "0" -> {}
                            default -> System.out.println("\nLa opción no es correcta.");
                        }
        } while (!"0".equals(menu));
    }
}

package ejemplos.tramo07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

/**
 *
 * @author Juan JosÈ EstÈvez Gonz·lez
 */
public class MenuTramo07 {
    
    public static void main(String[] args) throws TransformerException, TransformerConfigurationException, ParserConfigurationException, IOException, FileNotFoundException, ClassNotFoundException {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                              
                               
                               
                               
                               
                    **************************************************
                    *              EJEMPLOS TRAMO 07                 *
                    **************************************************
                    * 32. FICHERO DE TEXTO DEL REV…S.                *
                    * 33. ESCRITURA EN FICHERO BINARIO.              *
                    * 34. LECTURA DE FICHERO BINARIO.                *
                    * 35. SERIALIZACI”N.  INTERFAZ SERIALIZABLE.     *
                    * 36. ESCRITURA DE OBJETOS EN FICHERO.           *
                    * 37. LECTURA DE OBJETOS EN FICHERO.             *
                    **************************************************
                    * 0. ATR¡S.                                      *
                    **************************************************
                    
                    """);
            System.out.print("Seleccione una opciÛn: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "32" -> ejemplos.tramo07.TextoDelReves.main(args);
                case "33" -> ejemplos.tramo07.EscrituraFicheroBinario.main(args);
                case "34" -> ejemplos.tramo07.LecturaFicheroBinario.main(args);
                case "35" -> ejemplos.tramo07.SerializacionNotas.main(args);
                case "36" -> ejemplos.tramo07.EscrituraObjeto.main(args);
                case "37" -> ejemplos.tramo07.LecturaObjeto.main(args);
                case "0" -> {}
                default -> System.out.println("La opci√≥n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
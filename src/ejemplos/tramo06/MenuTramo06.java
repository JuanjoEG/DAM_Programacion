
package ejemplos.tramo06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class MenuTramo06 {
    
    public static void main(String[] args) throws TransformerException, TransformerConfigurationException, ParserConfigurationException, IOException, FileNotFoundException, ClassNotFoundException {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    **************************************************
                    *              EJEMPLOS TRAMO 06                 *
                    **************************************************
                    * 26. CALCULADORA DE FIGURAS.                    *
                    * 27. CREAR XML. CAT�LOGO DE DISCOS DE M�SICA.   *
                    * 28. CREAR XML. CONCESIONARIO DE COCHES.        *
                    * 29. CREAR XML. GEN�RICO.                       *
                    * 30. ESCRITURA EN FICHERO DE TEXTO.             *
                    * 31. LECTURA DE FICHERO DE TEXTO.               *
                    **************************************************
                    * 0. ATR�S.                                      *
                    **************************************************
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "26" -> ejemplos.tramo06.CalculadoraDeFiguras.main(args);
                case "27" -> ejemplos.tramo06.CrearXML_DiscosMusica.main(args);
                case "28" -> ejemplos.tramo06.CrearXML_ConcesionarioCoches.main(args);
                case "29" -> ejemplos.tramo06.CrearXML_Generico.main(args);
                case "30" -> ejemplos.tramo06.EscrituraFicheroTexto.main(args);
                case "31" -> ejemplos.tramo06.LecturaFicheroTexto.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}

package bloque03;

import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class DocumentosXML {
    
    public static void main(String[] args) throws TransformerException, TransformerConfigurationException, ParserConfigurationException {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    **********************************************************
                    *                    DOCUMENTOS XML                      *
                    **********************************************************
                    *          NECESITAMOS  -->  import org.w3c.dom.*;       *
                    **********************************************************
                    *  1. EJEMPLO  -->  CONSECIONARIO DE COCHES.             *
                    *  2. EJEMPLO  -->  CAT�LOGO DE DISCOS DE M�SICA.        *
                    *  3. EJEMPLO  -->  GEN�RICO.                            *
                    **********************************************************
                    *  0. ATR�S.                                             *
                    **********************************************************
                            
                            """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> ejemplos.tramo06.CrearXML_ConcesionarioCoches.main(args);
                case "2" -> ejemplos.tramo06.CrearXML_DiscosMusica.main(args);
                case "3" -> ejemplos.tramo06.CrearXML_Generico.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
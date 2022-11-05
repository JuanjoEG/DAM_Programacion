
package ejemplos.tramo03;

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
public class MenuTramo03 {
    
    public static void main(String[] args) throws TransformerException, TransformerConfigurationException, ParserConfigurationException, IOException, FileNotFoundException, ClassNotFoundException {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                               **************************************************
                               *              EJEMPLOS TRAMO 03                 *
                               **************************************************
                               * 11. N�MEROS PRIMOS.                            *
                               * 12. ELEVAR UN N�MERO A UN EXPONENTE.           *
                               * 13. CALCULAR LETRA DEL DNI.                    *
                               * 14. SUCESI�N DE FIBONACCI.                     *
                               * 15. MATRIZ DE CEROS Y UNOS.                    *
                               **************************************************
                               * 0. ATR�S.                                      *
                               **************************************************
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "11" -> ejemplos.tramo03.NumerosPrimos.main(args);
                case "12" -> ejemplos.tramo03.ElevarNumeroAExponente.main(args);
                case "13" -> ejemplos.tramo03.CalcularLetraDNI.main(args);
                case "14" -> ejemplos.tramo03.FIBONACCI.main(args);
                case "15" -> ejemplos.tramo03.MatrizCerosUnos.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
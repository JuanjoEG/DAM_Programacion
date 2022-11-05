
package ejemplos.tramo02;

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
public class MenuTramo02 {
    
    public static void main(String[] args) throws TransformerException, TransformerConfigurationException, ParserConfigurationException, IOException, FileNotFoundException, ClassNotFoundException {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                               **************************************************
                               *              EJEMPLOS TRAMO 02                 *
                               **************************************************
                               *  6. DOS N�MEROS.                               *
                               *  7. PONGA SU PESO.                             *
                               *  8. SUMA, RESTA, PRODUCTO, DIVISI�N Y RESTO.   *
                               *  9. TABLA DE MULTIPLICAR - BUCLE FOR.          *
                               * 10. DESCOMPONER UN N�MERO EN FACTORES PRIMOS.  *
                               **************************************************
                               * 0. ATR�S.                                      *
                               **************************************************
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "6" -> ejemplos.tramo02.DosNumeros.main(args);
                case "7" -> ejemplos.tramo02.PongaSuPeso.main(args);
                case "8" -> ejemplos.tramo02.SumaRestaProductoResto.main(args);
                case "9" -> ejemplos.tramo02.TablaMultiplicarBucleFor.main(args);
                case "10" -> ejemplos.tramo02.DescomponerNumeroFactoresPrimos.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
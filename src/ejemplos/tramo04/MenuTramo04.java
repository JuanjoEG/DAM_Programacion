
package ejemplos.tramo04;

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
public class MenuTramo04 {
    
    public static void main(String[] args) throws TransformerException, TransformerConfigurationException, ParserConfigurationException, IOException, FileNotFoundException, ClassNotFoundException {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                               **************************************************
                               *              EJEMPLOS TRAMO 04                 *
                               **************************************************
                               * 16. MATRIZ DE CEROS Y UNOS CON ARRAY DOS DIM.  *
                               * 17. USANDO ARRAYS.                             *
                               * 18. USANDO ARRAYS MATRIZ.                      *
                               * 19. CALCULAR NOTAS MEDIAS.                     *
                               * 20. USANDO COLECCIONES.                        *
                               **************************************************
                               * 0. ATRÁS.                                      *
                               **************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "16" -> ejemplos.tramo04.MatrizCerosUnosArray.main(args);
                case "17" -> ejemplos.tramo04.UsandoArrays.main(args);
                case "18" -> ejemplos.tramo04.UsandoArraysMatriz.main(args);
                case "19" -> ejemplos.tramo04.CalcularNotasMedias.main(args);
                case "20" -> ejemplos.tramo04.UsandoColecciones.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
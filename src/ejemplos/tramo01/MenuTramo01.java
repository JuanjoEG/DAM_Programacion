
package ejemplos.tramo01;

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
public class MenuTramo01 {
    
    public static void main(String[] args) throws TransformerException, TransformerConfigurationException, ParserConfigurationException, IOException, FileNotFoundException, ClassNotFoundException {
        
        String menu;
        do {            
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                               **************************************************
                               *              EJEMPLOS TRAMO 01                 *
                               **************************************************
                               *  1. CAFETERIA FACULTAD.                        *
                               *  2. ¿NÚMERO PAR O IMPAR?                       *
                               *  3. HORTALIZAS UNION EUROPEA.                  *
                               *  4. HORTALIZAS MEJORADO.                       *
                               *  5. INTERCAMBIO DE VARIABLES.                  *
                               **************************************************
                               * 0. ATRÁS.                                      *
                               **************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> ejemplos.tramo01.CafeteriaFacultad.main(args);
                case "2" -> ejemplos.tramo01.ParImpar.main(args);
                case "3" -> ejemplos.tramo01.HortalizasUnionEuropea.main(args);
                case "4" -> ejemplos.tramo01.HortalizasMejorado.main(args);
                case "5" -> ejemplos.tramo01.IntercambiandoVariables.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
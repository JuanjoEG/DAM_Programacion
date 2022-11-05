
package bloque03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class OperacionesConFicheros {
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *******************************************************************
                    *                   OPERACIONES CON FICHEROS                      *
                    *******************************************************************
                    *  1. EJEMPLO ESCRITURA EN FICHERO DE TEXTO.                      *
                    *  2. EJEMPLO LECTURA DE FICHERO DE TEXTO.                        *
                    *  3. EJEMPLO FICHERO DE TEXTO DEL REVÉS.                         *
                    *******************************************************************
                    *  4. EJEMPLO ESCRITURA EN FICHERO BINARIO.                       *
                    *  5. EJEMPLO LECTURA DE FICHERO BINARIO.                         *
                    *******************************************************************
                    *           NECESITAMOS  -->  import java.io.Serializable;        *
                    *******************************************************************
                    *  6. EJEMPLO SERIALIZACIÓN.  INTERFAZ SERIALIZABLE.              *
                    *  7. EJEMPLO ESCRITURA DE OBJETOS EN FICHERO.                    *
                    *  8. EJEMPLO LECTURA DE OBJETOS EN FICHERO.                      *
                    *  9. CREACIÓN Y ELIMINACIÓN DE DIRECTORIOS.                      *
                    *******************************************************************
                    *  0. ATRÁS.                                                      *
                    *******************************************************************
                             
                                """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> ejemplos.tramo06.EscrituraFicheroTexto.main(args);
                case "2" -> ejemplos.tramo06.LecturaFicheroTexto.main(args);
                case "3" -> ejemplos.tramo07.TextoDelReves.main(args);
                case "4" -> ejemplos.tramo07.EscrituraFicheroBinario.main(args);
                case "5" -> ejemplos.tramo07.LecturaFicheroBinario.main(args);
                case "6" -> ejemplos.tramo07.SerializacionNotas.main(args);
                case "7" -> ejemplos.tramo07.EscrituraObjeto.main(args);
                case "8" -> ejemplos.tramo07.LecturaObjeto.main(args);
                case "9" -> CreacionEliminacionDirectorios.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
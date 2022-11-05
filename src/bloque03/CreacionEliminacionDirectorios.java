
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class CreacionEliminacionDirectorios {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *****************************************************
                    *                CREACI�N DE DIRECTORIOS            *
                    *****************************************************
                    *     File directorio = new File(\"CARPETA\");        *
                    *****************************************************
                    *  mkdir()  -->  CREA UNA REFERENCIA AL DIRECTORIO. *
                    *                TIENE QUE EXISTIR.                 *
                    *****************************************************
                    *  mkdirs() -->  CREA UNA REFERENCIA AL DIRECTORIO  *
                    *                NO TIENE QUE EXISTIR. LO CREA.     *
                    *****************************************************
                                                                         
                    *****************************************************
                    *            ELIMINACI�N DE DIRECTORIOS             *
                    *****************************************************
                    *    File[] directorio = directorio.listFiles();    *
                    *****************************************************
                    *  isFile()  -->  PODEMOS SABER SI EL OBJETO        *
                    *                 ES UN FICHERO.                    *
                    *****************************************************
                    *  isDirectory() -->  PODEMOS SABER SI EL OBJETO    *
                    *                     ES UN DIRECTORIO.             *
                    *****************************************************
                    *  delete()  -->  M�TODO PARA BORRAR EL DIRECTORIO  *
                    *                 SI EST� VAC�O.                    *
                    *****************************************************
                    *  0. ATR�S.                                        *
                    *****************************************************
                    
                      """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
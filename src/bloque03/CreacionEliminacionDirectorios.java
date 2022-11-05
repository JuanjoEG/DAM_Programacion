
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class CreacionEliminacionDirectorios {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *****************************************************
                    *                CREACIÓN DE DIRECTORIOS            *
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
                    *            ELIMINACIÓN DE DIRECTORIOS             *
                    *****************************************************
                    *    File[] directorio = directorio.listFiles();    *
                    *****************************************************
                    *  isFile()  -->  PODEMOS SABER SI EL OBJETO        *
                    *                 ES UN FICHERO.                    *
                    *****************************************************
                    *  isDirectory() -->  PODEMOS SABER SI EL OBJETO    *
                    *                     ES UN DIRECTORIO.             *
                    *****************************************************
                    *  delete()  -->  MÉTODO PARA BORRAR EL DIRECTORIO  *
                    *                 SI ESTÁ VACÍO.                    *
                    *****************************************************
                    *  0. ATRÁS.                                        *
                    *****************************************************
                    
                      """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
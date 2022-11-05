
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class OrientacionObjetos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                    
                    
                    
                    
                    ******************************************************
                    *             ORIENTACI�N A OBJETOS                  *
                    ******************************************************
                    * 1. PRINCIPIOS B�SICOS.                             *
                    * 2. VISIBILIDAD DE LOS OBJETOS DE UNA CLASE.        *
                    * 3. CLASES.                                         *
                    * 4. OBJETOS.                                        *
                    * 5. ATRIBUTOS.                                      *
                    * 6. M�TODOS.                                        *
                    * 7. LA EST�TICA.                                    *
                    * 8. DOCUMENTACI�N DE UNA CLASE.                     *
                    * 9. BIBLIOTECA. IMPORTACI�N DE CLASES.              *
                    ******************************************************
                    *  0. ATR�S.                                         *
                    ******************************************************
                              
                                """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque04.PrincipiosBasicosOrientacionObjetos.main(args);
                case "2" -> bloque04.Visibilidad.main(args);
                case "3" -> bloque04.Clases.main(args);
                case "4" -> bloque04.CreacionObjetos.main(args);
                case "5" -> bloque04.Atributos.main(args);
                case "6" -> bloque04.Metodos.main(args);
                case "7" -> bloque04.Estatica.main(args);
                case "8" -> bloque04.DocumentacionClase.main(args);
                case "9" -> bloque04.Biblioteca.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
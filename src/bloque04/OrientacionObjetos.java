
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class OrientacionObjetos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                    
                    
                    
                    
                    ******************************************************
                    *             ORIENTACIÓN A OBJETOS                  *
                    ******************************************************
                    * 1. PRINCIPIOS BÁSICOS.                             *
                    * 2. VISIBILIDAD DE LOS OBJETOS DE UNA CLASE.        *
                    * 3. CLASES.                                         *
                    * 4. OBJETOS.                                        *
                    * 5. ATRIBUTOS.                                      *
                    * 6. MÉTODOS.                                        *
                    * 7. LA ESTÁTICA.                                    *
                    * 8. DOCUMENTACIÓN DE UNA CLASE.                     *
                    * 9. BIBLIOTECA. IMPORTACIÓN DE CLASES.              *
                    ******************************************************
                    *  0. ATRÁS.                                         *
                    ******************************************************
                              
                                """);
            System.out.print("Seleccione una opción: ");
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
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
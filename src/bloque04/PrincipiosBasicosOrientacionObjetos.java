
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class PrincipiosBasicosOrientacionObjetos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                    
                    
                    
                    
                    **************************************************
                    * PRINCIPIOS BÁSICOS DE LA ORIENTACIÓN A OBJETOS *
                    **************************************************
                    * 1. ABSTRACCIÓN.                                *
                    * 2. ENCAPSULAMIENTO.                            *
                    * 3. MODULARIZACIÓN.                             *
                    * 4. HERENCIA.                                   *
                    * 5. POLIMORFISMO.                               *
                    * 6. OCULTACIÓN DE LA INFORMACIÓN.               *
                    **************************************************
                    * 7. RELACIÓN ENTRE CLASES.                      *
                    **************************************************
                    *  0. ATRÁS.                                     *
                    **************************************************
                              
                                """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();            
            switch(menu){            
                case "1" -> bloque04.Abstraccion.main(args);
                case "2" -> bloque04.Encapsulamiento.main(args);
                case "3" -> bloque04.Modularizacion.main(args);
                case "4" -> bloque04.Herencia.main(args);
                case "5" -> bloque04.Polimorfismo.main(args);
                case "6" -> bloque04.Ocultacion.main(args);
                case "7" -> bloque05.RelacionClases.main(args);
                case "0" -> {
                }
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
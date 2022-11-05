
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class PrincipiosBasicosOrientacionObjetos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                    
                    
                    
                    
                    **************************************************
                    * PRINCIPIOS B�SICOS DE LA ORIENTACI�N A OBJETOS *
                    **************************************************
                    * 1. ABSTRACCI�N.                                *
                    * 2. ENCAPSULAMIENTO.                            *
                    * 3. MODULARIZACI�N.                             *
                    * 4. HERENCIA.                                   *
                    * 5. POLIMORFISMO.                               *
                    * 6. OCULTACI�N DE LA INFORMACI�N.               *
                    **************************************************
                    * 7. RELACI�N ENTRE CLASES.                      *
                    **************************************************
                    *  0. ATR�S.                                     *
                    **************************************************
                              
                                """);
            System.out.print("Seleccione una opci�n: ");
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
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
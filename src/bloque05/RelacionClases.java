
package bloque05;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class RelacionClases {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    **************************************************************
                    *                    RELACI�N ENTRE CLASES                   *
                    **************************************************************
                    *  1. RELACI�N DE COMPOSICI�N.    M�TODO PUENTE.             *
                    *  2. RELACI�N DE HERENCIA.       M�TODO PUENTE.             *
                    *  3. CLASES Y M�TODOS FINALES.                              *
                    *  4. CLASES Y M�TODOS ABSTRACTOS.                           *
                    *  5. CLASES Y EL POLIMORFISMO.                              *
                    *  6. INTERFACES.                                            *
                    *  7. TIPOS GEN�RICOS./CLASES GEN�RICAS./M�TODOS GEN�RICOS.  *
                    *  8. SOBREESCRITURA DE M�TODOS.                             *
                    *  9. EL M�TODO super / this.                                *
                    **************************************************************
                    *  0. ATR�S.                                                 *
                    **************************************************************
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque05.RelacionClasesComposicion.main(args);
                case "2" -> bloque05.RelacionClasesHerencia.main(args);
                case "3" -> bloque05.RelacionClasesFinales.main(args);
                case "4" -> bloque05.RelacionClasesAbstractas.main(args);
                case "5" -> bloque05.RelacionClasesPolimorfismo.main(args);
                case "6" -> bloque05.Interfaces.main(args);
                case "7" -> bloque05.ClasesGenericas.main(args);
                case "8" -> bloque05.MetodosSobreescritura.main(args);
                case "9" -> bloque05.MetodoSuper.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
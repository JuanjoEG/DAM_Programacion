
package bloque05;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class RelacionClases {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    **************************************************************
                    *                    RELACIÓN ENTRE CLASES                   *
                    **************************************************************
                    *  1. RELACIÓN DE COMPOSICIÓN.    MÉTODO PUENTE.             *
                    *  2. RELACIÓN DE HERENCIA.       MÉTODO PUENTE.             *
                    *  3. CLASES Y MÉTODOS FINALES.                              *
                    *  4. CLASES Y MÉTODOS ABSTRACTOS.                           *
                    *  5. CLASES Y EL POLIMORFISMO.                              *
                    *  6. INTERFACES.                                            *
                    *  7. TIPOS GENÉRICOS./CLASES GENÉRICAS./MÉTODOS GENÉRICOS.  *
                    *  8. SOBREESCRITURA DE MÉTODOS.                             *
                    *  9. EL MÉTODO super / this.                                *
                    **************************************************************
                    *  0. ATRÁS.                                                 *
                    **************************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
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
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
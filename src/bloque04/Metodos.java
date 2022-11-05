
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Metodos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    ******************************************************
                    *                 CLASES / MÉTODOS                   *
                    ******************************************************
                    *     SON LAS ACCIONES QUE POSEE LA CLASE.           *
                    ******************************************************
                    *  1. CONSTRUCTORES.                                 *
                    *  2. OBSERVADORES.   -->  GETTERS.                  *
                    *  3. MODIFICADORES.  -->  SETTERS.                  *
                    *  4. MÉTODO toString.                               *
                    *  5. MÉTODOS PERSONALIZADOS.                        *
                    *  6. MÉTODOS ESTÁTICOS.                             *
                    *  7. SOBRECARGA DE MÉTODOS.                         *
                    *  8. SOBREESCRITURA DE MÉTODOS.                     *
                    *  9. BLOQUES ESTÁTICOS.                             *
                    * 10. PASO POR VALOR Y PASO POR REFERENCIA.          *
                    ******************************************************
                    *  0. ATRÁS.                                         *
                    ******************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque04.Constructores.main(args);
                case "2" -> bloque04.MetodosGetters.main(args);
                case "3" -> bloque04.MetodosSetters.main(args);
                case "4" -> bloque04.MetodotoString.main(args);
                case "5" -> bloque04.MetodosPersonalizados.main(args);
                case "6" -> bloque04.MetodosEstaticos.main(args);
                case "7" -> bloque04.MetodosSobrecarga.main(args);
                case "8" -> bloque05.MetodosSobreescritura.main(args);
                case "9" -> bloque04.BloqueEstatico.main(args);
                case "10" -> bloque04.MetodosPasoValorReferencia.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
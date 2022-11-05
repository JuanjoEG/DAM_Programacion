
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Metodos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    ******************************************************
                    *                 CLASES / M�TODOS                   *
                    ******************************************************
                    *     SON LAS ACCIONES QUE POSEE LA CLASE.           *
                    ******************************************************
                    *  1. CONSTRUCTORES.                                 *
                    *  2. OBSERVADORES.   -->  GETTERS.                  *
                    *  3. MODIFICADORES.  -->  SETTERS.                  *
                    *  4. M�TODO toString.                               *
                    *  5. M�TODOS PERSONALIZADOS.                        *
                    *  6. M�TODOS EST�TICOS.                             *
                    *  7. SOBRECARGA DE M�TODOS.                         *
                    *  8. SOBREESCRITURA DE M�TODOS.                     *
                    *  9. BLOQUES EST�TICOS.                             *
                    * 10. PASO POR VALOR Y PASO POR REFERENCIA.          *
                    ******************************************************
                    *  0. ATR�S.                                         *
                    ******************************************************
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
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
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
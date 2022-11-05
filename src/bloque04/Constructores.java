
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Constructores {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    ****************************************************************
                    *                CLASES / MÉTODOS / CONSTRUCTORES              *
                    ****************************************************************
                    * LOS CONSTRUCTORES DEBEN DECLARARSE COMO PÚBLICOS.            *
                    * SON LOS ENCARGADOS DE INICIALIZAR LOS OBJETOS DE LA CLASE.   *
                    * LOS CONSTRUCTORES SE LLAMAN IGUAL QUE LA CLASE.              *
                    * LOS CONSTRUCTORES NO DEVOLVERÁN NINGÚN TIPO DE DATO.         *
                    * A LOS CONSTRUCTORES SE LES LLAMA CON EL OPERADOR new.        *
                    ****************************************************************
                    *  1. CONSTRUCTOR POR DEFECTO.                                 *
                    *  2. CONSTRUCTOR POR PARÁMETROS.                              *
                    *  3. CONSTRUCTOR POR COPIA.                                   *
                    ****************************************************************
                    *  0. ATRÁS.                                                   *
                    ****************************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque04.ConstructorPorDefecto.main(args);
                case "2" -> bloque04.ConstructorPorParametros.main(args);
                case "3" -> bloque04.ConstructorPorCopia.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
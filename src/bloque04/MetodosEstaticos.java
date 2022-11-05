
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class MetodosEstaticos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    ***********************************************************************
                    *                 CLASES / MÉTODOS / MÉTODOS ESTÁTICOS                *
                    ***********************************************************************
                    *  static[TIPOVUELTO/void] NOMBMETODO([PARAMETROS]){                  *
                    *            BLOQUE;                                                  *
                    *  }                                                                  *
                    ***********************************************************************
                    *            MÉTODO ESTÁTICO O MÉTODO DE CLASE.                       *
                    *  SON LOS MÉTODOS QUE POSEE LA CLASE.                                *
                    *  ES UN MÉTODO QUE PERTENECE A LA CLASE Y NO AL OBJETO.              *
                    *  NO DEPENDEN DE NINGÚN OBJETO DE LA CLASE.                          *
                    *  SE PUEDE Y SE DEBE LLAMAR USANDO EL NOMBRE DE LA CLASE.            *
                    *  PARA DECLARAR UN MÉTODO ESTÁTICO USAMOS static.                    *
                    *  UN MÉTODO ESTÁTICO PUEDE LLAMAR SOLO A OTROS MÉTODOS ESTÁTICOS.    *
                    *  LOS MÉTODOS ESTÁTICOS SON PÚBLICOS COMO LAS CLASES.                *
                    *  LOS MÉTODOS ESTÁTICOS PUEDEN USAR PARÁMETOS.                       *
                    *  UN MÉTODO ESTÁTICO NO PUEDE HACER REFERENCIA NI A this NI A super. *
                    ***********************************************************************
                    *  0. ATRÁS.                                                          *
                    ***********************************************************************
                               
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
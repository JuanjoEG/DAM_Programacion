
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Castings {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                             **************************************
                             *             CASTINGS               *
                             **************************************
                             * IMPLÍCITO  -->  MISMO GRUPO.       *
                             **************************************
                             * EXPLÍCITO  -->  DISTINTOS GRUPOS,  *
                             *                 PERO COMPATIBLES.  *
                             **************************************
                             * EJEMPLO, PASAR UN REAL A ENTERO:   *
                             *                                    *
                             * double num_real = 8,3;             *
                             * int mun_entero = (int) num_real;   *
                             *                                    *
                             *  OJO --> PERDIDA DE INFORMACIÓN.   *
                             **************************************                               
                               
                    ***********************************************************
                    *                CASTINGS ENTRE OBJETOS                   *
                    ***********************************************************
                    * IMPLÍCITO  -->  MISMO TIPO.                             *
                    ***********************************************************
                    * EXPLÍCITO  -->  DISTINTOS TIPOS,                        *
                    *                 PERO COMPATIBLES EN HERENCIA.           *
                    ***********************************************************
                    * POLIMORFISMO DINÁMICO / CASTING IMPLÍCITO DE OBJETOS    *
                    *    FORZANDO EL CASTING AL INSTANCIAR UN OBJETO.         *
                    *               (Cuadrado extends Figura)                 *
                    *   Figura c = new Cuadrado();                            *
                    *                                                         *
                    ***********************************************************
                    * POLIMORFISMO ESTÁTICO / CASTING EXPLÍCITO ENTRE OBJETOS *
                    *                                                         *
                    *   Cuadrado c = new Cuadrado();                          *
                    *                                                         *
                    *                       incompleto               *
                    ***********************************************************
                    * 0. ATRÁS.                                               *
                    ***********************************************************
                               
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
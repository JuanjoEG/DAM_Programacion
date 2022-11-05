
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
                             * IMPL�CITO  -->  MISMO GRUPO.       *
                             **************************************
                             * EXPL�CITO  -->  DISTINTOS GRUPOS,  *
                             *                 PERO COMPATIBLES.  *
                             **************************************
                             * EJEMPLO, PASAR UN REAL A ENTERO:   *
                             *                                    *
                             * double num_real = 8,3;             *
                             * int mun_entero = (int) num_real;   *
                             *                                    *
                             *  OJO --> PERDIDA DE INFORMACI�N.   *
                             **************************************                               
                               
                    ***********************************************************
                    *                CASTINGS ENTRE OBJETOS                   *
                    ***********************************************************
                    * IMPL�CITO  -->  MISMO TIPO.                             *
                    ***********************************************************
                    * EXPL�CITO  -->  DISTINTOS TIPOS,                        *
                    *                 PERO COMPATIBLES EN HERENCIA.           *
                    ***********************************************************
                    * POLIMORFISMO DIN�MICO / CASTING IMPL�CITO DE OBJETOS    *
                    *    FORZANDO EL CASTING AL INSTANCIAR UN OBJETO.         *
                    *               (Cuadrado extends Figura)                 *
                    *   Figura c = new Cuadrado();                            *
                    *                                                         *
                    ***********************************************************
                    * POLIMORFISMO EST�TICO / CASTING EXPL�CITO ENTRE OBJETOS *
                    *                                                         *
                    *   Cuadrado c = new Cuadrado();                          *
                    *                                                         *
                    *                       incompleto               *
                    ***********************************************************
                    * 0. ATR�S.                                               *
                    ***********************************************************
                               
                      """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
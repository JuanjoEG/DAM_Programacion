
package bloque05;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class RelacionClasesPolimorfismo {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                    *************************************************************************
                    *              RELACI�N ENTRE CLASES / POLIMORFISMO                     *
                    *************************************************************************
                    *  SE DA CUANO UNA CLASE SE APOYA EN OTRA CREANDO JERARQU�A. HERENCIA.  *
                    *  TENEMOS UNA CLASE PADRE. NORM�LMENTE ABSTRACTA. RA�Z COM�N.          *
                    *  Y UN CONJUNTO DE CLASES HIJAS. CADA UNA DIFERENTE.                   *
                    *************************************************************************
                    *  Figura   -->   CLASE PADRE ABSTRACTA. NO PODEMOS INSTANCIAR OBJETOS. *
                    *                                                                       *
                    *    Triangulo    extends Figura.         <--   CLASES HIJAS.           *
                    *    Cuadrilatero extends Figura.                                       *
                    *************************************************************************
                    *  CREAR OBJETO DE MANERA NORMAL:                                       *
                    *                                                                       *
                    *  Triangulo tri01 = new Triangulo();                                   *
                    *  Cuadrilatero cua01 = new Cuadrilatero();                             *
                    *************************************************************************
                    *  M�LTIPLES FORMAS DE CREAR UN TIPO DE OBJETO.                         *
                    *  PODEMOS TRATAR TODOS LOS TIPOS HIJOS COMO UN SOLO TIPO PADRE.        *
                    *  POLIMORFISMO DIN�MICO:              CASTING IMPL�CITO ENTRE OBJETOS. *
                    *                          FORZANDO EL CASTING AL INSTANCIAR EL OBJETO. *
                    *                                                                       *
                    *  Figura tri02 = new Triangulo();                                      *
                    *  Figura cua02 = new Cuadrilatero();                                   *
                    *                                                                       *
                    *  CON instanceof PODEMOS SABER DE QU� TIPO SE TRATA CADA OBJETO.       *
                    *************************************************************************
                    *  1. EJEMPLO USANDO instanceof.                                        *
                    *************************************************************************
                    *  0. ATR�S.                                                            *
                    *************************************************************************
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> ejemplos.tramo10.InstaceofPolimorfismoCasting.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
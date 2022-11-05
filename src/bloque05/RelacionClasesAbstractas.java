
package bloque05;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class RelacionClasesAbstractas {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                    *************************************************************************
                    *           RELACIÓN ENTRE CLASES / CLASES Y MÉTODOS ABSTRACTOS         *
                    *************************************************************************
                    *  SE USA NORMALMENTE CON LA HERENCIA.                                  *
                    *  ES UNA CLASE PADRE QUE ... NO PUEDE INSTANCIAR OBJETOS, PERO...      *
                    *  TENDRÁ OTRAS CLASES HIJAS QUE...                                     *
                    *      -. PODRÁ DECLARARSE TAMBIÉN ABSTRACTA, O PODRÁ...                *
                    *      -. IMPLEMENTAR TODOS LOS MÉTODOS ABSTRACTOS DE LA CLASE PADRE,   *
                    *         Y PODRÁ INSTANCIAR OBJETOS.                                   *
                    *************************************************************************
                    *  USAMOS LA PALABRA RESERVADA abstract                                 *
                    *************************************************************************
                    *  LOS MÉTODOS DE LAS CLASES ABSTRACTAS:   -->  MÉTODOS ABSTRACTOS.     *
                    *            NO SE IMPLEMENTAN.                                         *
                    *            SOLO PUEDEN EXISTIR EN CLASES ABSTRACTAS.                  *
                    *            TENDRÁN QUE SER SOBREESCRITOS POR LAS CLASES HIJAS.        *
                    *************************************************************************
                    *  UNA CLASE ABSTRACTA  -->  PUEDE TENER MÉTODOS NORMALES,              *
                    *                            Y PUEDE TENER MÉTODOS ABSTRACTOS.          *
                    *  UNA CLASE NORMAL     -->  NO PUEDE TENER MÉTODOS ABSTRACTOS.         *
                    *************************************************************************
                    *                                                                       *
                    *    public abstract class Mamifero {         -->  CLASE ABSTRACTA.     *
                    *                                                                       *
                    *        public abstract void desplazarse();  -->  MÉTODO ABSTRACTO.    *
                    *    }                                             SIN CUERPO.          *
                    *                                                                       *
                    *************************************************************************
                    *  0. ATRÁS.                                                            *
                    *************************************************************************
                               
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
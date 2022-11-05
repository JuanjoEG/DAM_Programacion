
package bloque05;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class RelacionClasesAbstractas {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                    *************************************************************************
                    *           RELACI�N ENTRE CLASES / CLASES Y M�TODOS ABSTRACTOS         *
                    *************************************************************************
                    *  SE USA NORMALMENTE CON LA HERENCIA.                                  *
                    *  ES UNA CLASE PADRE QUE ... NO PUEDE INSTANCIAR OBJETOS, PERO...      *
                    *  TENDR� OTRAS CLASES HIJAS QUE...                                     *
                    *      -. PODR� DECLARARSE TAMBI�N ABSTRACTA, O PODR�...                *
                    *      -. IMPLEMENTAR TODOS LOS M�TODOS ABSTRACTOS DE LA CLASE PADRE,   *
                    *         Y PODR� INSTANCIAR OBJETOS.                                   *
                    *************************************************************************
                    *  USAMOS LA PALABRA RESERVADA abstract                                 *
                    *************************************************************************
                    *  LOS M�TODOS DE LAS CLASES ABSTRACTAS:   -->  M�TODOS ABSTRACTOS.     *
                    *            NO SE IMPLEMENTAN.                                         *
                    *            SOLO PUEDEN EXISTIR EN CLASES ABSTRACTAS.                  *
                    *            TENDR�N QUE SER SOBREESCRITOS POR LAS CLASES HIJAS.        *
                    *************************************************************************
                    *  UNA CLASE ABSTRACTA  -->  PUEDE TENER M�TODOS NORMALES,              *
                    *                            Y PUEDE TENER M�TODOS ABSTRACTOS.          *
                    *  UNA CLASE NORMAL     -->  NO PUEDE TENER M�TODOS ABSTRACTOS.         *
                    *************************************************************************
                    *                                                                       *
                    *    public abstract class Mamifero {         -->  CLASE ABSTRACTA.     *
                    *                                                                       *
                    *        public abstract void desplazarse();  -->  M�TODO ABSTRACTO.    *
                    *    }                                             SIN CUERPO.          *
                    *                                                                       *
                    *************************************************************************
                    *  0. ATR�S.                                                            *
                    *************************************************************************
                               
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
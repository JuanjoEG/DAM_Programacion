
package bloque05;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Interfaces {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                      
                               
                               
                    *************************************************************************
                    *           RELACI�N ENTRE CLASES / INTERFACES                          *
                    *************************************************************************
                    *  EN UNA INTERFAZ S�LO EXISTEN LOS PROTOTIPOS DE LOS M�TODOS.          *
                    *         NO PERTENECEN A LA JERARQU�A DE CLASES.                       *
                    *         NO PUEDE INSTANCIAR OBJETOS.                                  *
                    *         TODOS SUS M�TODOS SIN IMPLEMENTAR --> ABSTRACTOS Y P�BLICOS.  *
                    *         NO PUEDE TENER M�TODOS NORMALES.                              *
                    *         SOLO PUEDE TENER VARIABLES CONSTANTES.                        *
                    *  LAS CLASES QUE IMPLEMENTEN LA INTERFAZ...                            *
                    *         TENDR�N QUE IMPLEMENTAR TODOS LOS M�TODOS DE LA INTERFAZ.     *
                    *         Y PODR�N INSTANCIAR OBJETOS.                                  *
                    *  A PARTIR DE UNA MISMA INTERFAZ PODEMOS OBTENER                       *
                    *         M�LTIPLES IMPLEMENTACIONES DISTINTAS.                         *
                    *************************************************************************
                    *  USAMOS LA PALABRA RESERVADA interface PARA DECLARARLA.               *
                    *  USAMOS LA PALABRA RESERVADA implements PARA USARLA.                  *
                    *************************************************************************
                    *                                                                       *
                    *  public interface Numerico {                                          *
                    *                                                                       *
                    *       void establecePrecision();            <--M�TODO SIN CUERPO.     *
                    *  }                                                                    *
                    *************************************************************************
                    *  LAS CLASES QUE IMPLEMENTAN LA INTERFAZ EST�N OBLIGADAS               *
                    *  A DAR UN CUERPO A LOS M�TODOS DE LA INTERFAZ.                        *
                    *                                                                       *
                    *  public class Acumulador implements Numerico {                        *
                    *                                                                       *
                    *       @Override                                                       *
                    *       public void establecePrecision() {                              *
                    *           CUERPO;                                                     *
                    *       }                                                               *
                    *  }                                                                    *
                    *************************************************************************
                    *  ES INTERESANTE USAR POLIMORFISMO CON INTERFACES.                     *
                    *  TRATAR LA INTERFAZ COMO SI FUERA UNA CLASE ABSTRACTA PADRE.          *
                    *  OBTENDREMOS OBJETOS DE DIFERENTES TIPOS HIJOS                        *
                    *  Y USARLOS COMO UN SOLO TIPO.                                         *
                    *  PODEMOS OBTENER DISTINTOS COMPORTAMIENTOS SEG�N LA IMPLEMENTACI�N.   *
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
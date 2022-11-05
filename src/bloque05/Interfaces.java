
package bloque05;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Interfaces {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                      
                               
                               
                    *************************************************************************
                    *           RELACIÓN ENTRE CLASES / INTERFACES                          *
                    *************************************************************************
                    *  EN UNA INTERFAZ SÓLO EXISTEN LOS PROTOTIPOS DE LOS MÉTODOS.          *
                    *         NO PERTENECEN A LA JERARQUÍA DE CLASES.                       *
                    *         NO PUEDE INSTANCIAR OBJETOS.                                  *
                    *         TODOS SUS MÉTODOS SIN IMPLEMENTAR --> ABSTRACTOS Y PÚBLICOS.  *
                    *         NO PUEDE TENER MÉTODOS NORMALES.                              *
                    *         SOLO PUEDE TENER VARIABLES CONSTANTES.                        *
                    *  LAS CLASES QUE IMPLEMENTEN LA INTERFAZ...                            *
                    *         TENDRÁN QUE IMPLEMENTAR TODOS LOS MÉTODOS DE LA INTERFAZ.     *
                    *         Y PODRÁN INSTANCIAR OBJETOS.                                  *
                    *  A PARTIR DE UNA MISMA INTERFAZ PODEMOS OBTENER                       *
                    *         MÚLTIPLES IMPLEMENTACIONES DISTINTAS.                         *
                    *************************************************************************
                    *  USAMOS LA PALABRA RESERVADA interface PARA DECLARARLA.               *
                    *  USAMOS LA PALABRA RESERVADA implements PARA USARLA.                  *
                    *************************************************************************
                    *                                                                       *
                    *  public interface Numerico {                                          *
                    *                                                                       *
                    *       void establecePrecision();            <--MÉTODO SIN CUERPO.     *
                    *  }                                                                    *
                    *************************************************************************
                    *  LAS CLASES QUE IMPLEMENTAN LA INTERFAZ ESTÁN OBLIGADAS               *
                    *  A DAR UN CUERPO A LOS MÉTODOS DE LA INTERFAZ.                        *
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
                    *  PODEMOS OBTENER DISTINTOS COMPORTAMIENTOS SEGÚN LA IMPLEMENTACIÓN.   *
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
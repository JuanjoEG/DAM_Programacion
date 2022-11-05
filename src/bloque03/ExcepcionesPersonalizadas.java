
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class ExcepcionesPersonalizadas {
    
    public static void main(String[] args) {
        
        String menu;
        do {            
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                               *******************************************************************
                               *                    EXCEPCIONES PERSONALIZADAS                   *
                               *******************************************************************
                               *   TODAS HEREDAN DE LA CLASE  -->  Exception                     *
                               *******************************************************************
                               *   SU NOMBRE DEBER� TERMINAR EN  ...Exception                    *
                               *   TENDR� UN CONSTRUCTOR QUE LE LLEGA UN String COMO PAR�METRO.  *
                               *   String  -->  MENSAJE DE NUESTRO ERROR PERSONALIZADO.          *
                               *******************************************************************
                               *   SI SE DAN LAS CONDICIONES REQUERIDAS DE LA EXCEPCI�N ...      *
                               *   SE LANZA NUESTRA EXCEPCI�N CON EL C�DIGO:                     *
                               *                                                                 *
                               *   thow new TipoException(String);                               *
                               *                                                                 *
                               *******************************************************************
                               *   SI LA EXCEPCI�N SE DA EN UN M�TODO  -->  A�ADIR  throws  Y... *
                               *   LA EJECUCI�N SE VA AL catsh DEL PROGRAMA PRINCIPAL.           *
                               *                                                                 *
                               *   private static void unMetodo() throws TipoException {         *
                               *        ...                                                      *
                               *        if (CONDICI�N) {                                         *
                               *            thow new TipoException("��� No es correcto !!!");    *
                               *        }                                                        *
                               *        ...                                                      *
                               *   }                                                             *
                               *                                                                 *
                               *******************************************************************
                               *   EN LA CLASE EXCEPCI�N PERSONALIZADA:                          *
                               *                                                                 *
                               *  public class TipoException extends Exception {                 *
                               *                                                                 *
                               *      public TipoException (String mensajeError) {               *
                               *          super(mensajeError);                                   *
                               *      }                                                          *
                               *  }                                                              *
                               *                                                                 *
                               *******************************************************************
                               *   EN EL PROGRAMA PRINCIPAL:                                     *
                               *                                                                 *
                               *    try {                                                        *
                               *        BLOQUE QUE PUEDE GENERAR LA EXCEPCI�N;                   *
                               *    } catch (TipoException ex) {                                 *
                               *        BLOQUE QUE SE MUESTRA SI HAY UNA EXCEPCI�N;              *
                               *        ex.printStackTrace();                                    *
                               *        System.out.println("Error: " + ex.toString();            *
                               *    } finaly {                                                   *
                               *        BLOQUE QUE SIEMPRE SE EJECUTA;                           *
                               *        CIERRE DE RECURSOS.                                      *
                               *    }                                                            *
                               *                                                                 *
                               *******************************************************************
                               *   UN try    -->  PUEDE TENER VARIOS catch  -->  MULTICATCH      *
                               *   UN catch  -->  TIENE QUE TENER UN try OBLIGATORIAMENTE        *
                               *******************************************************************
                               *  1. EJEMPLO DE EXCEPCIONES PERSONALIZADAS.                      *
                               *******************************************************************
                               *  0. ATR�S.                                                      *
                               *******************************************************************
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                case "1" -> ejemplos.tramo11.TermometroMain.main(args);
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
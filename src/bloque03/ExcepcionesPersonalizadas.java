
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
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
                               *   SU NOMBRE DEBERÁ TERMINAR EN  ...Exception                    *
                               *   TENDRÁ UN CONSTRUCTOR QUE LE LLEGA UN String COMO PARÁMETRO.  *
                               *   String  -->  MENSAJE DE NUESTRO ERROR PERSONALIZADO.          *
                               *******************************************************************
                               *   SI SE DAN LAS CONDICIONES REQUERIDAS DE LA EXCEPCIÓN ...      *
                               *   SE LANZA NUESTRA EXCEPCIÓN CON EL CÓDIGO:                     *
                               *                                                                 *
                               *   thow new TipoException(String);                               *
                               *                                                                 *
                               *******************************************************************
                               *   SI LA EXCEPCIÓN SE DA EN UN MÉTODO  -->  AÑADIR  throws  Y... *
                               *   LA EJECUCIÓN SE VA AL catsh DEL PROGRAMA PRINCIPAL.           *
                               *                                                                 *
                               *   private static void unMetodo() throws TipoException {         *
                               *        ...                                                      *
                               *        if (CONDICIÓN) {                                         *
                               *            thow new TipoException("¡¡¡ No es correcto !!!");    *
                               *        }                                                        *
                               *        ...                                                      *
                               *   }                                                             *
                               *                                                                 *
                               *******************************************************************
                               *   EN LA CLASE EXCEPCIÓN PERSONALIZADA:                          *
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
                               *        BLOQUE QUE PUEDE GENERAR LA EXCEPCIÓN;                   *
                               *    } catch (TipoException ex) {                                 *
                               *        BLOQUE QUE SE MUESTRA SI HAY UNA EXCEPCIÓN;              *
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
                               *  0. ATRÁS.                                                      *
                               *******************************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                case "1" -> ejemplos.tramo11.TermometroMain.main(args);
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
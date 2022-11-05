
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Excepciones {
    
    public static void main(String[] args) {
        
        String menu;
        do {            
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                               *******************************************************************
                               *                           EXCEPCIONES                           *
                               *******************************************************************
                               *   TODAS HEREDAN DE LA CLASE  -->  Exception                     *
                               *******************************************************************
                               *   CONTR�L MEDIANTE LOS BLOQUES  -->  try-catch                  *
                               *   LOS BLOQUES  try-catch  SE PONDR�N EN EL PROGRAMA PRINCIPAL.  *
                               *******************************************************************
                               *   SI LA EXCEPCI�N SE DA EN UN M�TODO  -->  A�ADIR  throws  Y... *
                               *   LA EJECUCI�N SE VA AL catsh DEL PROGRAMA PRINCIPAL.           *
                               *******************************************************************
                               *          SI QUEREMOS LANZAR NOSOTROS UNA EXCEPCI�N:             *
                               *   thow new MiException(); --> PODEMOS PERSONALIZAR LA EXCEPCI�N.*
                               *******************************************************************
                               *   EN EL PROGRAMA PRINCIPAL:                                     *
                               *                                                                 *
                               *    try {                                                        *
                               *        BLOQUE QUE PUEDE GENERAR LA EXCEPCI�N;                   *
                               *    } catch (TipoException ex) {                                 *
                               *        BLOQUE QUE SE MUESTRA SI HAY UNA EXCEPCI�N;              *
                               *        ex.printStackTrace();                                    *
                               *        System.out.println("Error: " + ex.toString());           *
                               *    } finaly {                                                   *
                               *        BLOQUE QUE SIEMPRE SE EJECUTA;                           *
                               *        CIERRE DE RECURSOS.                                      *
                               *    }                                                            *
                               *                                                                 *
                               *******************************************************************
                               *   UN try    -->  PUEDE TENER VARIOS catch  -->  MULTICATCH      *
                               *   UN catch  -->  TIENE QUE TENER UN try OBLIGATORIAMENTE        *
                               *******************************************************************
                               *  1. EXCEPCIONES PERSONALIZADAS.                                 *
                               *  2. DOCUMENTACI�N DE EXCEPCIONES.                               *
                               *******************************************************************
                               *  0. ATR�S.                                                      *
                               *******************************************************************
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                case "1" -> bloque03.ExcepcionesPersonalizadas.main(args);
                case "2" -> bloque04.DocumentacionClase.main(args);
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
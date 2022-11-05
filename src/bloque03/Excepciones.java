
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
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
                               *   CONTRÓL MEDIANTE LOS BLOQUES  -->  try-catch                  *
                               *   LOS BLOQUES  try-catch  SE PONDRÁN EN EL PROGRAMA PRINCIPAL.  *
                               *******************************************************************
                               *   SI LA EXCEPCIÓN SE DA EN UN MÉTODO  -->  AÑADIR  throws  Y... *
                               *   LA EJECUCIÓN SE VA AL catsh DEL PROGRAMA PRINCIPAL.           *
                               *******************************************************************
                               *          SI QUEREMOS LANZAR NOSOTROS UNA EXCEPCIÓN:             *
                               *   thow new MiException(); --> PODEMOS PERSONALIZAR LA EXCEPCIÓN.*
                               *******************************************************************
                               *   EN EL PROGRAMA PRINCIPAL:                                     *
                               *                                                                 *
                               *    try {                                                        *
                               *        BLOQUE QUE PUEDE GENERAR LA EXCEPCIÓN;                   *
                               *    } catch (TipoException ex) {                                 *
                               *        BLOQUE QUE SE MUESTRA SI HAY UNA EXCEPCIÓN;              *
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
                               *  2. DOCUMENTACIÓN DE EXCEPCIONES.                               *
                               *******************************************************************
                               *  0. ATRÁS.                                                      *
                               *******************************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                case "1" -> bloque03.ExcepcionesPersonalizadas.main(args);
                case "2" -> bloque04.DocumentacionClase.main(args);
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}

package ejemplos.tramo09;

import java.util.Scanner;
import Clases.LeerPorTeclado;

/**
 * ESPAÑA / SEVILLA / 2022
 * APACHE NET BEANS IDE 14
 * TOOLS --> TEMPLATES --> SETTINGS --> BORRAR # DE ÚLTIMA LÍNEA --> USER=Juan José Estévez González
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> SOURCE/BINARY FORMAT --> JDK 18
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> PROFILE --> FULL JRE
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> ENCODING --> ISO-8859-1
 * TOOLS --> OPTIONS --> FONTS & COLOR --> PROFILE: FLATLAF DARK
 * TOOLS --> OPTIONS --> FONTS & COLOR --> FONT --> MONOSPACED 18
 * TOOLS --> OPTIONS --> APPEARANCE --> LOOK AND FEEL --> FLATLAF DARK
 * @author Juan José Estévez González
 */
public class TiposDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        do {            
            System.out.println ("""
                                
                                
                                
                                
                                
                                *------------------------------* *------------------------------*
                                * - - - - - - MENÚ - - - - - - * * - - - - - - MENÚ - - - - - - *
                                *       MÉTODOS ESTÁTICOS      * *       MÉTODOS DINÁMICOS      *
                                *------------------------------* *------------------------------*
                                * 1. Leer una cadena de texto. * * 6.  Leer una cadena de texto.*
                                * 2. Leer un carácter.         * * 7.  Leer un carácter.        *
                                * 3. Leer un entero.           * * 8.  Leer un entero.          *
                                * 4. Leer un double.           * * 9.  Leer un double.          *
                                * 5. Leer un boolean.          * * 10. Leer un boolean.         *
                                * 0. Salir.                    * * 0.  Salir.                   *
                                *------------------------------* *------------------------------*
                                
                                """);
            System.out.print("SELECCIONA UNA OPCIÓN:  ");
            opcion = teclado.nextInt();
            LeerPorTeclado c1 = new LeerPorTeclado();
            
            switch(opcion){
                case 1 -> LeerPorTeclado.leerStringS("Introduce una STRING por teclado.");
                case 2 -> LeerPorTeclado.leerCharS("Introduce un CHAR por teclado.");
                case 3 -> LeerPorTeclado.leerIntS("Introduce un INT por teclado.");
                case 4 -> LeerPorTeclado.leerDoubleS("Introduce un DOUBLE por teclado.");
                case 5 -> LeerPorTeclado.leerBooleanS("Introduce un BOOLEAN por teclado.");
                case 6 -> c1.leerString("Introduce una STRING por teclado.");
                case 7 -> c1.leerChar("Introduce un CHAR por teclado.");
                case 8 -> c1.leerInt("Introduce un INT por teclado.");
                case 9 -> c1.leerDouble("Introduce un DOUBLE por teclado.");
                case 10 -> c1.leerBoolean("Introduce un BOOLEAN por teclado.");
                case 0 -> {}
                default -> System.out.println("La opción no es correcta.");
            }            
        } while (opcion !=0);        
    }    
}
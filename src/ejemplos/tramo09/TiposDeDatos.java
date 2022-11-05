
package ejemplos.tramo09;

import java.util.Scanner;
import Clases.LeerPorTeclado;

/**
 * ESPA�A / SEVILLA / 2022
 * APACHE NET BEANS IDE 14
 * TOOLS --> TEMPLATES --> SETTINGS --> BORRAR # DE �LTIMA L�NEA --> USER=Juan Jos� Est�vez Gonz�lez
 * BOT�N DERECHO EN PROYECTO --> PROPERTIES --> SOURCE/BINARY FORMAT --> JDK 18
 * BOT�N DERECHO EN PROYECTO --> PROPERTIES --> PROFILE --> FULL JRE
 * BOT�N DERECHO EN PROYECTO --> PROPERTIES --> ENCODING --> ISO-8859-1
 * TOOLS --> OPTIONS --> FONTS & COLOR --> PROFILE: FLATLAF DARK
 * TOOLS --> OPTIONS --> FONTS & COLOR --> FONT --> MONOSPACED 18
 * TOOLS --> OPTIONS --> APPEARANCE --> LOOK AND FEEL --> FLATLAF DARK
 * @author Juan Jos� Est�vez Gonz�lez
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
                                * - - - - - - MEN� - - - - - - * * - - - - - - MEN� - - - - - - *
                                *       M�TODOS EST�TICOS      * *       M�TODOS DIN�MICOS      *
                                *------------------------------* *------------------------------*
                                * 1. Leer una cadena de texto. * * 6.  Leer una cadena de texto.*
                                * 2. Leer un car�cter.         * * 7.  Leer un car�cter.        *
                                * 3. Leer un entero.           * * 8.  Leer un entero.          *
                                * 4. Leer un double.           * * 9.  Leer un double.          *
                                * 5. Leer un boolean.          * * 10. Leer un boolean.         *
                                * 0. Salir.                    * * 0.  Salir.                   *
                                *------------------------------* *------------------------------*
                                
                                """);
            System.out.print("SELECCIONA UNA OPCI�N:  ");
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
                default -> System.out.println("La opci�n no es correcta.");
            }            
        } while (opcion !=0);        
    }    
}

package ejemplos.tramo11;

import Clases.DNIException;
import java.util.Scanner;

/**
 * ESPA—A / SEVILLA / 2022
 * APACHE NET BEANS IDE 14
 * TOOLS --> TEMPLATES --> SETTINGS --> BORRAR # DE ⁄LTIMA LÕNEA --> USER=Juan JosÈ EstÈvez Gonz·lez
 * BOT”N DERECHO EN PROYECTO --> PROPERTIES --> SOURCE/BINARY FORMAT --> JDK 18
 * BOT”N DERECHO EN PROYECTO --> PROPERTIES --> PROFILE --> FULL JRE
 * BOT”N DERECHO EN PROYECTO --> PROPERTIES --> ENCODING --> ISO-8859-1
 * TOOLS --> OPTIONS --> FONTS & COLOR --> PROFILE: FLATLAF DARK
 * TOOLS --> OPTIONS --> FONTS & COLOR --> FONT --> MONOSPACED 18
 * TOOLS --> OPTIONS --> APPEARANCE --> LOOK AND FEEL --> FLATLAF DARK
 * @author Juan JosÈ EstÈvez Gonz·lez
 */

public class Excepciones_DNI {
    public static void validarDNI(String DNI) throws DNIException {
        int DNIsinletra = Integer.valueOf(DNI.substring(0,8));
        String letra = DNI.substring(8,9);
        String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int resto = DNIsinletra %23;
        if ( !letra.equals(letras[resto]) ) {
            throw new DNIException ("""
                                    
                                    El DNI: """+DNIsinletra+" y la LETRA: "+letra
                                  + "   °°° NO SON CORRECTOS !!!"+"\n"
                                  + "Yo creo que es FALSO,"+"\n"
                                  + "°°° CUIDADO CON ESE P√ÅJARO !!!");
        }
    }
    public static void main(String[] args) {
        Scanner variableteclado = new Scanner (System.in);
        String DNI;
        int salir = 1;
        System.out.println("""
                           
                           Ejemplos:
                           43052775X     Error de VALIDACI\u00d3N
                           34052X        Error de ESTRUCTURA
                           X34052775     Error de FORMATO
                           34052775X     Correcto
                           
                           """);
        do {
            System.out.println("""
                               
                               Por favor,
                               Introduzca su DNI
                               Las 8 cifras y la letra en Mayusculas sin espacios.
                               
                               """);           
            DNI=variableteclado.nextLine();
            System.out.println(" ");
            try {
                validarDNI(DNI);
                System.out.println("El DNI "+DNI+" es Correcto"+"\n");
                System.out.println("""
                                   
                                   °°° MUY BI…N CAMPE”N !!!
                                   
                                   """);
                salir = 0;
            }
            catch (DNIException ex) {
                
                System.out.println("""
                                   Error de VALIDACI”N: 
                                   """+ ex.toString());
                System.out.println(" ");
            }
            catch (StringIndexOutOfBoundsException e) {
                System.out.println("""
                                   Error de ESTRUCTURA: 
                                   """+ e.toString());
                System.out.println("""
                                   
                                   Recuerda que son 8 cifras y la letra en Mayusculas, todo junto.
                                   Vamos a ver churrita...
                                   øQuÈ parte es la que no entiendes?
                                   
                                   """);              
            }
            catch (NumberFormatException error) {
                System.out.println("""
                                   Error de FORMATO: 
                                   """+ error.toString());
                System.out.println("""
                                   
                                   UUUFFF... °°° Lo que no te pase a tÌ≠... !!!");
                                   øTe lo tengo que explicar otra vez?
                                   Recuerda que la letra va en Mayusculas,
                                   sin poner espacios y la pones al final.
                                   
                                   """);
            }
        } while (salir!=0);
    }
}
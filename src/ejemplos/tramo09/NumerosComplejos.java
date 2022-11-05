
package ejemplos.tramo09;

import Clases.Complejo;
import java.util.Scanner;

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
public class NumerosComplejos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Complejo c1, c2, c3, cRes;
        double real1, imag1, real2, imag2;
        Scanner teclado = new Scanner(System.in);
        
        // SE PIDEN LOS DATOS DE LOS N�MEROS COMPLEJOS
        System.out.println("PRIMER N�MERO.");
        System.out.print("Introduce la parte Real: ");
        real1 = teclado.nextDouble();
        System.out.print("Introduce la parte Imaginaria: ");
        imag1 = teclado.nextDouble();
        System.out.println("");
        System.out.println("SEGUNDO N�MERO.");
        System.out.print("Introduce la parte Real: ");
        real2 = teclado.nextDouble();
        System.out.print("Introduce la parte Imaginaria: ");
        imag2 = teclado.nextDouble();
        System.out.println("");        
        
        // USANDO EL CONSTRUCTOR POR PAR�METROS
        c1 = new Complejo(real1, imag1);
        c2 = new Complejo(real2, imag2);
        
        // USANDO EL CONSTRUCTOR COPIA
        c3 = new Complejo(c1);
        
        // LLAMAMOS AL M�TODO EST�TICO A TRAV�S DE LA PROPIA CLASE
        cRes = Complejo.SumarComplejos(c1, c2);
        
        // LLAMAMOS AL M�TODO A TRAV�S DE UN OBJETO DE LA CLASE
        c3.Sumar(c2);         
        
        // SE MUESTRA POR PANTALLA LO REALIZADO
        System.out.println("Complejo Primero:    "+c1);
        System.out.println("Complejo Segundo:    "+c2);
        System.out.println("");
        System.out.println("M�todo Est�tico Sumar.");
        System.out.println("Complejo Resultado : "+cRes);
        System.out.println("");
        System.out.println("M�todo Din�mico Sumar.");
        System.out.println("Complejo Resultado : "+c3);
        System.out.println("");
    }    
}
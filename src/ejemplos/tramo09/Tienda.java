
package ejemplos.tramo09;

import java.util.Scanner;
import Clases.Factura;

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
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String cliente, descripcion;
        double importe;
        Factura factura;
        
        System.out.println("Introduzca el nombre del cliente: ");
        cliente = teclado.nextLine();
        System.out.println("Introduzca los artículos presupuestados: ");
        descripcion = teclado.nextLine();
        System.out.println("Introduzca el importe de los presupuestos: ");
        importe = teclado.nextDouble();
        System.out.println("");
        
        factura = new Factura(cliente, descripcion, importe);
        factura.imprimirPresupuesto();
    }    
}
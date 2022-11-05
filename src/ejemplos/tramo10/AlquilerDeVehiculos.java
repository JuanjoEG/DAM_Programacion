
package ejemplos.tramo10;

import Clases.Alquiler;
import java.util.Scanner;

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
public class AlquilerDeVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado_Stg = new Scanner(System.in);
        String cantidad;
        
        System.out.println("( 1 - 4 )");
        System.out.print("¿Cuántos Vehí­culos desea alquilar?   = ");
        cantidad = teclado_Stg.nextLine();
        System.out.println("");
        
        switch (cantidad){
        
            case "1" -> {
                Alquiler a = new Alquiler(1);        
                a.mostrarFactura();
            }
            case "2" -> {
                Alquiler b = new Alquiler(2);        
                b.mostrarFactura();
            }
            case "3" -> {
                Alquiler c = new Alquiler(3);        
                c.mostrarFactura();
            }
            case "4" -> {
                Alquiler d = new Alquiler(4);        
                d.mostrarFactura();
            }
            default -> System.out.println("""
                                   ...................................................
                                   ...Lo lamentamos...................................
                                   ...En estos momentos no podemos dar ese servicio...
                                   ...Disculpen las molestias.........................
                                   ...................................................
                                   """);
        }
    }    
}
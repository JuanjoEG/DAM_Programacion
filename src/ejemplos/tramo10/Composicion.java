
package ejemplos.tramo10;

import Clases.Persona;

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
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Persona p = new Persona ("Juan","27345123R","Ford","GT40","2234TFC");
        
        System.out.println("La Marca es:"+p.getMiCoche().getMarca());
        System.out.println("El Modelo es:"+p.getMiCoche().getModelo());
        System.out.println("La Matricula es:"+p.getMiCoche().getMatricula());
        
        System.out.println("La Marca con Constructor Puente es:"+p.getMarca());
        System.out.println("El Modelo con Constructor Puente es:"+p.getModelo());
    }    
}
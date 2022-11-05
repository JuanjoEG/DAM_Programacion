
package ejemplos.tramo08;

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
public class MetEstatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //LLAMANDO A M�TODO EST�TICO
        Persona.saludarEstatico();
        
        Persona per1 = new Persona ("Lucia","L�pez", 26);
        
        //LLAMANDO A UN M�TODO DE OBJETO
        per1.saludarObjeto();
        
        //LLAMANDO AL M�TODO TOSTRING
        System.out.println(per1);
        
        //USANDO LOS GETTERS
        System.out.println("USANDO LOS getters DESDE EL main");
        System.out.println(per1.getApellidos()+" "+per1.getNombre());
        System.out.println("");
    }
}
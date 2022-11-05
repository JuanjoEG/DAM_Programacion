
package ejemplos.tramo08;

import Clases.Persona;

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
public class MetEstatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //LLAMANDO A MÉTODO ESTÁTICO
        Persona.saludarEstatico();
        
        Persona per1 = new Persona ("Lucia","López", 26);
        
        //LLAMANDO A UN MÉTODO DE OBJETO
        per1.saludarObjeto();
        
        //LLAMANDO AL MÉTODO TOSTRING
        System.out.println(per1);
        
        //USANDO LOS GETTERS
        System.out.println("USANDO LOS getters DESDE EL main");
        System.out.println(per1.getApellidos()+" "+per1.getNombre());
        System.out.println("");
    }
}
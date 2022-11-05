
package ejemplos.tramo10;

import Clases.Alumno;
import Clases.Persona;
import Clases.Profesor;

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
public class ConstructoresHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // INSTANCIACIÓN DE OBJETOS
        Persona persona1 = new Persona ("Juan","López",36);
        Profesor persona2 = new Profesor (6342,"Manolo","Toro",63);
        Alumno persona3 = new Alumno (6,5,8,"Antonio","Perez",25);
        
        // LLAMADAS A LOS MÉTODOS SALUDAR
        persona1.saludar();
        persona2.saludar();
        persona3.saludar();
        
        // LLAMADAS A LOS MÉTODOS toString
        System.out.println(".......");
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }    
}

package ejemplos.tramo10;

import Clases.ClaseGenerica;

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
public class ClaseGenericaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int ent1 = 10;
        int ent2 = 25;
        String cad1 = "HOLA MUNDO BUENO.";
        String cad2 = "ADIOS MUNDO CRUEL.";
        double dec1 = -3.2;
        double dec2 = -9.5;
        boolean bol1 = true;
        boolean bol2 = false;
        
        ClaseGenerica<Integer> gen1 = new ClaseGenerica<>(ent1);
        ClaseGenerica<String> gen2 = new ClaseGenerica<>(cad1);
        ClaseGenerica<Double> gen3 = new ClaseGenerica<>(dec1);
        ClaseGenerica<Boolean> gen4 = new ClaseGenerica<>(bol1);
        
        // M�TODO GEN�RICO PARA MOSTRAR INFORMACI�N
        System.out.println(gen1.toString());
        System.out.println(gen2.toString());
        System.out.println(gen3.toString());
        System.out.println(gen4.toString());
        System.out.println("");
        
        // M�TODO GEN�RICO PARA MODIFICAR VARIABLES - M�TODOS SETTERS
        gen1.setDato(ent2);
        gen2.setDato(cad2);
        gen3.setDato(dec2);
        gen4.setDato(bol2);
        
        // M�TODO GEN�RICO PARA MOSTRAR INFORMACI�N - MODIFICADO
        System.out.println(gen1.toString());
        System.out.println(gen2.toString());
        System.out.println(gen3.toString());
        System.out.println(gen4.toString());
        System.out.println("");
        
        // M�TODO GEN�RICO QUE INTERCAMBIA VALORES
        gen1.intercambiar(ent1, ent2);
        gen2.intercambiar(cad1, cad2);
        gen3.intercambiar(dec1, dec2);
        gen4.intercambiar(bol1, bol2);
        
    }
}
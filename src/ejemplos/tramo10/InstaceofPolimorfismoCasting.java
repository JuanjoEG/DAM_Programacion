
package ejemplos.tramo10;

import Clases.Loro;
import Clases.Perro;
import Clases.Serpiente;
import Clases.Animal;

import java.util.ArrayList;

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
public class InstaceofPolimorfismoCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // POLIMORFISMO EST�TICO:
        Perro     animal_1 = new Perro    ("Boby");
        Serpiente animal_2 = new Serpiente("Kaathe");
        Loro      animal_3 = new Loro     ("Misi");
        // POLIMORFISMO DIN�MICO:
        // CASTING IMPL�CITO DE OBJETOS
        // CREAMOS UN OBJETO DE TIPO Animal Y DECIMOS QUE ES UNA INSTANCIA DE TIPO Perro, Loro O Serpiente.
        Animal    animal_4 = new Perro    ("Tulo");
        Animal    animal_5 = new Loro     ("Pilo");
        Animal    animal_6 = new Serpiente("Framp");
        
        // NO SE PUEDE HACER AL CONTRARIO POR LA JERARQU�A DE CLASES
        // Perro animal_7 = new Animal ("Lobato");
        // EN UN ARRAYLIST DE TIPO Animal ENTRAN LOS TIPOS Perro, Loro Y Serpiente.
        
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(animal_1);
        animales.add(animal_2);
        animales.add(animal_3);
        animales.add(animal_4);
        animales.add(animal_5);
        animales.add(animal_6);
        
        for(Animal ani : animales) {
            
            // CON instanceof SABREMOS SI UN OBJETO DEL TIPO Animal ES UNA INSTANCIA DE OTRO TIPO
            
            if( ani instanceof Perro ){
                System.out.println("El Perro "+ani.getNombre()+" dice.....");
                // AQU� ENTRA CUANDO SEA PERRO
                // CASTING EXPL�CITO ENTRE OBJETOS
                // LE DECIMOS QUE TRANSFORME EL OBJETO ani DEL TIPO Animal, AL TIPO Perro
                // NUESTRO OBJETO p TIPO Perro ES IGUAL AHORA AL OBJETO ani TIPO Perro
                Perro p = (Perro)ani;
                p.desplazarse();
            }
            if( ani instanceof Loro ){
                System.out.println("El Loro "+ani.getNombre()+" dice.....");
                // AQU� ENTRA CUANDO SEA LORO
                // CASTING EXPL�CITO ENTRE OBJETOS
                Loro p = (Loro)ani;
                p.desplazarse();
            }
            if( ani instanceof Serpiente ){
                System.out.println("La Serpiente "+ani.getNombre()+" dice.....");
                // AQU� ENTRA CUANDO SEA SERPIENTE
                // CASTING EXPL�CITO ENTRE OBJETOS
                Serpiente p = (Serpiente)ani;
                p.desplazarse();
            }
            if( ani instanceof Animal ){
                System.out.println("El Animal "+ani.getNombre()+" dice.....");
                // AQU� ENTRA SIEMPRE
                // CASTING EXPL�CITO ENTRE OBJETOS
                Animal p = (Animal)ani;
                p.desplazarse();
                System.out.println("");
            }
        }
    }
}
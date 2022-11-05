
package ejemplos.tramo08;

import Clases.Agenda;

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
public class MiAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           
                           DOS FORMAS DE COPIAR UN OBJETO:
                           
                           PRIMERO: USAMOS EL CONSTRUCTOR POR PARÁMETROS
                                    PARA LA CREACIÓN DE UN OBJETO DE LA CLASE agenda.
                           SEGUNDO: USAMOS LOS MÉTODOS OBSERVADORES - LOS GETTERS
                                    PARA LA CREACIÓN DE OTRO OBJETO DE LA CLASE agenda
                                    USANDO LOS VALORES DEL PRIMER OBJETO.
                           TERCERO: USAMOS EL CONSTRUCTOR COPIA
                                    PARA CREAR OTRO OBJETO DE LA CLASE agenda
                                    AL QUE LE PASAMOS UN OBJETO - LA PRIMERA agenda.
                           """);
        Agenda a1, a2, a3;
        
        a1 = new Agenda("Fotos", "Temas", "Dudas", "Tutorí­as", "Trabajos");
        
        a2 = new Agenda(a1.getLunes(), a1.getMartes(), a1.getMiercoles(), a1.getJueves(), a1.getViernes());
        
        a3 = new Agenda(a1);
        
        for (int i=1; i<6; i++){
            System.out.println("ESTAMOS USANDO UN MÉTODO PERSONALIZADO - MUESTRA UN DÍA DE LA AGENDA.");
            System.out.print("Primera Agenda dí­a "+i+" :");
            a1.mostrarDia(i);
            System.out.print("Segunda Agenda dí­a "+i+" :");
            a2.mostrarDia(i);
            System.out.print("Tercera Agenda dí­a "+i+" :");
            a3.mostrarDia(i);
            System.out.println("");
        }
        System.out.println("ESTAMOS USANDO EL MÉTODO toString, Primera Agenda.");
        System.out.println(a1);
        System.out.println("ESTAMOS USANDO EL MÉTODO toString, Segunda Agenda.");
        System.out.println(a2);
        System.out.println("ESTAMOS USANDO EL MÉTODO toString, Tercera Agenda.");
        System.out.println(a3);
        System.out.println("\nLAS TRES AGENDAS SERÁN IGUALES.\n");
    }
}
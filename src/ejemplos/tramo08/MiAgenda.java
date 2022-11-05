
package ejemplos.tramo08;

import Clases.Agenda;

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
public class MiAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           
                           DOS FORMAS DE COPIAR UN OBJETO:
                           
                           PRIMERO: USAMOS EL CONSTRUCTOR POR PAR�METROS
                                    PARA LA CREACI�N DE UN OBJETO DE LA CLASE agenda.
                           SEGUNDO: USAMOS LOS M�TODOS OBSERVADORES - LOS GETTERS
                                    PARA LA CREACI�N DE OTRO OBJETO DE LA CLASE agenda
                                    USANDO LOS VALORES DEL PRIMER OBJETO.
                           TERCERO: USAMOS EL CONSTRUCTOR COPIA
                                    PARA CREAR OTRO OBJETO DE LA CLASE agenda
                                    AL QUE LE PASAMOS UN OBJETO - LA PRIMERA agenda.
                           """);
        Agenda a1, a2, a3;
        
        a1 = new Agenda("Fotos", "Temas", "Dudas", "Tutor�as", "Trabajos");
        
        a2 = new Agenda(a1.getLunes(), a1.getMartes(), a1.getMiercoles(), a1.getJueves(), a1.getViernes());
        
        a3 = new Agenda(a1);
        
        for (int i=1; i<6; i++){
            System.out.println("ESTAMOS USANDO UN M�TODO PERSONALIZADO - MUESTRA UN D�A DE LA AGENDA.");
            System.out.print("Primera Agenda d�a "+i+" :");
            a1.mostrarDia(i);
            System.out.print("Segunda Agenda d�a "+i+" :");
            a2.mostrarDia(i);
            System.out.print("Tercera Agenda d�a "+i+" :");
            a3.mostrarDia(i);
            System.out.println("");
        }
        System.out.println("ESTAMOS USANDO EL M�TODO toString, Primera Agenda.");
        System.out.println(a1);
        System.out.println("ESTAMOS USANDO EL M�TODO toString, Segunda Agenda.");
        System.out.println(a2);
        System.out.println("ESTAMOS USANDO EL M�TODO toString, Tercera Agenda.");
        System.out.println(a3);
        System.out.println("\nLAS TRES AGENDAS SER�N IGUALES.\n");
    }
}
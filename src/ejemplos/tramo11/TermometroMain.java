
package ejemplos.tramo11;

import Clases.FueraRangoException;
import Clases.TermometroClass;
import java.util.InputMismatchException;
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
public class TermometroMain {
    
    public static void main(String[] args) {
        String menu, opcion;
        System.out.println("""
                           
                           FUNCIONAMIENTO DEL TERMÓMETRO: DE -20º A 90º.
                           PRUEBA A SALIR DEL RANGO RECOMENDADO.
                           """);
        do {       
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("\nTESTEO DE TEMPERATURA: ( S / N )");
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "N" -> {
                }
                case "S" -> {
                    try {
                        float temperatura=0;
                        TermometroClass termometro2 = new TermometroClass(temperatura);
                        Scanner   teclaFloat   = new Scanner(System.in);
                        System.out.print("\nIntroduce la Temperatura:  ");
                        temperatura = teclaFloat.nextFloat();
                        System.out.print("¿TERMOMETRO CREAR NUEVO O MODIFICAR EXISTENTE?  ( C / M )");
                        opcion = teclaStr.nextLine();
                        
                        if (null == opcion){
                            System.out.println("\nLa opción no es correcta.");
                        } else switch (opcion) {
                            case "C" -> {
                                TermometroClass termometro1 = new TermometroClass(temperatura);
                                termometro1.imprimir();
                                System.out.println(termometro1.toString());
                            }
                            case "M" -> {
                                termometro2.setTemperatura(temperatura);
                                termometro2.imprimir();
                                System.out.println(termometro2.toString());
                            }
                            default -> System.out.println("\nLa opción no es correcta.");
                        }
                    }
                    catch (FueraRangoException ex) {
                        System.out.println(ex.toString());
                    }
                    catch (InputMismatchException ex) {
                        System.out.println("ERROR: TIPO DE DATO INCORRECTO: "+ex.toString());
                    }
                }
                default -> System.out.println("\nLa opción no es correcta.");
            }
        } while (!"N".equals(menu));
    }
}
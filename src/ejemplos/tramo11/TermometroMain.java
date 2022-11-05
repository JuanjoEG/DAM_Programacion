
package ejemplos.tramo11;

import Clases.FueraRangoException;
import Clases.TermometroClass;
import java.util.InputMismatchException;
import java.util.Scanner;

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
public class TermometroMain {
    
    public static void main(String[] args) {
        String menu, opcion;
        System.out.println("""
                           
                           FUNCIONAMIENTO DEL TERM�METRO: DE -20� A 90�.
                           PRUEBA A SALIR DEL RANGO RECOMENDADO.
                           """);
        do {       
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("\nTESTEO DE TEMPERATURA: ( S / N )");
            System.out.print("Seleccione una opci�n: ");
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
                        System.out.print("�TERMOMETRO CREAR NUEVO O MODIFICAR EXISTENTE?  ( C / M )");
                        opcion = teclaStr.nextLine();
                        
                        if (null == opcion){
                            System.out.println("\nLa opci�n no es correcta.");
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
                            default -> System.out.println("\nLa opci�n no es correcta.");
                        }
                    }
                    catch (FueraRangoException ex) {
                        System.out.println(ex.toString());
                    }
                    catch (InputMismatchException ex) {
                        System.out.println("ERROR: TIPO DE DATO INCORRECTO: "+ex.toString());
                    }
                }
                default -> System.out.println("\nLa opci�n no es correcta.");
            }
        } while (!"N".equals(menu));
    }
}
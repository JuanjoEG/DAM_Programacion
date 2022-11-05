
package ejemplos.tramo11;

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
public class UsandoBloqueTryCatch {

    /**
     * @param dividendo
     * @param divisor
     * @return 
     */
    
    public static  double division(double dividendo, double divisor) throws ArithmeticException {
        
        double solucion;
        
        if (divisor !=0) {
            solucion = dividendo / divisor;
            return solucion;
        }else {
            throw new ArithmeticException("""
                                          
                                          El divisor no puede ser cero patatero.""");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("\nPRUEBA A DIVIDIR POR CERO Y A PONER LA EDAD MENOR A 18.\n");
        
        Scanner teclado_dbl = new Scanner(System.in);
        Scanner teclado_int = new Scanner(System.in);
        double numerador, denominador, solucion;
        int edad;
        
        // USO DE TRY-CATCH
        
        try { 
            
            System.out.print("Eliga numerador: ");
            numerador = teclado_dbl.nextDouble();
            System.out.print("Eliga denominador: ");
            denominador = teclado_dbl.nextDouble();        
            
            solucion = numerador/denominador;
            System.out.println("La división es: "+solucion);
            
        } catch (NullPointerException error) {
            
            System.out.println("""
                               NullPointerException en Java es una excepción en tiempo de ejecución. Java asigna 
                               un valor nulo especial a una referencia de objeto. Cuando un programa intenta usar 
                               una referencia de objeto establecida en el valor nulo, se lanza esta excepción. 
                               """+ error.toString());
            
        } catch (ArithmeticException error) {
            
            System.out.println("""
                               Las excepciones predefinidas, como ArithmeticException, se conocen como excepciones runtime. 
                               Actualmente, como todas las excepciones son eventos runtime, será mejor llamarlas excepciones irrecuperables. 
                               """+ error.toString());
            
        } catch (Exception error) {
            
            System.out.println("""
                               Lo lamento, se produjo un error. 
                               """+ error.toString());
        }
        
        
        // USO DE THROW
        
        try {
            
            System.out.print("Introduce la edad: ");
            edad = teclado_int.nextInt();
            
            if (edad<18){
            
                throw new Exception("""
                                    
                                    La persona ha de ser mayor de edad.
                                    """);
            }     
            
        } catch (Exception error) {
            
            System.out.println("""
                               Se produjo un Error: 
                               """+ error.toString());
        }
        
        // USO DE THROWS
        
        try {
            
            System.out.print("Eliga numerador: ");
            numerador = teclado_dbl.nextDouble();
            System.out.print("Eliga denominador: ");
            denominador = teclado_dbl.nextDouble();
        
            solucion = division(numerador, denominador);
            System.out.println("La división es: "+solucion);
            
        } catch (ArithmeticException e) {
            
            System.out.println("""
                               Ya tenemos un Error: 
                               """+ e.toString());
        }
    }
}
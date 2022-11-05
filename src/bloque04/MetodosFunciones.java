
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class MetodosFunciones {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    **************************************************************************
                    *           CLASES / MÉTODOS PERSONALIZADOS / FUNCIONES                  *
                    **************************************************************************
                    *  REALIZAN OPERACIONES NECESARIAS FUERA DE LOS MÉTODOS ANTERIORES.      *
                    *         LOS MÉTODOS QUE DEVUELVEN UN VALOR --> FUNCIONES.              *
                    **************************************************************************
                    * public class Persona {                                                 *
                    *       private static int multiplicar(int x, int y) {                   *
                    *             return x * y;                                              *
                    *       }                                                                *
                    * }                                                                      *
                    **************************************************************************
                    * 1. VISIBILIDAD. --> ESTÁNDAR=\"NADA\" / public / protected / private     *
                    * 2. ENLACE.      --> DINÁMICO=\"NADA\" / static                           *
                    * 3. TIPO DEVUELTO. --> int / String / boolean / ...                     *
                    * 4. NOMBRE DE LA FUNCIÓN.                                               *
                    *       ******************************************************************
                    *       *  USAR UN NOMBRE QUE DESCRIBA LA FUNCIONALIDA.                  *
                    *       *  USAR CAMEL CASE -->LA PRIMERA PALABRA EN MINÚSCULAS,          *
                    *       *      LAS DEMÁS PALABRAS CON LA PRIMERA LETRA EN MAYÚSCULA      *
                    *       *      Y NO USAR ESPACIOS ENTRE LAS PALABRAS.                    *
                    *       ******************************************************************
                    * 5. PARÁMETROS DE LA FUNCIÓN.                                           *
                    *       ******************************************************************                   
                    *       *  SE PUEDEN PASAR TANTOS PARÁMETROS COMO SE NECESITE.           *
                    *       ******************************************************************   
                    * 6. VALOR DEVUELTO. --> return ____;                                    *
                    *       ******************************************************************                   
                    *       *  LA FUNCIÓN SÓLO DEVUELVE UN VALOR.                            *
                    *       ******************************************************************
                    * 7. LLAMAR A UN MÉTODO.                                                 *
                    **************************************************************************
                    *  0. ATRÁS.                                                             *
                    **************************************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque04.Visibilidad.main(args);
                case "2" -> bloque04.MetodosEstaticos.main(args);
                case "3" -> bloque01.TiposDeDatos.main(args);
                case "4" -> System.out.println("""
                            
                                               
                                               
                                               
                            ******************************************************************
                            *  USAR UN NOMBRE QUE DESCRIBA LA FUNCIONALIDA.                  *
                            *  USAR CAMEL CASE -->LA PRIMERA PALABRA EN MINÚSCULAS,          *
                            *      LAS DEMÁS PALABRAS CON LA PRIMERA LETRA EN MAYÚSCULA      *
                            *      Y NO USAR ESPACIOS ENTRE LAS PALABRAS.                    *
                            ******************************************************************
                
                """);
                case "5" -> System.out.println("""
                                               
                                               
                                               
                                               
                                               
                            ******************************************************************                   
                            *  SE PUEDEN PASAR TANTOS PARÁMETROS COMO SE NECESITE.           *
                            ******************************************************************                   
                                               
                                               """);
                case "6" -> System.out.println("""
                            
                                               
                                               
                                               
                                               
                            ******************************************************************                   
                            *  LA FUNCIÓN SÓLO DEVUELVE UN VALOR.                            *
                            ******************************************************************
                                               
                """);
                case "7" -> bloque04.MetodosLlamar.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
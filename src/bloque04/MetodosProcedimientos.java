
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan JosÃ© EstÃ©vez GonzÃ¡lez
 */
public class MetodosProcedimientos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    **************************************************************************
                    *         CLASES / MÉTODOS PERSONALIZADOS / PROCEDIMIENTOS               *
                    *     LOS MÉTODOS QUE NO DEVUELVEN UN VALOR --> PROCEDIMIENTOS.          *
                    **************************************************************************
                    *  REALIZAN OPERACIONES NECESARIAS FUERA DE LOS MÉTODOS ANTERIORES.      *
                    **************************************************************************
                    * public class Persona {                                                 *
                    *       private static void multiplicar(int x, int y) {                  *
                    *             System.out.print (x * y);                                  *
                    *       }                                                                *
                    * }                                                                      *
                    **************************************************************************
                    * 1. VISIBILIDAD. --> ESTÁNDAR=\"NADA\" / public / protected / private     *
                    * 2. ENLACE.      --> DINÁMICO=\"NADA\" / static                           *
                    * 3. TIPO DEVUELTO. --> void --> NO DEVUELVEN NADA.                      *
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
                    * 6. VALOR DEVUELTO. --> NO DEVUELVEN NADA.                              *
                    *       ******************************************************************                   
                    *       *  EL PROCEDIMIENTO NO DEVUELVE NINGÚN VALOR.                    *
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
                            *  EL PROCEDIMIENTO NO DEVUELVE NINGÚN VALOR.                    *
                            ******************************************************************
                                               
                """);
                case "7" -> bloque04.MetodosLlamar.main(args);
                case "0" -> {
                }
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
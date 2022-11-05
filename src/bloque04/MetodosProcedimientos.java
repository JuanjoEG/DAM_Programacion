
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class MetodosProcedimientos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    **************************************************************************
                    *         CLASES / M�TODOS PERSONALIZADOS / PROCEDIMIENTOS               *
                    *     LOS M�TODOS QUE NO DEVUELVEN UN VALOR --> PROCEDIMIENTOS.          *
                    **************************************************************************
                    *  REALIZAN OPERACIONES NECESARIAS FUERA DE LOS M�TODOS ANTERIORES.      *
                    **************************************************************************
                    * public class Persona {                                                 *
                    *       private static void multiplicar(int x, int y) {                  *
                    *             System.out.print (x * y);                                  *
                    *       }                                                                *
                    * }                                                                      *
                    **************************************************************************
                    * 1. VISIBILIDAD. --> EST�NDAR=\"NADA\" / public / protected / private     *
                    * 2. ENLACE.      --> DIN�MICO=\"NADA\" / static                           *
                    * 3. TIPO DEVUELTO. --> void --> NO DEVUELVEN NADA.                      *
                    * 4. NOMBRE DE LA FUNCI�N.                                               *
                    *       ******************************************************************
                    *       *  USAR UN NOMBRE QUE DESCRIBA LA FUNCIONALIDA.                  *
                    *       *  USAR CAMEL CASE -->LA PRIMERA PALABRA EN MIN�SCULAS,          *
                    *       *      LAS DEM�S PALABRAS CON LA PRIMERA LETRA EN MAY�SCULA      *
                    *       *      Y NO USAR ESPACIOS ENTRE LAS PALABRAS.                    *
                    *       ******************************************************************
                    * 5. PAR�METROS DE LA FUNCI�N.                                           *
                    *       ******************************************************************                   
                    *       *  SE PUEDEN PASAR TANTOS PAR�METROS COMO SE NECESITE.           *
                    *       ******************************************************************
                    * 6. VALOR DEVUELTO. --> NO DEVUELVEN NADA.                              *
                    *       ******************************************************************                   
                    *       *  EL PROCEDIMIENTO NO DEVUELVE NING�N VALOR.                    *
                    *       ******************************************************************
                    * 7. LLAMAR A UN M�TODO.                                                 *
                    **************************************************************************
                    *  0. ATR�S.                                                             *
                    **************************************************************************
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque04.Visibilidad.main(args);
                case "2" -> bloque04.MetodosEstaticos.main(args);
                case "3" -> bloque01.TiposDeDatos.main(args);
                case "4" -> System.out.println("""
                            
                                               
                                               
                                               
                            ******************************************************************
                            *  USAR UN NOMBRE QUE DESCRIBA LA FUNCIONALIDA.                  *
                            *  USAR CAMEL CASE -->LA PRIMERA PALABRA EN MIN�SCULAS,          *
                            *      LAS DEM�S PALABRAS CON LA PRIMERA LETRA EN MAY�SCULA      *
                            *      Y NO USAR ESPACIOS ENTRE LAS PALABRAS.                    *
                            ******************************************************************
                
                """);
                case "5" -> System.out.println("""
                                               
                                               
                                               
                                               
                                               
                            ******************************************************************                   
                            *  SE PUEDEN PASAR TANTOS PAR�METROS COMO SE NECESITE.           *
                            ******************************************************************                   
                                               
                                               """);
                case "6" -> System.out.println("""
                            
                                               
                                               
                                               
                                               
                            ******************************************************************                   
                            *  EL PROCEDIMIENTO NO DEVUELVE NING�N VALOR.                    *
                            ******************************************************************
                                               
                """);
                case "7" -> bloque04.MetodosLlamar.main(args);
                case "0" -> {
                }
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
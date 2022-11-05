
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class MetodotoString {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                               
                    ***********************************************************************
                    *                      CLASES / M�TODOS TOSTRING                      *
                    ***********************************************************************
                    *  MUESTRA POR PANTALLA UN RESUMEN DE LOS VALORES DE SUS ATRIBUTOS    *
                    ***********************************************************************
                    *        @Override                                                    *
                    *        public String toString(){                                    *
                    *             String mensaje;                                         *
                    *             mensaje=\" MENSAJE \" + VARIABLES;                        *
                    *             return mensaje;                                         *
                    *        }                                                            *
                    ***********************************************************************
                    * public class Persona {                                              *
                    *        1.  ATRIBUTOS.  -->  SUS PROPIEDADES.                        *
                    *        2.  CONSTRUCTOR POR DEFECTO.                                 *
                    *        3.  CONSTRUCTOR POR PAR�METROS.                              *
                    *        4.  CONSTRUCTOR POR COPIA.                                   *
                    *        5.  M�TODOS GETTERS.                                         *
                    *        6.  M�TODOS SETTERS.                                         *
                    *            ...                                                      *
                    *        @Override                                                    *
                    *        public String toString(){                                    *
                    *            return \"Nombre: \"+nombre+\", Edad; \"+edad;                *
                    *        }                                                            *
                    *            ...                                                      *
                    *        8.  M�TODOS PERSONALIZADOS.                                  *
                    *               81.  M�TODOS PERSONALIZADOS.  -->  FUNCIONES.         *
                    *               82.  M�TODOS PERSONALIZADOS.  -->  PROCEDIMIENTOS.    *
                    *  }                                                                  *
                    ***********************************************************************
                    *  0. ATR�S.                                                          *
                    ***********************************************************************
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque04.Atributos.main(args);
                case "2" -> bloque04.ConstructorPorDefecto.main(args);
                case "3" -> bloque04.ConstructorPorParametros.main(args);
                case "4" -> bloque04.ConstructorPorCopia.main(args);
                case "5" -> bloque04.MetodosGetters.main(args);
                case "6" -> bloque04.MetodosSetters.main(args);
                case "7" -> bloque04.MetodotoString.main(args);
                case "8" -> bloque04.MetodosPersonalizados.main(args);
                case "81" -> bloque04.MetodosFunciones.main(args);
                case "82" -> bloque04.MetodosProcedimientos.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}

package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class AtributosEstaticos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    ***********************************************************************
                    *               CLASES / ATRIBUTOS / ATRIBUTOS ESTÁTICOS              *
                    ***********************************************************************
                    *            VARIABLES ESTÁTICAS O VARIABLES DE CLASE.                *
                    *  SON LAS PROPIEDADES QUE POSEE LA CLASE.                            *
                    *  ES UN VARIABLE QUE PERTENECE A LA CLASE Y NO AL OBJETO.            *
                    *  NO DEPENDEN DE NINGÚN OBJETO DE LA CLASE.                          *
                    *  ES COMPARTIDO POR TODOS LOS OBJETO DE LA CLASE.                    *
                    *  PARA DECLARAR UN ATRIBUTO ESTÁTICO USAMOS static.                  *
                    *  SE INICIALIZAN SOLO UNA VEZ.                                       *
                    *  UNA SOLA COPIA PARA SER COMPARTIDA POR TODOS LOS OBJETOS.          *
                    *  LOS ATRIBUTOS ESTÁTICO SON PÚBLICOS COMO LAS CLASES.               *
                    ***********************************************************************
                    * public class Persona {                                              *
                    *        private String nombre;                                       *
                    *        private String apellidos;                                    *
                    *        private Int edad;                                            *
                    *        public static int cantidad;                                  *
                    *        ...                                                          *
                    *        public Persona(String nombre, int edad) {                    *
                    *            this.nombre = nombre;                                    *
                    *            this edad = edad;                                        *
                    *            cantidad++;                                              *
                    *        }                                                            *
                    *        ...                                                          *
                    *        2.  CONSTRUCTOR POR DEFECTO.                                 *
                    *        3.  CONSTRUCTOR POR PARÁMETROS.                              *
                    *        4.  CONSTRUCTOR POR COPIA.                                   *
                    *        5.  MÉTODOS GETTERS.                                         *
                    *        6.  MÉTODOS SETTERS.                                         *
                    *        7.  MÉTODO TOSTRING                                          *
                    *        8.  MÉTODOS PERSONALIZADOS.                                  *
                    *               81.  MÉTODOS PERSONALIZADOS.  -->  FUNCIONES.         *
                    *               82.  MÉTODOS PERSONALIZADOS.  -->  PROCEDIMIENTOS.    *
                    *  }                                                                  *
                    ***********************************************************************
                    *  0. ATRÁS.                                                          *
                    ***********************************************************************
                              
                                """);
            System.out.print("Seleccione una opción: ");
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
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
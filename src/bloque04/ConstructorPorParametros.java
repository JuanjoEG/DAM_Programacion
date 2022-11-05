
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class ConstructorPorParametros {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    ***********************************************************************
                    *          CLASES / MÉTODOS / CONSTRUCTOR POR PARÁMETROS              *
                    ***********************************************************************
                    * PUEDEN LLEVAR TANTOS PARÁMETROS COMO ATRIBUTO TIENE LA CLASE.       *
                    * PODEMOS CREAR TANTOS COMO COMBINACIONES DE ATRIBUTOS HAYA.          *
                    ***********************************************************************
                    * LOS CONSTRUCTORES DEBEN DECLARARSE COMO PÚBLICOS.                   *
                    * SON LOS ENCARGADOS DE INICIALIZAR LOS OBJETOS DE LA CLASE.          *
                    * LOS CONSTRUCTORES SE LLAMAN IGUAL QUE LA CLASE.                     *
                    * LOS CONSTRUCTORES NO DEVOLVERÁN NINGÚN TIPO DE DATO.                *
                    * A LOS CONSTRUCTORES SE LES LLAMA CON EL OPERADOR new.               *
                    ***********************************************************************
                    * public class Persona {                                              *
                    *        1.  ATRIBUTOS.  -->  SUS PROPIEDADES.                        *
                    *        2.  CONSTRUCTOR POR DEFECTO.                                 *
                    *            ...                                                      *
                    *        public Persona(String nombre,String apellidos,int edad) {    *
                    *            this.nombre = nombre;                                    *
                    *            this apellidos = apellidos;                              *
                    *            this edad = edad;                                        *
                    *        }                                                            *
                    *            ...                                                      *
                    *        4.  CONSTRUCTOR POR COPIA.                                   *
                    *        5.  MÉTODOS GETTERS.                                         *
                    *        6.  MÉTODOS SETTERS.                                         *
                    *        7.  MÉTODO TOSTRING                                          *
                    *        8.  MÉTODOS PERSONALIZADOS.                                  *
                    *               81.  MÉTODOS PERSONALIZADOS.  -->  FUNCIONES.         *
                    *               82.  MÉTODOS PERSONALIZADOS.  -->  PROCEDIMIENTOS.    *
                    *  }                                                                  *
                    ***********************************************************************
                    *  this.nombre  -->  SE REFIERE AL ATRIBUTO DEL OBJETO DE LA CLASE.   *
                    *                    EL this. NO ES OBLIGATORIO SI USAMOS             *
                    *                    DIFERENTES NOMBRES.                              *
                    *  nombre  -->  SE REFIERE AL PARÁMETRO QUE SE LE PASE AL CONSTRUCTOR.*
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
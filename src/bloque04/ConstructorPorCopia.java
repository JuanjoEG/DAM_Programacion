
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class ConstructorPorCopia {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                               
                    ***********************************************************************
                    *          CLASES / M�TODOS / CONSTRUCTOR POR COPIA                   *
                    ***********************************************************************
                    * RECIBE COMO PAR�METRO UN OBJETO DE LA MISMA LA CLASE PARA CLONARLO. *
                    * S�LO PODEMOS TENER UN CONSTRUCTOR COPIA.                            *
                    ***********************************************************************
                    * LOS CONSTRUCTORES DEBEN DECLARARSE COMO P�BLICOS.                   *
                    * SON LOS ENCARGADOS DE INICIALIZAR LOS OBJETOS DE LA CLASE.          *
                    * LOS CONSTRUCTORES SE LLAMAN IGUAL QUE LA CLASE.                     *
                    * LOS CONSTRUCTORES NO DEVOLVER�N NING�N TIPO DE DATO.                *
                    * A LOS CONSTRUCTORES SE LES LLAMA CON EL OPERADOR new.               *
                    ***********************************************************************
                    * public class Persona {                                              *
                    *        1.  ATRIBUTOS.  -->  SUS PROPIEDADES.                        *
                    *        2.  CONSTRUCTOR POR DEFECTO.                                 *
                    *        3.  CONSTRUCTOR POR PAR�METROS.                              *
                    *                                                                     *
                    *        public Persona(Persona copia) {                              *
                    *            this.nombre = copia.nombre;                              *
                    *            this apellidos = copia.apellidos;                        *
                    *            this edad = copia.edad;                                  *
                    *        }                                                            *
                    *            ...                                                      *
                    *        5.  M�TODOS GETTERS.                                         *
                    *        6.  M�TODOS SETTERS.                                         *
                    *        7.  M�TODO TOSTRING                                          *
                    *        8.  M�TODOS PERSONALIZADOS.                                  *
                    *               81.  M�TODOS PERSONALIZADOS.  -->  FUNCIONES.         *
                    *               82.  M�TODOS PERSONALIZADOS.  -->  PROCEDIMIENTOS.    *
                    *  }                                                                  *
                    ***********************************************************************
                    *  this.nombre  -->   SE REFIERE AL ATRIBUTO DEL OBJETO DE LA CLASE.  *
                    *                     EL this. NO ES OBLIGATORIO.                     *
                    *  copia.nombre  -->  SE REFIERE AL PAR�METRO DEL OBJETO A COPIAR     *
                    *                     QUE SE LE PASA AL CONSTRUCTOR.                  *
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
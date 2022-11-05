
package bloque05;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class RelacionClasesHerencia {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                    *************************************************************************
                    *              RELACIÓN ENTRE CLASES / HERENCIA                         *
                    *************************************************************************
                    *  SE DA CUANO UNA CLASE SE APOYA EN OTRA CREANDO JERARQUÍA.            *
                    *************************************************************************
                    *  CLASE PADRE - SUPERCLASE. CEDE SUS ATRIBUTOS Y MÉTODOS.              *
                    *  CLASE HIJA - SUBCLASE. HEREDA ESOS ATRIBUTOS Y MÉTODOS.              *
                    *               Y AÑADE ALGUNA FUNCIONALIDAD A LA CLASE PADRE.          *
                    *               LOS GETTERS Y LOS SETTERS TAMBIÉN SE HEREDAN.           *
                    *************************************************************************
                    *  LOS MÉTODOS DE LA CLASE PADRE SE PUEDEN SOBREESCRIBIR EN LOS HIJOS.  *
                    *  INDICANDO  -->  @override                                            *
                    *  TENDRÁ  -->  MISMO NOMBRE, MISMO TIPO DEVUELTO Y MISMOS PARÁMETROS.  *
                    *  TENDRÁ  -->  DISTINTA FUNCIONALIDAD SEGÚN A QUÉ CLASE LLAME.         *
                    *************************************************************************
                    *  AL DEFINIR LOS CONSTRUCTORES DE LA CLASE HIJA  -->  ES OBLIGATORIO:  *
                    *  USAR super PARA LLAMAR AL CONSTRUCTOR DE LA CLASE PADRE.             *
                    *  PONER super EN LA PRIMERA LÍNEA DEL CONSTRUCTOR.                     *
                    *************************************************************************
                    *  LA CLASE HIJA SOLO PODRÁ USAR LA PARTE PÚBLICA DE LA CLASE PADRE.    *
                    *  PARA ACCEDER A LA PARTE PRIVADA --> NECESITA UN MÉTODO PUENTE.       *
                    *************************************************************************
                    *  MÉTODO PUENTE:                                                       *
                    *  CREAR UN MÉTODO PÚBLICO QUE NOS PERMITA USAR LA PARTE PRIVADA.       *
                    *  DESDE LA CLASE Alumno NO PODEMOS ACCEDER A edad DE LA CLASE Persona. *
                    *  EL MÉTODO PUENTE ABRE ESE CAMINO.                                    *
                    *************************************************************************
                    *  CLASE PADRE --> Persona.    /    CLASE HIJA --> Alumno.              *
                    *                                                                       *
                    *  public class Alumno extends Persona {                                *
                    *          private double nota;                        <--  ATRIBUTOS.  *
                    *                                                                       *
                    *          public Alumno(){           <--   CONSTRUCTOR POR DEFECTO.    *
                    *               super();                                                *
                    *               this.nota = 0;                                          *
                    *          }                                                            *
                    *                                                                       *
                    *          public Alumno(double nota){ <-- CONSTRUCTOR POR PARÁMETROS.  *
                    *               super(nombre, apellidos, edad);                         *
                    *               this.nota = 0;                                          *
                    *          }                                                            *
                    *                                                                       *
                    *          public int getEdad() {              <--  MÉTODO PUENTE.      *
                    *                return super.getEdad();                                *
                    *          }                                                            *
                    *  }                                                                    *
                    *************************************************************************
                    *  1. EL MÉTODO super / this.                                           *
                    *  2. SOBREESCRITURA DE MÉTODOS.                                        *
                    *  3. CLASES Y MÉTODOS ABSTRACTOS.                                      *
                    *************************************************************************
                    *  0. ATRÁS.                                                            *
                    *************************************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque05.MetodoSuper.main(args);
                case "2" -> bloque05.MetodosSobreescritura.main(args);
                case "3" -> bloque05.RelacionClasesAbstractas.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
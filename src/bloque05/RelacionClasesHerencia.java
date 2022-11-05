
package bloque05;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class RelacionClasesHerencia {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                    *************************************************************************
                    *              RELACI�N ENTRE CLASES / HERENCIA                         *
                    *************************************************************************
                    *  SE DA CUANO UNA CLASE SE APOYA EN OTRA CREANDO JERARQU�A.            *
                    *************************************************************************
                    *  CLASE PADRE - SUPERCLASE. CEDE SUS ATRIBUTOS Y M�TODOS.              *
                    *  CLASE HIJA - SUBCLASE. HEREDA ESOS ATRIBUTOS Y M�TODOS.              *
                    *               Y A�ADE ALGUNA FUNCIONALIDAD A LA CLASE PADRE.          *
                    *               LOS GETTERS Y LOS SETTERS TAMBI�N SE HEREDAN.           *
                    *************************************************************************
                    *  LOS M�TODOS DE LA CLASE PADRE SE PUEDEN SOBREESCRIBIR EN LOS HIJOS.  *
                    *  INDICANDO  -->  @override                                            *
                    *  TENDR�  -->  MISMO NOMBRE, MISMO TIPO DEVUELTO Y MISMOS PAR�METROS.  *
                    *  TENDR�  -->  DISTINTA FUNCIONALIDAD SEG�N A QU� CLASE LLAME.         *
                    *************************************************************************
                    *  AL DEFINIR LOS CONSTRUCTORES DE LA CLASE HIJA  -->  ES OBLIGATORIO:  *
                    *  USAR super PARA LLAMAR AL CONSTRUCTOR DE LA CLASE PADRE.             *
                    *  PONER super EN LA PRIMERA L�NEA DEL CONSTRUCTOR.                     *
                    *************************************************************************
                    *  LA CLASE HIJA SOLO PODR� USAR LA PARTE P�BLICA DE LA CLASE PADRE.    *
                    *  PARA ACCEDER A LA PARTE PRIVADA --> NECESITA UN M�TODO PUENTE.       *
                    *************************************************************************
                    *  M�TODO PUENTE:                                                       *
                    *  CREAR UN M�TODO P�BLICO QUE NOS PERMITA USAR LA PARTE PRIVADA.       *
                    *  DESDE LA CLASE Alumno NO PODEMOS ACCEDER A edad DE LA CLASE Persona. *
                    *  EL M�TODO PUENTE ABRE ESE CAMINO.                                    *
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
                    *          public Alumno(double nota){ <-- CONSTRUCTOR POR PAR�METROS.  *
                    *               super(nombre, apellidos, edad);                         *
                    *               this.nota = 0;                                          *
                    *          }                                                            *
                    *                                                                       *
                    *          public int getEdad() {              <--  M�TODO PUENTE.      *
                    *                return super.getEdad();                                *
                    *          }                                                            *
                    *  }                                                                    *
                    *************************************************************************
                    *  1. EL M�TODO super / this.                                           *
                    *  2. SOBREESCRITURA DE M�TODOS.                                        *
                    *  3. CLASES Y M�TODOS ABSTRACTOS.                                      *
                    *************************************************************************
                    *  0. ATR�S.                                                            *
                    *************************************************************************
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque05.MetodoSuper.main(args);
                case "2" -> bloque05.MetodosSobreescritura.main(args);
                case "3" -> bloque05.RelacionClasesAbstractas.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}

package bloque05;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class RelacionClasesComposicion {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                    ****************************************************************************
                    *             RELACI�N ENTRE CLASES / COMPOSICI�N                          *
                    ****************************************************************************
                    *  SE DA CUANDO UNA CLASE DECLARARA VARIABLES QUE SON                      *
                    *  OBJETOS DE OTRA CLASE.                                                  *
                    ****************************************************************************
                    *  public class Persona {                                                  *
                    *       private String nombre;                                             *
                    *       private Coche miCoche;                                             *
                    *  }                                                                       *
                    ****************************************************************************
                    *  EN EL CONSTRUCTOR POR DEFECTO:                                          *
                    *  public Persona() {                                                      *
                    *               this.nombre = \"\";                                          *
                    *               this.miCoche = new Coche();                                *
                    *  }                                                                       *
                    *  SE LLAMA AL CONSTRUCTOR POR DEFECTO DE LA OTRA CLASE.                   *
                    ****************************************************************************
                    *  EN EL CONSTRUCTOR POR PAR�METROS                                        *
                    *  public Persona(String nombre, Coche miCoche) {                          *
                    *               this.nombre = nombre;                                      *
                    *               this.miCoche = new Coche(miCoche);                         *
                    *  }                                                                       *
                    *  SE LLAMA AL CONSTRUCTOR COPIA DE LA OTRA CLASE.                         *
                    ****************************************************************************
                    *  EN EL CONSTRUCTOR POR PAR�METROS                                        *
                    *  public Persona(String nombre, String marca) {                           *
                    *               this.nombre = nombre;                                      *
                    *               this.miCoche = new Coche(marca);                           *
                    *  }                                                                       *
                    *  SE LLAMA AL CONSTRUCTOR POR PAR�METROS DE LA OTRA CLASE.                *
                    ****************************************************************************
                    *  EL M�TODO PUENTE                                                        *
                    *  public String getMarca() {                                              *
                    *               return this.miCoche.getMarca();                            *
                    *  }                                                                       *
                    *  LA CLASE Persona SOLO PODR� USAR LA PARTE P�BLICA DE LA CLASE Coche.    *
                    *  PARA ACCEDER A LA PARTE PRIVADA --> NECESITA UN M�TODO PUENTE.          *
                    *  CREAR UN M�TODO P�BLICO QUE NOS PERMITA USAR LA PARTE PRIVADA.          *
                    *  EL M�TODO PUENTE ABRE ESE CAMINO.                                       *
                    ****************************************************************************
                    *  0. ATR�S.                                                               *
                    ****************************************************************************
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
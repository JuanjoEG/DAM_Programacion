
package bloque05;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class RelacionClasesComposicion {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                    ****************************************************************************
                    *             RELACIÓN ENTRE CLASES / COMPOSICIÓN                          *
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
                    *  EN EL CONSTRUCTOR POR PARÁMETROS                                        *
                    *  public Persona(String nombre, Coche miCoche) {                          *
                    *               this.nombre = nombre;                                      *
                    *               this.miCoche = new Coche(miCoche);                         *
                    *  }                                                                       *
                    *  SE LLAMA AL CONSTRUCTOR COPIA DE LA OTRA CLASE.                         *
                    ****************************************************************************
                    *  EN EL CONSTRUCTOR POR PARÁMETROS                                        *
                    *  public Persona(String nombre, String marca) {                           *
                    *               this.nombre = nombre;                                      *
                    *               this.miCoche = new Coche(marca);                           *
                    *  }                                                                       *
                    *  SE LLAMA AL CONSTRUCTOR POR PARÁMETROS DE LA OTRA CLASE.                *
                    ****************************************************************************
                    *  EL MÉTODO PUENTE                                                        *
                    *  public String getMarca() {                                              *
                    *               return this.miCoche.getMarca();                            *
                    *  }                                                                       *
                    *  LA CLASE Persona SOLO PODRÁ USAR LA PARTE PÚBLICA DE LA CLASE Coche.    *
                    *  PARA ACCEDER A LA PARTE PRIVADA --> NECESITA UN MÉTODO PUENTE.          *
                    *  CREAR UN MÉTODO PÚBLICO QUE NOS PERMITA USAR LA PARTE PRIVADA.          *
                    *  EL MÉTODO PUENTE ABRE ESE CAMINO.                                       *
                    ****************************************************************************
                    *  0. ATRÁS.                                                               *
                    ****************************************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
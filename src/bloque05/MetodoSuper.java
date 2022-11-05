
package bloque05;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class MetodoSuper {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                      
                               
                               
                    ************************************************************************************************************
                    *                           MÉTODO    super  /  this                                                       *
                    ************************************************************************************************************
                    *  CUANDO USAS HERENCIA LOS CONSTRUCTORES DE LAS CLASES USAN...                                            *
                    *                                                                                                          *
                    *      super(ARGUMENTOS);  --> HACE REFERENCIA AL CONSTRUCTOR DE LA CLASE PADRE.                           *
                    *      this(ARGUMENTOS);   --> HACE REFERENCIA AL CONSTRUCTOR DE LA CLASE ACTUAL.                          *
                    *                                                                                                          *
                    *      this.ATRIBUTO;   --> HACE REFERENCIA AL ATRIBUTO DE LA CLASE ACTUAL.                                *
                    *      super.MÉTODO();  --> LLAMADA A UN MÉTODO DE LA CLASE PADRE.                                         *                                                                                                    *
                    *                                                                                                          *
                    ************************************************************************************************************
                    *                                                                                                          *
                    *   public class Archivo {                 --> CLASE PADRE.                                                *
                    *       private String nombre;                                                                             *
                    *       private String extension;          --> 3 ATRIBUTOS.                                                *
                    *       private String ruta;                                                                               *
                    *   }                                                                                                      *
                    *                                                                                                          *
                    *       public Archivo(String nombre, String extension) {  --> CONSTRUCTOR CON 2 PARÁMETROS.               *
                    *           this.nombre = nombre;                                                                          *
                    *           this.extension = extension;                                                                    *
                    *           this.ruta = "";                                                                                *
                    *       }                                                                                                  *
                    *                                                                                                          *
                    *       public Archivo(String nombre, String extension, String ruta) {  --> CONSTRUCTOR CON 3 PARÁMETROS.  *
                    *           this(nombre, extension);                                    --> HACE REFERENCIA AL CONSTRUCTOR *
                    *           this.ruta = ruta;                                               ACTUAL CON 2 PARÁMETROS.       *
                    *       }                                                                                                  *
                    *                                                                                                          *
                    ************************************************************************************************************
                    *     this.nombre             -->  HACE REFERENCIA AL ATRIBUTO nombre DE LA CLASE ACTUAL.                  *
                    *                 = nombre;   -->  HACE REFERENCIA AL ARGUMENTO QUE LE LLEGA AL CONSTRUCTOR, EL PARÁMETRO. *
                    ************************************************************************************************************
                    *                                                                                                          *
                    *   public class Imagen extends Archivo {        --> CLASE HIJA.                                           *
                    *       private Integer ancho;                                                                             *
                    *       private Integer alto;                    --> +2 ATRIBUTOS. (5 EN TOTAL)                            *
                    *                                                                                                          *
                    *   public Imagen(String nombre, String extension, String ruta) {       --> CONSTRUCTOR CON 3 PARÁMETROS.  *
                    *       super(nombre, extension, ruta);             --> HACE REFERENCIA AL CONSTRUCTOR DE LA CLASE PADRE.  *
                    *       this.ancho = 1920;                                                                                 *
                    *       this.alto = 1080;                                                                                  *
                    *   }                                                                                                      *
                    *                                                                                                          *
                    *   public Imagen(String nombre, String extension, String ruta, Integer ancho, Integer alto) {             *
                    *       super(nombre, extension, ruta);                                 --> HACE REFERENCIA AL CONSTRUCTOR *
                    *       this.ancho = ancho;                                                 PADRE CON 3 PARÁMETROS.        *
                    *       this.alto = alto;                                                                                  *
                    *   }                                                                                                      *
                    *                                                                                                          *
                    *   public Imagen(String nombre, String extension, String ruta, Dimension dimensiones) {                   *
                    *       this(nombre, extension, ruta, dimensiones.width, dimensiones.height);                              *
                    *   }                                                                                                      *
                    *                                                                                                          *
                    ************************************************************************************************************
                    *  1. EJEMPLO: USANDO this / super                                                                         *
                    ************************************************************************************************************
                    *  0. ATRÁS.                                                                                               *
                    ************************************************************************************************************
                               
                               """);
                               
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> ejemplos.tramo12.UsandoThisSuper.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
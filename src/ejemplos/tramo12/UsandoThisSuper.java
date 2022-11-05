
package ejemplos.tramo12;

import Clases.Archivo;
import Clases.Imagen;
import java.awt.Dimension;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class UsandoThisSuper {
    
    public static void main(String[] args) {
        
        System.out.println("\nCREAMOS archivo1 SIN PAR�METROS --> CONSTRUCTOR POR DEFECTO:");
        Archivo archivo1 = new Archivo();
        System.out.println(archivo1.toString());

        System.out.println("\nCREAMOS archivo2 CON 1 PAR�METROS --> CONSTRUCTO CON 1 ARGUMENTO: lista_compra ");
        Archivo archivo2= new Archivo("lista_compra");
        System.out.println(archivo2.toString());

        System.out.println("\nCREAMOS archivo3 CON 2 PAR�METROS --> CONSTRUCTO CON 2 ARGUMENTO: lista_compra, doc ");
        Archivo archivo3 = new Archivo("lista_compra", "doc");
        System.out.println(archivo3.toString());

        System.out.println("\nCREAMOS archivo4 CON 3 PAR�METROS --> CONSTRUCTO CON 3 ARGUMENTO: lista_compra, doc, /home/ivan/Documents/ ");
        Archivo archivo4 = new Archivo("lista_compra", "doc", "/home/usuario/Documents/");
        System.out.println(archivo4.toString());

        System.out.println("\nCREAMOS imagen1 CON 3 PAR�METROS  ");
        Archivo imagen1 = new Imagen("foto", "png", "/home/usuario/Documents/Proyecto/");
        System.out.println(imagen1.toString());

        System.out.println("\nCREAMOS imagen2 CON 5 PAR�METROS  ");
        Archivo imagen2 = new Imagen("casa", "png", "/home/usuario/Documents/Proyecto/", 2500, 4000);
        System.out.println(imagen2.toString());

        System.out.println("\nCREAMOS imagen3 CON 4 PAR�METROS  ");
        Dimension dimensiones = new Dimension(300, 50);
        Imagen imagen3 = new Imagen("logo", "svg", "/home/usuario/Documents/Proyecto/", dimensiones);
        System.out.println(imagen3.toString());
        
        System.out.println("""
                           
                        ***********************************************************************   
                        *   VER LAS CLASES Imagen Y Archivo.                                  *
                        *                                                                     *
                        *        CLASE PADRE --> Archivo                                      *
                        *        CLASE HIJA  --> Imagen                                       *
                        *                                                                     *
                        *   EN LA CLASE Archivo LOS CONSTRUCTORES EST�N CADA UNO              *
                        *   REFERIDO AL ANTERIOR USANDO this(ARGUMENTOS); .                   *
                        *                                                                     *
                        *   EN LA CLASE Imagen SE USA super(ARGUMENTOS) PARA REFERIRSE        *
                        *   AL CONSTRUCTOR DE LA CLASE PADRE Archivo.                         *
                        *                                                                     *
                        *   SE USA super EN EL M�TODO toString DE LA CLASE Imagen PARA        *
                        *   COMPLEMENTAR EL M�TODO toString DE LA CLSE Archivo.               *
                        *                                                                     *
                        *   this   --> REFERIDO A LA CLASE ACTUAL.                            *
                        *   super  --> REFERIDO A LA CLASE PADRE.                             *
                        *                                                                     *
                        *   SI USAMOS PUNTO NOS REFERIMOS A UN ATRIBUTO.                      *
                        *   SI USAMOS PAR�NTESIS NOS REFERIMOS A LOS ARGUMENTOS               *
                        *   DE UN CONSTRUCTOR.                                                *
                        ***********************************************************************  
                           """);
    
    }     
}
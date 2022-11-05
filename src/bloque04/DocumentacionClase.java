
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class DocumentacionClase {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    ***************************************************************************
                    *                CLASES / DOCUMENTACIÓN DE UNA CLASE                      *
                    *         DOXYGEN --> DOX(DOCUMENTOS) Y GEN(GENERADOR)                    *
                    ***************************************************************************
                    *  TODO EL CÓDIGO DE DOCUMENTACIÓN DOXYGEN.       --> ENTRE  /**  Y  */   *
                    *  TODOS LOS MÉTODOS TIENEN QUE DOCUMENTARSE.     --> ENTRE  /**  Y  */   *
                    *  TODOS LAS EXCEPCIONES TIENEN QUE DOCUMENTARSE. --> ENTRE  /**  Y  */   *
                    ***************************************************************************
                    * PARA DOCUMENTAR LAS CLASES USAMOS LAS ETIQUETAS:                        *
                    *       @version                                                          *
                    *       @author                                                           *
                    ***************************************************************************
                    * PARA DOCUMENTAR LOS MÉTODOS USAMOS LAS ETIQUETAS:                       *
                    *       @param                                                            *
                    *       @returm                                                           *
                    *       @deprecated                                                       *
                    *       @see                                                              *
                    *       @throws                                                           *
                    ***************************************************************************
                    * EN APACHE NETBEANS:                                                     *
                    *       MENÚ RUN --> GENERATE JAVADOC                                     *
                    ***************************************************************************
                    * SE CREA:  DIST / JAVADOC / index.html    (TODA LA DOCUMENTACIÓN)        *
                    ***************************************************************************
                    *  0. ATRÁS.                                                              *
                    ***************************************************************************
                               
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
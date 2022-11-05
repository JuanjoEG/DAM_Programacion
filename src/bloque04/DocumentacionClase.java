
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class DocumentacionClase {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    ***************************************************************************
                    *                CLASES / DOCUMENTACI�N DE UNA CLASE                      *
                    *         DOXYGEN --> DOX(DOCUMENTOS) Y GEN(GENERADOR)                    *
                    ***************************************************************************
                    *  TODO EL C�DIGO DE DOCUMENTACI�N DOXYGEN.       --> ENTRE  /**  Y  */   *
                    *  TODOS LOS M�TODOS TIENEN QUE DOCUMENTARSE.     --> ENTRE  /**  Y  */   *
                    *  TODOS LAS EXCEPCIONES TIENEN QUE DOCUMENTARSE. --> ENTRE  /**  Y  */   *
                    ***************************************************************************
                    * PARA DOCUMENTAR LAS CLASES USAMOS LAS ETIQUETAS:                        *
                    *       @version                                                          *
                    *       @author                                                           *
                    ***************************************************************************
                    * PARA DOCUMENTAR LOS M�TODOS USAMOS LAS ETIQUETAS:                       *
                    *       @param                                                            *
                    *       @returm                                                           *
                    *       @deprecated                                                       *
                    *       @see                                                              *
                    *       @throws                                                           *
                    ***************************************************************************
                    * EN APACHE NETBEANS:                                                     *
                    *       MEN� RUN --> GENERATE JAVADOC                                     *
                    ***************************************************************************
                    * SE CREA:  DIST / JAVADOC / index.html    (TODA LA DOCUMENTACI�N)        *
                    ***************************************************************************
                    *  0. ATR�S.                                                              *
                    ***************************************************************************
                               
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
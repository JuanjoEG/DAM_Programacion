
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class PrimerosPasos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                                                   
                               
                    ***********************************************************
                    *                     PRIMEROS PASOS                      *
                    ***********************************************************
                    * DESCARGAR / INSTALAR  -->  OpenJDK                      *
                    ***********************************************************
                    * PROPIEDADES DEL SISTEMA:                                *
                    *   EDITAR LAS VARIABLES DE ENTORNO                       *
                    *                                                         *
                    *     VARIABLES DEL SISTEMA:                              *
                    *        JAVA_HOME  -->  C:\\Program Files\\Java\\jdk-18.0.2 *
                    *                                                         *
                    *     VARIABLES DE USUARIO PARA ...                       *
                    *        EDITAR Path:                                     *
                    *              %JAVA_HOME%\\bin                            *
                    ***********************************************************
                    * EN EL CMD ESCRIBIR...                                   *
                    *                 java -version                           *
                    ***********************************************************
                    *          IDES RECOMENDADOS:                             *
                    *   DESCARGAR / INSTALAR  -->   Apache NetBeans           *
                    *   DESCARGAR / INSTALAR  -->   IntelliJ                  *
                    *                                                         *
                    ***********************************************************
                    
                    ***********************************************************
                    * 0. ATR�S.                                               *
                    ***********************************************************
                               
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
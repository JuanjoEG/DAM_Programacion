
package bloque05;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class ClasesGenericas {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                    
                    
                    
                    
                    *************************************************************************
                    *      RELACI�N ENTRE CLASES / CLASES GEN�RICAS / TIPOS GEN�RICOS       *
                    *************************************************************************
                    *  PERMITE CREAR FUNCIONALIDADES DONDE PODAMOS ELEGIR EL TIPO DE DATO.  *
                    *  PERMITE CREAR PLANTILLA DE FUNCIONALIDADES.                          *
                    *  EL TIPO DE DATO VENDR� DADO POR UN PAR�METRO.                        *
                    *************************************************************************
                    *          TIPOS ENVOLTORIO O WRAPPER:                                  *
                    *          EQUIVALENTES A LOS TIPOS PRIMITIVOS PERO COMO OBJETOS.       *
                    *   byte  -->  Byte        long   --> Long       char    --> Character  *
                    *   short -->  Short       float  --> Float      boolean --> Boolean    *
                    *   int   -->  Integer     double --> Double                            *
                    *   TIPOS DE LA BIBLIOTECA DE JAVA --> String, Scanner, ArrayList...    *
                    *************************************************************************
                    *  1. EJEMPLO CLASES GEN�RICAS.                                         *
                    *************************************************************************
                    *  0. ATR�S.                                                            *
                    *************************************************************************
            
            """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                case "1" -> ejemplos.tramo10.ClaseGenericaMain.main(args);
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
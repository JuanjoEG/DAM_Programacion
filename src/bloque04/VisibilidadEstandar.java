
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class VisibilidadEstandar {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                    
                    
                    
                    
                    ************************************************************
                    *      VISIBILIDAD ESTANDAR DE LOS OBJETOS DE UNA CLASE    *
                    ************************************************************
                    * ACCESO DESDE LA PROPIA CLASE                    -->  SI  *
                    * ACCESO DESDE OTRAS CLASES DEL MISMO PAQUETE     -->  SI  *
                    * ACCESO DESDE UNA SUBCLASE EN EL MISMO PAQUETE   -->  SI  *
                    * ACCESO DESDE UNA SUBCLASE EN OTROS PAQUETES     -->  NO  *
                    * ACCESO DESDE OTRAS CLASES EN OTROS PAQUETES     -->  NO  *
                    ************************************************************
                    *  0. ATR�S.                                               *
                    ************************************************************
                    
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
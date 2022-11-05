
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class VisibilidadPublico {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                    
                    
                    
                    
                    ************************************************************
                    *      VISIBILIDAD PÚBLICO DE LOS OBJETOS DE UNA CLASE     *
                    ************************************************************
                    * ACCESO DESDE LA PROPIA CLASE                    -->  SI  *
                    * ACCESO DESDE OTRAS CLASES DEL MISMO PAQUETE     -->  SI  *
                    * ACCESO DESDE UNA SUBCLASE EN EL MISMO PAQUETE   -->  SI  *
                    * ACCESO DESDE UNA SUBCLASE EN OTROS PAQUETES     -->  SI  *
                    * ACCESO DESDE OTRAS CLASES EN OTROS PAQUETES     -->  SI  *
                    ************************************************************
                    *  0. ATRÁS.                                               *
                    ************************************************************
                    
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
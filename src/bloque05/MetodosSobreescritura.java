
package bloque05;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class MetodosSobreescritura {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                      
                               
                               
                    *****************************************************************************************
                    *           RELACIÓN ENTRE CLASES / SOBREESCRITURA DE MÉTODOS                           *
                    *****************************************************************************************
                    *                                                                                       *
                    *  LA SOBREESCRITURA DE MÉTODOS ES UNA CARACTERÍSTICA DE LA HERENCIA.                   *
                    *  LAS CLASES HIJAS HEREDAN LOS MÉTODOS DE LA CLASE PADRE.                              *
                    *                                                                                       *
                    *  SI NECESITAMOS QUE EL COMPORTAMIENTO DE UN MÉTODO DE LA CLASE PADRE SEA              *
                    *  DIFERENTE PARA LOS OBJETOS DE LA CLASE HIJA --> HAY QUE SOBREESCRIBIR EL MÉTODO.     *
                    *                                                                                       *
                    *  SE REQUIERE:                                                                         *
                    *           SE USA LA ANOTACIÓN  -->   @Override                                        *
                    *           CREAR EL MÉTODO EN LA CLASE HIJA.                                           *
                    *           USAR EL MISMO NOMBRE DEL MÉTODO DE LA CLASE PADRE.                          *
                    *           USAR EL MISMO TIPO DE RETORNO.                                              *
                    *           USAR LA MISMA LISTA DE ARGUMENTOS.                                          *
                    *                                                                                       *
                    * EN CASO DE NO CUMPLIR CON EL ÚLTIMO REQUISITO SERÍA SOBRECARGA DEL MÉTODO.            *
                    *****************************************************************************************
                    *  0. ATRÁS.                                                                            *
                    *****************************************************************************************
                               
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
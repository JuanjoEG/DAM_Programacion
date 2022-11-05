
package bloque05;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class MetodosSobreescritura {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                      
                               
                               
                    *****************************************************************************************
                    *           RELACI�N ENTRE CLASES / SOBREESCRITURA DE M�TODOS                           *
                    *****************************************************************************************
                    *                                                                                       *
                    *  LA SOBREESCRITURA DE M�TODOS ES UNA CARACTER�STICA DE LA HERENCIA.                   *
                    *  LAS CLASES HIJAS HEREDAN LOS M�TODOS DE LA CLASE PADRE.                              *
                    *                                                                                       *
                    *  SI NECESITAMOS QUE EL COMPORTAMIENTO DE UN M�TODO DE LA CLASE PADRE SEA              *
                    *  DIFERENTE PARA LOS OBJETOS DE LA CLASE HIJA --> HAY QUE SOBREESCRIBIR EL M�TODO.     *
                    *                                                                                       *
                    *  SE REQUIERE:                                                                         *
                    *           SE USA LA ANOTACI�N  -->   @Override                                        *
                    *           CREAR EL M�TODO EN LA CLASE HIJA.                                           *
                    *           USAR EL MISMO NOMBRE DEL M�TODO DE LA CLASE PADRE.                          *
                    *           USAR EL MISMO TIPO DE RETORNO.                                              *
                    *           USAR LA MISMA LISTA DE ARGUMENTOS.                                          *
                    *                                                                                       *
                    * EN CASO DE NO CUMPLIR CON EL �LTIMO REQUISITO SER�A SOBRECARGA DEL M�TODO.            *
                    *****************************************************************************************
                    *  0. ATR�S.                                                                            *
                    *****************************************************************************************
                               
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
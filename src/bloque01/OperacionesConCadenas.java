
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class OperacionesConCadenas {
    
    public static void main(String[] args) {
        
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                              
                    
                    
                    
                    
                    *****************************************************************************************
                    *          OPERACIONES CON CADENAS DE CARACTERES / M�TODOS DE LA CLASE String           *
                    *****************************************************************************************
                    * CADENA.length()                  -->  LONGITUD DE LA CADENA.                          *
                    * CADENA.trim()                    -->  DEVUELVE String SIN ESPACIOS A LOS LADOS.       *
                    * CADENA.indexOf('CARACTER')       -->  POSICI�N DE LA 1� APARICI�N DEL CARACTER.       *
                    * CADENA.lasIndexOf('CARACTER')    -->  POSICI�N DE LA �LTIMA APARICI�N DEL CARACTER.   *
                    * CADENA.charAt(n)                 -->  CARACTER EN POSICI�N n.                         *
                    * CADENA.substring(n1,n2)          -->  SUBCADENA ENTRE n1 Y n2.                        *
                    * CADENA.toUpperCase()             -->  DEVUELVE String EN MAY�SCULAS.                  *
                    * CADENA.toLowerCase()             -->  DEVUELVE String EN MIN�SCULAS.                  *
                    * CADENA.equals(CADENA2)           -->  COMPARA DOS CADENAS. true SI SON IGUALES        *
                    * CADENA.equalsIgnoreCase(CADENA2) -->  equals SIN CONSIDERAR MAY�SCULAS Y MIN�SCULAS.  *
                    * CADENA.compareTo(OtroString)     -->   0 SI SON IGUALES.                              *
                    *                               <0 SI LA 1� ES MENOR.  (ALFAB�TICAMENTE)                *
                    *                               >0 SI LA 1� ES MAYOR.  (ALFAB�TICAMENTE)                *
                    * CADENA.compareToIgnoreCase(OtroString)  --> SIN CONSIDERAR MAY�SCULAS Y MIN�SCULAS.   *
                    * CADENA.valueOf(n)                -->  CONVIERTE EL VALOR n A String.                  *
                    * CADENA.replace(char char1, char char2)  --> REEMPLAZA EN String QUE INVOCA EL M�TODO. *
                    *                                             TODOS LOS char1 POR LOS char2.            *
                    * CADENA.replaceAll(String string1, String string2)  --> REEMPLAZA EN String            *
                    *                                   TODAS LAS SUBCADENAS string1 POR string2.           *
                    * CADENA.replaceFirst(String string1, String string2)  --> REEMPLAZA EN String          *
                    *                   LA PRIMERA APARICI�N DE LA SUBCADENA string1 POR string2.           *
                    *****************************************************************************************
                    * 0. ATR�S.                                                                             *
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
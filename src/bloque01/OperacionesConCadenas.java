
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class OperacionesConCadenas {
    
    public static void main(String[] args) {
        
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                              
                    
                    
                    
                    
                    *****************************************************************************************
                    *          OPERACIONES CON CADENAS DE CARACTERES / MÉTODOS DE LA CLASE String           *
                    *****************************************************************************************
                    * CADENA.length()                  -->  LONGITUD DE LA CADENA.                          *
                    * CADENA.trim()                    -->  DEVUELVE String SIN ESPACIOS A LOS LADOS.       *
                    * CADENA.indexOf('CARACTER')       -->  POSICIÓN DE LA 1ª APARICIÓN DEL CARACTER.       *
                    * CADENA.lasIndexOf('CARACTER')    -->  POSICIÓN DE LA ÚLTIMA APARICIÓN DEL CARACTER.   *
                    * CADENA.charAt(n)                 -->  CARACTER EN POSICIÓN n.                         *
                    * CADENA.substring(n1,n2)          -->  SUBCADENA ENTRE n1 Y n2.                        *
                    * CADENA.toUpperCase()             -->  DEVUELVE String EN MAYÚSCULAS.                  *
                    * CADENA.toLowerCase()             -->  DEVUELVE String EN MINÚSCULAS.                  *
                    * CADENA.equals(CADENA2)           -->  COMPARA DOS CADENAS. true SI SON IGUALES        *
                    * CADENA.equalsIgnoreCase(CADENA2) -->  equals SIN CONSIDERAR MAYÚSCULAS Y MINÚSCULAS.  *
                    * CADENA.compareTo(OtroString)     -->   0 SI SON IGUALES.                              *
                    *                               <0 SI LA 1ª ES MENOR.  (ALFABÉTICAMENTE)                *
                    *                               >0 SI LA 1ª ES MAYOR.  (ALFABÉTICAMENTE)                *
                    * CADENA.compareToIgnoreCase(OtroString)  --> SIN CONSIDERAR MAYÚSCULAS Y MINÚSCULAS.   *
                    * CADENA.valueOf(n)                -->  CONVIERTE EL VALOR n A String.                  *
                    * CADENA.replace(char char1, char char2)  --> REEMPLAZA EN String QUE INVOCA EL MÉTODO. *
                    *                                             TODOS LOS char1 POR LOS char2.            *
                    * CADENA.replaceAll(String string1, String string2)  --> REEMPLAZA EN String            *
                    *                                   TODAS LAS SUBCADENAS string1 POR string2.           *
                    * CADENA.replaceFirst(String string1, String string2)  --> REEMPLAZA EN String          *
                    *                   LA PRIMERA APARICIÓN DE LA SUBCADENA string1 POR string2.           *
                    *****************************************************************************************
                    * 0. ATRÁS.                                                                             *
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
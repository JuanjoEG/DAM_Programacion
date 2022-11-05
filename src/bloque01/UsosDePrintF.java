
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class UsosDePrintF {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    ************************************************************************************
                    *                    SALIDA POR PANTALLA / USOS DE printf                          *
                    ************************************************************************************
                    * printf(String De Formato, Object... datos);                                      *
                    ************************************************************************************
                    * SINTAXIS PARA LOS ESPECIFICADORES DE FORMATO                                     *
                    * %[posición_dato$][indicador_de_formato][ancho][.precision]carácter_de_conversión *
                    ************************************************************************************
                    * POSICIÓN DE DATOS  -->    1$ --> PRIMERO    2$ --> SEGUNDO  ...                  *
                    ************************************************************************************
                    * INDICADOR DE FORMATO:                                                            *
                    *  -    -->    ALINEACIÓN A LA IZQUIERDA.                                          *
                    *  +    -->    MOSTRAR SIGNO + EN NÚMEROS POSITIVOS.                               *
                    *  (    -->    LOS NÚMEROS NEGATIVOS SE MUESTRAN ENTRE PARÉNTESIS.                 *
                    *  0    -->    RELLENAR CON CEROS.                                                 *
                    *  ,    -->    MUESTRA EL SEPARADOR DECIMAL.                                       *
                    ************************************************************************************
                    * ANCHO  -->    TAMAÑO MÍNIMO DE CARACTERES QUE OCUPA EL DATO EN PANTALLA.         *
                    ************************************************************************************
                    * PRECISIÓN  -->   NÚMERO DE DECIMALES REPRESENTADOS. SOLO float / double.         *
                    ************************************************************************************
                    * CARÁCTER DE CONVERSIÓN:                                                          *
                    *  d    -->    NÚMERO ENTERO EN BASE DECIMAL.                                      *
                    *  f    -->    NÚMERO REAL CON PUNTO FIJO.                                         *
                    *  E,e  -->    NÚMERO REAL NOTACIÓN CIENTÍFICA.                                    *
                    *  g    -->    NÚMERO REAL. NOTACIÓN CIENTÍFICA EN CASOS EXTREMOS.                 *
                    *  X,x  -->    NÚMERO ENTERO EN BASE HEXADECIMAL.                                  *
                    *  s    -->    String.                                                             *
                    *  S    -->    String EN MAYÚSCULAS.                                               *
                    *  C,c  -->    CARÁCTER UNICODE. C: EN MAYÚSCULAS.                                 *
                    ************************************************************************************
                    * 1. EJEMPLO USANDO printf.                                                        *
                    ************************************************************************************
                    * 0. ATRÁS.                                                                        *
                    ************************************************************************************
                    
                      """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> {
                    System.out.println("DIFERENTES USOS DE printf");
                    ejemplos.tramo05.UsandoPrintf.main(args);
                }
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
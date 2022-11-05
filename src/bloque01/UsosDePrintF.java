
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
                    * %[posici�n_dato$][indicador_de_formato][ancho][.precision]car�cter_de_conversi�n *
                    ************************************************************************************
                    * POSICI�N DE DATOS  -->    1$ --> PRIMERO    2$ --> SEGUNDO  ...                  *
                    ************************************************************************************
                    * INDICADOR DE FORMATO:                                                            *
                    *  -    -->    ALINEACI�N A LA IZQUIERDA.                                          *
                    *  +    -->    MOSTRAR SIGNO + EN N�MEROS POSITIVOS.                               *
                    *  (    -->    LOS N�MEROS NEGATIVOS SE MUESTRAN ENTRE PAR�NTESIS.                 *
                    *  0    -->    RELLENAR CON CEROS.                                                 *
                    *  ,    -->    MUESTRA EL SEPARADOR DECIMAL.                                       *
                    ************************************************************************************
                    * ANCHO  -->    TAMA�O M�NIMO DE CARACTERES QUE OCUPA EL DATO EN PANTALLA.         *
                    ************************************************************************************
                    * PRECISI�N  -->   N�MERO DE DECIMALES REPRESENTADOS. SOLO float / double.         *
                    ************************************************************************************
                    * CAR�CTER DE CONVERSI�N:                                                          *
                    *  d    -->    N�MERO ENTERO EN BASE DECIMAL.                                      *
                    *  f    -->    N�MERO REAL CON PUNTO FIJO.                                         *
                    *  E,e  -->    N�MERO REAL NOTACI�N CIENT�FICA.                                    *
                    *  g    -->    N�MERO REAL. NOTACI�N CIENT�FICA EN CASOS EXTREMOS.                 *
                    *  X,x  -->    N�MERO ENTERO EN BASE HEXADECIMAL.                                  *
                    *  s    -->    String.                                                             *
                    *  S    -->    String EN MAY�SCULAS.                                               *
                    *  C,c  -->    CAR�CTER UNICODE. C: EN MAY�SCULAS.                                 *
                    ************************************************************************************
                    * 1. EJEMPLO USANDO printf.                                                        *
                    ************************************************************************************
                    * 0. ATR�S.                                                                        *
                    ************************************************************************************
                    
                      """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> {
                    System.out.println("DIFERENTES USOS DE printf");
                    ejemplos.tramo05.UsandoPrintf.main(args);
                }
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
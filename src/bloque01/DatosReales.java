
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class DatosReales {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    *************************************
                    *     TIPOS DE DATOS / REALES       *
                    *         PUNTO FLOTANTE            *
                    *************************************
                    * float   -->   4 Bytes.            *
                    * double  -->   8 Bytes.            *
                    *************************************
                    * SE USA EL PUNTO, Y NO LA COMA     *
                    * PARA ASIGNAR UN VALOR DECIMAL.    *
                    *************************************
                    * TIPO IDENTIFICADOR;               *
                    * IDENTIFICADOR = VALOR;            *
                    *************************************
                    * TIPO IDENTIFICADOR = VALOR;       *
                    *************************************
                    * CON float SE A�ADE f AL VALOR.    *
                    *    float mialtura = 1.7f;         *
                    *************************************
                    * CON double SE A�ADE d (OPCI�N)    *
                    *    double mialtura = 1.7d;        *
                    *************************************
                    * LOS TIPOS PRIMITIVOS              *
                    * NO PUDEN VALER null.              *
                    *************************************
                    * LOS IDENTIFICADORES DE LAS        *
                    * VARIABLES EMPIEZAN CON MINUSCULAS *
                    *************************************
                    * 0. ATR�S.                         *
                    *************************************
                                                
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

package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class CreacionObjetos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    **************************************************************************************
                    *                         CLASES / CREACI�N DE OBJETOS                               *
                    **************************************************************************************
                    * TIPO IDENTIFICADOR;                                                                *
                    * IDENTIFICADOR = new CONSTRUCTOR;    -->  LLAMAMOS AL CONSTRUCTOR.                  *
                    **************************************************************************************
                    *                         DECLARACI�N DEL OBJETO:                                    *
                    *  Persona pers01;                                                                   *
                    *                         INSTANCI�N DEL OBJETO:                                     *
                    *  pers01 = new Persona();                             -->  CONSTRUCTOR POR DEFECTO. *
                    *                      DEFINIR LOS ATRIBUTOS DE OBJETOS:                             *
                    *  pers01.nombre = \" Juan Jos� \";                                                    *
                    *  pers01.edad = 50;                                                                 *
                    **************************************************************************************
                    *                         DECLARACI�N + INSTANCI�N DEL OBJETO:                       *
                    *  Persona pers01 = new Persona();                     -->  CONSTRUCTOR POR DEFECTO. *
                    *                         DEFINIR LOS ATRIBUTOS DE OBJETOS:                          *
                    *  pers01.nombre = \" Juan Jos� \";                                                    *
                    *  pers01.edad = 50;                                                                 *
                    **************************************************************************************
                    *                     DECLARACI�N + INSTANCI�N + DEFINIR LOS ATRIBUTOS:              *
                    *  Persona pers01 = new Persona(\"Juan Jos�\",50);    -->  CONSTRUCTOR POR PAR�METROS. *
                    **************************************************************************************
                    *                         DECLARACI�N DEL OBJETO:                                    *
                    *  Persona pers01;                                                                   *
                    *                         INSTANCI�N + DEFINIR LOS ATRIBUTOS:                        *
                    *  pers01 = new Persona(\"Juan Jos�\",50);            -->  CONSTRUCTOR POR PAR�METROS. *
                    **************************************************************************************
                    *                         DECLARACI�N DEL OBJETO:                                    *
                    *  Persona pers02;                                                                   *
                    *                         INSTANCI�N + DEFINIR LOS ATRIBUTOS:                        *
                    *  pers02 = new Persona(pers01);                         -->  CONSTRUCTOR POR COPIA. *
                    **************************************************************************************
                    *                     DECLARACI�N + INSTANCI�N + DEFINIR LOS ATRIBUTOS:              *
                    *  Persona pers02 = new Persona(pers01);                 -->  CONSTRUCTOR POR COPIA. *
                    **************************************************************************************
                    *  0. ATR�S.                                                                         *
                    **************************************************************************************
                               
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
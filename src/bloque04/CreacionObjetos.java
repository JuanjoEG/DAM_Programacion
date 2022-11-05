
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class CreacionObjetos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    **************************************************************************************
                    *                         CLASES / CREACIÓN DE OBJETOS                               *
                    **************************************************************************************
                    * TIPO IDENTIFICADOR;                                                                *
                    * IDENTIFICADOR = new CONSTRUCTOR;    -->  LLAMAMOS AL CONSTRUCTOR.                  *
                    **************************************************************************************
                    *                         DECLARACIÓN DEL OBJETO:                                    *
                    *  Persona pers01;                                                                   *
                    *                         INSTANCIÓN DEL OBJETO:                                     *
                    *  pers01 = new Persona();                             -->  CONSTRUCTOR POR DEFECTO. *
                    *                      DEFINIR LOS ATRIBUTOS DE OBJETOS:                             *
                    *  pers01.nombre = \" Juan José \";                                                    *
                    *  pers01.edad = 50;                                                                 *
                    **************************************************************************************
                    *                         DECLARACIÓN + INSTANCIÓN DEL OBJETO:                       *
                    *  Persona pers01 = new Persona();                     -->  CONSTRUCTOR POR DEFECTO. *
                    *                         DEFINIR LOS ATRIBUTOS DE OBJETOS:                          *
                    *  pers01.nombre = \" Juan José \";                                                    *
                    *  pers01.edad = 50;                                                                 *
                    **************************************************************************************
                    *                     DECLARACIÓN + INSTANCIÓN + DEFINIR LOS ATRIBUTOS:              *
                    *  Persona pers01 = new Persona(\"Juan José\",50);    -->  CONSTRUCTOR POR PARÁMETROS. *
                    **************************************************************************************
                    *                         DECLARACIÓN DEL OBJETO:                                    *
                    *  Persona pers01;                                                                   *
                    *                         INSTANCIÓN + DEFINIR LOS ATRIBUTOS:                        *
                    *  pers01 = new Persona(\"Juan José\",50);            -->  CONSTRUCTOR POR PARÁMETROS. *
                    **************************************************************************************
                    *                         DECLARACIÓN DEL OBJETO:                                    *
                    *  Persona pers02;                                                                   *
                    *                         INSTANCIÓN + DEFINIR LOS ATRIBUTOS:                        *
                    *  pers02 = new Persona(pers01);                         -->  CONSTRUCTOR POR COPIA. *
                    **************************************************************************************
                    *                     DECLARACIÓN + INSTANCIÓN + DEFINIR LOS ATRIBUTOS:              *
                    *  Persona pers02 = new Persona(pers01);                 -->  CONSTRUCTOR POR COPIA. *
                    **************************************************************************************
                    *  0. ATRÁS.                                                                         *
                    **************************************************************************************
                               
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
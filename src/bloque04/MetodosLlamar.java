
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class MetodosLlamar {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    **********************************************************************
                    *                 CLASES / LLAMAR A M�TODOS                          *
                    **********************************************************************
                    *     [VARIABLE=] NOMBOBJETO.NOMBMETODO([P�RAMETROS]);               *
                    **********************************************************************
                    *  LLAMAR A FUNCIONES:                                               *
                    *      VARIABLE= NOMBOBJETO.NOMBMETODO([P�RAMETROS]);                *
                    **********************************************************************
                    *  LLAMAR A PROCEDIMIENTOS:                                          *
                    *       NOMBOBJETO.NOMBMETODO([P�RAMETROS]);                         *
                    **********************************************************************
                    *  LLAMAR A FUNCIONES EST�TICAS:                                     *
                    *      VARIABLE= NOMBCLASE.NOMBMETODO([P�RAMETROS]);                 *
                    **********************************************************************
                    *  LLAMAR A PROCEDIMIENTOS EST�TICOS:                                *
                    *       NOMBCLASE.NOMBMETODO([P�RAMETROS]);                          *
                    **********************************************************************
                    *  LLAMAR A FUNCIONES EST�TICAS CREADAS EN LA CLASE PRINCIPAL:       *
                    *      VARIABLE= NOMBMETODO([P�RAMETROS]);                           *
                    **********************************************************************
                    *  LLAMAR A PROCEDIMIENTOS EST�TICOS CREADAS EN LA CLASE PRINCIPAL:  *
                    *       NOMBMETODO([P�RAMETROS]);                                    *
                    **********************************************************************
                    *  0. ATR�S.                                                         *
                    **********************************************************************
                               
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
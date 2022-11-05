
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class MetodosLlamar {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    **********************************************************************
                    *                 CLASES / LLAMAR A MÉTODOS                          *
                    **********************************************************************
                    *     [VARIABLE=] NOMBOBJETO.NOMBMETODO([PÁRAMETROS]);               *
                    **********************************************************************
                    *  LLAMAR A FUNCIONES:                                               *
                    *      VARIABLE= NOMBOBJETO.NOMBMETODO([PÁRAMETROS]);                *
                    **********************************************************************
                    *  LLAMAR A PROCEDIMIENTOS:                                          *
                    *       NOMBOBJETO.NOMBMETODO([PÁRAMETROS]);                         *
                    **********************************************************************
                    *  LLAMAR A FUNCIONES ESTÁTICAS:                                     *
                    *      VARIABLE= NOMBCLASE.NOMBMETODO([PÁRAMETROS]);                 *
                    **********************************************************************
                    *  LLAMAR A PROCEDIMIENTOS ESTÁTICOS:                                *
                    *       NOMBCLASE.NOMBMETODO([PÁRAMETROS]);                          *
                    **********************************************************************
                    *  LLAMAR A FUNCIONES ESTÁTICAS CREADAS EN LA CLASE PRINCIPAL:       *
                    *      VARIABLE= NOMBMETODO([PÁRAMETROS]);                           *
                    **********************************************************************
                    *  LLAMAR A PROCEDIMIENTOS ESTÁTICOS CREADAS EN LA CLASE PRINCIPAL:  *
                    *       NOMBMETODO([PÁRAMETROS]);                                    *
                    **********************************************************************
                    *  0. ATRÁS.                                                         *
                    **********************************************************************
                               
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
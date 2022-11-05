
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class MetodosEstaticos {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    ***********************************************************************
                    *                 CLASES / M�TODOS / M�TODOS EST�TICOS                *
                    ***********************************************************************
                    *  static[TIPOVUELTO/void] NOMBMETODO([PARAMETROS]){                  *
                    *            BLOQUE;                                                  *
                    *  }                                                                  *
                    ***********************************************************************
                    *            M�TODO EST�TICO O M�TODO DE CLASE.                       *
                    *  SON LOS M�TODOS QUE POSEE LA CLASE.                                *
                    *  ES UN M�TODO QUE PERTENECE A LA CLASE Y NO AL OBJETO.              *
                    *  NO DEPENDEN DE NING�N OBJETO DE LA CLASE.                          *
                    *  SE PUEDE Y SE DEBE LLAMAR USANDO EL NOMBRE DE LA CLASE.            *
                    *  PARA DECLARAR UN M�TODO EST�TICO USAMOS static.                    *
                    *  UN M�TODO EST�TICO PUEDE LLAMAR SOLO A OTROS M�TODOS EST�TICOS.    *
                    *  LOS M�TODOS EST�TICOS SON P�BLICOS COMO LAS CLASES.                *
                    *  LOS M�TODOS EST�TICOS PUEDEN USAR PAR�METOS.                       *
                    *  UN M�TODO EST�TICO NO PUEDE HACER REFERENCIA NI A this NI A super. *
                    ***********************************************************************
                    *  0. ATR�S.                                                          *
                    ***********************************************************************
                               
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
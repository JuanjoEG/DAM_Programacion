
package bloque06;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class NuevoProyecto {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                               ****************************************************************************
                               *                INTERFACES GR�FICAS / NUEVO PROYECTO                      *
                               ****************************************************************************
                               *             BIBLIOTECA SWING INTEGRADA EN LA JDK DE JAVA.                *
                               ****************************************************************************
                               *  PULSAR NUEVO PROYECTO --> Java With Ant --> Java Application --> Next.  *
                               *  DESMARCAR Create main Class --> SIN CLASE PRINCIP�L.                    *
                               *  LE PONEMOS NOMBRE Y LOCALIZACI�N --> Finish.                            *
                               *  EN defaul package --> BOT�N DERECHO --> New --> JFrame Form...          *
                               *  LE PONEMOS NOMBRE --> NUEVA CLASE QUE HEREDA DE javax.swing.Jframe      *
                               *  PULSAR EJECUTAR --> ASIGNAR main A NUESTRA VENTANA GR�FICA.             *
                               ****************************************************************************
                               *  0. ATR�S.                                                               *
                               ****************************************************************************
                               
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
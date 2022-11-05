
package bloque06;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class NuevoProyecto {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                               ****************************************************************************
                               *                INTERFACES GRÁFICAS / NUEVO PROYECTO                      *
                               ****************************************************************************
                               *             BIBLIOTECA SWING INTEGRADA EN LA JDK DE JAVA.                *
                               ****************************************************************************
                               *  PULSAR NUEVO PROYECTO --> Java With Ant --> Java Application --> Next.  *
                               *  DESMARCAR Create main Class --> SIN CLASE PRINCIPÁL.                    *
                               *  LE PONEMOS NOMBRE Y LOCALIZACIÓN --> Finish.                            *
                               *  EN defaul package --> BOTÓN DERECHO --> New --> JFrame Form...          *
                               *  LE PONEMOS NOMBRE --> NUEVA CLASE QUE HEREDA DE javax.swing.Jframe      *
                               *  PULSAR EJECUTAR --> ASIGNAR main A NUESTRA VENTANA GRÁFICA.             *
                               ****************************************************************************
                               *  0. ATRÁS.                                                               *
                               ****************************************************************************
                               
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
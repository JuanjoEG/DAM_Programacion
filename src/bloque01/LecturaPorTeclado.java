
package bloque01;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class LecturaPorTeclado {
    
    public static void main(String[] args) {
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""
                               
                               
                               
                               
                               
                    ************************************************************
                    *         LECTURA DE DATOS POR TECLADO                     *
                    ************************************************************
                    *  NECESITAMOS  -->  import java.util.Scanner;             *
                    ************************************************************
                    * Scanner   teclaStr   = new Scanner(System.in, "UTF-8");  *
                    *       ...teclaFloat...                                   *
                    *       ...teclaInt...                                     *
                    *       ...teclaDouble...                                  *
                    *       ...teclaBoolean...                                 *
                    *       ...teclaChar...                                    *
                    ************************************************************
                    *  String       mivariable;                                *
                    *  float...                                                *
                    *  int...                                                  *
                    *  double...                                               *
                    *  boolean...                                              *
                    *  char...                                                 *
                    ************************************************************
                    *      System.out.print(\"  ¿PREGUNTA?  \");                 *
                    ************************************************************
                    *  mivariable =         teclaStr.nextLine();               *
                    *                  ...teclaFloat.nextFloat();              *
                    *                    ...teclaInt.nextInt();                *
                    *                 ...teclaDouble.nextDouble();             *
                    *                ...teclaBoolean.nextBoolean();            *
                    *                   ...teclaChar.next().char(0);           *
                    ************************************************************
                    * 0. ATRÁS.                                                *
                    ************************************************************
                    
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
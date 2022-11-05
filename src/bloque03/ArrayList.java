
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class ArrayList {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    ********************************************************************************
                    *                             ARRAYLIST                                        *
                    ********************************************************************************
                    *              NECESITAMOS  -->  import java.util.ArrayList;                   *
                    *                                import java.util.List;                        *
                    ********************************************************************************
                    *             ArrayList<TIPO> NOMBRE = new ArrayList<TIPO>();                  *
                    *                List<String> NOMBRE = new ArrayList<>();                      *
                    ********************************************************************************
                    * int size()  -->  DEVUELVE NÚMERO DE ELEMENTOS.                               *
                    * add(Object ob)  -->  AÑADE ob AL FINAL. DEVUELVE true.                       *
                    * add(int pos, Object ob)  -->  INSERTA ob EN POSICIÓN pos.                    *
                    * Object get(int pos)  -->  DEVUELVE ELEMENTO QUE ESTÁ EN POSICIÓN pos.        *
                    * Object remove(int pos)  -->  ELIMINA ELEMENTO QUE ESTÁ EN POSICIÓN pos.      *
                    *                              DEVUELVE ELEMENTO ELIMINADO.                    *
                    * Boolean remove(Object ob)  -->  ELIMINA LA PRIMERA OCURRECIA DEL ob.         *
                    *                                 DEVUELVE true SI EL ELEMENTO ESTÁ.           *
                    * clear()  -->   ELIMINA TODOS LOS ELEMENTOS.                                  *
                    * set(int pos, Object ob)  -->  SUSTITUYE EL ELEMENTO EN POSICIÓN pos          *
                    *                               POR EL OBJETO ob.                              *
                    * Boolean contains(Object ob)  -->  COMPRUEBA SI CONTIENE AL OBJETO ob.        *
                    *                                   DEVUELVE true SI EL ELEMENTO ESTÁ.         *
                    * int indexOf(Object ob)  -->  DEVUELVE LA POSICIÓN DEL OBJETO ob.             *
                    *                              DEVUELVE -1 SI EL ELEMENTO NO ESTÁ.             *
                    * boolean isEmpty()  -->  DEVUELVE true SI ESTÁ VACÍO.                         *
                    *                         DEVUELVE false SI EL CONTIENE ALGÚN ELEMENTO.        *
                    * int lastIndexOf(Object ob)  -->  DEVUELVE LA ÚLTIMA POSICIÓN DEL OBJETO ob.  *
                    *                                  DEVUELVE -1 SI EL ELEMENTO NO ESTÁ.         *
                    ********************************************************************************
                    *  PARA ACCEDER A LOS ELEMENTOS DE UNA COLECCIÓN UNAMOS ITERADORES.            *
                    ********************************************************************************
                    *  1. ITERADORES.                                                              *
                    ********************************************************************************
                    *  0. ATRÁS.                                                                   *
                    ********************************************************************************
                    
                      """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque03.Iteradores.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
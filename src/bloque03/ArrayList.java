
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
                    * int size()  -->  DEVUELVE N�MERO DE ELEMENTOS.                               *
                    * add(Object ob)  -->  A�ADE ob AL FINAL. DEVUELVE true.                       *
                    * add(int pos, Object ob)  -->  INSERTA ob EN POSICI�N pos.                    *
                    * Object get(int pos)  -->  DEVUELVE ELEMENTO QUE EST� EN POSICI�N pos.        *
                    * Object remove(int pos)  -->  ELIMINA ELEMENTO QUE EST� EN POSICI�N pos.      *
                    *                              DEVUELVE ELEMENTO ELIMINADO.                    *
                    * Boolean remove(Object ob)  -->  ELIMINA LA PRIMERA OCURRECIA DEL ob.         *
                    *                                 DEVUELVE true SI EL ELEMENTO EST�.           *
                    * clear()  -->   ELIMINA TODOS LOS ELEMENTOS.                                  *
                    * set(int pos, Object ob)  -->  SUSTITUYE EL ELEMENTO EN POSICI�N pos          *
                    *                               POR EL OBJETO ob.                              *
                    * Boolean contains(Object ob)  -->  COMPRUEBA SI CONTIENE AL OBJETO ob.        *
                    *                                   DEVUELVE true SI EL ELEMENTO EST�.         *
                    * int indexOf(Object ob)  -->  DEVUELVE LA POSICI�N DEL OBJETO ob.             *
                    *                              DEVUELVE -1 SI EL ELEMENTO NO EST�.             *
                    * boolean isEmpty()  -->  DEVUELVE true SI EST� VAC�O.                         *
                    *                         DEVUELVE false SI EL CONTIENE ALG�N ELEMENTO.        *
                    * int lastIndexOf(Object ob)  -->  DEVUELVE LA �LTIMA POSICI�N DEL OBJETO ob.  *
                    *                                  DEVUELVE -1 SI EL ELEMENTO NO EST�.         *
                    ********************************************************************************
                    *  PARA ACCEDER A LOS ELEMENTOS DE UNA COLECCI�N UNAMOS ITERADORES.            *
                    ********************************************************************************
                    *  1. ITERADORES.                                                              *
                    ********************************************************************************
                    *  0. ATR�S.                                                                   *
                    ********************************************************************************
                    
                      """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque03.Iteradores.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
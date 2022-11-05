
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Colecciones {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    *******************************************************************
                    *                   COLECCIONES                                   *
                    *******************************************************************
                    *         NECESITAMOS  -->  import java.util.Collection;          *
                    *******************************************************************
                    *  int size() --> DEVUELVE LA CANTIDAD DE ELEMENTOS.              *
                    *  void add(Object ob) --> AGREGA ob A LA COLECCI�N.              *
                    *  void addaLL(Collection c) --> AGREGA A LA COLECCI�N            *
                    *                                TODOS LOS ELEMENTOS DE c.        *
                    *  boolean remove(Object ob) --> ELIMINA DE LA COLECCI�N          *
                    *                                TODOS LOS ob.                    *
                    *  boolean removeAll(Collection c) --> ELIMINA DE LA COLECCI�N    *
                    *                                      TODOS LOS ELEMENTOS DE c.  *
                    *  boolean isEmpty() --> INDICA SI LA COLECCI�N EST� VAC�A.       *
                    *  void clear() --> ELIMINA TODOS LOS ELEMENTOS DE LA COLECCI�N.  *
                    *******************************************************************
                    *  1. LISTAS.                                                     *
                    *  2. CONJUNTOS.                                                  *
                    *  3. MAPAS.                                                      *
                    *  4. ITERADORES.                                                 *
                    *  5. EJEMPLO  -->  USANDO COLECCIONES.                           *
                    *******************************************************************
                    *  0. ATR�S.                                                      *
                    *******************************************************************
                    
                                 """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque03.Listas.main(args);
                case "2" -> bloque03.Conjuntos.main(args);
                case "3" -> bloque03.Mapas.main(args);
                case "4" -> bloque03.Iteradores.main(args);
                case "5" -> ejemplos.tramo04.UsandoColecciones.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
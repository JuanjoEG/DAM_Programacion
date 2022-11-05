
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
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
                    *  void add(Object ob) --> AGREGA ob A LA COLECCIÓN.              *
                    *  void addaLL(Collection c) --> AGREGA A LA COLECCIÓN            *
                    *                                TODOS LOS ELEMENTOS DE c.        *
                    *  boolean remove(Object ob) --> ELIMINA DE LA COLECCIÓN          *
                    *                                TODOS LOS ob.                    *
                    *  boolean removeAll(Collection c) --> ELIMINA DE LA COLECCIÓN    *
                    *                                      TODOS LOS ELEMENTOS DE c.  *
                    *  boolean isEmpty() --> INDICA SI LA COLECCIÓN ESTÁ VACÍA.       *
                    *  void clear() --> ELIMINA TODOS LOS ELEMENTOS DE LA COLECCIÓN.  *
                    *******************************************************************
                    *  1. LISTAS.                                                     *
                    *  2. CONJUNTOS.                                                  *
                    *  3. MAPAS.                                                      *
                    *  4. ITERADORES.                                                 *
                    *  5. EJEMPLO  -->  USANDO COLECCIONES.                           *
                    *******************************************************************
                    *  0. ATRÁS.                                                      *
                    *******************************************************************
                    
                                 """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque03.Listas.main(args);
                case "2" -> bloque03.Conjuntos.main(args);
                case "3" -> bloque03.Mapas.main(args);
                case "4" -> bloque03.Iteradores.main(args);
                case "5" -> ejemplos.tramo04.UsandoColecciones.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
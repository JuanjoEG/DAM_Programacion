
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class MetodosMap {
    
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    **************************************************************************************************************************
                    *                                               MÉTODOS DE LA INTERFAZ Map                                               *
                    **************************************************************************************************************************
                    *                                                                                                                        *
                    *  int size(); --> Devuelve el número de asignaciones de clave-valor en esta asignación.                                 *
                    *                                                                                                                        *
                    *  boolean isEmpty(); --> Devuelve {@code true} si este mapa no contiene asignaciones de clave-valor.                    *
                    *                                                                                                                        *
                    *  boolean containsKey(Object key); --> Devuelve {@code true} si este mapa contiene una asignación para                  *
                    *                                       la clave especificada.                                                           *
                    *  boolean containsValue(Object value); --> Devuelve {@code true} si este mapa asigna una o más claves                   *
                    *                                           al valor especificado.                                                       *
                    *  V get(Object key); --> Devuelve el valor al que se asigna la clave especificada,                                      *
                    *                         o {@code null} si este mapa no contiene ninguna asignación para la clave.                      *
                    *  V put(K key, V value); --> Asocia el valor especificado con la clave especificada en este mapa (operación opcional).  *
                    *                                                                                                                        *
                    *  V remove(Object key); --> Elimina el mapeo de una clave de este mapa si está presente (operación opcional).           *
                    *                                                                                                                        *
                    *  void putAll(Map<? extends K, ? extends V> m); --> Copia todas las asignaciones del mapa especificado                  *
                    *                                                    a este mapa (operación opcional).                                   *
                    *  void clear(); --> Elimina todas las asignaciones de este mapa (operación opcional).                                   *
                    *                                                                                                                        *
                    *  Set<K> keySet(); --> Devuelve una vista {@link Set} de las claves contenidas en este mapa.                            *
                    *                                                                                                                        *
                    *  Collection<V> values(); --> Devuelve una vista {@link Collection} de los valores contenidos en este mapa.             *
                    *                                                                                                                        *
                    *  Set<Map.Entry<K, V>> entrySet(); --> Devuelve una vista {@link Set} de las asignaciones contenidas en este mapa.      *
                    *                                                                                                                        *
                    *  K getKey(); --> Devuelve la clave correspondiente a esta entrada.                                                     *
                    *                                                                                                                        *
                    *  V getValue(); --> Devuelve el valor correspondiente a esta entrada.                                                   *
                    *                                                                                                                        *
                    *  V setValue(V value); --> Reemplaza el valor correspondiente a esta entrada                                            *
                    *                           con el valor especificado (operación opcional).                                              *
                    *  boolean equals(Object o); --> Compara el objeto especificado con esta entrada para la igualdad.                       *
                    *                                                                                                                        *
                    *  int hashCode(); --> Devuelve el valor del código hash para esta entrada de mapa.                                      *
                    *                                                                                   *
                    *                                                          *
                    *                                                                                                                        *
                    *                            *
                    *                                                                                                                        *
                    *                                                  *
                    *                                                                                                                        *
                    *                                   *
                    *                                                                                                                        *
                    *                *
                    *                                                                                                *
                    *         *
                    *                                                                                                                        *
                    *                                 *
                    *                                                                                                                        *
                    *          *
                    *                                                                        *
                    *      *
                    *                                                                            *
                    *                     *
                    *                                                                                           *
                    *          *
                    *                                         *
                    *  *
                    *                                                                             *
                    *                                                                                                                        *
                    *                                                                                                                        *
                    **************************************************************************************************************************
                    *  0. ATRÁS.                                                                                                             *
                    **************************************************************************************************************************
                    
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

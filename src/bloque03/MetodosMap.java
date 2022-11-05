
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class MetodosMap {
    
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    **************************************************************************************************************************
                    *                                               M�TODOS DE LA INTERFAZ Map                                               *
                    **************************************************************************************************************************
                    *                                                                                                                        *
                    *  int size(); --> Devuelve el n�mero de asignaciones de clave-valor en esta asignaci�n.                                 *
                    *                                                                                                                        *
                    *  boolean isEmpty(); --> Devuelve {@code true} si este mapa no contiene asignaciones de clave-valor.                    *
                    *                                                                                                                        *
                    *  boolean containsKey(Object key); --> Devuelve {@code true} si este mapa contiene una asignaci�n para                  *
                    *                                       la clave especificada.                                                           *
                    *  boolean containsValue(Object value); --> Devuelve {@code true} si este mapa asigna una o m�s claves                   *
                    *                                           al valor especificado.                                                       *
                    *  V get(Object key); --> Devuelve el valor al que se asigna la clave especificada,                                      *
                    *                         o {@code null} si este mapa no contiene ninguna asignaci�n para la clave.                      *
                    *  V put(K key, V value); --> Asocia el valor especificado con la clave especificada en este mapa (operaci�n opcional).  *
                    *                                                                                                                        *
                    *  V remove(Object key); --> Elimina el mapeo de una clave de este mapa si est� presente (operaci�n opcional).           *
                    *                                                                                                                        *
                    *  void putAll(Map<? extends K, ? extends V> m); --> Copia todas las asignaciones del mapa especificado                  *
                    *                                                    a este mapa (operaci�n opcional).                                   *
                    *  void clear(); --> Elimina todas las asignaciones de este mapa (operaci�n opcional).                                   *
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
                    *                           con el valor especificado (operaci�n opcional).                                              *
                    *  boolean equals(Object o); --> Compara el objeto especificado con esta entrada para la igualdad.                       *
                    *                                                                                                                        *
                    *  int hashCode(); --> Devuelve el valor del c�digo hash para esta entrada de mapa.                                      *
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
                    *  0. ATR�S.                                                                                                             *
                    **************************************************************************************************************************
                    
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

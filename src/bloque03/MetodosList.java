
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class MetodosList {
    
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    **************************************************************************************************************************
                    *                                               MÉTODOS DE LA INTERFAZ List                                              *
                    **************************************************************************************************************************
                    *                                                                                                                        *
                    *  int size(); --> Devuelve el número de elementos de esta lista.                                                        *
                    *                                                                                                                        *
                    *  boolean isEmpty(); --> Devuelve true si esta lista no contiene elementos.                                             *
                    *                                                                                                                        *
                    *  boolean contains(Object o); -->  Devuelve true si esta lista contiene el elemento especificado.                       *
                    *                                                                                                                        *
                    *  Iterator<E> iterator(); --> Devuelve un iterador sobre los elementos de esta lista en la secuencia adecuada.          *
                    *                                                                                                                        *
                    *  Object[] toArray(); --> Devuelve una matriz que contiene todos los elementos de esta lista en secuencia.              *
                    *                                                                                                                        *
                    *  <T> T[] toArray(T[] a); --> Devuelve una matriz que contiene todos los elementos de esta lista en secuencia.          *
                    *                                                                                                                        *
                    *  boolean add(E e); --> Agrega el elemento especificado al final de esta lista (opcional operación).                    *
                    *                                                                                                                        *
                    *  boolean remove(Object o); --> Elimina la primera aparición del elemento especificado de esta lista.                   *
                    *                                                                                                                        *
                    *  boolean containsAll(Collection<?> c); --> Devuelve true si esta lista contiene todos los elementos de la colección.   *
                    *                                                                                                                        *
                    *  boolean addAll(Collection<? extends E> c); --> Añade todos los elementos de la colección especificada al final.       *
                    *                                                                                                                        *
                    *  boolean addAll(int index, Collection<? extends E> c); --> Inserta todos los elementos de la colección especificada    *
                    *                                                            en esta lista en la posición especificada.                  *
                    *  boolean removeAll(Collection<?> c); --> Elimina de esta lista todos sus elementos que están contenidos                *
                    *                                          en la colección especificada.                                                 *
                    *  boolean retainAll(Collection<?> c); --> Conserva solo los elementos de esta lista que están contenidos                *
                    *                                          en la colección especificada.                                                 *
                    *  default void replaceAll(UnaryOperator<E> operator) --> Reemplaza cada elemento de esta lista con el resultado de      *
                    *                                                         aplicar el operador a ese elemento.                            *
                    *  default void sort(Comparator<? super E> c --> Ordena esta lista según el orden inducido por el                        *
                    *                                                 {@link Comparator} especificado.                                       *
                    *  void clear(); --> Elimina todos los elementos de esta lista.                                                          *
                    *                                                                                                                        *
                    *  boolean equals(Object o); --> Devuelve true si y solo si el objeto especificado es igual.                             *
                    *                                                                                                                        *
                    *  int hashCode(); --> Devuelve el valor del código hash para esta lista.                                                *
                    *                                                                                                                        *
                    *  E get(int index); --> Devuelve el elemento en la posición especificada en esta lista.                                 *
                    *                                                                                                                        *
                    *  E set(int index, E element); --> Reemplaza el elemento en la posición especificada en esta lista con el               *
                    *                                   elemento especificado.                                                               *
                    *  void add(int index, E element); --> Inserta el elemento especificado en la posición especificada en esta lista.       *
                    *                                                                                                                        *
                    *  E remove(int index); --> Elimina el elemento en la posición especificada en esta lista.                               *
                    *                                                                                                                        *
                    *  int indexOf(Object o); --> Devuelve el índice de la primera aparición del elemento especificado en esta lista,        *
                    *                             o -1 si esta lista no contiene el elemento.                                                *
                    *  int lastIndexOf(Object o); --> Devuelve el índice de la última aparición del elemento especificado en esta lista,     *
                    *                                 o -1 si esta lista no contiene el elemento.                                            *
                    *  ListIterator<E> listIterator(); --> Devuelve un iterador de lista sobre los elementos de esta lista                   *
                    *                                      (en la secuencia adecuada).                                                       *
                    *  ListIterator<E> listIterator(int index); --> Devuelve un iterador de lista sobre los elementos de esta lista          *
                    *                                         (en la secuencia adecuada), comenzando en la posición especificada en la lista.*
                    *  List<E> subList(int fromIndex, int toIndex); --> Devuelve una vista de la parte de esta lista entre {@code fromIndex},*
                    *                                                   inclusive, y {@code toIndex}, exclusivo.                             *
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

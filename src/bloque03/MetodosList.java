
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class MetodosList {
    
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    **************************************************************************************************************************
                    *                                               M�TODOS DE LA INTERFAZ List                                              *
                    **************************************************************************************************************************
                    *                                                                                                                        *
                    *  int size(); --> Devuelve el n�mero de elementos de esta lista.                                                        *
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
                    *  boolean add(E e); --> Agrega el elemento especificado al final de esta lista (opcional operaci�n).                    *
                    *                                                                                                                        *
                    *  boolean remove(Object o); --> Elimina la primera aparici�n del elemento especificado de esta lista.                   *
                    *                                                                                                                        *
                    *  boolean containsAll(Collection<?> c); --> Devuelve true si esta lista contiene todos los elementos de la colecci�n.   *
                    *                                                                                                                        *
                    *  boolean addAll(Collection<? extends E> c); --> A�ade todos los elementos de la colecci�n especificada al final.       *
                    *                                                                                                                        *
                    *  boolean addAll(int index, Collection<? extends E> c); --> Inserta todos los elementos de la colecci�n especificada    *
                    *                                                            en esta lista en la posici�n especificada.                  *
                    *  boolean removeAll(Collection<?> c); --> Elimina de esta lista todos sus elementos que est�n contenidos                *
                    *                                          en la colecci�n especificada.                                                 *
                    *  boolean retainAll(Collection<?> c); --> Conserva solo los elementos de esta lista que est�n contenidos                *
                    *                                          en la colecci�n especificada.                                                 *
                    *  default void replaceAll(UnaryOperator<E> operator) --> Reemplaza cada elemento de esta lista con el resultado de      *
                    *                                                         aplicar el operador a ese elemento.                            *
                    *  default void sort(Comparator<? super E> c --> Ordena esta lista seg�n el orden inducido por el                        *
                    *                                                 {@link Comparator} especificado.                                       *
                    *  void clear(); --> Elimina todos los elementos de esta lista.                                                          *
                    *                                                                                                                        *
                    *  boolean equals(Object o); --> Devuelve true si y solo si el objeto especificado es igual.                             *
                    *                                                                                                                        *
                    *  int hashCode(); --> Devuelve el valor del c�digo hash para esta lista.                                                *
                    *                                                                                                                        *
                    *  E get(int index); --> Devuelve el elemento en la posici�n especificada en esta lista.                                 *
                    *                                                                                                                        *
                    *  E set(int index, E element); --> Reemplaza el elemento en la posici�n especificada en esta lista con el               *
                    *                                   elemento especificado.                                                               *
                    *  void add(int index, E element); --> Inserta el elemento especificado en la posici�n especificada en esta lista.       *
                    *                                                                                                                        *
                    *  E remove(int index); --> Elimina el elemento en la posici�n especificada en esta lista.                               *
                    *                                                                                                                        *
                    *  int indexOf(Object o); --> Devuelve el �ndice de la primera aparici�n del elemento especificado en esta lista,        *
                    *                             o -1 si esta lista no contiene el elemento.                                                *
                    *  int lastIndexOf(Object o); --> Devuelve el �ndice de la �ltima aparici�n del elemento especificado en esta lista,     *
                    *                                 o -1 si esta lista no contiene el elemento.                                            *
                    *  ListIterator<E> listIterator(); --> Devuelve un iterador de lista sobre los elementos de esta lista                   *
                    *                                      (en la secuencia adecuada).                                                       *
                    *  ListIterator<E> listIterator(int index); --> Devuelve un iterador de lista sobre los elementos de esta lista          *
                    *                                         (en la secuencia adecuada), comenzando en la posici�n especificada en la lista.*
                    *  List<E> subList(int fromIndex, int toIndex); --> Devuelve una vista de la parte de esta lista entre {@code fromIndex},*
                    *                                                   inclusive, y {@code toIndex}, exclusivo.                             *
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


package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Iteradores {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    **********************************************************
                    *                          ITERADORES                    *
                    **********************************************************
                    *  PERMITEN ACCEDER A LOS ELEMENTOS DE LAS COLECCIONES.  *
                    **********************************************************
                    *  Iterator<TIPO> nombrevariable = COLECCI�N.iterator()  *
                    **********************************************************
                    *  next()  -->  DEVUELVE EL VALOR DEL ELEMENTO           *
                    *               EN EL QUE EST� EL ITERADOR.              *
                    *  hasNext()  -->  INDICA SI HAY UN ELEMENTO SIGUIENTE   *
                    *                  EN EL ORDEN DEL ITERADOR.             *
                    *  remove()  -->  ELIMINA EL ELEMENTO QUE TENGA          *
                    *                 EL ITERADOR DE LA COLECCI�N.           *
                    **********************************************************
                    *  PARA RECORRER UNA COLECCI�N USAMOS UN BUCLE for-each. *
                    **********************************************************
                    *  1. BUCLE for-each.  -->  RECORRE UNA COLECCI�N.       *
                    *  2. EJEMPLO  -->  USANDO ITERADORES.                   *
                    **********************************************************
                    *  0. ATR�S.                                             *
                    **********************************************************
                    
                      """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque02.BucleFor.main(args);
                case "2" -> ejemplos.tramo05.UsandoIteradores.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
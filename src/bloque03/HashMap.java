
package bloque03;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class HashMap {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                    
                    
                    
                    
                    ********************************************************************************
                    *                               HASHMAP                                        *
                    ********************************************************************************
                    *  ELEMENTOS PARES CLAVE-VALOR.   NO PUEDE HABER CLAVES REPETIDAS.             *
                    ********************************************************************************
                    *              NECESITAMOS  -->  import java.util.HashMap;                     *
                    *                                import java.util.Map;                         *
                    ********************************************************************************
                    *          HashMap<TIPO, TIPO> NOMBRE = new HashMap<TIPO, TIPO>();             *
                    *            Map<String, String> NOMBRE = new HashMap<>();                     *
                    ********************************************************************************
                    * NOMBRE.put(CLAVE, VALOR) --> A�ADE UN ELEMENTO DE PARES CLAVE-VALOR.         *
                    *                                                                              *
                    * for (TIPO key : NOMBRE.keySet()) {   <-- NOS PERMITE ITERAR POR LAS CLAVES.  *
                    *      System.out.println(key);                                                *
                    * }                                                                            *
                    *                                                                              *
                    * for (TIPO value : NOMBRE.values()) { <-- NOS PERMITE ITERAR POR LOS VALORES. *
                    *      System.out.println(value);                                              *
                    * }                                                                            *
                    *            PARA ITERAR POR LOS PARES CLAVE-VALOR:                            *
                    *                                                                              *
                    * for (Map.Entry<TIPO, TIPO> pair : NOMBRE.entrySet()) {                       *
                    *      System.out.println(pair.getKey() + " - " + pair.getValue());            *
                    * }                                                                            *
                    *                                                                              *
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
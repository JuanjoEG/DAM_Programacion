
package ejemplos.tramo05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class UsandoIteradores {
    
    public static void main(String[] args) {
        
         
        String menu;
        //CREAMOS UN ARRAYS DE 10 ELEMENTOS RANDOM
        Random aleatorios = new Random();
        ArrayList<Integer> miarray = new ArrayList<>();
        for (int i=0; i<10; i++){
            miarray.add(aleatorios.nextInt(100));
        }
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                    
                               
                               
                               
                               
                    ******************************************************
                    *                USANDO ITERADORES                   *
                    ******************************************************
                    *    CREAMOS UN ARRAYS DE 10 ELEMENTOS RANDOM.       *
                    * 1. MOSTRAR ARRAY  -->  USANDO  ITERADOR.           *
                    * 2. MOSTRAR ARRAY  -->  USANDO  BUCLE for-each.     *
                    ******************************************************
                    * 0. ATRÁS.                                          *
                    ******************************************************
                    
                   """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
                    
            switch(menu){
                case "1" -> {
                    //DECLARAMOS EL ITERADOR PARA RECORRER EL ARRAY
                    Iterator<Integer> iterador = miarray.iterator();
                    while(iterador.hasNext()){
                        int elemento = iterador.next();
                        System.out.print(elemento + "\t");
                    }
                    System.out.println("");
                }
                case "2" -> {
                    //RECORREMOS EL ARRAY CON UN BUCLE FOR-EACH
                    for (Integer elemento : miarray){
                        System.out.print(elemento + "\t");
                    }
                    System.out.println("");
                }                
                case "0" -> {
                }
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
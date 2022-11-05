
package ejemplos.tramo04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Juan José Estévez González
 */
public class UsandoColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sn_teclado = new Scanner (System.in);
        String palabra;
        System.out.println("Escribe 10 palabras para formar...\n"
                + "un ArrayList, un TreeSet y un HashMap.\n");
        ArrayList<String> miArray = new ArrayList();
        Set miTreeSet = new TreeSet();
        Map <Integer, String> miHashMap = new HashMap<>();
        
        for (int i=0; i<10; i++){
            System.out.print(i+". Introduce una palabra : ");
            palabra = sn_teclado.nextLine();
            
            //SE INTRODUCE LA PALABRA EN LAS TRES COLECCIONES
            miArray.add(palabra);
            miTreeSet.add(palabra);
            miHashMap.put(i, palabra);
        }
        System.out.println("ArrayList:");
        System.out.println(miArray);
        System.out.println("TreeSet:");
        System.out.println(miTreeSet);
        System.out.println("HashMap:");
        System.out.println(miHashMap);
        System.out.println("");
    }
}
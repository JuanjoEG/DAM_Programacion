
package ejemplos.tramo06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class EscrituraFicheroTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n"
                + "PRUEVA DE ESCRITURA EN ARCHIVO DE TEXTO.\n"
                + "El fichero lo encontrar�s en la raiz del programa.\n"
                + "    ....   prueba_de_texto.txt   ...\n");
        FileWriter fichero = null;
        PrintWriter escritura_fichero = null;
        try{
            fichero = new FileWriter("..\\prueba_de_texto.txt");
            
            escritura_fichero = new PrintWriter(fichero);
            for (int i=0; i<10; i++){
                escritura_fichero.println("La l�nea de TEXTO "+i);
            }
            System.out.println("\nEL FICHERO SE ESCRIBI� CON �XITO.\n");
        }
        catch (IOException e){
            System.out.println("Error ESCRIBIENDO el fichero: "+ e.toString());
        }
        finally{
            try{
                escritura_fichero.close();
                fichero.close();
            }
            catch(IOException e2){
                System.out.println("Error CERRANDO el fichero: "+ e2.toString());
            }
        }
    }
}
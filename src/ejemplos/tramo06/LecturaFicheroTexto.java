
package ejemplos.tramo06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Juan José Estévez González
 */
public class LecturaFicheroTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n"
                + "PRUEVA DE LECTURA EN ARCHIVO DE TEXTO.\n"
                + "El fichero lo encontrarás en la raiz del programa.\n"
                + "    ....   prueba_de_texto.txt   ...\n");
        File archivo = null;
        FileReader lectura_fichero = null;
        BufferedReader buffer_lectura = null;
        try{
            archivo = new File("..\\prueba_de_texto.txt");
            lectura_fichero = new FileReader(archivo);
            buffer_lectura = new BufferedReader(lectura_fichero);
            String linea;
            while ((linea = buffer_lectura.readLine()) != null){
                System.out.println(linea);
            }
            System.out.println("\nEL FICHERO SE HA LEíDO CON ÉXITO.\n");
        } 
        catch (IOException e){
            System.out.println("Error LEYENDO el fichero: " + e.toString());
        } 
        finally{
            try{
                buffer_lectura.close();
                lectura_fichero.close();
            } 
            catch (IOException e2){
                System.out.println("Error CERRANDO el fichero: " + e2.toString());
            }
        }
    }    
}
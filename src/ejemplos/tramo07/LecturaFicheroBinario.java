
package ejemplos.tramo07;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Juan José Estévez Gonzélez
 */
public class LecturaFicheroBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n"
                + "PRUEVA DE LECTURA EN ARCHIVO BINARIO.\n"
                + "El fichero lo encontrarás en la raiz del programa.\n"
                + "    ....   prueba_de_binario.dat   ...\n");
        FileInputStream fichero_binario = null;
        BufferedInputStream buffer_binario_lectura = null;
        BufferedReader buffer_lectura = null;
        String linea = "";
        try{
            fichero_binario = new FileInputStream("..\\prueba_de_binario.dat");
            buffer_binario_lectura = new BufferedInputStream(fichero_binario);
            buffer_lectura = new BufferedReader(new InputStreamReader(buffer_binario_lectura, StandardCharsets.UTF_8));
            while ((linea = buffer_lectura.readLine()) != null){
                System.out.println(linea);
            }
            System.out.println("\nEL FICHERO SE HA LEÍDO CON ÉXITO.\n");
        } 
        catch (IOException e){
            System.out.println("Error leyendo el fichero: " + e.toString());
        } 
        finally{
            try{
                buffer_binario_lectura.close();
                fichero_binario.close();
            } 
            catch (IOException e2){
                System.out.println("Error cerrando el fichero: " + e2.toString());
            }
        }
    }    
}
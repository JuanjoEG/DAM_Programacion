
package ejemplos.tramo07;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Juan José Estévez Gonzélez
 */
public class EscrituraFicheroBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n"
                + "PRUEVA DE ESCRITURA EN ARCHIVO BINARIO.\n"
                + "El fichero lo encontrarás en la raiz del programa.\n"
                + "    ....   prueba_de_binario.dat   ...\n");
        FileOutputStream fichero_binario = null;
        BufferedOutputStream buffer_binario_escritura = null;
        String saltolinea = "\n";
        try{
            fichero_binario = new FileOutputStream("..\\prueba_de_binario.dat");
            buffer_binario_escritura = new BufferedOutputStream(fichero_binario);
            for (int i=0; i<10; i++){
                String escribir = ("La lí­nea de BINARIOS "+i);
                buffer_binario_escritura.write(escribir.getBytes(StandardCharsets.UTF_8));
                buffer_binario_escritura.write(saltolinea.getBytes(StandardCharsets.UTF_8));
            }
            System.out.println("\nEL FICHERO SE ESCRIBIÓ CON EXITO.\n");
        }
        catch (IOException e){
            System.out.println("Error ESCRIBIENDO el fichero: "+ e.toString());
        }
        finally{
            try{
                buffer_binario_escritura.close();
                fichero_binario.close();
            }
            catch(IOException e2){
                System.out.println("Error CERRANDO el fichero: "+ e2.toString());
            }
        }
    }    
}
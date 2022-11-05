
package ejemplos.tramo07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Clases.Notas;

/**
 *
 * @author Juan José Estévez González
 */
public class SerializacionNotas {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, FileNotFoundException,ClassNotFoundException{
        // TODO code application logic here
        System.out.println("\n"
                + "MEDIANTE LA SERIALIZACIÓN VAMOS A PODER\n"
                + "ESCRIBIR LOS OBJETOS DIRÉCTAMENTE EN UN ARCHIVO.\n"
                + "NECESITAMOS  -->  LA CLASE TIENE QUE IMPLEMENTAR \n"
                + "OBLIGATORIAMENTE LA INTERFAZ Serializable.\n"
                + "\n...   public class Notas implements Serializable {   ...\n"
                + "\nEl fichero lo encontrarás en la raiz del programa.\n"
                + "    ....   notas.dat   ...\n");
        Notas notasSalida = new Notas();
        
        // SE LEEN LAS NOTAS
        notasSalida.leerNotas();
        serializarNotas("notas.dat", notasSalida);
        System.out.println("");
        System.out.println("La nota media es: "+obtenerNotaMedia("notas.dat"));
        System.out.println(notasSalida);        
    }
    public static void serializarNotas (String ruta, Notas notas) throws IOException{
        // SALIDA
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        
        // SE ESCRIBEN LAS NOTAS EN UN FICHERO
        try {
            // SE CREA EL FICHERO
            fos = new FileOutputStream(ruta);
            salida = new ObjectOutputStream(fos);
            salida.writeObject(notas);
            
        } catch (IOException e) {
            System.out.println("Error 1: "+ e.toString());
        }
        
        finally{
            try {
                salida.close();
                fos.close();
            } catch (IOException e) {
                System.out.println("Error 2: "+ e.toString());
            }
        }
    }
    public static double obtenerNotaMedia(String ruta) throws FileNotFoundException, IOException, ClassNotFoundException{
        // ENTRADA
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        double media = 0;
        
        Notas notasEntrada = new Notas();
        
        // SE LEEN LAS NOTAS DEL FICHERO Y SE CALCULA LA MEDIA
        fis = new FileInputStream(ruta);
        entrada = new ObjectInputStream(fis);
        
        notasEntrada = (Notas) entrada.readObject();
        
        for (int i=0; i<6; i++){
            media = media + notasEntrada.getNota(i);
        }
        media /= 6;
        return  media;
    }
}
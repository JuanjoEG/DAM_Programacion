
package ejemplos.tramo07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class TextoDelReves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String rutaLectura;
        String rutaEscritura;
        File archivoLectura = null;
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        Scanner sn = new Scanner (System.in);
        String linea = "";
        
        // SE PIDEN LAS DOS RUTAS
        System.out.println("La aplicaci�n te pide la ruta de dos ficheros de texto por teclado.");
        System.out.println("El programa leer� el contenido del primer fichero");
        System.out.println("y lo escribir� en el segundo al rev�s.");
        System.out.println("Puedes usar los ficheros que te pasa como ejemplo,");
        System.out.println("si los escribes tal cual, la aplicaci�n los busca");
        System.out.println("en la carpeta de la aplicaci�n.");
        System.out.println("Busca esos archivos y modifica el texto,");
        System.out.println("luego le pasas la aplicaci�n.");
        System.out.println("");
        System.out.println("Introduce la ruta del primer fichero: ");
        System.out.println("Ejemplo: archivo_origen.txt");
        rutaLectura = sn.nextLine();
        System.out.println("Introduce la ruta del segundo fichero: ");
        System.out.println("Si no existe el archivo, la aplicaci�n lo crear�.");
        System.out.println("Ejemplo: archivo_destino.txt");
        rutaEscritura = sn.nextLine();
        
        try{
            // APERTURA DEL FICHERO Y CREACI�N DE BufferedReader PARA PODER HACER LA LECTURA
            archivoLectura = new File(rutaLectura);
            fr = new FileReader(archivoLectura);
            br = new BufferedReader(fr);
            
            // LECTURA DEL FICHERO
            int caracter;
            
            // read() PERMITE LEER CAR�CTER A CAR�CTER COMO ENTEROS HASTA EL FINAL QUE SER� -1
            while ((caracter = br.read()) != -1){
                // SE VA INTRODUCIENDO EL CAR�CTER AL PRINCIPIO HACIENDO UN CASTING
                linea = (char) caracter + linea;
            }
            System.out.println("\nEL FICHERO SE HA LE�DO CON �XITO.\n"
                    + "EL TEXTO DEL REV�S PONE...\n");
            System.out.println(linea);
        }
        catch (IOException e){
            System.out.println("Error leyendo el fichero: "+ e.toString());
        }
        // EN ESTE PUNTO EL FICHERO EST� YA AL REV�S EN linea
        try {
            //ESCRIBIMOS EL FICHERO
            fw = new FileWriter(rutaEscritura);
            pw = new PrintWriter(fw);
            
            pw.print(linea);
        } 
        catch (IOException e) {
            System.out.println("Error leyendo el fichero: "+ e.toString());
        }
        finally{
            try {
                // SE CIERRA TODO LO QUE SE HA ABIERTO
                br.close();
                fr.close();
                pw.close();
                fw.close();
            } 
            catch (IOException e2) {
                System.out.println("Error cerrando el fichero: "+ e2.toString());
            }
        }
    }
}

package ejemplos.tramo07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import Clases.Persona;

/**
 *
 * @author Juan José Estévez González
 */
public class LecturaObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n"
                + "PRUEVA DE LECTURA DE OBJETO EN ARCHIVO.\n"
                + "El fichero lo encontrarás en la raiz del programa.\n"
                + "    ....   prueba_de_objeto.dat   ...\n");
        FileInputStream fichero_binario = null;
        ObjectInputStream objeto_lectura = null;
        Persona p;
        
        try{
            fichero_binario = new FileInputStream("..\\prueba_de_objeto.dat");
            objeto_lectura = new ObjectInputStream(fichero_binario);
            
            p = (Persona) objeto_lectura.readObject();
            System.out.println(p.toString());
            p = (Persona) objeto_lectura.readObject();
            System.out.println(p.toString());
            p = (Persona) objeto_lectura.readObject();
            System.out.println(p.toString());
            System.out.println("\nEL FICHERO SE HA LEÍDO CON ÉXITO.\n");
        }
        catch (IOException | ClassNotFoundException e){
            System.out.println("Error LEYENDO el fichero: "+ e.toString());
        }
        finally{
            try{
                objeto_lectura.close();
                fichero_binario.close();
            }
            catch (IOException e){
                System.out.println("Error CERRANDO el fichero: ");
            }
        }
    }    
}
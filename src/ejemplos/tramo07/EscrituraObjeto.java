
package ejemplos.tramo07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import Clases.Persona;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class EscrituraObjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n"
                + "PRUEVA DE ESCRITURA DE OBJETO EN ARCHIVO.\n"
                + "El fichero lo encontrar�s en la raiz del programa.\n"
                + "    ....   prueba_de_objeto.dat   ...\n");
        FileOutputStream fichero_binario = null;
        ObjectOutputStream objeto_escritura = null;
        Persona p;
        try{
            fichero_binario = new FileOutputStream("..\\prueba_de_objeto.dat");
            objeto_escritura = new ObjectOutputStream(fichero_binario);
            p = new Persona("Mariano","Fern�ndez Pluma",24);
            objeto_escritura.writeObject(p);
            p = new Persona("Jos�","Lobo Labrador",31);
            objeto_escritura.writeObject(p);
            p = new Persona("Antonio","Espinosa Toro",63);
            objeto_escritura.writeObject(p);
            System.out.println("\nEL FICHERO SE ESCRIBI� CON �XITO.\n");
        }
        catch (IOException e){
            System.out.println("Error ESCRIBIENDO el fichero: "+ e.toString());
        }
        finally{
            try{
                objeto_escritura.close();
                fichero_binario.close();
            }
            catch(IOException e2){
                System.out.println("Error CERRANDO el fichero: "+ e2.toString());
            }
        }
    }    
}
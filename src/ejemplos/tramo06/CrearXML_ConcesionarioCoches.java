
package ejemplos.tramo06;

import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
/**
 *
 * @author Juan José Estévez González
 */
public class CrearXML_ConcesionarioCoches {

    /**
     * @param args the command line arguments
     * @throws javax.xml.transform.TransformerConfigurationException
     * @throws javax.xml.parsers.ParserConfigurationException
     */
    public static void main(String[] args) throws TransformerConfigurationException, TransformerException, ParserConfigurationException {
        // TODO code application logic here
        String marca, modelo, cilindradaStr, fichero, rutaXML;
        
        int elementos, cilindradaInt;
        
        Scanner tecladoStr = new Scanner (System.in);
        Scanner tecladoInt = new Scanner (System.in);
        System.out.println("\nCREACIÓN DE UN FICHERO XML:\nINTRODUCCIÓN DE DATOS:\n");
        try{
            //ELEMENTOS PARA CREAR EL FICHERO XML
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc =  db.newDocument();
            
            //ELEMENTO RAÍZ DEL DOCUMENTO
            Element eRaiz = doc.createElement("concesionario");
            doc.appendChild(eRaiz);
            
            System.out.print("CONCESIONARO DE COCHES:\n"
                    + "¿CUÁNTOS ELEMENTOS DESEA INTRODUCIR?   :");
            elementos = tecladoInt.nextInt();
            
            for (int i=1; i<(elementos+1); i++){
                System.out.println("");
                //DEFINIMOS EL NODO COCHE QUE CONTENDRÁ LOS ELEMENTOS
                Element eCoche = doc.createElement("coche");
                // SE INTRODUCE EN EL NODO
                eRaiz.appendChild(eCoche);
                
                //NODO PARA LA MARCA DEL COCHE
                Element eMarca = doc.createElement("marca");
                // SE PIDE LA INFORMACIÓN POR TECLADO
                System.out.print(i+".  Introduce la marca del coche: ");
                marca= tecladoStr.nextLine();
                eMarca.appendChild(doc.createTextNode(marca));
                // SE INTRODUCE EN EL NODO
                eCoche.appendChild(eMarca);
                
                //NODO PARA EL MODELO DEL COCHE
                Element eModelo = doc.createElement("modelo");
                // SE PIDE LA INFORMACIÓN POR TECLADO
                System.out.print(i+".  Introduce el modelo del coche: ");
                modelo= tecladoStr.nextLine();
                eModelo.appendChild(doc.createTextNode(modelo));
                // SE INTRODUCE EN EL NODO
                eCoche.appendChild(eModelo);
                
                //NODO PARA LA CILINDRADA DEL COCHE
                Element eCilindrada = doc.createElement("cilindrada");
                // SE PIDE LA INFORMACIÓN POR TECLADO
                System.out.print(i+".  Introduce la cilindrada del coche: ");
                cilindradaInt= tecladoInt.nextInt();
                // SE TRANSFORMA EL VALOR ENTERO A STRING
                cilindradaStr= String.valueOf(cilindradaInt);
                eCilindrada.appendChild(doc.createTextNode(cilindradaStr));
                // SE INTRODUCE EN EL NODO
                eCoche.appendChild(eCilindrada);
            }
            
            //SE PIDE EL NOMBRE DEL FICHERO
            System.out.print("\nIntroduce nombre del fichero XML: ");
            fichero = tecladoStr.nextLine();
            //CLASES NECESARIAS PARA FINALIZAR LA CREACIÓN DEL ARCHIVO XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            
            //SE LE AÑADE LA EXTENSIÓN
            rutaXML = fichero+".xml";
            StreamResult result = new StreamResult (new File(rutaXML));
            //CREACIÓN DEL FICHERO XML EN DISCO
            transformer.transform(source, result);
            
            System.out.println("\nEL FICHERO HA SIDO CREADO CON ÉXITO\n");
        }
        catch (ParserConfigurationException | TransformerException | DOMException e){
            System.out.println("\nError -> "+ e.toString());
        }
    }
}
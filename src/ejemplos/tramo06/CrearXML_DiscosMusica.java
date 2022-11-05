
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
public class CrearXML_DiscosMusica {

    /**
     * @param args the command line arguments
     * @throws javax.xml.transform.TransformerConfigurationException
     * @throws javax.xml.parsers.ParserConfigurationException
     */
    public static void main(String[] args) throws TransformerConfigurationException, TransformerException, ParserConfigurationException {
        // TODO code application logic here
        String titulo, artista, origen, fichero, precio, anio;
        double precioD;
        int elementos, anioI;
        
        Scanner tecladoStr = new Scanner (System.in);
        Scanner tecladoInt = new Scanner (System.in);
        System.out.println("\nCREACIÓN DE UN FICHERO XML:\nINTRODUCCIÓN DE DATOS:\n");
        try{
            //ELEMENTOS PARA CREAR EL FICHERO XML
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc =  db.newDocument();
            
            //ELEMENTO RAÍZ DEL DOCUMENTO
            Element eRaiz = doc.createElement("CatÃ¡logo");
            doc.appendChild(eRaiz);
            
            System.out.print("CATÁLOGO DE DISCOS DE MÚSICA:\n"
                    + "¿CUÁNTOS ELEMENTOS DESEA INTRODUCIR?   :");
            elementos = tecladoInt.nextInt();
            
            for (int i=1; i<(elementos+1); i++){
                System.out.println("");
                Element eCd = doc.createElement("CD");
                Element eTitulo = doc.createElement("TÃ­tulo");
                Element eArtista = doc.createElement("Artista");
                Element eOrigen = doc.createElement("Origen");
                Element ePrecio = doc.createElement("Precio");
                Element eAnio = doc.createElement("AÃ±o");
                
                // SE PIDE LA INFORMACIÓN POR TECLADO
                System.out.print(i+".  Introduce el tí­tulo del disco: ");
                titulo= tecladoStr.nextLine();
                eTitulo.appendChild(doc.createTextNode(titulo));
                
                System.out.print(i+".  Introduce el artista del disco: ");
                artista= tecladoStr.nextLine();
                eArtista.appendChild(doc.createTextNode(artista));
                
                System.out.print(i+".  Introduce el origen del disco: ");
                origen= tecladoStr.nextLine();
                eOrigen.appendChild(doc.createTextNode(origen));
                
                System.out.print(i+".  Introduce el precio del disco: ");
                precioD= tecladoStr.nextDouble();
                // SE TRANSFORMA EL VALOR REAL A STRING
                precio= String.valueOf(precioD);
                ePrecio.appendChild(doc.createTextNode(precio));
                tecladoStr.nextLine();
                
                System.out.print(i+".  Introduce el año del disco: ");
                anioI= tecladoStr.nextInt();
                anio= String.valueOf(anioI);
                // SE TRANSFORMA EL VALOR ENTERO A STRING
                eAnio.appendChild(doc.createTextNode(anio));
                tecladoStr.nextLine();
                
                // SE INTRODUCEN LOS NODOS
                eRaiz.appendChild(eCd);
                eCd.appendChild(eTitulo);
                eCd.appendChild(eArtista);
                eCd.appendChild(eOrigen);
                eCd.appendChild(ePrecio);
                eCd.appendChild(eAnio);
                
            }
            
            //SE PIDE EL NOMBRE DEL FICHERO
            System.out.print("\nIntroduce nombre del fichero XML: ");
            fichero = tecladoStr.nextLine();
            //CLASES NECESARIAS PARA FINALIZAR LA CREACIÓN DEL ARCHIVO XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            
            //SE LE AÑADE LA EXTENSIÓN
            StreamResult result = new StreamResult (new File(fichero+".xml"));
            //CREACIÓN DEL FICHERO XML EN DISCO
            transformer.transform(source, result);
            
            System.out.println("\nEL FICHERO HA SIDO CREADO CON ÉXITO\n");
        }
        catch (ParserConfigurationException | TransformerException | DOMException e){
            System.out.println("\nError -> "+ e.toString());
        }
    }
}

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
public class CrearXML_Generico {

    /**
     * @param args the command line arguments
     * @throws javax.xml.transform.TransformerConfigurationException
     * @throws javax.xml.parsers.ParserConfigurationException
     */
    public static void main(String[] args) throws TransformerConfigurationException, TransformerException, ParserConfigurationException {
        // TODO code application logic here
        String nombreraiz, nombrenodo, nombreatributo, valoratributo, fichero, rutaXML;
        
        int nodosdiferentes, elementos, atributos;
        
        Scanner tecladoStr = new Scanner (System.in);
        Scanner tecladoInt = new Scanner (System.in);
        System.out.println("\nCREACIÃ“N DE UN FICHERO XML:\nINTRODUCCIÃ“N DE DATOS:\n");
        try{
            // CAPTACIÓN DE DATOS
            System.out.print("INTRODUCE EL NOMBRE DEL NODO RAIZ  :");
            nombreraiz = tecladoStr.nextLine();
            
            //ELEMENTOS PARA CREAR EL FICHERO XML
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc =  db.newDocument();
            
            //ELEMENTO RAÍZ DEL DOCUMENTO
            Element eRaiz = doc.createElement(nombreraiz);
            doc.appendChild(eRaiz);
            
            System.out.print("\n¿CUÁNTOS NODOS DIFERENTES TIENE EL DOCUMENTO?   :");
            nodosdiferentes = tecladoInt.nextInt();
            
            String[] nodosdistintos = new String [nodosdiferentes];            
            
            for (int a=0; a<nodosdiferentes; a++){
                
                System.out.print("\nINTRODUCE EL NOMBRE DEL NODO "+(a+1)+"  :");
                nombrenodo = tecladoStr.nextLine();
                
                nodosdistintos [a] = nombrenodo;
                
                System.out.print("\n¿CUÁNTOS ATRIBUTOS TIENE CADA ELEMENTO DEL NODO "+(a+1)+"?   :");
                atributos = tecladoInt.nextInt();
                System.out.println("");
                
                String[] atributosdistintos = new String [atributos];
                
                for (int b=0; b<atributos; b++){
                    
                    System.out.print("INTRODUCE EL NOMBRE DEL ATRIBUTO "+(b+1)+" DEL NODO "+(a+1)+"  :");
                    nombreatributo = tecladoStr.nextLine();
                    
                    atributosdistintos[b] = nombreatributo;
                }
                
                System.out.print("\n¿CUÁNTOS ELEMENTOS DESEA INTRODUCIR DEL NODO "+(a+1)+"?   :");
                elementos = tecladoInt.nextInt();
            
                for (int i=0; i<elementos; i++){
                    System.out.println("");
                    //DEFINIMOS EL NODO QUE CONTENDRÁ LOS ELEMENTOS
                    Element eNodo = doc.createElement(nodosdistintos[a]);
                    // SE INTRODUCE EN EL NODO
                    eRaiz.appendChild(eNodo);

                        for (int j=0; j<atributos; j++){
                        //NODO PARA LA MARCA DEL COCHE
                        Element eAtributo = doc.createElement(atributosdistintos[j]);
                        // SE PIDE LA INFORMACIÓN POR TECLADO
                        System.out.print(".  INTRODUCE EL VALOR DEL ATRIBUTO "+(j+1)+" DEL ELEMENTO "+(i+1)+": ");
                        valoratributo= tecladoStr.nextLine();
                        eAtributo.appendChild(doc.createTextNode(valoratributo));
                        // SE INTRODUCE EN EL NODO
                        eNodo.appendChild(eAtributo);
                        }
                }
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
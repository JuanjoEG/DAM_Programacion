
package Clases;

/**
 * ESTA CLASE REPRESENTA UNA CARTA GEN�RICA
 * @version 1.0
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class CartaGenerica {
    /**
     *  DECLARACI�N DE ATRIBUTOS
     */
    int numero;
    String palo;
    /**
     *  DECLARACI�N DE M�TODOS
     *  CONSTRUCTOR POR DEFECTO
     */
    public CartaGenerica(){
        this.numero=0;
        this.palo="";
    }
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS
     * @param numero
     * @param palo
     */
    public CartaGenerica(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS OBSERVADORES - LOS GETTERS
     * @return EL N�MERO DE LA CARTA
     */
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS OBSERVADORES - LOS GETTERS
     * @return EL PALO DE LA CARTA
     */
    public String getPalo() {
        return palo;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS MODIFICADORES - LOS SETTERS
     * MODIFICA UN D�A DE LA AGENDA
     * @param palo NUEVO PALO DE LA CARTA
     */
    public void setPalo(String palo) {
        this.palo = palo;
    }
    /**
     * M�TODO PERSONALIZADO
     * MUESTRA UNA CARTA
     */
    public void mostrarCarta(){
        System.out.println("La carta es: "+numero+" de "+palo+".");
    }
}
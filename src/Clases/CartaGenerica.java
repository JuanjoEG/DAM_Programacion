
package Clases;

/**
 * ESTA CLASE REPRESENTA UNA CARTA GENÉRICA
 * @version 1.0
 * @author Juan José Estévez González
 */
public class CartaGenerica {
    /**
     *  DECLARACIÓN DE ATRIBUTOS
     */
    int numero;
    String palo;
    /**
     *  DECLARACIÓN DE MÉTODOS
     *  CONSTRUCTOR POR DEFECTO
     */
    public CartaGenerica(){
        this.numero=0;
        this.palo="";
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS
     * @param numero
     * @param palo
     */
    public CartaGenerica(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return EL NÚMERO DE LA CARTA
     */
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return EL PALO DE LA CARTA
     */
    public String getPalo() {
        return palo;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA UN DÍA DE LA AGENDA
     * @param palo NUEVO PALO DE LA CARTA
     */
    public void setPalo(String palo) {
        this.palo = palo;
    }
    /**
     * MÉTODO PERSONALIZADO
     * MUESTRA UNA CARTA
     */
    public void mostrarCarta(){
        System.out.println("La carta es: "+numero+" de "+palo+".");
    }
}
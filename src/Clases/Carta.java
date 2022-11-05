
package Clases;

/**
 * ESTA CLASE REPRESENTA UNA CARTA DE LA BARAJA DE PÓKER
 * @version 1.0
 * @author Juan José Estévez González
 */

public class Carta {
    
    /**
     *  DECLARACIÓN DE ATRIBUTOS
     */
    private int numero;
    private String palo;
    /**
     *  DECLARACIÓN DE MÉTODOS
     *  CONSTRUCTOR POR DEFECTO
     */
     public Carta() {
         this.numero=0;
         this.palo="";
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS
     * @param numero VALOR DEL NÚMERO DE LA CARTA
     * @param palo VALOR DEL PALO DE LA CARTA
     */

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    /**
     *  DECLARACIÓN DE MÉTODOS
     *  CONSTRUCTOR DE COPIA
     * @param copia
     */
    
    public Carta(Carta copia) {
         this.numero=copia.numero;
         this.palo=copia.palo;
    }
    
    /**
     *  DECLARACIÓN DE MÉTODOS
     *  MÉTODOS OBSERVADORES - LOS GETTERS
     *  DEVUELVE EL NÚMERO DE LA CARTA
     *  @return EL NÚMERO DE LA CARTA
     */

    public int getNumero() {
        return numero;
    }
    
    /**
     *  DECLARACIÓN DE MÉTODOS
     *  MÉTODOS OBSERVADORES - LOS GETTERS
     *  DEVUELVE EL PALO DE LA CARTA
     *  @return EL PALO DE LA CARTA
     */

    public String getPalo() {
        return palo;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL VALOR DEL NÚMERO DE LA CARTA
     * @param numero NUEVO NÚMERO DE LA CARTA
     */

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL VALOR DEL PALO DE LA CARTA
     * @param palo NUEVO PALO DE LA CARTA
     */

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    /**
     * MÉTODO PERSONALIZADO
     * SE MUESTRA LA CARTA
     * TENIENDO EN CUENTA
     * SU PALO Y SU NÚMERO
     */
    
    public void mostrarCarta(){
        String palo = "";
        String numero = "";
        
        if (null == this.palo){
            palo = "JOKER";
        } else palo = switch (this.palo) {
            case "C" -> "CORAZONES.";
            case "P" -> "PICAS.";
            case "T" -> "TRÉBOLES.";
            case "R" -> "ROMBOS.";
            default -> "JOKER";
        };
        
        numero = switch (this.numero) {
            case 1 -> "el -AS-";
            case 2 -> "el 2";
            case 3 -> "el 3";
            case 4 -> "el 4";
            case 5 -> "el 5";
            case 6 -> "el 6";
            case 7 -> "el 7";
            case 8 -> "el 8";
            case 9 -> "el 9";
            case 10 -> "el 10";
            case 11 -> "el JACK -J-";
            case 12 -> "la REINA -Q-";
            case 13 -> "el REY -K-";
            default -> "JOKER";
        };
        
        if ("JOKER".equals(palo) || "JOKER".equals(numero)){
            System.out.println("¡ ¡ ¡ ¡ ¡ ¡ Es el JOKER ! ! ! ! ! !");
        } else {
            System.out.println("Es " + numero + " de " + palo);
        }
    }
    
    /**
    * MÉTODO PERSONALIZADO
    * COMPARA DOS CARTAS PARA SABER CUÁL ES MAYOR
    * @param c LA CARTA CON LA QUE HAY QUE COMPARAR
    * @return EL VALOR AL COMPARAR -1, 0 Y 1.
    */
    
    public int comparaCarta(Carta c){
            if (this.numero > c.getNumero()){
                return 1;
            } else if ( this.numero < c.getNumero()){
                return -1;
            } else if ( "T".equals(this.palo) && !"T".equals(c.getPalo())){
                return 1;
            } else if ( "T".equals(c.getPalo()) && !"T".equals(this.palo)){
                return -1;
            } else if ( "C".equals(this.palo) && !"C".equals(c.getPalo())){
                return -1;
            } else if ( "C".equals(c.getPalo()) && !"C".equals(this.palo)){
               return 1; 
            } else if ( "R".equals(this.palo) && !"R".equals(c.getPalo())){
                return 1;
            } else if ( "P".equals(this.palo) && !"P".equals(c.getPalo())){
                return -1;
            } else if ( "P".equals(c.getPalo()) && !"P".equals(this.palo)){
                return 1;
            } else if ( "R".equals(c.getPalo()) && !"R".equals(this.palo)){
                return -1;
            } else{
                return 0;
            }
        }
}
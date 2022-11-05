
package Clases;

import java.util.Random;

/**
 * ESTA CLASE REPRESENTA UNA CARTA DE LA BARAJA FRANCESA
 * @version 1.0
 * @author Juan José Estévez González
 */
public class CartaFrancesa extends CartaGenerica{
    /**
     *  DECLARACIÓN DE MÉTODOS
     *  CONSTRUCTOR POR DEFECTO
     *  CON super(); LLAMAMOS AL CONSTRUCTOR POR DEFECTO DE LA CLASE PADRE
     */
    public CartaFrancesa(){
        super();
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS
     * CON super(numero, palo); LLAMAMOS AL CONSTRUCTOR POR PARÁMETROS DE LA CLASE PADRE
     * @param numero
     * @param palo
     */
    public CartaFrancesa(int numero, String palo){
        super(numero, palo);
        
        Random r = new Random();
        int carta = 0;
    
        if (numero<1 || numero>13){
            carta = r.nextInt(13)+1;
            super.setNumero(carta);
        }
        
        if (!palo.equals("Corazones") && !palo.equals("Picas") && !palo.equals("Rombos") && !palo.equals("Tréboles")){
            carta = r.nextInt(4);
            switch (carta){
                case 0 -> super.setPalo("Corazones");
                case 1 -> super.setPalo("Picas");
                case 2 -> super.setPalo("Rombos");
                case 3 -> super.setPalo("Tréboles");
                default -> {
                }
            }
        }
    }
    /**
     * MÉTODO PERSONALIZADO
     * MUESTRA CARTAS
     */
    @Override
    public void mostrarCarta(){
        String figura;
        switch (super.getNumero()){
            case 1 -> {
                figura="As";
                System.out.println("La carta es: "+figura+" de "+super.getPalo()+".");
            }
            case 11 -> {
                figura="Jota";
                System.out.println("La carta es: "+figura+" de "+super.getPalo()+".");
            }
            case 12 -> {
                figura="Reina";
                System.out.println("La carta es: "+figura+" de "+super.getPalo()+".");
            }
            case 13 -> {
                figura="Rey";
                System.out.println("La carta es: "+figura+" de "+super.getPalo()+".");
            }
            default -> super.mostrarCarta();
        }
    }
}
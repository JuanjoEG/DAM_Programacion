
package Clases;

import java.util.Random;

/**
 * ESTA CLASE REPRESENTA UNA CARTA DE LA BARAJA DE ESPA�OLA
 * @version 1.0
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class CartaEspanola extends CartaGenerica{
    /**
     *  DECLARACI�N DE M�TODOS
     *  CONSTRUCTOR POR DEFECTO
     *  CON super(); LLAMAMOS AL CONSTRUCTOR POR DEFECTO DE LA CLASE PADRE
     */
    public CartaEspanola(){
        super();
    }
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS
     * CON super(numero, palo); LLAMAMOS AL CONSTRUCTOR POR PAR�METROS DE LA CLASE PADRE
     * @param numero
     * @param palo
     */
    public CartaEspanola(int numero, String palo){
        super(numero, palo);
        
        Random r = new Random();
        int carta=0;
        
        if (numero<1 || numero>10){
            carta= r.nextInt(10)+1;
            super.setNumero(carta);
        }
        
        if (!palo.equals("Espadas") && !palo.equals("Copas") && !palo.equals("Oros") && !palo.equals("Bastos")){
            carta = r.nextInt(4);
            switch (carta){
                case 0 -> super.setPalo("Espadas");
                case 1 -> super.setPalo("Copas");
                case 2 -> super.setPalo("Oros");
                case 3 -> super.setPalo("Bastos");
            }
        }
    }
     /**
     * M�TODO PERSONALIZADO
     * MUESTRA CARTAS
     */
    @Override
    public void mostrarCarta(){
        String figura;
        
        switch(super.getNumero()){
            case 1 -> {
                figura="As";
                System.out.println("La carta es: "+figura+" de "+super.getPalo()+".");
            }
            case 8 -> {
                figura="Sota";
                System.out.println("La carta es: "+figura+" de "+super.getPalo()+".");
            }
            case 9 -> {
                figura="Caballo";
                System.out.println("La carta es: "+figura+" de "+super.getPalo()+".");
            }
            case 10 -> {
                figura="Rey";
                System.out.println("La carta es: "+figura+" de "+super.getPalo()+".");
            }
            default -> super.mostrarCarta();
        }
    }
}
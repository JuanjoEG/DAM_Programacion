
package Clases;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Loro extends Animal {
    
    public Loro (String nombre) {
        super(nombre);
    }
    
    @Override
    public void desplazarse() {
        System.out.println("Soy el LORO "+getNombre()+" y vuelo.");
    }
}

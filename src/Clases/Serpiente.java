
package Clases;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Serpiente extends Animal {
    
    public Serpiente (String nombre) {
        super(nombre);
    }
    
    @Override
    public void desplazarse() {
        System.out.println("Soy la SERPIENTE "+getNombre()+" y repto.");
    }
}
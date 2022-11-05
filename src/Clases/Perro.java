
package Clases;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Perro extends Animal {
    
    public Perro (String nombre) {
        super(nombre);
    }
    
    @Override
    public void desplazarse() {
        System.out.println("Soy el PERRO "+getNombre()+" y ando.");
    }
}

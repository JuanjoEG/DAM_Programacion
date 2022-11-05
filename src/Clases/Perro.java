
package Clases;

/**
 *
 * @author Juan José Estévez González
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

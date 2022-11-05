
package Clases;

/**
 *
 * @author Juan José Estévez González
 * @param <T>
 */
public class ClaseGenerica<T> {
    private T dato;
    
    public ClaseGenerica(T dato) {
        this.dato = dato;
    }
    
    public void mostrarInformacion() {
        
        System.out.println("El dato vale "+this.dato+" y es del Tipo "+this.dato.getClass().getSimpleName());
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        String mensaje = "El dato vale "+this.dato+" y es del Tipo "+this.dato.getClass().getSimpleName();
        return mensaje;
    }
    
    
    /**
     * MÉTODO PERSONALIZADO
     * INTERCAMBIA DOS OBJETOS
     * @param datoA
     * @param datoB
     */
    public void intercambiar(T datoA, T datoB){
        System.out.println("\nEl dato A vale "+datoA+" y es del Tipo "+datoA.getClass().getSimpleName());
        System.out.println("El dato B vale "+datoB+" y es del Tipo "+datoB.getClass().getSimpleName());
        T aux = datoA;
        datoA = datoB;
        datoB = aux;
        System.out.println("\nEl dato A vale "+datoA+" y es del Tipo "+datoA.getClass().getSimpleName());
        System.out.println("El dato B vale "+datoB+" y es del Tipo "+datoB.getClass().getSimpleName());
    }
}
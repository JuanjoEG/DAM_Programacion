
package Clases;

/**
 * ESTA CLASE REPRESENTA UN ANIMAL
 * @version 1.0
 * @author Juan José Estévez González
 */
public abstract class Animal {
    /**
     *  DECLARACIÓN DE ATRIBUTOS
     */
    private String nombre;
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS 
     * @param nombre
     */
    public Animal(String nombre) {
        this.nombre=nombre;
    }
    /**
     * MÉTODO ABSTRACTO
     * SIN IMPLEMENTAR
     */
    public abstract void desplazarse();
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE EL NOMBRE DEL ANIMAL
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL NOMBRE DEL ANIMAL
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
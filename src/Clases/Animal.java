
package Clases;

/**
 * ESTA CLASE REPRESENTA UN ANIMAL
 * @version 1.0
 * @author Juan Jos� Est�vez Gonz�lez
 */
public abstract class Animal {
    /**
     *  DECLARACI�N DE ATRIBUTOS
     */
    private String nombre;
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS 
     * @param nombre
     */
    public Animal(String nombre) {
        this.nombre=nombre;
    }
    /**
     * M�TODO ABSTRACTO
     * SIN IMPLEMENTAR
     */
    public abstract void desplazarse();
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE EL NOMBRE DEL ANIMAL
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL NOMBRE DEL ANIMAL
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

package Clases;

/**
 * ESTA CLASE REPRESENTA UN VEHÍCULO ABSTRACTO
 * ESPAÑA / SEVILLA / 2022
 * APACHE NET BEANS IDE 14
 * TOOLS --> TEMPLATES --> SETTINGS --> BORRAR # DE ÚLTIMA LÍNEA --> USER=Juan José Estévez González
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> SOURCE/BINARY FORMAT --> JDK 18
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> PROFILE --> FULL JRE
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> ENCODING --> ISO-8859-1
 * TOOLS --> OPTIONS --> FONTS & COLOR --> PROFILE: FLATLAF DARK
 * TOOLS --> OPTIONS --> FONTS & COLOR --> FONT --> MONOSPACED 16
 * TOOLS --> OPTIONS --> MISCELLANEOUS --> OUTPUT --> FONT --> MONOSPACED 16
 * TOOLS --> OPTIONS --> MISCELLANEOUS --> TERMINAL -->FONT --> MONOSPACED 16
 * TOOLS --> OPTIONS --> APPEARANCE --> LOOK AND FEEL --> FLATLAF DARK
 * @author Juan José Estévez González
 */
public abstract class Vehiculo {
    /**
     *  DECLARACIÓN DE ATRIBUTOS
     */
    String matricula;
    int dias_alquiler;
    /**
     *  DECLARACIÓN DE MÉTODOS
     *  CONSTRUCTOR POR DEFECTO
     */
    public Vehiculo(){
        this.matricula="";
        this.dias_alquiler=0;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS 
     * @param matricula
     * @param dias_alquiler
     */
    public Vehiculo(String matricula, int dias_alquiler) {
        this.matricula = matricula;
        this.dias_alquiler = dias_alquiler;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE LA MATRÍCULA DEL VEHÍCULO
     */
    public String getMatricula() {
        return matricula;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA UN DÍA DE LA AGENDA 
     * @param matricula MODIFICA LA MATRÍCULA DEL VEHÍCULO
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE LOS DÍAS DE ALQUILER DEL VEHÍCULO
     */
    public int getDias_alquiler() {
        return dias_alquiler;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA UN DÍA DE LA AGENDA 
     * @param dias_alquiler MODIFICA LOS DÍAS DE ALQUILER DEL VEHÍCULO
     */
    public void setDias_alquiler(int dias_alquiler) {
        this.dias_alquiler = dias_alquiler;
    }
    /**
     * MÉTODO PERSONALIZADO ABSTRACTO
     * MUESTRA EL IMPORTE DEL ALQUILER
     * @return VALOR DEL ALQUILER
     */
    public abstract double importeAlquiler();
    /**
     * MÉTODO PERSONALIZADO ABSTRACTO
     * MUESTRA EL RECIBO DEL ALQUILER
     */
    public abstract void recibo();
}
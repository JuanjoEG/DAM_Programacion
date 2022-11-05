
package Clases;

/**
 * ESTA CLASE REPRESENTA UN VEH�CULO ABSTRACTO
 * ESPA�A / SEVILLA / 2022
 * APACHE NET BEANS IDE 14
 * TOOLS --> TEMPLATES --> SETTINGS --> BORRAR # DE �LTIMA L�NEA --> USER=Juan Jos� Est�vez Gonz�lez
 * BOT�N DERECHO EN PROYECTO --> PROPERTIES --> SOURCE/BINARY FORMAT --> JDK 18
 * BOT�N DERECHO EN PROYECTO --> PROPERTIES --> PROFILE --> FULL JRE
 * BOT�N DERECHO EN PROYECTO --> PROPERTIES --> ENCODING --> ISO-8859-1
 * TOOLS --> OPTIONS --> FONTS & COLOR --> PROFILE: FLATLAF DARK
 * TOOLS --> OPTIONS --> FONTS & COLOR --> FONT --> MONOSPACED 16
 * TOOLS --> OPTIONS --> MISCELLANEOUS --> OUTPUT --> FONT --> MONOSPACED 16
 * TOOLS --> OPTIONS --> MISCELLANEOUS --> TERMINAL -->FONT --> MONOSPACED 16
 * TOOLS --> OPTIONS --> APPEARANCE --> LOOK AND FEEL --> FLATLAF DARK
 * @author Juan Jos� Est�vez Gonz�lez
 */
public abstract class Vehiculo {
    /**
     *  DECLARACI�N DE ATRIBUTOS
     */
    String matricula;
    int dias_alquiler;
    /**
     *  DECLARACI�N DE M�TODOS
     *  CONSTRUCTOR POR DEFECTO
     */
    public Vehiculo(){
        this.matricula="";
        this.dias_alquiler=0;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS 
     * @param matricula
     * @param dias_alquiler
     */
    public Vehiculo(String matricula, int dias_alquiler) {
        this.matricula = matricula;
        this.dias_alquiler = dias_alquiler;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE LA MATR�CULA DEL VEH�CULO
     */
    public String getMatricula() {
        return matricula;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS MODIFICADORES - LOS SETTERS
     * MODIFICA UN D�A DE LA AGENDA 
     * @param matricula MODIFICA LA MATR�CULA DEL VEH�CULO
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE LOS D�AS DE ALQUILER DEL VEH�CULO
     */
    public int getDias_alquiler() {
        return dias_alquiler;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS MODIFICADORES - LOS SETTERS
     * MODIFICA UN D�A DE LA AGENDA 
     * @param dias_alquiler MODIFICA LOS D�AS DE ALQUILER DEL VEH�CULO
     */
    public void setDias_alquiler(int dias_alquiler) {
        this.dias_alquiler = dias_alquiler;
    }
    /**
     * M�TODO PERSONALIZADO ABSTRACTO
     * MUESTRA EL IMPORTE DEL ALQUILER
     * @return VALOR DEL ALQUILER
     */
    public abstract double importeAlquiler();
    /**
     * M�TODO PERSONALIZADO ABSTRACTO
     * MUESTRA EL RECIBO DEL ALQUILER
     */
    public abstract void recibo();
}
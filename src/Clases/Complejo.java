
package Clases;

/**
 * ESTA CLASE REPRESENTA UN NÚMERO COMPLEJO
 * @version 1.0
 * @author Juan José Estévez González
 */
public class Complejo {
    /**
     *  DECLARACIÓN DE ATRIBUTOS
     */
    private double real;
    private double imag;
    /**
     *  DECLARACIÓN DE MÉTODOS
     *  CONSTRUCTOR POR DEFECTO
     */
    public Complejo() {
        this.real=0;
        this.imag=0;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS 
     * @param real
     * @param imag
     */
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR DE COPIA
     * @param copia 
     */
    public Complejo(Complejo copia){
        real=copia.real;
        imag=copia.imag;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE LA PARTE REAL
     */
    public double getReal() {
        return real;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA LA PARTE REAL
     * @param real
     */
    public void setReal(double real) {
        this.real = real;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE LA PARTE IMAGINARIA
     */
    public double getImag() {
        return imag;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA LA PARTE IMAGINARIA
     * @param imag
     */
    public void setImag(double imag) {
        this.imag = imag;
    }
    /**
     * MÉTODO toString
     * @return MUESTRA UN RESUMEN DEL OBJETO
     */
    @Override
    public String toString() {
        return real+" + "+imag+"i";
    }
    /**
     * MÉTODO PERSONALIZADO
     * SUMA DOS COMPLEJOS
     * @param b 
     */
    public void Sumar(Complejo b){
        this.real = b.getReal()+this.real;
        this.imag = b.getImag()+this.imag;
    }
    /**
     * MÉTODO PERSONALIZADO ESTÁTICO
     * SUMA DOS COMPLEJOS
     * @param a
     * @param b
     * @return 
     */
    public static Complejo SumarComplejos(Complejo a, Complejo b){
        Complejo c = new Complejo();
        c.setReal(a.getReal()+b.getReal());
        c.setImag(a.getImag()+b.getImag());
        return c;
    }
}
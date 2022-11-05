
package Clases;

/**
 * ESTA CLASE REPRESENTA UN N�MERO COMPLEJO
 * @version 1.0
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Complejo {
    /**
     *  DECLARACI�N DE ATRIBUTOS
     */
    private double real;
    private double imag;
    /**
     *  DECLARACI�N DE M�TODOS
     *  CONSTRUCTOR POR DEFECTO
     */
    public Complejo() {
        this.real=0;
        this.imag=0;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS 
     * @param real
     * @param imag
     */
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR DE COPIA
     * @param copia 
     */
    public Complejo(Complejo copia){
        real=copia.real;
        imag=copia.imag;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE LA PARTE REAL
     */
    public double getReal() {
        return real;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS MODIFICADORES - LOS SETTERS
     * MODIFICA LA PARTE REAL
     * @param real
     */
    public void setReal(double real) {
        this.real = real;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE LA PARTE IMAGINARIA
     */
    public double getImag() {
        return imag;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS MODIFICADORES - LOS SETTERS
     * MODIFICA LA PARTE IMAGINARIA
     * @param imag
     */
    public void setImag(double imag) {
        this.imag = imag;
    }
    /**
     * M�TODO toString
     * @return MUESTRA UN RESUMEN DEL OBJETO
     */
    @Override
    public String toString() {
        return real+" + "+imag+"i";
    }
    /**
     * M�TODO PERSONALIZADO
     * SUMA DOS COMPLEJOS
     * @param b 
     */
    public void Sumar(Complejo b){
        this.real = b.getReal()+this.real;
        this.imag = b.getImag()+this.imag;
    }
    /**
     * M�TODO PERSONALIZADO EST�TICO
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
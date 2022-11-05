
package Clases;

/**
 * ESTA CLASE REPRESENTA UN CAMIÓN
 * @version 1.0
 * @author Juan José Estévez González
 */
public class Camion extends Vehiculo{
    /**
     *  DECLARACIÓN DE ATRIBUTOS
     */
    private int tara;
    /**
     *  DECLARACIÓN DE MÉTODOS
     *  CONSTRUCTOR POR DEFECTO
     *  CON super(); LLAMAMOS AL CONSTRUCTOR POR DEFECTO DE LA CLASE PADRE
     */
    public Camion(){
        super();
        tara=0;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS
     * @param tara
     */
    public Camion(int tara) {
        this.tara = tara;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS
     * CON super(matricula, dias_alquiler); LLAMAMOS AL CONSTRUCTOR POR PARÁMETROS DE LA CLASE PADRE
     * @param tara
     * @param matricula
     * @param dias_alquiler
     */
    public Camion(int tara, String matricula, int dias_alquiler) {
        super(matricula, dias_alquiler);
        this.tara = tara;
    }
    /**
     * MÉTODO PERSONALIZADO
     * MUESTRA EL IMPORTE DEL ALQUILER
     * @return 
     */
    @Override
    public double importeAlquiler(){
        return 50*super.getDias_alquiler()+(20*tara*super.getDias_alquiler()/1000)+40;
    }
    /**
     * MÉTODO PERSONALIZADO
     * MUESTRA UN RECIBO
     */
    @Override
    public void recibo(){
        System.out.println("-------------------------------------------------\n"
                          +"CAMIÓN\n"
                          +"- - - - - - - - - - - - - - - - - - - - - - - - -\n"
                          +"Matrí­cula: "+super.getMatricula()+"\n"
                          +"Duración: "+super.getDias_alquiler()+"\n"
                          +"TARA: "+tara+"\n"
                          +"Importe del Alquiler: "+importeAlquiler());
    }
}
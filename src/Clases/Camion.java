
package Clases;

/**
 * ESTA CLASE REPRESENTA UN CAMI�N
 * @version 1.0
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Camion extends Vehiculo{
    /**
     *  DECLARACI�N DE ATRIBUTOS
     */
    private int tara;
    /**
     *  DECLARACI�N DE M�TODOS
     *  CONSTRUCTOR POR DEFECTO
     *  CON super(); LLAMAMOS AL CONSTRUCTOR POR DEFECTO DE LA CLASE PADRE
     */
    public Camion(){
        super();
        tara=0;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS
     * @param tara
     */
    public Camion(int tara) {
        this.tara = tara;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS
     * CON super(matricula, dias_alquiler); LLAMAMOS AL CONSTRUCTOR POR PAR�METROS DE LA CLASE PADRE
     * @param tara
     * @param matricula
     * @param dias_alquiler
     */
    public Camion(int tara, String matricula, int dias_alquiler) {
        super(matricula, dias_alquiler);
        this.tara = tara;
    }
    /**
     * M�TODO PERSONALIZADO
     * MUESTRA EL IMPORTE DEL ALQUILER
     * @return 
     */
    @Override
    public double importeAlquiler(){
        return 50*super.getDias_alquiler()+(20*tara*super.getDias_alquiler()/1000)+40;
    }
    /**
     * M�TODO PERSONALIZADO
     * MUESTRA UN RECIBO
     */
    @Override
    public void recibo(){
        System.out.println("-------------------------------------------------\n"
                          +"CAMI�N\n"
                          +"- - - - - - - - - - - - - - - - - - - - - - - - -\n"
                          +"Matr�cula: "+super.getMatricula()+"\n"
                          +"Duraci�n: "+super.getDias_alquiler()+"\n"
                          +"TARA: "+tara+"\n"
                          +"Importe del Alquiler: "+importeAlquiler());
    }
}
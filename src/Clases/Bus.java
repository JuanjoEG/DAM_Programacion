
package Clases;

/**
 * ESTA CLASE REPRESENTA UN BUS
 * @version 1.0
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Bus extends Vehiculo{
    /**
     *  DECLARACI�N DE ATRIBUTOS
     */
    private int plazas;
    /**
     *  DECLARACI�N DE M�TODOS
     *  CONSTRUCTOR POR DEFECTO
     *  CON super(); LLAMAMOS AL CONSTRUCTOR POR DEFECTO DE LA CLASE PADRE
     */
    public Bus(){
        super();
        plazas=0;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS
     * CON super(matricula, dias_alquiler); LLAMAMOS AL CONSTRUCTOR POR PAR�METROS DE LA CLASE PADRE
     * @param plazas
     * @param matricula
     * @param dias_alquiler
     */
    public Bus(int plazas, String matricula, int dias_alquiler) {
        super(matricula, dias_alquiler);
        this.plazas = plazas;
    }
    /**
     * M�TODO PERSONALIZADO
     * MUESTRA EL IMPORTE DEL ALQUILER
     * @return 
     */
    @Override
    public double importeAlquiler(){
        return 50*super.getDias_alquiler()+(1.5*plazas*super.getDias_alquiler())+(2*plazas);
    }
    /**
     * M�TODO PERSONALIZADO
     * MUESTRA UN RECIBO
     */
    @Override
    public void recibo(){
        System.out.println("-------------------------------------------------\n"
                          +"BUS\n"
                          +"- - - - - - - - - - - - - - - - - - - - - - - - -\n"
                          +"Matr�cula: "+super.getMatricula()+"\n"
                          +"Duraci�n: "+super.getDias_alquiler()+"\n"
                          +"Plazas: "+plazas+"\n"
                          +"Importe del Alquiler: "+importeAlquiler());
    }
}

package Clases;

/**
 * ESTA CLASE REPRESENTA UN BUS
 * @version 1.0
 * @author Juan José Estévez González
 */
public class Bus extends Vehiculo{
    /**
     *  DECLARACIÓN DE ATRIBUTOS
     */
    private int plazas;
    /**
     *  DECLARACIÓN DE MÉTODOS
     *  CONSTRUCTOR POR DEFECTO
     *  CON super(); LLAMAMOS AL CONSTRUCTOR POR DEFECTO DE LA CLASE PADRE
     */
    public Bus(){
        super();
        plazas=0;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS
     * CON super(matricula, dias_alquiler); LLAMAMOS AL CONSTRUCTOR POR PARÁMETROS DE LA CLASE PADRE
     * @param plazas
     * @param matricula
     * @param dias_alquiler
     */
    public Bus(int plazas, String matricula, int dias_alquiler) {
        super(matricula, dias_alquiler);
        this.plazas = plazas;
    }
    /**
     * MÉTODO PERSONALIZADO
     * MUESTRA EL IMPORTE DEL ALQUILER
     * @return 
     */
    @Override
    public double importeAlquiler(){
        return 50*super.getDias_alquiler()+(1.5*plazas*super.getDias_alquiler())+(2*plazas);
    }
    /**
     * MÉTODO PERSONALIZADO
     * MUESTRA UN RECIBO
     */
    @Override
    public void recibo(){
        System.out.println("-------------------------------------------------\n"
                          +"BUS\n"
                          +"- - - - - - - - - - - - - - - - - - - - - - - - -\n"
                          +"Matrí­cula: "+super.getMatricula()+"\n"
                          +"Duración: "+super.getDias_alquiler()+"\n"
                          +"Plazas: "+plazas+"\n"
                          +"Importe del Alquiler: "+importeAlquiler());
    }
}
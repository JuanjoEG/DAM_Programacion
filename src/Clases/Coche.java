
package Clases;

/**
 * ESTA CLASE REPRESENTA UN COCHE
 * @version 1.0
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Coche extends Vehiculo{
    /**
     *  DECLARACI�N DE ATRIBUTOS
     */
    private String marca , modelo , matricula  ;
    private int plazas;
    /**
     *  DECLARACI�N DE M�TODOS
     *  CONSTRUCTOR POR DEFECTO
     *  CON super(); LLAMAMOS AL CONSTRUCTOR POR DEFECTO DE LA CLASE PADRE
     */
    public Coche() {
        super();
        this.marca="";
        this.modelo="";
        this.matricula="";
        this.plazas=0;
    }
    
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR DE COPIA
     * @param copia 
     */
    public Coche(Coche copia) {
        this.marca=copia.getMarca();
        this.modelo=copia.getModelo();
        this.matricula=copia.getMatricula();
        this.plazas=copia.getPlazas();
    }
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS
     * @param matricula
     * @param modelo
     * @param marca
     */
    public Coche(String matricula, String modelo, String marca) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE LA MARCA DEL COCHE
     */
    public String getMarca() {
        return this.marca;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE EL MODELO DEL COCHE
     */
    public String getModelo() {
        return this.modelo;
    }

    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE LA MATR�CULA DEL COCHE
     */
    @Override
    public String getMatricula() {
        return this.matricula;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE LAS PLAZAS DEL COCHE
     */
    public int getPlazas() {
        return this.plazas;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS MODIFICADORES - LOS SETTERS
     * MODIFICA LA MARCA DEL COCHE
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL MODELO DEL COCHE
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS MODIFICADORES - LOS SETTERS
     * MODIFICA LA MATR�CULA DEL COCHE
     * @param matricula
     */
    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS MODIFICADORES - LOS SETTERS
     * MODIFICA LAS PLAZAS DEL COCHE
     * @param plazas
     */
    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS
     * CON super(matricula, dias_alquiler); LLAMAMOS AL CONSTRUCTOR POR PAR�METROS DE LA CLASE PADRE
     * @param plazas
     * @param matricula
     * @param dias_alquiler
     */
    public Coche(int plazas, String matricula, int dias_alquiler) {
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
        return 50*super.getDias_alquiler()+(1.5*plazas*super.getDias_alquiler());
    }
    /**
     * M�TODO PERSONALIZADO
     * MUESTRA UN RECIBO
     */
    @Override
    public void recibo(){
        System.out.println("-------------------------------------------------\n"
                          +"COCHE\n"
                          +"- - - - - - - - - - - - - - - - - - - - - - - - -\n"
                          +"Matr�cula: "+super.getMatricula()+"\n"
                          +"Duraci�n: "+super.getDias_alquiler()+"\n"
                          +"Plazas: "+plazas+"\n"
                          +"Importe del Alquiler: "+importeAlquiler());
    }
}
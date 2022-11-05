
package Clases;

/**
 * ESTA CLASE REPRESENTA UN COCHE
 * @version 1.0
 * @author Juan José Estévez González
 */
public class Coche extends Vehiculo{
    /**
     *  DECLARACIÓN DE ATRIBUTOS
     */
    private String marca , modelo , matricula  ;
    private int plazas;
    /**
     *  DECLARACIÓN DE MÉTODOS
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
     * DECLARACIÓN DE MÉTODOS
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
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS
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
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE LA MARCA DEL COCHE
     */
    public String getMarca() {
        return this.marca;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE EL MODELO DEL COCHE
     */
    public String getModelo() {
        return this.modelo;
    }

    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE LA MATRÍCULA DEL COCHE
     */
    @Override
    public String getMatricula() {
        return this.matricula;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE LAS PLAZAS DEL COCHE
     */
    public int getPlazas() {
        return this.plazas;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA LA MARCA DEL COCHE
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL MODELO DEL COCHE
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA LA MATRÍCULA DEL COCHE
     * @param matricula
     */
    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA LAS PLAZAS DEL COCHE
     * @param plazas
     */
    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS
     * CON super(matricula, dias_alquiler); LLAMAMOS AL CONSTRUCTOR POR PARÁMETROS DE LA CLASE PADRE
     * @param plazas
     * @param matricula
     * @param dias_alquiler
     */
    public Coche(int plazas, String matricula, int dias_alquiler) {
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
        return 50*super.getDias_alquiler()+(1.5*plazas*super.getDias_alquiler());
    }
    /**
     * MÉTODO PERSONALIZADO
     * MUESTRA UN RECIBO
     */
    @Override
    public void recibo(){
        System.out.println("-------------------------------------------------\n"
                          +"COCHE\n"
                          +"- - - - - - - - - - - - - - - - - - - - - - - - -\n"
                          +"Matrí­cula: "+super.getMatricula()+"\n"
                          +"Duración: "+super.getDias_alquiler()+"\n"
                          +"Plazas: "+plazas+"\n"
                          +"Importe del Alquiler: "+importeAlquiler());
    }
}
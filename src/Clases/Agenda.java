
package Clases;

/**
 * ESTA CLASE REPRESENTA UNA AGENDA
 * @version 1.0
 * @author Juan José Estévez González
 */
public class Agenda {
    
    /**
     *  DECLARACIÓN DE ATRIBUTOS
     */
    
    String lunes, martes, miercoles, jueves, viernes;
    
    /**
     *  DECLARACIÓN DE MÉTODOS
     *  CONSTRUCTOR POR DEFECTO
     */

    public Agenda() {
        lunes="";
        martes="";
        miercoles="";
        jueves="";
        viernes="";
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS
     * @param lunes
     * @param martes
     * @param miercoles
     * @param jueves
     * @param viernes 
     */

    public Agenda(String lunes, String martes, String miercoles, String jueves, String viernes) {
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR DE COPIA
     * @param copia 
     */

    public Agenda(Agenda copia){
        lunes=copia.lunes;
        martes=copia.martes;
        miercoles=copia.miercoles;
        jueves=copia.jueves;
        viernes=copia.viernes;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE EL DÍA DE LA AGENDA
     */

    public String getLunes() {
        return lunes;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA UN DÍA DE LA AGENDA
     * @param lunes NUEVO LUNES DE LA AGENDA 
     */

    public void setLunes(String lunes) {
        this.lunes = lunes;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE EL DÍA DE LA AGENDA
     */

    public String getMartes() {
        return martes;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA UN DÍA DE LA AGENDA
     * @param martes NUEVO MARTES DE LA AGENDA 
     */

    public void setMartes(String martes) {
        this.martes = martes;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE EL DÍA DE LA AGENDA
     */

    public String getMiercoles() {
        return miercoles;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA UN DÍA DE LA AGENDA
     * @param miercoles NUEVO MIERCOLES DE LA AGENDA 
     */

    public void setMiercoles(String miercoles) {
        this.miercoles = miercoles;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE EL DÍA DE LA AGENDA
     */

    public String getJueves() {
        return jueves;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA UN DÍA DE LA AGENDA
     * @param jueves NUEVO JUEVES DE LA AGENDA 
     */

    public void setJueves(String jueves) {
        this.jueves = jueves;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE EL DÍA DE LA AGENDA
     */

    public String getViernes() {
        return viernes;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA UN DÍA DE LA AGENDA
     * @param viernes NUEVO VIERNES DE LA AGENDA
     */

    public void setViernes(String viernes) {
        this.viernes = viernes;
    }
    
    /**
     * MÉTODO PERSONALIZADO
     * MUESTRA UN DÍA DE LA AGENDA
     * @param dia A MOSTRAR
     */
    
    public void mostrarDia(int dia){
        switch(dia){
            case 1 -> System.out.println(lunes);
            case 2 -> System.out.println(martes);
            case 3 -> System.out.println(miercoles);
            case 4 -> System.out.println(jueves);
            case 5 -> System.out.println(viernes);
            default -> System.out.println("......ERROR......");
        
        }
        
    }
    
    /**
     * MÉTODO toString
     * @return MUESTRA UN RESUMEN DEL OBJETO
     */

    @Override
    public String toString() {
        String mensaje = """
                         **********************************
                           AGENDA
                         """;
            mensaje +="Lunes= " + lunes +"\n";
            mensaje +="Martes= " + martes +"\n";
            mensaje +="Miércoles= " + miercoles +"\n";
            mensaje +="Jueves= " + jueves +"\n";
            mensaje +="Viernes= " + viernes +"\n"; 
            mensaje += """
                       **********************************
                       """;
        return mensaje;
    }
}
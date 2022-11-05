
package Clases;

/**
 * ESTA CLASE REPRESENTA UNA AGENDA
 * @version 1.0
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Agenda {
    
    /**
     *  DECLARACI�N DE ATRIBUTOS
     */
    
    String lunes, martes, miercoles, jueves, viernes;
    
    /**
     *  DECLARACI�N DE M�TODOS
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
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS
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
     * DECLARACI�N DE M�TODOS
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
     * DECLARACI�N DE M�TODOS
     * M�TODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE EL D�A DE LA AGENDA
     */

    public String getLunes() {
        return lunes;
    }
    
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS MODIFICADORES - LOS SETTERS
     * MODIFICA UN D�A DE LA AGENDA
     * @param lunes NUEVO LUNES DE LA AGENDA 
     */

    public void setLunes(String lunes) {
        this.lunes = lunes;
    }
    
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE EL D�A DE LA AGENDA
     */

    public String getMartes() {
        return martes;
    }
    
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS MODIFICADORES - LOS SETTERS
     * MODIFICA UN D�A DE LA AGENDA
     * @param martes NUEVO MARTES DE LA AGENDA 
     */

    public void setMartes(String martes) {
        this.martes = martes;
    }
    
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE EL D�A DE LA AGENDA
     */

    public String getMiercoles() {
        return miercoles;
    }
    
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS MODIFICADORES - LOS SETTERS
     * MODIFICA UN D�A DE LA AGENDA
     * @param miercoles NUEVO MIERCOLES DE LA AGENDA 
     */

    public void setMiercoles(String miercoles) {
        this.miercoles = miercoles;
    }
    
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE EL D�A DE LA AGENDA
     */

    public String getJueves() {
        return jueves;
    }
    
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS MODIFICADORES - LOS SETTERS
     * MODIFICA UN D�A DE LA AGENDA
     * @param jueves NUEVO JUEVES DE LA AGENDA 
     */

    public void setJueves(String jueves) {
        this.jueves = jueves;
    }
    
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS OBSERVADORES - LOS GETTERS
     * @return DEVUELVE EL D�A DE LA AGENDA
     */

    public String getViernes() {
        return viernes;
    }
    
    /**
     * DECLARACI�N DE M�TODOS
     * M�TODOS MODIFICADORES - LOS SETTERS
     * MODIFICA UN D�A DE LA AGENDA
     * @param viernes NUEVO VIERNES DE LA AGENDA
     */

    public void setViernes(String viernes) {
        this.viernes = viernes;
    }
    
    /**
     * M�TODO PERSONALIZADO
     * MUESTRA UN D�A DE LA AGENDA
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
     * M�TODO toString
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
            mensaje +="Mi�rcoles= " + miercoles +"\n";
            mensaje +="Jueves= " + jueves +"\n";
            mensaje +="Viernes= " + viernes +"\n"; 
            mensaje += """
                       **********************************
                       """;
        return mensaje;
    }
}
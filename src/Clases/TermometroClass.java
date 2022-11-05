
package Clases;

/**
 *
 * @author Juan José Estévez González
 */
public class TermometroClass {
    /**
     *  DECLARACIÓN DE ATRIBUTOS
     */
    private float temperatura;
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS
     * USAMOS UN CONDICIONAL if PARA LANZAR NUESTRA EXCEPCIÓN PERSONALIZADA CON throw new
     * @param temperatura
     * @throws Clases.FueraRangoException
     */
    public TermometroClass(float temperatura) throws FueraRangoException {
        String mensaje = "LA TEMPERATURA NO ES CORRECTA \n"
                    + "FALLO AL CONSTRUIR EL OBJETO:\n"
                    + "RANGO RECOMENDADO -->  [ (-20)  <-->  (+90) ]\n";
        if (temperatura < -20 || temperatura > 90){
            
            throw new FueraRangoException(mensaje);
        }
        this.temperatura = temperatura;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL VALOR DE LA TEMPERATURA
     * USAMOS UN CONDICIONAL if PARA LANZAR NUESTRA EXCEPCIÓN PERSONALIZADA CON throw new
     * @param temperatura
     * @throws Clases.FueraRangoException
     */
    public void setTemperatura(float temperatura) throws FueraRangoException {
        String mensaje = "LA TEMPERATURA NO ES CORRECTA \n"
                    + "FALLO AL MODIFICAR LA TEMPERATURA DEL OBJETO:\n"
                    + "RANGO RECOMENDADO -->  [ (-20)  <-->  (+90) ]\n";
        if (temperatura < -20 || temperatura > 90){
            
            throw new FueraRangoException(mensaje);
        }
        this.temperatura = temperatura;
    }
    /**
     * MÉTODO PERSONALIZADO
     * MUESTRA LA TEMPERATURA DEL TERMOMETRO
     */
    public void imprimir() {
        System.out.println("\nMÉTODO imprimir\n"
                + "LA TEMPERATURA ES DE:  " + temperatura +"º");
    }
    /**
     * MÉTODO toString
     * @return mensaje MUESTRA UN RESUMEN DEL TERMOMETRO
     */
    @Override
    public String toString() {
        String mensaje = "\nMÉTODO toString\n"
                    + "LA TEMPERATURA ES DE:  " + temperatura +"º\n"
                    + "RANGO RECOMENDADO -->  [ (-20)  <-->  (+90) ]\n";
        return mensaje;
    }
}
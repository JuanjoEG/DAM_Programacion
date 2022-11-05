
package Clases;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class TermometroClass {
    /**
     *  DECLARACI�N DE ATRIBUTOS
     */
    private float temperatura;
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS
     * USAMOS UN CONDICIONAL if PARA LANZAR NUESTRA EXCEPCI�N PERSONALIZADA CON throw new
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
     * DECLARACI�N DE M�TODOS
     * M�TODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL VALOR DE LA TEMPERATURA
     * USAMOS UN CONDICIONAL if PARA LANZAR NUESTRA EXCEPCI�N PERSONALIZADA CON throw new
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
     * M�TODO PERSONALIZADO
     * MUESTRA LA TEMPERATURA DEL TERMOMETRO
     */
    public void imprimir() {
        System.out.println("\nM�TODO imprimir\n"
                + "LA TEMPERATURA ES DE:  " + temperatura +"�");
    }
    /**
     * M�TODO toString
     * @return mensaje MUESTRA UN RESUMEN DEL TERMOMETRO
     */
    @Override
    public String toString() {
        String mensaje = "\nM�TODO toString\n"
                    + "LA TEMPERATURA ES DE:  " + temperatura +"�\n"
                    + "RANGO RECOMENDADO -->  [ (-20)  <-->  (+90) ]\n";
        return mensaje;
    }
}
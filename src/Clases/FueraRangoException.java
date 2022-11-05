
package Clases;

/**
 *
 * @author Juan José Estévez González
 */
public class FueraRangoException extends Exception {
    
    public FueraRangoException (String mensaje){
    
        super("\n\n   ¡¡¡ ATENCIÓN !!!   \n\n"+mensaje+"\n");
    }
    
    /* NECESITAMOS QUE HEREDE DE Exception.
    * QUE SU NOMBRE ESTÉ RELACIONADO CON SU FUNCIONALIDAD.
    * QUE SU NOMBRE TERMINE EN ...Exception.
    * TENDRÁ UN CONSTRUCTOR QUE LE LLEGA UN String COMO PARÁMETRO.
    * String  -->  MENSAJE DE NUETRO ERROR PERSONALIZADO.
    */
}

package Clases;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class FueraRangoException extends Exception {
    
    public FueraRangoException (String mensaje){
    
        super("\n\n   ��� ATENCI�N !!!   \n\n"+mensaje+"\n");
    }
    
    /* NECESITAMOS QUE HEREDE DE Exception.
    * QUE SU NOMBRE EST� RELACIONADO CON SU FUNCIONALIDAD.
    * QUE SU NOMBRE TERMINE EN ...Exception.
    * TENDR� UN CONSTRUCTOR QUE LE LLEGA UN String COMO PAR�METRO.
    * String  -->  MENSAJE DE NUETRO ERROR PERSONALIZADO.
    */
}
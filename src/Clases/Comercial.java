
package Clases;

/**
 * ESTA CLASE REPRESENTA UN COMERCIAL
 * @version 1.0
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Comercial extends Empleado {
    /**
     *  DECLARACI�N DE ATRIBUTOS
     */
    private double comision;
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS
     * CON super(nombre, apellido, edad, salario); LLAMAMOS AL CONSTRUCTOR POR PAR�METROS DE LA CLASE PADRE
     * @param nombre
     * @param apellido
     * @param edad
     * @param salario
     * @param comision
     */
    public Comercial(String nombre, String apellido, int edad, double salario, double comision) {
        super(nombre, apellido, edad, salario);
        this.comision=comision;
    }
     /*
    *M�TODO PERSONALIZADO
    * A�ADE UN PLUS AL SALARIO
    */
    @Override
    public boolean plus(double plus) {
        boolean aumento = false;
        if (edad >= 40 || comision>=200) {
            salario += plus;
            aumento = true;
        }
        return aumento;
    }
     
    public void metodoComercial(){
        System.out.println("Estoy en la clase comercial");
    }
}
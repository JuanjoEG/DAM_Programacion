
package Clases;

/**
 * ESTA CLASE REPRESENTA UN COMERCIAL
 * @version 1.0
 * @author Juan José Estévez González
 */
public class Comercial extends Empleado {
    /**
     *  DECLARACIÓN DE ATRIBUTOS
     */
    private double comision;
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS
     * CON super(nombre, apellido, edad, salario); LLAMAMOS AL CONSTRUCTOR POR PARÁMETROS DE LA CLASE PADRE
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
    *MÉTODO PERSONALIZADO
    * AÑADE UN PLUS AL SALARIO
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
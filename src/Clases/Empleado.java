
package Clases;

/**
 * ESTA CLASE REPRESENTA UN COMERCIAL
 * @version 1.0
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Empleado {
    /**
     *  DECLARACI�N DE ATRIBUTOS
     */
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double salario;
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS
     * @param nombre
     * @param apellido
     * @param edad
     * @param salario
     */
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS
     * @param nombre
     * @param apellido
     * @param edad
     */
    public Empleado(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    
    }
    
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getApellido() {
        return apellido;
    }
 
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
 
    public int getEdad() {
        return edad;
    }
 
    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    public double getSalario() {
        return salario;
    }
 
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario + '}';
    }
 
    public boolean plus(double plus) {
        boolean aumento = false;
        if (edad >= 40) {
            salario += plus;
            aumento = true;
        }
        return aumento;
    }
}
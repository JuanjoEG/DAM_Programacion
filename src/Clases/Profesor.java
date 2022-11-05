
package Clases;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Profesor extends Persona {
    
    //ATRIBUTO
    private int codigoprofesor;

    //CONSTRUCTOR POR DEFECTO
    public Profesor() {
        super();
        codigoprofesor = 0;        
    }
    
    //CONSTRUCTOR POR PARAMETROS
    public Profesor(int codigoprofesor, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.codigoprofesor = codigoprofesor;
    }
     
    //OBSEVADORES
    public int getCodigoprofesor() {
        return codigoprofesor;
    }
    
    //MODIFICADORES
    public void setCodigoprofesor(int codigoprofesor) {
        this.codigoprofesor = codigoprofesor;
    }

    //M�TODO toString
    @Override
    public String toString() {
        return "Profesor{" + "codigoprofesor=" + codigoprofesor + '}';
    }
    
    //M�TODO SALUDAR
    @Override
    public void saludar() {
        System.out.println("Hola soy el PROFESOR "+this.getNombre()+" - CLASE PROFESOR");
    }
    
}

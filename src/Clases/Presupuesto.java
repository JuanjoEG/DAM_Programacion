
package Clases;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Presupuesto {
    /**
     *  DECLARACI�N DE ATRIBUTOS
     */
    private String cliente;
    private String descripcion;
    private double importe;
    /**
     *  DECLARACI�N DE M�TODOS
     *  CONSTRUCTOR POR DEFECTO
     */
    public Presupuesto() {
        cliente="";
        descripcion="";
        importe=0;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS
     * @param cliente
     * @param descripcion
     * @param importe 
     */
    public Presupuesto(String cliente, String descripcion, double importe) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    public void imprimirPresupuesto(){
        System.out.println("Cliente:\n" + cliente + "\n");
        System.out.println("Art�culos presupuestados;\n"+descripcion+"\n");
        System.out.println("Importe TOTAL:\n"+importe);
    }    
}
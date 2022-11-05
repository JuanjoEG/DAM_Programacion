
package Clases;

/**
 *
 * @author Juan José Estévez González
 */
public class Presupuesto {
    /**
     *  DECLARACIÓN DE ATRIBUTOS
     */
    private String cliente;
    private String descripcion;
    private double importe;
    /**
     *  DECLARACIÓN DE MÉTODOS
     *  CONSTRUCTOR POR DEFECTO
     */
    public Presupuesto() {
        cliente="";
        descripcion="";
        importe=0;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS
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
        System.out.println("Artículos presupuestados;\n"+descripcion+"\n");
        System.out.println("Importe TOTAL:\n"+importe);
    }    
}
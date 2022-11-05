
package Clases;

/**
 * CLASE FACTURA QUE HEREDA DE PRESUPUESTO 
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Factura extends Presupuesto{
    /**
     *  DECLARACI�N DE ATRIBUTOS
     */
    private final String fabricante;
    /**
     *  DECLARACI�N DE M�TODOS
     *  CONSTRUCTOR POR DEFECTO
     *  LLAMAMOS AL CONSTRUCTOR POR DEFECTO DE LA CLASE PADRE CON super();
     */
    public Factura(){
        super();
        fabricante="Productos ACME S.L.";
    }
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS
     * @param fabricante 
     */
    public Factura(String fabricante) {
        this.fabricante = fabricante;
    }
    /**
     * DECLARACI�N DE M�TODOS
     * CONSTRUCTOR POR PAR�METROS
     * LLAMAMOS AL CONSTRUCTOR POR PAR�METROS DE LA CLASE PADRE CON super(cliente, descripcion, importe);
     * @param cliente
     * @param descripcion
     * @param importe 
     */
    public Factura(String cliente, String descripcion, double importe){
        super(cliente, descripcion, importe);
        fabricante="Productos ACME S.L.";
    }
    /**
     * M�TODO PERSONALIZADO
     * CALCULA EL PRECIO
     * @return VALOR DEL PRECIO
     */
    public double obtenerPrecioOficial(){
        double temporal, precio;
        temporal = (super.getImporte()*0.21) + super.getImporte();
        precio = Math.round(temporal*100.00)/100.00;
        return precio;
    }
    /**
     * M�TODO PERSONALIZADO
     * MUESTRA EL PRESUPUESTO
     */
    @Override
    public void imprimirPresupuesto(){
        super.imprimirPresupuesto();
        System.out.println("Importe + IVA: "+ obtenerPrecioOficial());
        System.out.println("Fabricante: "+ fabricante);
    }
}
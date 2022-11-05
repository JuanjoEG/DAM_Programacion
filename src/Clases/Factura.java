
package Clases;

/**
 * CLASE FACTURA QUE HEREDA DE PRESUPUESTO 
 * @author Juan José Estévez González
 */
public class Factura extends Presupuesto{
    /**
     *  DECLARACIÓN DE ATRIBUTOS
     */
    private final String fabricante;
    /**
     *  DECLARACIÓN DE MÉTODOS
     *  CONSTRUCTOR POR DEFECTO
     *  LLAMAMOS AL CONSTRUCTOR POR DEFECTO DE LA CLASE PADRE CON super();
     */
    public Factura(){
        super();
        fabricante="Productos ACME S.L.";
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS
     * @param fabricante 
     */
    public Factura(String fabricante) {
        this.fabricante = fabricante;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS
     * LLAMAMOS AL CONSTRUCTOR POR PARÁMETROS DE LA CLASE PADRE CON super(cliente, descripcion, importe);
     * @param cliente
     * @param descripcion
     * @param importe 
     */
    public Factura(String cliente, String descripcion, double importe){
        super(cliente, descripcion, importe);
        fabricante="Productos ACME S.L.";
    }
    /**
     * MÉTODO PERSONALIZADO
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
     * MÉTODO PERSONALIZADO
     * MUESTRA EL PRESUPUESTO
     */
    @Override
    public void imprimirPresupuesto(){
        super.imprimirPresupuesto();
        System.out.println("Importe + IVA: "+ obtenerPrecioOficial());
        System.out.println("Fabricante: "+ fabricante);
    }
}

package Clases;

/**
 * Clase que representa una cuenta corriente de un banco
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class CuentaCorriente{
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    /**
     * Constructor por defecto
     */ 
    
    public CuentaCorriente(){
        this.nombre = "";
        this.cuenta = "";
        this.saldo = 0;
        this.tipoInteres = 0;
    }
    
    /**
     * Constructor con par�metros
     * @param nombre Nombre del titular de la cuenta
     * @param cuenta N�mero de cuenta
     * @param saldo Saldo de la cuenta
     * @param tipoInteres Tipo de inter�s de la cuenta
     */
    
    public CuentaCorriente(String nombre, String cuenta, double saldo, double tipoInteres){
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    /**
     * Obtiene el nombre del titular de la cuenta
     * @return Nombre del titular de la cuenta
     */
    
    public String getNombre(){
        return nombre;
    }

    /**
     * Modifica el nombre del titular de la cuenta
     * @param nombre Nombre del titular de la cuenta nuevo
     */
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Obtiene el n�mero de cuenta
     * @return N�mero de cuenta
     */
    
    public String getCuenta(){
        return cuenta;
    }

    /**
     * Modifica el n�mero de la cuenta
     * @param cuenta Nuevo n�mero de cuenta
     */
    
    public void setCuenta(String cuenta){
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo de la cuenta
     * @return Saldo de la cuenta
     */
    
    public double getSaldo(){
        return saldo;
    }

    /**
     * Modifica el saldo de la cuenta
     * @param saldo Nuevo saldo
     */
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés
     * @return Tipo de interés
     */
    
    public double getTipoInteres(){
        return tipoInteres;
    }

    /**
     * Modifica el tipo de inter�s de la cuenta
     * @param tipoInteres Nuevo tipo de inter�s
     */
    
    public void setTipoInteres(double tipoInteres){
        this.tipoInteres = tipoInteres;
    }
    
    /**
     * Ingresa dinero en la cuenta corriente
     * @param cantidad Cantidad a ingresar en la cuenta
     * @throws java.lang.Exception
     */
    
    public void ingresarDinero (double cantidad) throws Exception{
        
        saldo = saldo + cantidad;
    }
    
    /**
     * Retira dinero de la cuenta corriente
     * @param cantidad Cantidad a retirar de la cuenta
     * @throws java.lang.Exception
     */
    
    public void retirarDinero (double cantidad) throws Exception{
        
        saldo = saldo - cantidad;
    }

    /**
     * 
     * @return 
     */
    
    @Override
    public String toString() {
        String mensaje;
        mensaje=
                 "Cuenta Corriente: " + cuenta + "\n"
                +"Titular: " + nombre + "\n"
                +"Saldo de " + saldo + " ?.\n"
                +"Inter�s del " + tipoInteres + "%.\n";
        return mensaje;
    }
    
}
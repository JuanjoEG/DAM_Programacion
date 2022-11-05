
package Clases;

import java.io.Serializable;

/**
 *
 * @author Juan José Estévez González
 */
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String apellidos;
    private int edad;
    private String DNI;
    private Coche miCoche ;
    
    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.DNI = "";
        this.miCoche = new Coche();
    }
    
    public Persona(String nombre, String DNI, Coche miCoche) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.miCoche = new Coche(miCoche);
    }

    public Persona(String nombre, String DNI, String marca , String modelo , String matricula ) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.miCoche = new Coche( matricula , modelo , marca );
    }
    public Persona(String nombre,String apellidos,int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    public Coche getMiCoche() {
        return miCoche;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setMiCoche(Coche miCoche) {
        this.miCoche = miCoche;
    }
    
    @Override
    public String toString(){
        System.out.println("MÉTODO toString");
        String mensaje ="Persona: "+"\n"
                       +"Nombre= " + nombre +"\n"
                       +"Apellidos= " + apellidos + "\n"
                       +"Edad= " + edad + "\n";
        return mensaje;
    }
    //MÃ©todo EstÃ¡tico
    public static void saludarEstatico(){
        System.out.println("SALUDAR ESTÁTICO - No necesita Ojeto");
        System.out.println("Hola desde DENTRO de la Clase Persona");
        System.out.println("");
    }
    //MÃ©todo de Objeto
    public void saludarObjeto(){
        System.out.println("SALUDAR OBJETO");
        System.out.println("Hola soy "+nombre+" "+apellidos);
        System.out.println("");
    }
    
    
    //Metodo Puente
    public String getMarca() {
        return this.miCoche.getMarca();
    }
    
    //Metodo Puente
    public String getModelo() {
        return this.miCoche.getModelo();
    }
    
    //METODO SALUDAR
    public void saludar() {
        System.out.println("Hola soy "+nombre+" "+apellidos+" - CLASE PERSONA");
    }
    

}
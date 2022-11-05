
package Clases;

/**
 * ESTA CLASE REPRESENTA UN ALUMNO
 * @version 1.0
 * @author Juan José Estévez González
 */

public class Alumno extends Persona{
    
    /**
     *  ATRIBUTOS
     */
    
    private String nombre, apellidos;
    private int num_dni, edad;
    private double tri_1, tri_2, tri_3;
    public static int numero_de_alumnos;
    private double nota1 , nota2 , nota3 ;
     
     /**
     *  DECLARACIÓN DE MÉTODOS
     *  CONSTRUCTOR POR DEFECTO
     */
    
    public Alumno(){
        super();
        this.nombre="";
        this.apellidos="";
        this.num_dni=0;
        this.edad=0;
        this.tri_1=0;
        this.tri_2=0;
        this.tri_3=0;
        this.nota1 =0;
        this.nota2 =0;
        this.nota3 =0;
        numero_de_alumnos=numero_de_alumnos+1;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS
     * @param nombre
     * @param apellidos
     * @param num_dni
     * @param edad
     * @param tri_1
     * @param tri_2
     * @param tri_3
     */

    public Alumno(String nombre, String apellidos, int num_dni, int edad, double tri_1, double tri_2, double tri_3) {
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.num_dni = num_dni;
        this.edad = edad;
        this.tri_1 = tri_1;
        this.tri_2 = tri_2;
        this.tri_3 = tri_3;
        numero_de_alumnos=numero_de_alumnos+1;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS
     * @param nota1
     * @param nota2
     * @param nota3
     * @param nombre
     * @param apellidos
     * @param edad
     */
    public Alumno(double nota1, double nota2, double nota3, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     *  @return EL NOMBRE DEL ALUMNO
     */

    @Override
    public String getNombre() {
        return nombre;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     *  @return LOS APELLIDOS DEL ALUMNO
     */

    @Override
    public String getApellidos() {
        return apellidos;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     *  @return EL DNI DEL ALUMNO
     */
    
    public int getNum_dni() {
        return num_dni;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     *  @return LA EDAD DEL ALUMNO
     */

    @Override
    public int getEdad() {
        return edad;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     *  @return LA NOTA DEL PRIMER TRIMESTRE DEL ALUMNO
     */

    public double getTri_1() {
        return tri_1;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     *  @return LA NOTA DEL SEGUNDO TRIMESTRE DEL ALUMNO
     */

    public double getTri_2() {
        return tri_2;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     *  @return LA NOTA DEL TERCER TRIMESTRE DEL ALUMNO
     */

    public double getTri_3() {
        return tri_3;
    }
  
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL VALOR DEL NOMBRE DEL ALUMNO
     * @param nombre NUEVO VALOR PARA EL NOMBRE
     */
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL VALOR DE LOS APELLIDOS DEL ALUMNO
     * @param apellidos NUEVO VALOR PARA LOS APELLIDOS
     */

    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL VALOR DEL DNI DEL ALUMNO
     * @param num_dni NUEVO VALOR PARA EL DNI
     */
    
    public void setNum_dni(int num_dni) {
        this.num_dni = num_dni;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL VALOR DE LA EDAD DEL ALUMNO
     * @param edad NUEVO VALOR PARA LA EDAD
     */

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL VALOR DE La NOTA DEL ALUMNO
     * @param tri_1 NUEVO VALOR PARA EL PRIMER TRIMESTRE
     */

    public void setTri_1(double tri_1) {
        this.tri_1 = tri_1;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL VALOR DE La NOTA DEL ALUMNO
     * @param tri_2 NUEVO VALOR PARA EL SEGUNDO TRIMESTRE
     */

    public void setTri_2(double tri_2) {
        this.tri_2 = tri_2;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL VALOR DE La NOTA DEL ALUMNO
     * @param tri_3 NUEVO VALOR PARA EL TERCER TRIMESTRE
     */

    public void setTri_3(double tri_3) {
        this.tri_3 = tri_3;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return LA NOTA 1 DEL ALUMNO
     */
    public double getNota1() {
        return nota1;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return LA NOTA 2 DEL ALUMNO
     */
    public double getNota2() {
        return nota2;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return LA NOTA 3 DEL ALUMNO
     */
    public double getNota3() {
        return nota3;
    }
    
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL VALOR DE La NOTA DEL ALUMNO
     * @param nota1 NUEVO VALOR PARA EL VALOR
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL VALOR DE La NOTA DEL ALUMNO
     * @param nota2 NUEVO VALOR PARA EL VALOR
     */
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL VALOR DE La NOTA DEL ALUMNO
     * @param nota3 NUEVO VALOR PARA EL VALOR
     */
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    /**
     * MÉTODO toString
     * @return MUESTRA UN RESUMEN DEL OBJETO
     */

    @Override
    public String toString() {
        String mensaje = "Alumno: "+nombre+ " "+apellidos+ "\n";
        mensaje += "{" + " DNI= " + num_dni + ", Edad= " + edad + " aÃ±os,"+"\n";
        mensaje += "1ª Trimestre= " + tri_1 +", 2ª Trimestre= " + tri_2 + ", 3ª Trimestre= " + tri_3 + '}';
        mensaje += "nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
        return mensaje;
    }
    
    /**
     *  MÃ‰TODO PERSONALIZADO
     *  @return LA MEDIA DE LOS TRIMESTRES
     */
    
    public double calcularMedia(){
        double media=(tri_1+tri_2+tri_3)/3;
        double media_redondeo=Math.round(media*100.00)/100.00;
        return media_redondeo;
    }

    
    //METODO SALUDAR
    @Override
    public void saludar() {        
        System.out.println("Hola soy un ALUMNO - CLASE ALUMNO");
        super.saludar();
    }
}
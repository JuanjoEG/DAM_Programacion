
package Clases;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Motocicleta {
    
    // ATRIBUTOS
    
    private String marca , modelo, matricula ;
    private int cilindrada, potencia, parmotor, kilometros ;
    public static int numero_de_motos=0, numero_de_ruedas=2;

    // CONSTRUCTOR POR DEFECTO
    
    public Motocicleta(){
        marca = "";
        modelo = "";
        matricula = "";
        cilindrada = 0;
        potencia = 0;
        parmotor = 0;
        kilometros = 0;
        numero_de_motos=numero_de_motos+1;
    }
    
    // CONSTRUCTOR POR PAR�METROS
    
    public Motocicleta(String marca, String modelo, String matricula, int cilindrada, int potencia, int parmotor, int kilometros){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
        this.parmotor = parmotor;
        this.kilometros = kilometros;
        numero_de_motos=numero_de_motos+1;
    }

    // M�TODOS OBSERVADORES - LOS GETTERS
    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getParmotor() {
        return parmotor;
    }

    public int getKilometros() {
        return kilometros;
    }
        
    // M�TODOS MODIFICADORES - LOS SETTERS

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setParmotor(int parmotor) {
        this.parmotor = parmotor;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    // M�TODO toString
    
    @Override
    public String toString() {
        return "Motocicleta {" + " Marca = " + marca + " - Modelo = " + modelo + " - Matrícula = " + matricula + " -" + "\n" + "Cilindrada = " + cilindrada + " c.c. - Potencia = " + potencia + " C.V. - Par Motor = " + parmotor + " N./m. - Kilómetros = " + kilometros + " Kms. " +'}'+ "\n";
    }
    
}

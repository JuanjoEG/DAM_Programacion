
package Clases;

/**
 *
 * @author Juan José Estévez González
 */
public class Furgoneta extends Vehiculo{
    
    private int tara;
    
    public Furgoneta(){
        super();
        tara=0;
    }

    public Furgoneta(int tara) {
        this.tara = tara;
    }

    public Furgoneta(int tara, String matricula, int dias_alquiler) {
        super(matricula, dias_alquiler);
        this.tara = tara;
    }
    
    @Override
    public double importeAlquiler(){
        return 50*super.getDias_alquiler()+(20*tara*super.getDias_alquiler()/1000);
    }
    
    @Override
    public void recibo(){
        System.out.println("-------------------------------------------------\n"
                          +"FURGONETA\n"
                          +"- - - - - - - - - - - - - - - - - - - - - - - - -\n"
                          +"Matrí­cula: "+super.getMatricula()+"\n"
                          +"Duración: "+super.getDias_alquiler()+"\n"
                          +"TARA: "+tara+"\n"
                          +"Importe del Alquiler: "+importeAlquiler());
    }
}
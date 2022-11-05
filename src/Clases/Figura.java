
package Clases;

/**
 *
 * @author Juan José Estévez González
 */
public abstract class Figura {
    
    double num_lados;
    
    public Figura(){
        num_lados=0;
    }

    public Figura(double num_lados) {
        this.num_lados = num_lados;
    }

    public double getNum_lados() {
        return num_lados;
    }

    public void setNum_lados(double num_lados) {
        this.num_lados = num_lados;
    }
    
    public abstract double perimetroFigura();
    
    public abstract double areaFigura();
}
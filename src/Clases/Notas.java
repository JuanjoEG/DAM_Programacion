
package Clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Notas implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<Double> array;
    
    public Notas(){
        array = new ArrayList<Double>();
    }
    
    public Notas (ArrayList<Double> array){
        this.array = array;
    }
    
    public double getNota(int pos){
        return array.get(pos);
    }
    
    public void leerNotas(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce las notas de las asignaturas:");
        System.out.println("");
        System.out.print("Programación: ");
        array.add(sn.nextDouble());
        System.out.println("");
        System.out.print("Lenguaje de Marcas: ");
        array.add(sn.nextDouble());
        System.out.println("");
        System.out.print("Bases de Datos: ");
        array.add(sn.nextDouble());
        System.out.println("");
        System.out.print("Entornos de Desarrollo: ");
        array.add(sn.nextDouble());
        System.out.println("");
        System.out.print("Sistemas Informáticos: ");
        array.add(sn.nextDouble());
        System.out.println("");
        System.out.print("Formación y Orientación Laboral: ");
        array.add(sn.nextDouble());
    }
    
    @Override
    public String toString(){
        return  "                                  "+"\n"+
                "Nota de Programación:"+ getNota(0) +"\n"+
                "Nota de Lenguaje de Marcas:"+ getNota(1) +"\n"+
                "Nota de Bases de Datos:"+ getNota(2) +"\n"+
                "Nota de Entornos de Desarrollo:"+ getNota(3) +"\n"+
                "Nota de Sistemas Informáticos:"+ getNota(4) +"\n"+
                "Nota de Formación y Orientación Laboral:"+ getNota(5) +"\n";
    }
}

package ejemplos.tramo04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class CalcularNotasMedias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int indice=0;
        double nota=0;
        double mediaP=0;
        double mediaT=0;
        String seguir="S";
        ArrayList notasArrayList = new ArrayList();
        while(seguir.equals("S")||seguir.equals("s")){ 
            Scanner sc1= new Scanner(System.in);
            Scanner sc2= new Scanner(System.in);
            System.out.println("");      
            System.out.print("Por favor"+"\n"+"Introduce la nota de Examen : ");
             nota= sc1.nextDouble();
            System.out.println("");
            notasArrayList.add(indice, nota);
            indice=indice+1;
            mediaP=mediaP+nota;
            System.out.println("En la posición "+indice+" tienes la nota "+nota);
            System.out.println("");
            System.out.print("¿Desea introducir otra nota de Examen? (S/N) : ");
            seguir= sc2.nextLine();
        }
        System.out.println("");
        for( int i=0;i<notasArrayList.size();i++) {
        System.out.println((i+1)+"---"+notasArrayList.get(i));
        }
        System.out.println("");
        mediaT=mediaP/(notasArrayList.size());
        System.out.println("La Media de Notas es : "+mediaT);
        System.out.println("");
        if (mediaT>=0 && mediaT<3){
            System.out.println("MUY DEFICIENTE");
        } else if (mediaT>=3 && mediaT<5){
            System.out.println("INSUFICIENTE");
            } else if (mediaT>=5 && mediaT<7){
                System.out.println("SUFICIENTE");
                } else if (mediaT>=7 && mediaT<9){
                    System.out.println("NOTABLE");
                        } else if (mediaT>=9 && mediaT<=10){
                            System.out.println("SOBRESALIENTE");
                            }
        System.out.println("");  
    }
}
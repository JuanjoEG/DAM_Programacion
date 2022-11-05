
package Clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ESTA CLASE REPRESENTA UN ALQUILER
 * @version 1.0
 * @author Juan José Estévez González
 */
public class Alquiler implements Facturacion{
    
    ArrayList<Vehiculo> pedido;
    
    public Alquiler(int n_vehiculos){
       
        String matricula, tipo;
        int dias, plazas, tara;
        
        Scanner teclado_Str = new Scanner(System.in);
        Scanner teclado_int = new Scanner(System.in);
        
        
        pedido = new ArrayList<Vehiculo>();
        
        for (int i=0; i<n_vehiculos; i++){
            do {            
            System.out.println("(C para Coche - B para Bus - F para Furgoneta - M para Camión)");
            System.out.print("Introduce el TIPO de Vehí­culo: ");
            tipo = teclado_Str.nextLine();
            System.out.println("");            
            } while (!"C".equals(tipo) && !"B".equals(tipo)  && !"F".equals(tipo)  && !"M".equals(tipo));
            
            System.out.print("Introduce la MATRÍCULA de Vehí­culo: ");
            matricula = teclado_Str.nextLine();
            System.out.println("");
            
            System.out.print("Introduce los DÍAS de Alquiler: ");
            dias = teclado_int.nextInt();
            System.out.println("");
            
            switch (tipo){
                case "C" -> {
                    System.out.print("Introduce las PLAZAS del Coche: ");
                    plazas = teclado_int.nextInt();
                    System.out.println("");
                    Coche c = new Coche(plazas, matricula, dias);
                    pedido.add(c);
                }
                case "B" -> {
                    System.out.print("Introduce las PLAZAS del Bus: ");
                    plazas = teclado_int.nextInt();
                    System.out.println("");
                    Bus b = new Bus(plazas, matricula, dias);
                    pedido.add(b);
                }
                case "F" -> {
                    System.out.print("Introduce la TARA de la Furgoneta en Kg.: ");
                    tara = teclado_int.nextInt();
                    System.out.println("");
                    Furgoneta f = new Furgoneta(tara, matricula, dias);
                    pedido.add(f);
                }
                case "M" -> {
                    System.out.print("Introduce la TARA del Camión en Kg.: ");
                    tara = teclado_int.nextInt();
                    System.out.println("");
                    Camion m = new Camion(tara, matricula, dias);
                    pedido.add(m);
                }
                default -> System.out.println("* * * * * * VEHÍCULO NO ENCONTRADO * * * * * *");
            }
        }
    }

    public double getImporteTotal(){
        double total=0;
        for (int i=0; i<pedido.size(); i++){
            total += getImporteVehiculo(i);
        }
        return total;
    }
    public double getImporteVehiculo (int pos){
        double importe;
        
        importe = pedido.get(pos).importeAlquiler();
        
        return importe;
    }
    
    @Override
    public void mostrarFactura(){
        System.out.println("\n"+
                           "-------------------------------------------------\n"+
                           "Total alquiler: "+getImporteTotal()+" ?\n"+
                           "-------------------------------------------------\n"+
                           "DETALLE\n"+
                           "-------------------------------------------------");
        for (int i=0; i<pedido.size(); i++){
            
            pedido.get(i).recibo();
            System.out.println("VEHÍCULO "+(i+1));
            System.out.println("-------------------------------------------------");
        }
    }
}
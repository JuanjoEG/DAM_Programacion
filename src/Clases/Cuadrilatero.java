
package Clases;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Cuadrilatero extends Figura {
    
    private double lado_AB;
    private double lado_BC;
    private double lado_CD;
    private double lado_DA;
    private double ang_A;
    private double ang_B;
    private double ang_C;
    private double ang_D;

    public Cuadrilatero(double lado_AB, double lado_BC, double lado_CD, double lado_DA, double ang_A, double ang_B, double ang_C, double ang_D) {
        this.lado_AB = lado_AB;
        this.lado_BC = lado_BC;
        this.lado_CD = lado_CD;
        this.lado_DA = lado_DA;
        this.ang_A = ang_A;
        this.ang_B = ang_B;
        this.ang_C = ang_C;
        this.ang_D = ang_D;
    }

    public double getLado_AB() {
        return lado_AB;
    }

    public void setLado_AB(double lado_AB) {
        this.lado_AB = lado_AB;
    }

    public double getLado_BC() {
        return lado_BC;
    }

    public void setLado_BC(double lado_BC) {
        this.lado_BC = lado_BC;
    }

    public double getLado_CD() {
        return lado_CD;
    }

    public void setLado_CD(double lado_CD) {
        this.lado_CD = lado_CD;
    }

    public double getLado_DA() {
        return lado_DA;
    }

    public void setLado_DA(double lado_DA) {
        this.lado_DA = lado_DA;
    }

    public double getAng_A() {
        return ang_A;
    }

    public void setAng_A(double ang_A) {
        this.ang_A = ang_A;
    }

    public double getAng_B() {
        return ang_B;
    }

    public void setAng_B(double ang_B) {
        this.ang_B = ang_B;
    }

    public double getAng_C() {
        return ang_C;
    }

    public void setAng_C(double ang_C) {
        this.ang_C = ang_C;
    }

    public double getAng_D() {
        return ang_D;
    }

    public void setAng_D(double ang_D) {
        this.ang_D = ang_D;
    }    

    @Override
    public double getNum_lados() {
        return num_lados;
    }

    @Override
    public void setNum_lados(double num_lados) {
        this.num_lados = num_lados;
    }
    
    @Override
    public double perimetroFigura(){
        double perimetro = lado_AB+lado_BC+lado_CD+lado_DA;
        return perimetro;
    }
    
    @Override
    public double areaFigura(){        
        double area, diag_AC, diag_BD;
        diag_AC = lado_TeoremaDelCoseno(lado_DA, lado_CD, ang_D);
        diag_BD = lado_TeoremaDelCoseno(lado_AB, lado_DA, ang_A);
        Triangulo tr_01 = new Triangulo(lado_DA, lado_CD, diag_AC);
        Triangulo tr_02 = new Triangulo(lado_AB, lado_BC, diag_AC);
        area = tr_01.areaFigura()+tr_02.areaFigura();
        System.out.println("Diagonal AC: "+diag_AC);
        System.out.println("Diagonal BD: "+diag_BD);
        
        return area;
    }
    
    public static double lado_TeoremaDelCoseno(double lado_1,double lado_2,double angulo){
        double lado_3;
        lado_3 = Math.sqrt((lado_1*lado_1)+(lado_2*lado_2)-(2*lado_1*lado_2*Math.cos(Math.toRadians(angulo))));
        return lado_3;
    }

    public static double teoremaDelBinomio(double lado_ab,double lado_bc,double lado_cd,double lado_da){
        double angulo_a;
        angulo_a = Math.toDegrees(Math.acos(((lado_da*lado_da)-(2*lado_da*lado_bc)-(lado_cd*lado_cd)+(lado_bc*lado_bc)+(lado_ab*lado_ab))/( 2*lado_ab*(lado_da-lado_bc))));
        return angulo_a;
    }
       
    public void mostrarResultados(){
        
        double perimetro, area;
        perimetro = perimetroFigura();
        System.out.println("");
        System.out.println("*********************************************************");
        System.out.println("Perímetro: "+perimetro);
        area = areaFigura();
        System.out.println("�rea: "+area);
        System.out.println("Lado AB: "+lado_AB);
        System.out.println("Lado BC: "+lado_BC);
        System.out.println("Lado CD: "+lado_CD);
        System.out.println("Lado DA: "+lado_DA);
        System.out.println("Ángulo A: "+ang_A);
        System.out.println("Ángulo B: "+ang_B);
        System.out.println("Ángulo C: "+ang_C);
        System.out.println("Ángulo D: "+ang_D);
        System.out.println("Suma de ángulos: "+(ang_A+ang_B+ang_C+ang_D));
    }
    
    public static String mostrarMenu(){
        
        Scanner teclado_Str = new Scanner(System.in);
        Scanner teclado_dbl = new Scanner(System.in);
        String menu;
        double lado_ab, lado_bc, lado_cd, lado_da, ang_a, ang_b, ang_c, ang_d;        
        
        do {
        
        System.out.println(""
                + "*************************************"+"\n"
                + "********    CUADRILÁTEROS    ********"+"\n"
                + "*************************************"+"\n"                
                + "*   1. CUADRADO.                   |*"+"\n"
                + "*   2. RECTÁNGULO.                 |*"+"\n"
                + "*   3. ROMBO.                      |*"+"\n"
                + "*   4. ROMBOIDE.                   |*"+"\n"
                + "*   5. TRAPECIO.                   |*"+"\n"
                + "*                                  |*"+"\n"
                + "*   0. ATRÁS.                      |*"+"\n"                
                + "*************************************"+"\n"
                + "*************************************"+"\n"
                );
        
        System.out.print("Eliga su opción: ");
        menu = teclado_Str.nextLine();           
                
        switch(menu){
            
             case "1": // CUADRADO
                 
                 System.out.print("Longitud del Lado: ");
                 lado_ab = teclado_dbl.nextDouble();
                 
                 Cuadrilatero c_01 = new Cuadrilatero(lado_ab, lado_ab, lado_ab, lado_ab, 90, 90, 90, 90);
                 
                 c_01.mostrarResultados();                    
                    
             break;
                
             case "2": // RECTÁNGULO
                 
                 System.out.print("Longitud del Lado AB: ");
                 lado_ab = teclado_dbl.nextDouble();
                 System.out.print("Longitud del Lado DA: ");
                 lado_da = teclado_dbl.nextDouble();
                 
                 Cuadrilatero c_02 = new Cuadrilatero(lado_ab, lado_da, lado_ab, lado_da, 90, 90, 90, 90);
                 
                 c_02.mostrarResultados();              
             
             break;
                                
             case "3": // ROMBO
                 
                 System.out.print("Longitud del Lado: ");
                 lado_ab = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vertice A: ");                
                 ang_a = teclado_dbl.nextDouble();
                 ang_b = 180 - ang_a;
                
                 Cuadrilatero c_03 = new Cuadrilatero(lado_ab, lado_ab, lado_ab, lado_ab, ang_a, ang_b, ang_a, ang_b); 
                 
                 c_03.mostrarResultados();
                
             break;
             
             case "4": // ROMBOIDE
                 
                 System.out.print("Longitud del Lado AB: ");
                 lado_ab = teclado_dbl.nextDouble();
                 System.out.print("Longitud del Lado DA: ");
                 lado_da = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vertice A: ");                
                 ang_a = teclado_dbl.nextDouble();
                 ang_b = 180 - ang_a;
                
                 Cuadrilatero c_04 = new Cuadrilatero(lado_ab, lado_da, lado_ab, lado_da, ang_a, ang_b, ang_a, ang_b); 
                 
                 c_04.mostrarResultados();
                
             break;
              
             case "5": // TRAPECIO
                
                 System.out.print("Longitud del Lado AB: ");
                 lado_ab = teclado_dbl.nextDouble();
                 System.out.print("Longitud del Lado BC: ");
                 lado_bc = teclado_dbl.nextDouble();
                 System.out.print("Longitud del Lado CD: ");
                 lado_cd = teclado_dbl.nextDouble();
                 System.out.print("Longitud del Lado DA: ");
                 lado_da = teclado_dbl.nextDouble();
                 
                 ang_a = teoremaDelBinomio(lado_ab, lado_bc, lado_cd, lado_da);
                 ang_b = 180 - ang_a;              
                 
                 ang_d = teoremaDelBinomio(lado_cd, lado_bc, lado_ab, lado_da);
                 ang_c = 180 - ang_d;
                
                 Cuadrilatero c_05 = new Cuadrilatero(lado_ab, lado_bc, lado_cd, lado_da, ang_a, ang_b, ang_c, ang_d); 
                 
                 c_05.mostrarResultados();
                
             break;       
             
            case "0":
            break;
            }
        }while (!menu.equals("0")); 
    return menu; 
    }  
}

package Clases;

import java.util.Scanner;

/**
 * ESTA CLASE REPRESENTA UN TRIANGULO --> HEREDA DE FIGURA
 * ESPAÑA / SEVILLA / 2022
 * APACHE NET BEANS IDE 14
 * TOOLS --> TEMPLATES --> SETTINGS --> BORRAR # DE ÚLTIMA LÍNEA --> USER=Juan José Estévez González
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> SOURCE/BINARY FORMAT --> JDK 18
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> PROFILE --> FULL JRE
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> ENCODING --> ISO-8859-1
 * TOOLS --> OPTIONS --> FONTS & COLOR --> PROFILE: FLATLAF DARK
 * TOOLS --> OPTIONS --> FONTS & COLOR --> FONT --> MONOSPACED 16
 * TOOLS --> OPTIONS --> MISCELLANEOUS --> OUTPUT --> FONT --> MONOSPACED 16
 * TOOLS --> OPTIONS --> MISCELLANEOUS --> TERMINAL -->FONT --> MONOSPACED 16
 * TOOLS --> OPTIONS --> APPEARANCE --> LOOK AND FEEL --> FLATLAF DARK
 * @author Juan José Estévez González
 */

public class Triangulo extends Figura{    
    /**
     *  DECLARACIÓN DE ATRIBUTOS
     */
    private double lado_a;
    private double lado_b;
    private double lado_c;
    /**
     * DECLARACIÓN DE MÉTODOS
     * CONSTRUCTOR POR PARÁMETROS 
     * @param lado_a
     * @param lado_b
     * @param lado_c
     */
    public Triangulo(double lado_a, double lado_b, double lado_c) {
        
        this.lado_a = lado_a;
        this.lado_b = lado_b;
        this.lado_c = lado_c;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return VALOR DEL LADO
     */
    public double getLado_a() {
        return lado_a;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL VALOR DEL LADO
     * @param lado_a VALOR DEL LADO
     */
    public void setLado_a(double lado_a) {
        this.lado_a = lado_a;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return VALOR DEL LADO
     */
    public double getLado_b() {
        return lado_b;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL VALOR DEL LADO
     * @param lado_b VALOR DEL LADO
     */
    public void setLado_b(double lado_b) {
        this.lado_b = lado_b;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return VALOR DEL LADO
     */
    public double getLado_c() {
        return lado_c;
    }
    /**
     * DECLARACIÓN DE MÉTODOS
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * MODIFICA EL VALOR DEL LADO
     * @param lado_c VALOR DEL LADO
     */
    public void setLado_c(double lado_c) {
        this.lado_c = lado_c;
    }
    /**
     * MÉTODO PUENTE
     * MÉTODOS OBSERVADORES - LOS GETTERS
     * @return MUESTRA EL NÚMERO DE LADOS
     */
    @Override
    public double getNum_lados() {
        return num_lados;
    }
    /**
     * MÉTODO PUENTE
     * MÉTODOS MODIFICADORES - LOS SETTERS
     * @param num_lados MODIFICA EL NÚMERO DE LADOS
     */
    @Override
    public void setNum_lados(double num_lados) {
        this.num_lados = num_lados;
    }
    /**
     * MÉTODO PERSONALIZADO
     * CALCULA EL PERÍMETRO
     * @return VALOR DEL PERÍMETRO
     */
    @Override
    public double perimetroFigura(){
        double perimetro;
        perimetro = lado_a+lado_b+lado_c;
        return perimetro;
    }
    /**
     * MÉTODO PERSONALIZADO
     * CALCULA EL ÁREA
     * @return VALOR DEL ÁREA
     */
    @Override
    public double areaFigura(){        
        double semi_perimetro, area;
        semi_perimetro = (perimetroFigura()/2);
        area = Math.sqrt(semi_perimetro*(semi_perimetro-lado_a)*(semi_perimetro-lado_b)*(semi_perimetro-lado_c));
        return area;
    }
    /**
     * MÉTODO PERSONALIZADO
     * CALCULA LA ALTURA DEL TRIÁNGULO
     * @param area
     * @param lado
     * @return ALTURA DEL TRIÁNGULO
     */
    public static double alturaDelLado(double area, double lado){
        double altura;
        altura = 2*area/lado;
    return altura;
    }
    /**
     * MÉTODO PERSONALIZADO
     * MUESTRA LOS RESULTADOS
     * @param lado1
     * @param lado2
     * @param lado3 
     */
    public static void mostrarResultados(double lado1, double lado2, double lado3){
        
        if ( ((lado1+lado2)>lado3) && ((lado1+lado3)>lado2) && ((lado2+lado3)>lado1) ) {    
        
        double perimetro, area, h_a,h_b,h_c, ang_a, ang_b, ang_c;
        Triangulo tr_01 = new Triangulo(lado1, lado2, lado3);
        
        perimetro=tr_01.perimetroFigura();
                area=tr_01.areaFigura();
                
                h_a = alturaDelLado(area, lado1); 
                h_b = alturaDelLado(area, lado2); 
                h_c = alturaDelLado(area, lado3);        
                
                ang_a = angulo_TeoremaDelCoseno(lado1, lado2, lado3);
                ang_b = angulo_TeoremaDelCoseno(lado2, lado1, lado3);
                ang_c = angulo_TeoremaDelCoseno(lado3, lado1, lado2);
                
                System.out.println("********************************************");
                System.out.println("Lado a: "+lado1);
                System.out.println("Lado b: "+lado2);
                System.out.println("Lado c: "+lado3);
                System.out.println("********************************************");
                System.out.println("El Perí­metro es: "+perimetro);
                System.out.println("El Área es: "+area);
                System.out.println("********************************************");
                System.out.println("Altura del Vértice A: "+h_a);
                System.out.println("Altura del Vértice B: "+h_b);
                System.out.println("Altura del Vértice C: "+h_c);
                System.out.println("********************************************");
                System.out.println("Ángulo del Vértice A: "+ang_a);
                System.out.println("Ángulo del Vértice B: "+ang_b);
                System.out.println("Ángulo del Vértice C: "+ang_c);
                System.out.println("Suma de sus Ángulos:  "+(ang_a+ang_b+ang_c));
                System.out.println("********************************************");
                System.out.println("");
        
        } else{
            System.out.println("""
                               
                               **************************************************************** 
                               *****      E L   T R I A N G U L O   N O   E X I S T E .   ***** 
                               **************************************************************** 
                               """);
        }
    }
    
    public static double angulo_TeoremaDelCoseno(double lado_1, double lado_2, double lado_3){
        double angulo_1;
        angulo_1 = Math.toDegrees(Math.acos(((lado_2*lado_2)+(lado_3*lado_3)-(lado_1*lado_1))/(2*lado_2*lado_3)));
    return angulo_1;
    }
    
    public static double teoremaDelSeno(double lado_1, double lado_2, double angulo_2){
        double angulo_1;
        angulo_1= Math.toDegrees(Math.asin((lado_1*Math.sin(Math.toRadians(angulo_2)))/lado_2));
    return angulo_1;
    }
    
    public static double lado_TeoremaDelCoseno(double lado_1,double lado_2,double angulo){
        double lado_3;
        lado_3 = Math.sqrt((lado_1*lado_1)+(lado_2*lado_2)-(2*lado_1*lado_2*Math.cos(Math.toRadians(angulo))));
        return lado_3;
    }    
     
    public static double dosAngulosUnLadoAdyacente(double lado_1, double ang_1, double ang_2){
        double lado_2;
        lado_2 = lado_1*Math.sin(Math.toRadians(ang_2))/Math.sin(Math.toRadians(ang_1));
    return lado_2;
    } 
    
    public static double longDosPuntos(double ax, double ay, double bx, double by){
        double distancia;
        distancia = Math.sqrt(((bx-ax)*(bx-ax))  + ((by-ay)*(by-ay)));    
    return distancia;
    }
    
    
    public static void susTresLados(){
        
        Scanner teclado_dbl = new Scanner(System.in);
        double  lado_a, lado_b, lado_c;
                System.out.print("Longitud del Lado a: ");
                lado_a = teclado_dbl.nextDouble();
                System.out.print("Longitud del Lado b: ");
                lado_b = teclado_dbl.nextDouble();
                System.out.print("Longitud del Lado c: ");
                lado_c = teclado_dbl.nextDouble();
                
                mostrarResultados(lado_a, lado_b, lado_c);   
    }
    
    public static String mostrarMenu(){
        
        Scanner teclado_Str = new Scanner(System.in);
        Scanner teclado_dbl = new Scanner(System.in);
        String menu;
        
        double lado_a1, lado_b1, lado_c1, ang_A1, ang_B1, ang_C1;
        double lado_a2, lado_b2, lado_c2, ang_A2, ang_B2, ang_C2;
        double ax, ay, bx, by, cx, cy;
        
        do {
        
        System.out.println("""
                           *********************************************************
                           ********          TRIANGULO CONOCIENDO...        ********
                           *********************************************************
                           ********      LADOS      ******      ÁNGULOS     ********
                           *********************************************************
                           ********  a  *  b  *  c  ******   A  *  B  *  C  ********
                           *********************************************************
                           *   1. |  X  |  X  |  X  |     |     |     |     |*******
                           *   2. |  X  |  X  |     |     |  X  |     |     |*******
                           *   3. |  X  |  X  |     |     |     |  X  |     |*******
                           *   4. |  X  |  X  |     |     |     |     |  X  |*******
                           *   5. |  X  |     |  X  |     |  X  |     |     |*******
                           *   6. |  X  |     |  X  |     |     |  X  |     |*******
                           *   7. |  X  |     |  X  |     |     |     |  X  |*******
                           *   8. |     |  X  |  X  |     |  X  |     |     |*******
                           *   9. |     |  X  |  X  |     |     |  X  |     |*******
                           *  10. |     |  X  |  X  |     |     |     |  X  |*******
                           *  11. |  X  |     |     |     |  X  |  X  |     |*******
                           *  12. |     |  X  |     |     |  X  |  X  |     |*******
                           *  13. |     |     |  X  |     |  X  |  X  |     |*******
                           *  14. |  X  |     |     |     |  X  |     |  X  |*******
                           *  15. |     |  X  |     |     |  X  |     |  X  |*******
                           *  16. |     |     |  X  |     |  X  |     |  X  |*******
                           *  17. |  X  |     |     |     |     |  X  |  X  |*******
                           *  18. |     |  X  |     |     |     |  X  |  X  |*******
                           *  19. |     |     |  X  |     |     |  X  |  X  |*******
                           *  20. |      L A S  C O O R D E N A D A S       |*******
                           *********************************************************
                           *   0. ATRÁS.                                           *
                           *********************************************************
                           """);
        
        System.out.print("Eliga su opción: ");
        menu = teclado_Str.nextLine();           
                
        switch(menu){
            
             case "1" -> susTresLados();
                
             case "2" -> {
                 System.out.print("Longitud del Lado a: ");
                 lado_a1 = teclado_dbl.nextDouble();
                 System.out.print("Longitud del Lado b: ");
                 lado_b1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice A: ");
                 ang_A1 = teclado_dbl.nextDouble();
                 
                 ang_B1 = teoremaDelSeno(lado_b1, lado_a1, ang_A1);
                 ang_C1 = 180 - ang_A1 - ang_B1;
                 lado_c1 = lado_TeoremaDelCoseno(lado_a1, lado_b1, ang_C1);
                 System.out.println("********************************************");
                 System.out.println("          C A S O   1.");
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                 
                 ang_B2 = 180 - ang_B1;
                 ang_C2 = 180 - ang_A1 - ang_B2;
                 lado_c2 = lado_TeoremaDelCoseno(lado_a1, lado_b1, ang_C2);
                 System.out.println("********************************************");
                 System.out.println("          C A S O   2.");
                 mostrarResultados(lado_a1, lado_b1, lado_c2);
                }
                                
             case "3" -> {
                 System.out.print("Longitud del Lado a: ");
                 lado_a1 = teclado_dbl.nextDouble();
                 System.out.print("Longitud del Lado b: ");
                 lado_b1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice B: ");
                 ang_B1 = teclado_dbl.nextDouble();
                 
                 ang_A1 = teoremaDelSeno(lado_a1, lado_b1, ang_B1);
                 ang_C1 = 180 - ang_A1 - ang_B1;
                 lado_c1 = lado_TeoremaDelCoseno(lado_a1, lado_b1, ang_C1);
                 System.out.println("********************************************");
                 System.out.println("          C A S O   1.");
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                 
                 ang_A2 = 180 - ang_A1;
                 ang_C2 = 180 - ang_A2 - ang_B1;
                 lado_c2 = lado_TeoremaDelCoseno(lado_a1, lado_b1, ang_C2);
                 System.out.println("********************************************");
                 System.out.println("          C A S O   2.");
                 mostrarResultados(lado_a1, lado_b1, lado_c2);
                }
             
             case "4" -> {
                 System.out.print("Longitud del Lado a: ");
                 lado_a1 = teclado_dbl.nextDouble();
                 System.out.print("Longitud del Lado b: ");
                 lado_b1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice C: ");
                 ang_C1 = teclado_dbl.nextDouble();
                 lado_c1 = lado_TeoremaDelCoseno(lado_a1, lado_b1, ang_C1);
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                }
              
             case "5" -> {
                 System.out.print("Longitud del Lado a: ");
                 lado_a1 = teclado_dbl.nextDouble();
                 System.out.print("Longitud del Lado c: ");
                 lado_c1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice A: ");
                 ang_A1 = teclado_dbl.nextDouble();
                 
                 ang_C1 = teoremaDelSeno(lado_c1, lado_a1, ang_A1);
                 ang_B1 = 180 - ang_A1 - ang_C1;
                 lado_b1 = lado_TeoremaDelCoseno(lado_a1, lado_c1, ang_B1);
                 System.out.println("********************************************");
                 System.out.println("          C A S O   1.");
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                 
                 ang_C2 = 180 - ang_C1;
                 ang_B2= 180 - ang_A1 - ang_C2;
                 lado_b2 = lado_TeoremaDelCoseno(lado_a1, lado_c1, ang_B2);
                 System.out.println("********************************************");
                 System.out.println("          C A S O   2.");
                 mostrarResultados(lado_a1, lado_b2, lado_c1);
                }
            
             case "6" -> {
                 System.out.print("Longitud del Lado a: ");
                 lado_a1 = teclado_dbl.nextDouble();
                 System.out.print("Longitud del Lado c: ");
                 lado_c1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice B: ");
                 ang_B1 = teclado_dbl.nextDouble();
                 lado_b1 = lado_TeoremaDelCoseno(lado_a1, lado_c1, ang_B1);
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                }
            
             case "7" -> {
                 System.out.print("Longitud del Lado a: ");
                 lado_a1 = teclado_dbl.nextDouble();
                 System.out.print("Longitud del Lado c: ");
                 lado_c1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice C: ");
                 ang_C1 = teclado_dbl.nextDouble();
                 
                 ang_A1 = teoremaDelSeno(lado_a1, lado_c1, ang_C1);
                 ang_B1 = 180 - ang_A1 - ang_C1;
                 lado_b1 = lado_TeoremaDelCoseno(lado_a1, lado_c1, ang_B1);
                 System.out.println("********************************************");
                 System.out.println("          C A S O   1.");
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                 
                 ang_A2 = 180 - ang_A1;
                 ang_B2 = 180 - ang_A2 - ang_C1;
                 lado_b2 = lado_TeoremaDelCoseno(lado_a1, lado_c1, ang_B2);             
                 System.out.println("********************************************");
                 System.out.println("          C A S O   2.");
                 mostrarResultados(lado_a1, lado_b2, lado_c1);
                }
             
             case "8" -> {
                 System.out.print("Longitud del Lado b: ");
                 lado_b1 = teclado_dbl.nextDouble();
                 System.out.print("Longitud del Lado c: ");
                 lado_c1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice A: ");
                 ang_A1 = teclado_dbl.nextDouble();
                 lado_a1 = lado_TeoremaDelCoseno(lado_b1, lado_c1, ang_A1);
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                }
             
             case "9" -> {
                 System.out.print("Longitud del Lado b: ");
                 lado_b1 = teclado_dbl.nextDouble();
                 System.out.print("Longitud del Lado c: ");
                 lado_c1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice B: ");
                 ang_B1 = teclado_dbl.nextDouble();
                 
                 ang_C1 = teoremaDelSeno(lado_c1, lado_b1, ang_B1);
                 ang_A1 = 180 - ang_B1 - ang_C1;
                 lado_a1 = lado_TeoremaDelCoseno(lado_b1, lado_c1, ang_A1);
                 System.out.println("********************************************");
                 System.out.println("          C A S O   1.");
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                 
                 ang_C2 = 180 - ang_C1;
                 ang_A2 = 180 - ang_B1 - ang_C2;
                 lado_a2 = lado_TeoremaDelCoseno(lado_b1, lado_c1, ang_A2);             
                 System.out.println("********************************************");
                 System.out.println("          C A S O   2.");
                 mostrarResultados(lado_a2, lado_b1, lado_c1);
                }
             
             case "10" -> {
                 System.out.print("Longitud del Lado b: ");
                 lado_b1 = teclado_dbl.nextDouble();
                 System.out.print("Longitud del Lado c: ");
                 lado_c1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice C: ");
                 ang_C1 = teclado_dbl.nextDouble();
                 
                 ang_B1 =  teoremaDelSeno(lado_b1, lado_c1, ang_C1);
                 ang_A1 = 180 - ang_B1 - ang_C1;
                 lado_a1 = lado_TeoremaDelCoseno(lado_b1, lado_c1, ang_A1);
                 System.out.println("********************************************");
                 System.out.println("          C A S O   1.");
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                 
                 ang_B2 =  180 - ang_B1;
                 ang_A2 = 180 - ang_B2 - ang_C1;
                 lado_a2 = lado_TeoremaDelCoseno(lado_b1, lado_c1, ang_A2);            
                 System.out.println("********************************************");
                 System.out.println("          C A S O   2.");
                 mostrarResultados(lado_a2, lado_b1, lado_c1);
                }
             
             case "11" -> {
                 System.out.print("Longitud del Lado a: ");
                 lado_a1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vertice A: ");
                 ang_A1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice B: ");
                 ang_B1 = teclado_dbl.nextDouble();
                 ang_C1 = 180 - ang_A1 - ang_B1;
                 lado_b1 = dosAngulosUnLadoAdyacente(lado_a1, ang_A1, ang_B1);
                 lado_c1 = dosAngulosUnLadoAdyacente(lado_a1, ang_A1, ang_C1);
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                }
             
             case "12" -> {
                 System.out.print("Longitud del Lado b: ");
                 lado_b1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice A: ");
                 ang_A1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice B: ");
                 ang_B1 = teclado_dbl.nextDouble();
                 ang_C1 = 180 - ang_A1 - ang_B1;
                 lado_a1 = dosAngulosUnLadoAdyacente(lado_b1, ang_B1, ang_A1);
                 lado_c1 = dosAngulosUnLadoAdyacente(lado_b1, ang_B1, ang_C1);
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                }             
             
             case "13" -> {
                 System.out.print("Longitud del Lado c: ");
                 lado_c1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice A: ");
                 ang_A1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice B: ");
                 ang_B1 = teclado_dbl.nextDouble();
                 ang_C1 = 180 - ang_A1 - ang_B1;
                 lado_b1 = dosAngulosUnLadoAdyacente(lado_c1, ang_C1, ang_B1);
                 lado_a1 = dosAngulosUnLadoAdyacente(lado_c1, ang_C1, ang_A1);
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                }
             
             case "14" -> {
                 System.out.print("Longitud del Lado a: ");
                 lado_a1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice A: ");
                 ang_A1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice C: ");
                 ang_C1 = teclado_dbl.nextDouble();
                 ang_B1 = 180 - ang_A1 - ang_C1;
                 lado_b1 = dosAngulosUnLadoAdyacente(lado_a1, ang_A1, ang_B1);
                 lado_c1 = dosAngulosUnLadoAdyacente(lado_a1, ang_A1, ang_C1);
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                }            
             
             case "15" -> {
                 System.out.print("Longitud del Lado b: ");
                 lado_b1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice A: ");
                 ang_A1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice C: ");
                 ang_C1 = teclado_dbl.nextDouble();
                 ang_B1 = 180 - ang_A1 - ang_C1;
                 lado_a1 = dosAngulosUnLadoAdyacente(lado_b1, ang_B1, ang_A1);
                 lado_c1 = dosAngulosUnLadoAdyacente(lado_b1, ang_B1, ang_C1);
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                }
             
             case "16" -> {
                 System.out.print("Longitud del Lado c: ");
                 lado_c1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice A: ");
                 ang_A1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice C: ");
                 ang_C1 = teclado_dbl.nextDouble();
                 ang_B1 = 180 - ang_A1 - ang_C1;
                 lado_a1 = dosAngulosUnLadoAdyacente(lado_c1, ang_C1, ang_A1);
                 lado_b1 = dosAngulosUnLadoAdyacente(lado_c1, ang_C1, ang_B1);
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                }             
             
             case "17" -> {
                 System.out.print("Longitud del Lado a: ");
                 lado_a1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice B: ");
                 ang_B1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice C: ");
                 ang_C1 = teclado_dbl.nextDouble();
                 ang_A1 = 180 - ang_B1 - ang_C1;
                 lado_b1 = dosAngulosUnLadoAdyacente(lado_a1, ang_A1, ang_B1);
                 lado_c1 = dosAngulosUnLadoAdyacente(lado_a1, ang_A1, ang_C1);
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                }
             
             case "18" -> {
                 System.out.print("Longitud del Lado b: ");
                 lado_b1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice B: ");
                 ang_B1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice C: ");
                 ang_C1 = teclado_dbl.nextDouble();
                 ang_A1 = 180 - ang_B1 - ang_C1;
                 lado_a1 = dosAngulosUnLadoAdyacente(lado_b1, ang_B1, ang_A1);
                 lado_c1 = dosAngulosUnLadoAdyacente(lado_b1, ang_B1, ang_C1);
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                }
            
             case "19" -> {
                 System.out.print("Longitud del Lado c: ");
                 lado_c1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice B: ");
                 ang_B1 = teclado_dbl.nextDouble();
                 System.out.print("Ángulo del Vértice C: ");
                 ang_C1 = teclado_dbl.nextDouble();
                 ang_A1 = 180 - ang_B1 - ang_C1;
                 lado_a1 = dosAngulosUnLadoAdyacente(lado_c1, ang_C1, ang_A1);
                 lado_b1 = dosAngulosUnLadoAdyacente(lado_c1, ang_C1, ang_B1);
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                }             
             
             case "20" -> {
                 System.out.print("Vértice A: x= ");
                 ax = teclado_dbl.nextDouble();
                 System.out.print("Vértice A: y= ");
                 ay = teclado_dbl.nextDouble();
                 System.out.print("Vértice B: x= ");
                 bx = teclado_dbl.nextDouble();
                 System.out.print("Vértice B: y= ");
                 by = teclado_dbl.nextDouble();
                 System.out.print("Vértice C: x= ");
                 cx = teclado_dbl.nextDouble();
                 System.out.print("Vértice C: y= ");
                 cy = teclado_dbl.nextDouble();
                 System.out.println("");
                 System.out.println("Coordenadas: A("+ax+","+ay+") , B("+bx+","+by+") , C("+cx+","+cy+")  ");
                 
                 lado_a1 = longDosPuntos(cx, cy, bx, by);
                 lado_b1 = longDosPuntos(ax, ay, cx, cy);
                 lado_c1 = longDosPuntos(ax, ay, bx, by);
                 
                 mostrarResultados(lado_a1, lado_b1, lado_c1);
                }
            
            case "0" -> {
                }
            }
        }while (!menu.equals("0")); 
    return menu; 
    }
}
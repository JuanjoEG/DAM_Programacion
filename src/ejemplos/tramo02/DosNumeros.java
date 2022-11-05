
package ejemplos.tramo02;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class DosNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declarar Variables
        int numero1 = 0;
        int numero2 = 0;
        
        // Pedir numero por teclado
        System.out.print("Escribe un número entero: ");
        Scanner sc = new Scanner (System.in);
        numero1 = sc.nextInt();
        System.out.println("El número es : "+numero1);
        
        // Pedir Otro numero por teclado
        System.out.print("Escribe otro número entero: ");
        numero2 = sc.nextInt();
        System.out.println("El otro número es : "+numero2);
        System.out.println("");
        
        if (numero2 > numero1){
            System.out.println("El número "+numero2+" es mayor que el número "+numero1+".");
            
        }else{
            if(numero2 < numero1){
                System.out.println("El número "+numero2+" es menor que el número "+numero1+".");
                
            }else{
                System.out.println("El número "+numero2+" es igual que el número "+numero1+".");
            }
        }
        int elproducto = numero1 * numero2;
        System.out.println("Su producto es: "+elproducto);
        
        int ladivision = numero1 / numero2;
        System.out.println("Su división es: "+ladivision);
        
        int elresto = numero1 % numero2;
        System.out.println("El resto de la división es: "+elresto);
        
        double num1doble = numero1;
        double num2doble = numero2;
                
        double ladivisionexacta = num1doble / num2doble;
        System.out.println("La división exacta es: "+ladivisionexacta);
        
        int lasuma = numero1 + numero2;
        System.out.println("Su suma es: "+lasuma);
        
        int laresta = numero1 - numero2;
        System.out.println("Su resta es: "+laresta);
        
        System.out.print("Ahora Usaremos El Producto Obtenido = "+elproducto);
        System.out.println("\nPara Calcular Áreas De Polí­gonos Regulares");
        
        System.out.println("\nTodas las Figuras seran regulares de lado = "+elproducto);
        
        double lado = elproducto;
        double areatriangulo = Math.sqrt(3)*lado*lado/4;
        System.out.println("\nÁrea del Triángulo = "+areatriangulo);
        
        double areacuadrado = lado*lado;
        System.out.println("Área del Cuadrado = "+areacuadrado);
        
        double tanValor = Math.tan(3.14159265358979/5);
        double apotema = lado/(2*tanValor);
        double areapentagono = 5*lado*apotema/2;
        System.out.println("Área del Pentágono = "+areapentagono);
        
        double tanValor2 = Math.tan(3.14159265358979/6);
        double apotema2 = lado/(2*tanValor2);
        double areahexagono = 6*lado*apotema2/2;
        System.out.println("Área del Hexágono = "+areahexagono);
        
        double tanValor3 = Math.tan(3.14159265358979/7);
        double apotema3 = lado/(2*tanValor3);
        double areaheptagono = 7*lado*apotema3/2;
        System.out.println("Área del Heptágono = "+areaheptagono);
        
        double tanValor4 = Math.tan(3.14159265358979/8);
        double apotema4 = lado/(2*tanValor4);
        double areaoctogono = 8*lado*apotema4/2;
        System.out.println("Área del Octógono = "+areaoctogono);
    }
}
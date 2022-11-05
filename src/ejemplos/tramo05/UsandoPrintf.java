
package ejemplos.tramo05;

/**
 *
 * @author Juan José Estévez Gonzélez
 */
public class UsandoPrintf {
    
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println(12.369834);
        //Si queremos mostrar el número 12.369834 de tipo double con dos decimales:
        System.out.printf("%.2f %n", 12.369834);
        /*El primer % indica que en esa posición se va a escribir un valor. 
            El valor a escribir se encuentra a continuación de las comillas.
            .2 indica el número de decimales.
            La f indica que el número es de tipo float o double.
            Si el número a mostrar es un entero se utiliza el caracter d.
            %n indica un salto de lí­nea. Equivale a \n. 
            Con printf podemos usar ambos para hacer un salto de lí­nea.
        
            Lo más común será que tengamos el valor en una variable, 
            en ese caso si queremos escribir el valor de n con tres decimales:
        */
        double n = 1.2503673456;
        System.out.println("El valor de n es: " + n);
        System.out.printf("Redondeo de n = %.3f %n", n);
        
        //Para mostrar el signo + en un número positivo:
        System.out.printf("Mostrando el signo  %+.3f %n", n);
        
        int x = 10;
        System.out.printf("El valor de x es = %+d %n", x);
        
        double m = 123.4567;
        System.out.printf("El cuadrado de %.2f es %.2f\n", m, m*m);
        
        //printf permite mostrar valores con un ancho de campo determinado. 
        //Por ejemplo, si queremos mostrar el contenido de n en un ancho de campo 
        //de 10 caracteres escribimos:
        
        System.out.printf("%+010.2f %n", m);
        
        double precio = 1.22;
System.out.printf("%10.2f", precio);
        
        double q = 1.0/3.0;
        System.out.printf
            ("1.0/3.0 = %5.3f %n", q);
        System.out.printf
            ("1.0/3.0 = %7.5f %n", q);
        q = 1.0/2.0;
        System.out.printf
            ("1.0/2.0 = %09.3f %n", q);
        q = 1000.0/3.0;
        System.out.printf
            ("1000/3.0 = %7.1e h%n", q);
        q = 3.0/4567.0;
        System.out.printf
            ("3.0/4567.0 = %7.3e %n", q);
        q = -1.0/0.0;
        System.out.printf
            ("-1.0/0.0 = %7.2e %n", q);
        q = 0.0/0.0;
        System.out.printf
            ("0.0/0.0 = %5.2e %n", q);
        System.out.printf
            ("pi = %5.3f, e = %10.4f %n", Math.PI, Math.E);
        double r = 1.1;
        System.out.printf
            ("C = 2 * %1$5.5f * %2$4.1f, "+"A = %2$4.1f * %2$4.1f * %1$5.5f %n",Math.PI, r);
        System.out.println();
    }
}
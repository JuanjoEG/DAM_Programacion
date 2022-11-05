
package ejemplos.tramo08;

import java.util.Scanner;
import Clases.Motocicleta;

/**
 * ESPAÑA / SEVILLA / 2022
 * APACHE NET BEANS IDE 14
 * TOOLS --> TEMPLATES --> SETTINGS --> BORRAR # DE ÚLTIMA LÍNEA --> USER=Juan José Estévez González
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> SOURCE/BINARY FORMAT --> JDK 18
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> PROFILE --> FULL JRE
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> ENCODING --> ISO-8859-1
 * TOOLS --> OPTIONS --> FONTS & COLOR --> PROFILE: FLATLAF DARK
 * TOOLS --> OPTIONS --> FONTS & COLOR --> FONT --> MONOSPACED 18
 * TOOLS --> OPTIONS --> APPEARANCE --> LOOK AND FEEL --> FLATLAF DARK
 * @author Juan José Estévez González
 */
public class MiGaraje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // INSTANCIACIÓN DE OBJETOS
        // USAMOS EL CONSTRUCTOR POR PARÁMETROS
        // LE DAMOS VALORES A LOS ATRIBUTOS 
        
        // POR SEPARADO...
        // 1. ESTO ES UNA REFERENCIA
        
        Motocicleta moto_01;
        
        // 2. Y LA REFERENCIA APUNTARÁ A UN OBJETO NUEVO
                
        moto_01 = new Motocicleta("Honda", "CB650", "2365-FTH", 650, 95, 63, 15400); 
        
        // ...O EN UNA SOLA LÍNEA...
        // CREAMOS EL OBJETO Y LA REFERENCIA QUE APUNTA A ÉL
        
        Motocicleta moto_02 = new Motocicleta("Honda", "NC750X", "6595-BLP", 750, 58, 69, 24800);
        Motocicleta moto_03 = new Motocicleta("Honda", "CB1000R", "3482-LSQ", 1000, 143, 104, 9700);
             
        // ACCEDEMOS A LAS VARIABLES DE CLASE
        // DECLARADAS EN LA CLASE COMO public static
        // NO DEPENDEN DE NINGÚN OBJETO
        
        System.out.println("");
        System.out.println("Nuestro Garaje tiene ... " + Motocicleta.numero_de_motos + " motos.");
        System.out.println("Todas las motos tienen ... "+ Motocicleta.numero_de_ruedas + " ruedas.");
        System.out.println(""); 

        // LLAMADAS A LOS MÉTODOS toString
        // ES EL MÉTODO PARA MOSTRAR LOS OBJETOS EN FORMA DE CADENA DE TEXTO
        
        System.out.println(moto_01.toString());
        System.out.println(moto_02.toString());
        System.out.println(moto_03.toString());
        
        // LLAMADAS A LOS MÉTODOS GETTERS
        // ES EL MÉTODO PARA UTILIZAR LOS VALORES DE LOS ATRIBUTOS DE LOS OBJETOS
        
        System.out.println("La moto 1 tiene una cilindrada de "+moto_01.getCilindrada()+" centÃ­metros cúbicos.");
        System.out.println("La moto 2 tiene la matrí­cula "+moto_02.getMatricula());
        System.out.println("La moto 3 tiene una potencia de "+moto_03.getPotencia()+" caballos.");
        
        // USAREMOS LOS MÉTODOS SETTERS PARA HACER MODIFICACIONES A LOS VALORES
        // PEDIMOS POR TECLADO UNA NUEVA MATRÍCULA PARA LA moto_02
        // Y SE LA PASAMOS AL setMatricula DEL OBJETO
        
        String nueva_matricula;
        Scanner tecla = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Introduce la nueva matrícula de la moto 2: ");
        nueva_matricula = tecla.nextLine();
        
        moto_02.setMatricula(nueva_matricula);
        
        // MOSTRAMOS LA NUEVA moto_02
        
        System.out.println("");
        System.out.println("La moto 2 ahora tiene la matrí­cula "+moto_02.getMatricula());
        System.out.println("");
        System.out.println(moto_02.toString());
    }    
}

package ejemplos.tramo08;

import java.util.Random;
import java.util.Scanner;
import Clases.Carta;

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
public class BarajaPoker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // DECLARACIÓN DE VARIABLES
        int numero, eleccion, n_palo_1, n_palo_2, numero_1, numero_2;
        int ganador=0, empate=0,derrota=0;
        double saldo=10, ganancia=1.16;
        double saldo_redondeo;
        String palo, jugar, palo_1, palo_2;
        Scanner teclado_int= new Scanner(System.in);
        Scanner teclado_Str= new Scanner(System.in);
        Carta c1 = new Carta();
        Carta c2;
        
        // INICIALIZACIÓN DE CARTA MEDIANTE SET
        
        c1.setPalo("T");
        c1.setNumero(8);
        
        // EXTRACCIÓN DE LOS PARÁMETROS DE LA CARTA
        
        System.out.println("");
        System.out.println("( 1 - 13 )");
        System.out.print("Introduce el número de una carta: ");        
        numero = teclado_int.nextInt();
        System.out.println("");        
        System.out.println("T - para TRÉBOL.");
        System.out.println("R - para ROMBOS.");
        System.out.println("P - para PICAS.");
        System.out.println("C - para CORAZONES.");
        System.out.print("Introduce el palo de una carta: ");
        palo = teclado_Str.nextLine();
        System.out.println("");
        
        // INICIALIZACIÓN DE CARTA MEDIANTE CONSTRUCTOR POR PARÁMETROS
        System.out.println("""
                           
                           USAMOS LOS VALORES QUE TENEMOS PARA PASARLOS
                           AL CONSTRUCTOR POR PARÁMETROS.
                           CREAMOS UN OBJETO DE LA CLASE CARTA - CREAMOS UNA CARTA.
                           """);
        c2 = new Carta (numero, palo);
        
        // SE MUESTRAN AMBAS CARTAS
        System.out.println("ESTAMOS USANDO UN MÉTODO PERSONALIZADO - MUESTRA UNA CARTA.");
        c1.mostrarCarta();
        System.out.println("ESTAMOS USANDO UN MÉTODO PERSONALIZADO - MUESTRA UNA CARTA.");
        c2.mostrarCarta();
        
        // SE COMPARA CUAL ES MAYOR (LA SEGUNDA CON LA PRIMERA)
        System.out.println("\nESTAMOS USANDO UN MÉTODO PERSONALIZADO - COMPARA CARTAS.");
        System.out.println(c1.comparaCarta(c2));
        
        // SE MODIFICA LA SEGUNDA CARTA MEDIANTE SET
        System.out.println("\nESTAMOS USANDO UN MÉTODOS MODIFICADOR - UN SETTER - MODIFICA CARTA.");
        c2.setPalo("T");
        c2.setNumero(8);
        
        // SE COMPARA AHORA (LA PRIMERA CON LA SEGUNDA)
        System.out.println("\nESTAMOS USANDO UN MÉTODO PERSONALIZADO - COMPARA CARTAS.");
        System.out.println(c2.comparaCarta(c1));
        System.out.println("");
        
        // UNA VEZ COMPLETADA LA TAREA DEL TEMA...
        // SE PLANTE UN JUEGO OBVIO DADO EL CÓDIGO EXISTENTE
        // JUGAR A LA CARTA MAYOR
        System.out.println("\n¡ ¡ ¡   V A M O S    A    J U G A R   ! ! !\n");
        // PLANTEAMOS LAS NORMAS DEL JUEGO CON UN BUCLE
        // PARA SALIR HAY QUE CONTESTAR CORRECTAMENTE
        
        do {            
            System.out.println("""
                               La carta más alta gana,
                               la más chica es el AS,
                               y la más grande el REY.
                               En caso de empate numerico...
                               el orden de valor de los palos es...
                               TRÉBOL > ROMBOS > PICAS > CORAZONES.
             
                               ¿Quieres Jugar una mano de cartas?
                               ( Y - N ) = """);
            jugar = teclado_Str.nextLine();
            
        } while (!"Y".equals(jugar) && !"N".equals(jugar)); 
        
        // ESTE ES EL BUCLE DEL CUERPO DEL JUEGO
        
        while("Y".equals(jugar) || "".equals(jugar)){
            
        // INICIO
        
        System.out.println("Se reparten dos cartas al azar.");
        System.out.println("Puedes elegir la que quieras.");
        System.out.println("");
        saldo_redondeo=Math.round(saldo*100.00)/100.00;
        System.out.println("Tu SALDO es de "+saldo_redondeo+" Euros.");
        System.out.println("");
        
        // ELECCIÓN AL AZAR - RANDOM - DE LAS DOS CARTAS
        
        Random n = new Random();
        Random p = new Random();
        numero_1=1+n.nextInt(13);
        n_palo_1=1+p.nextInt(4);
        numero_2=1+n.nextInt(13);
        n_palo_2=1+p.nextInt(4);
        
        // CONDICIONAL QUE TRANSFORMA EL PALO NUMÉRICO A CADENA
        
        switch (n_palo_1) {
            case 1:
                palo_1="T";
                break;
            case 2:
                palo_1="R";
                break;
            case 3:
                palo_1="P";
                break;
            case 4:
                palo_1="C";
                break;
            default:
                palo_1="J";
                break;
        }
        
        switch (n_palo_2) {
            case 1:
                palo_2="T";
                break;
            case 2:
                palo_2="R";
                break;
            case 3:
                palo_2="P";
                break;
            case 4:
                palo_2="C";
                break;
            default:
                palo_2="J";
                break;
        }
        
        // INICIALIZACIÓN DE CARTA MEDIANTE CONSTRUCTOR POR PARÁMETROS
        
        c1 = new Carta (numero_1, palo_1);
        c2 = new Carta (numero_2, palo_2);
        
        // BUCLE PARA ELECCIÓN
        // SE SALE CON RESPUESTA CORRECTA
        
        do {            
            System.out.println("¿Cuál quieres descubrir primero?");
            System.out.print("( 1 - 2 ) =");
            eleccion = teclado_int.nextInt();
            System.out.println("");
        } while (eleccion!=1 && eleccion!=2);
        
        // CONDICIONAL PARA MOSTRAR UNA CARTA
        
        switch (eleccion) {
            case 1:
                System.out.println("Carta 1.");
                c1.mostrarCarta();
                System.out.println("");
                break;
            case 2:
                System.out.println("Carta 2.");
                c2.mostrarCarta();
                System.out.println("");
                break;         
        }
        
        // BUCLE PARA ELECCIÓN
        // SE SALE CON RESPUESTA CORRECTA
        
        do {            
            System.out.println("¿Qué carta te quedas?");
            System.out.print("( 1 - 2 ) =");
            eleccion = teclado_int.nextInt();
            System.out.println("");
        } while (eleccion!=1 && eleccion!=2);
        
        // MÉTODOS PARA MOSTRAR LAS CARTAS
        
        System.out.println("Carta 1.");
        c1.mostrarCarta();
        System.out.println("");
        System.out.println("Carta 2.");
        c2.mostrarCarta();
        System.out.println("");
        
        // CONDICIONALES QUE COMPARAN CARTAS Y MUESTRA RESULTADO
                
        if (eleccion==1){
            switch (c1.comparaCarta(c2)) {
                case 1:
                    System.out.println("...ERES GANADOR...");
                    System.out.println("");
                    saldo=saldo*ganancia;
                    ganador=ganador+1;
                    break;
                case 0:
                    System.out.println("...EMPATE...");
                    System.out.println("");
                    empate=empate+1;
                    break;
                case -1:
                    System.out.println("...PERDISTE...");
                    System.out.println("");
                    saldo=saldo/2;
                    derrota=derrota+1;
                    break;
                default:
                    break;
            }
        } else if(eleccion==2){
            switch (c2.comparaCarta(c1)) {
                case 1:
                    System.out.println("...ERES GANADOR...");
                    System.out.println("");
                    saldo=saldo*ganancia;
                    ganador=ganador+1;
                    break;
                case 0:
                    System.out.println("...EMPATE...");
                    System.out.println("");
                    empate=empate+1;
                    break;
                case -1:
                    System.out.println("...PERDISTE...");
                    System.out.println("");
                    saldo=saldo/2;
                    derrota=derrota+1;
                    break;
                default:
                    break;
            }        
        }
        
        // BUCLE PARA ELECCIÓN
        // SE SALE CON RESPUESTA CORRECTA
        
        do { 
            saldo_redondeo=Math.round(saldo*100.00)/100.00;
            System.out.println("Tu SALDO es de "+saldo_redondeo+" Euros.");
            System.out.println("¿Quieres Jugar otra mano de cartas?");
            System.out.println("Pulsa Intro para Jugar o pulsa...");
            System.out.print("( Y - N ) = ");
            jugar = teclado_Str.nextLine();
            System.out.println("");
        } while (!"Y".equals(jugar) && !"N".equals(jugar) && !"".equals(jugar));
        }
        
        // SALIDA DEL JUEGO
        
        saldo_redondeo=Math.round(saldo*100.00)/100.00;        
        System.out.println(ganador+" - Número de Victorias.");
        System.out.println(empate+" - Número de Empates.");
        System.out.println(derrota+" - Número de Derrotas.");
        System.out.println("Tu SALDO es de "+saldo_redondeo+" Euros.");
        System.out.println("");
        System.out.println("¡ ¡ ¡ ¡   G R A C I A S    P O R    J U G A R   ! ! ! !");
        System.out.println("");
    }           
}
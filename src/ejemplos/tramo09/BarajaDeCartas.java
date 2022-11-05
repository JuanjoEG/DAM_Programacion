
package ejemplos.tramo09;

import java.util.Scanner;
import Clases.CartaEspanola;
import Clases.CartaFrancesa;

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
public class BarajaDeCartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String menu;
        do {         
         
        System.out.println("""
                           
                           
                           
                           
                           
                           **************************
                           *          MENÚ          *
                           **************************
                           * 1. Carta Esp.  Random  *
                           * 2. Carta Fran. Random  *
                           * 3. Elegir Carta Esp.   *
                           * 4. Elegir Carta Fran.  *
                           * 0. Salir               *
                           **************************
                           
                           """);
            System.out.print("OPCIÓN:  ");
        Scanner teclado = new Scanner(System.in);
        menu= teclado.nextLine();
        
        switch (menu){
            case "1":
                CartaEspanola ce = new CartaEspanola(22, "CUALQUIERA");
        
                System.out.print("CARTA ESPAÑOLA: ");
                ce.mostrarCarta();
                System.out.println("");
                break;
            case "2":
                CartaFrancesa cf = new CartaFrancesa(22, "CUALQUIERA");
                
                System.out.print("CARTA FRACESA: ");
                cf.mostrarCarta();
                System.out.println("");
                break;
            case "3":
                elegirCartaEsp();
                break;
            case "4":
                elegirCartaFra(); 
                break;
            default:
                break;
        }            
        
        } while (!menu.equals("0"));                
               
    }
    
    public static void elegirCartaEsp(){
        
        int numero;
        String palo;
        CartaEspanola ce;
        
        Scanner teclado_int = new Scanner(System.in);
        Scanner teclado_Str = new Scanner(System.in);
        
        
        System.out.println("CARTA ESPAÑOLA");
        System.out.println("");
        
        System.out.println("1 - 10");
        System.out.print("Introduce un número :");
        numero = teclado_int.nextInt();
        System.out.println("");
        
        System.out.println("Espadas - Copas - Oros - Bastos");
        System.out.print("Introduce un palo español :");
        palo = teclado_Str.nextLine();
        System.out.println("");
        
        ce = new CartaEspanola(numero, palo);
        
        System.out.print("CARTA ESPAÑOLA: ");
        ce.mostrarCarta();
        System.out.println("");        
    }
    
    public static void elegirCartaFra(){
        
        int numero;
        String palo;        
        CartaFrancesa cf;
        
        Scanner teclado_int = new Scanner(System.in);
        Scanner teclado_Str = new Scanner(System.in);
        
        System.out.println("CARTA FRACESA");
        System.out.println("");
        
        System.out.println("1 - 13");
        System.out.print("Introduce un número :");
        numero = teclado_int.nextInt();
        System.out.println("");
        
        System.out.println("Corazones - Picas - Rombos - Tréboles");
        System.out.print("Introduce un palo español :");
        palo = teclado_Str.nextLine();
        System.out.println("");
        
        cf = new CartaFrancesa(numero, palo);
        
        System.out.print("CARTA FRACESA: ");
        cf.mostrarCarta();
        System.out.println("");        
    }
}
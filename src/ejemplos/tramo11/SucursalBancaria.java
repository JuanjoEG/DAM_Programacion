
package ejemplos.tramo11;

import Clases.CuentaCorriente;
import Clases.SaldoException;
import java.util.Scanner;

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
public class SucursalBancaria {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        CuentaCorriente c1 = new CuentaCorriente("Aurora Holguí­n Lozano", "ES63 2100 6091 74 01 00002750", 12073.35, 3.5);
        double cantidad, interes;
        String menu;
        do {
            System.out.println("""
                               
                               
                               
                               
                               
                               **************************
                               *          MENÚ          *
                               **************************
                               * 1. Nombre del Titular. *
                               * 2. Número de Cuenta.   *
                               * 3. Consultar Saldo.    *
                               * 4. Ingresa Saldo.      *
                               * 5. Retirar Saldo.      *
                               * 6. Tipo de Interés.    *
                               * 7. Resumen General.    *
                               * 0. Salir               *
                               **************************
                               
                               """);
            Scanner teclado = new Scanner(System.in);
            System.out.print("Elige opción: ");            
            menu= teclado.nextLine();
            if (null == menu){
                    System.out.println("\nLa opción no es correcta.");
                } else switch(menu){
                        case "0" -> {
                        }
                        case "1" -> System.out.println("Titular: "+c1.getNombre());
                        case "2" -> System.out.println("Número de Cuenta: "+c1.getCuenta());
                        case "3" -> System.out.println("El Saldo es de: "+c1.getSaldo()+"?.");
                        case "4" -> {
                            try {
                                System.out.print("Cantidad a Ingresar: ");
                                cantidad = teclado.nextDouble();
                                c1.ingresarDinero(cantidad);
                                System.out.println("El Saldo AHORA es de: "+c1.getSaldo()+"?.");
                            }   catch (SaldoException e) {
                                System.out.println("""

                                                   La Operación de INGRESO NO es posible
                                                   """+e.toString());
                            }
                        }
                        case "5" -> {
                            try {
                                System.out.print("Cantidad a Retirar: ");
                                cantidad = teclado.nextDouble();
                                c1.retirarDinero(cantidad);
                                System.out.println("El Saldo AHORA es de: "+c1.getSaldo()+"?.");
                            }   catch (SaldoException e) {
                                System.out.println("""

                                                   La Operación de RETIRADA NO es posible
                                                   """+e.toString());
                            }
                        }
                        case "6" -> {
                            System.out.println("El Interés es del: "+c1.getTipoInteres()+" %.");
                            System.out.print("Ingrese el Nuevo Interés: ");
                            interes = teclado.nextDouble();
                            c1.setTipoInteres(interes);
                            System.out.println("El Interés AHORA es del: "+c1.getTipoInteres()+" %.");
                        }
                        case "7" -> System.out.println(c1);
                        default -> {
                        }
        }
        } while (!menu.equals("0"));
    }
}
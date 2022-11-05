
package Clases;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class LeerPorTeclado {
    
    // M�TODOS DIN�MICOS
    
    public void leerString(String mensaje){
    
        Scanner teclado = new Scanner(System.in);
        String valor;
        
        System.out.println(mensaje);
        valor = teclado.nextLine();
        
        System.out.println(valor);
    }
    
    public void leerChar(String mensaje){
    
        Scanner teclado = new Scanner(System.in);
        char valor;
        
        System.out.println(mensaje);
        valor = teclado.next().charAt(0);
        
        System.out.println(valor);
    }
    
    public void leerInt(String mensaje){
    
        Scanner teclado = new Scanner(System.in);
        int valor;
        
        System.out.println(mensaje);
        valor = teclado.nextInt();
        
        System.out.println(valor);
    }
    
    public void leerDouble(String mensaje){
    
        Scanner teclado = new Scanner(System.in);
        double valor;
        
        System.out.println(mensaje);
        valor = teclado.nextDouble();
        
        System.out.println(valor);
    }
    
    public void leerBoolean(String mensaje){
    
        Scanner teclado = new Scanner(System.in);
        boolean valor;
        
        System.out.println(mensaje);
        valor = teclado.nextBoolean();
        
        System.out.println(valor);
    } 
    
    // M�TODOS EST�TICOS
    
    public static void leerStringS(String mensaje){
    
        Scanner teclado = new Scanner(System.in);
        String valor;
        
        System.out.println(mensaje);
        valor = teclado.nextLine();
        
        System.out.println(valor);
    }
    
    public static void leerCharS(String mensaje){
    
        Scanner teclado = new Scanner(System.in);
        char valor;
        
        System.out.println(mensaje);
        valor = teclado.next().charAt(0);
        
        System.out.println(valor);
    }
    
    public static void leerIntS(String mensaje){
    
        Scanner teclado = new Scanner(System.in);
        int valor;
        
        System.out.println(mensaje);
        valor = teclado.nextInt();
        
        System.out.println(valor);
    }
    
    public static void leerDoubleS(String mensaje){
    
        Scanner teclado = new Scanner(System.in);
        double valor;
        
        System.out.println(mensaje);
        valor = teclado.nextDouble();
        
        System.out.println(valor);
    }
    
    public static void leerBooleanS(String mensaje){
    
        Scanner teclado = new Scanner(System.in);
        boolean valor;
        
        System.out.println(mensaje);
        valor = teclado.nextBoolean();
        
        System.out.println(valor);
    }    
}
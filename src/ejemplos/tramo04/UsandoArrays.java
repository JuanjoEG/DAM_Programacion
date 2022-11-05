
package ejemplos.tramo04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class UsandoArrays {
    public static void mostrarArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(i+".-  "+array[i]+" ");
        }
    }
    public static void mostrarArrayInverso(int[] array){
        for (int i=array.length -1; i>=0; i--){
            System.out.println(i+".-  "+array[i]+" ");
        }
    }
    public static void buscarMenor(int[] array){
        int menor = array[0];
        for (int i=0; i<array.length; i++){
            if(array[i] < menor)
                menor = array[i];
        }
        System.out.println("El menor es "+menor+"\n");
    }
    public static void buscarMayor(int[] array){
        int mayor = array[0];
        for (int i=0; i<array.length; i++){
            if(array[i] > mayor)
                mayor = array[i];
        }
        System.out.println("El mayor es "+mayor+"\n");
    }
    public static void buscarNumeroUnico(int [] array, int numero){
        boolean salir = false;
        for (int i=0; i<array.length && salir == false; i++){
            if (array[i] == numero){
                System.out.println("El número introducido está en la posición "+i+"\n");
                salir = true;
            }
        }
        if(salir == false)
            System.out.println("El número no se encuentra en el array\n");
    }
    public static void buscarNumeroTodos(int [] array, int numero){
        boolean salir = false;
        for (int i=0; i<array.length; i++){
            if (array[i] == numero){
                System.out.println("El número introducido está en la posición "+i+"\n");
                salir = true;
            }
        }
        if(salir == false)
            System.out.println("El número no se encuentra en el array\n");
    }
    public static void cambiarNumero(int [] array, int posicion, int numero){
        array[posicion] = numero;
        System.out.println("Un elemento en el Array se ha cambiado.\n");
    }
    public static void intercambiarNumeros(int [] array, int posicion1, int posicion2){
        int temp;
        temp = array[posicion1];
        array[posicion1] = array[posicion2];
        array[posicion2] = temp;
        System.out.println("Se han intercambiado dos elementos en el Array.\n");
    }
    public static void ordenarMenorMayor(int [] array){
        for (int a=0; a<(array.length-1); a++){
            for (int b=(a+1); b<array.length; b++){
                if (array[a]>array[b]){
                    intercambiarNumeros(array, a, b);
                }
            }
        }
        System.out.println("Se ha ordenado el Array de menor a mayor.\n");
    }
    public static void ordenarMayorMenor(int [] array){
        for (int a=0; a<(array.length-1); a++){
            for (int b=(a+1); b<array.length; b++){
                if (array[a]<array[b]){
                    intercambiarNumeros(array, a, b);
                }
            }
        }
        System.out.println("Se ha ordenado el Array de mayor a menor.\n");
    }
    public static void nuevoArrayRandom(int [] array){
        Random r = new Random();        
        for (int i=0; i<array.length; i++){
            array[i] = r.nextInt(100);
        }
        System.out.println("Se ha creado un Array Nuevo.\n");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, posicion, posicion1,posicion2;
        String menu;
        Scanner sn_teclado = new Scanner (System.in);
        // ARRAY DE 15 POSICIONES
        int[] array = new int[15];
        nuevoArrayRandom(array);
        
        do{
            menu ="";
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("\n-----------------------------------------\n"
                                +"......ARRAY DE 15 POSICIONES RANDOM......\n"
                                +"..................Menú...................\n"
                                +"-----------------------------------------\n"
                                +" 1.  Mostrar el array.\n"
                                +" 2.  Mostrar el array en orden inverso.\n"
                                +" 3.  Buscar el número menor.\n"
                                +" 4.  Buscar el número mayor.\n"
                                +" 5.  Comprobar si existe un número en el array, una vez.\n"
                                +" 6.  Comprobar si existe un número en el array, varias veces.\n"
                                +" 7.  Cambiar el valor del número.\n"
                                +" 8.  Cambiar dos números de posición.\n"
                                +" 9.  Ordenar el array de menor a mayor.\n"
                                +"10.  Ordenar el array de mayor a menor.\n"
                                +"11.  Nuevo array.\n"
                                +"-----------------------------------------\n"
                                +" 0. ATRÁS.\n"
                                +"-----------------------------------------\n");
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch (menu){
                case "1":
                    mostrarArray(array);
                    break;
                case "2":
                    mostrarArrayInverso(array);
                    break;
                case "3":
                    buscarMenor(array);
                    break;
                case "4":
                    buscarMayor(array);
                    break;
                case "5":
                    System.out.println("Introduce el número a buscar una vez");
                    numero= sn_teclado.nextInt();
                    buscarNumeroUnico(array, numero);
                    break;
                case "6":
                    System.out.println("Introduce el número a buscar");
                    numero= sn_teclado.nextInt();
                    buscarNumeroTodos(array, numero);
                    break;
                case "7":
                    System.out.println("Introduce la posición y el nuevo valor");
                    posicion= sn_teclado.nextInt();
                    numero= sn_teclado.nextInt();
                    cambiarNumero(array, posicion, numero);
                    break;
                case "8":
                    System.out.println("Introduce las dos posiciones a intercambiar");
                    posicion1= sn_teclado.nextInt();
                    posicion2= sn_teclado.nextInt();
                    intercambiarNumeros(array, posicion1, posicion2);
                    break;
                case "9":
                    ordenarMenorMayor(array);
                    break;
                case "10":
                    ordenarMayorMenor(array);
                    break;
                case "11": 
                    nuevoArrayRandom(array);
                    break;
                case "0":
                    System.out.println("Gracias por usar el programa.\n");
                    break;
                default:
                    System.out.println("La opción no es correcta.\n");
                    break;
            }
        }while (!"0".equals(menu));
    }
}
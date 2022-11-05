
package ejemplos.tramo04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class UsandoArraysMatriz {
    public static void mostrarArray(int[][] array, int fila, int columna){
        for (int a=0; a<(fila); a++){
            for (int b=0; b<(columna); b++){
                System.out.print("("+a+","+b+")="+array[a][b]+" ");
            }
            System.out.println("");
        }    
    }
    public static void mostrarArrayInverso(int[][] array, int fila, int columna){
        for (int a=(fila-1); a>-1; a--){
            for (int b=(columna-1); b>-1; b--){
                System.out.print("("+a+","+b+")="+array[a][b]+" ");
            }
            System.out.println("");
        }  
    }
    public static void buscarMenor(int[][] array, int fila, int columna){
        int menor = array[0][0];
        int a_temp = 0;
        int b_temp = 0;
        for (int a=0; a<(fila); a++){
            for (int b=0; b<(columna); b++){
                if(array[a][b] < menor){
                menor = array[a][b];
                a_temp = a;
                b_temp = b;
                }
            }
        }
        System.out.println("El menor es "+menor+" en la posición ("+a_temp+","+b_temp+")\n");
    }
    public static void buscarMayor(int[][] array, int fila, int columna){
        int mayor = array[0][0];
        int a_temp = 0;
        int b_temp = 0;
        for (int a=0; a<(fila); a++){
            for (int b=0; b<(columna); b++){
                if(array[a][b] > mayor){
                mayor = array[a][b];
                a_temp = a;
                b_temp = b;
                }
            }
        }
        System.out.println("El mayor es "+mayor+" en la posición ("+a_temp+","+b_temp+")\n");
    }
    public static void buscarNumeroUnico(int[][] array, int fila, int columna, int numero){
        boolean salir = false;
        for (int a=0; a<(fila) && salir == false; a++){
            for (int b=0; b<(columna) && salir == false; b++){
                if (array[a][b] == numero){
                System.out.println("El número introducido está en la posición ("+a+","+b+")\n");
                salir = true;
                }
            }
        }
        if(salir == false)
            System.out.println("El número no se encuentra en el array\n");
    }
    public static void buscarNumeroTodos(int[][] array, int fila, int columna, int numero){
        boolean salir = false;
        for (int a=0; a<(fila); a++){
            for (int b=0; b<(columna); b++){
                if (array[a][b] == numero){
                System.out.println("El número introducido está en la posición ("+a+","+b+")\n");
                salir = true;
                }
            }
        }
        if(salir == false)
            System.out.println("El número no se encuentra en el array\n");
    }
    public static void buscarPosicion(int [][] array, int fila, int columna){
        System.out.println("En la posición ("+fila+","+columna+")");
        System.out.println("se encuentra el valor= "+array[fila][columna]+"\n");
    }
    public static void cambiarNumero(int[][] array, int fila, int columna, int numero){
        array[fila][columna] = numero;
        System.out.println("Un elemento en el Array se ha cambiado.\n");
    }
    public static void intercambiarNumeros(int [][] array, int fila_pri, int columna_pri, int fila_seg, int columna_seg){
        int temp;
        temp = array[fila_pri][columna_pri];
        array[fila_pri][columna_pri] = array[fila_seg][columna_seg];
        array[fila_seg][columna_seg] = temp;
        System.out.println("Se han intercambiado dos elementos en el Array.\n");
    }
    public static void ordenarMenorMayor(int [][] array, int fila, int columna){
        for (int a1=0; a1<(fila); a1++){
            for (int b1=0; b1<(columna); b1++){
                for (int a2=0; a2<(fila); a2++){
                    for (int b2=0; b2<(columna); b2++){
                        if (array[a1][b1]<array[a2][b2]){
                            intercambiarNumeros(array, a1, b1, a2, b2);
                        }
                    }
                }
            }
        }
        System.out.println("Se ha ordenado el Array de menor a mayor.\n");
    }
    public static void ordenarMayorMenor(int [][] array, int fila, int columna){
        for (int a1=0; a1<(fila); a1++){
            for (int b1=0; b1<(columna); b1++){
                for (int a2=0; a2<(fila); a2++){
                    for (int b2=0; b2<(columna); b2++){
                        if (array[a1][b1]>array[a2][b2]){
                            intercambiarNumeros(array, a1, b1, a2, b2);
                        }
                    }
                }
            }
        }
        System.out.println("Se ha ordenado el Array de mayor a menor.\n");
    }
    public static void nuevoArrayRandom(int [][] array, int fila, int columna){
        Random r = new Random();        
        for (int a=0; a<(fila); a++){
            for (int b=0; b<(columna); b++){
            array[a][b] = (r.nextInt(90))+10;
            }
        }
        System.out.println("Se ha creado un Array Nuevo.\n");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int fila;
        int columna;
        String menu;
        Scanner sn_teclado = new Scanner (System.in);
        // ARRAY
        System.out.println("Introduce las filas del array ");
        fila= sn_teclado.nextInt();
        System.out.println("Introduce las columnas del array ");
        columna= sn_teclado.nextInt();
        int[][] array = new int[fila][columna];
        nuevoArrayRandom(array, fila, columna);
        
        do{
            menu ="";
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("\n*-----------------------------------------------------*\n"
                                +"*.................ARRAY MATRIZ RANDOM.................*\n"
                                +"*........................Menú.........................*\n"
                                +"*-----------------------------------------------------*\n"
                                +"*     1.  Mostrar el array.                           *\n"
                                +"*     2.  Mostrar el array en orden inverso.          *\n"
                                +"*     3.  Buscar el número menor.                     *\n"
                                +"*     4.  Buscar el número mayor.                     *\n"
                                +"*     5.  Buscar un número en el array, una vez.      *\n"
                                +"*     6.  Buscar un número en el array, varias veces. *\n"
                                +"*     7.  Buscar un número por su posición.           *\n"
                                +"*     8.  Cambiar el valor del número.                *\n"
                                +"*     9.  Cambiar dos números de posición.            *\n"
                                +"*    10.  Ordenar el array de menor a mayor.          *\n"
                                +"*    11.  Ordenar el array de mayor a menor.          *\n"
                                +"*    12.  Nuevo array.                                *\n"
                                +"*-----------------------------------------------------*\n"
                                +"*     0.  Salir.                                      *\n"
                                +"*-----------------------------------------------------*\n");
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch (menu){
                case "1":
                    mostrarArray(array, fila, columna);
                    break;
                case "2":
                    mostrarArrayInverso(array, fila, columna);
                    break;
                case "3":
                    buscarMenor(array, fila, columna);
                    break;
                case "4":
                    buscarMayor(array, fila, columna);
                    break;
                case "5":
                    System.out.println("Introduce el número a buscar una vez");
                    numero= sn_teclado.nextInt();
                    buscarNumeroUnico(array, fila, columna, numero);
                    break;
                case "6":
                    System.out.println("Introduce el número a buscar");
                    numero= sn_teclado.nextInt();
                    buscarNumeroTodos(array, fila, columna, numero);
                    break;
                case "7":
                    int fila_busc, columna_busc;
                    System.out.println("Introduce la posición del número a buscar ");
                    System.out.println("Introduce la fila ");
                    fila_busc= sn_teclado.nextInt();
                    System.out.println("Introduce la columna ");
                    columna_busc= sn_teclado.nextInt();
                    buscarPosicion(array, fila_busc, columna_busc);
                    break;
                case "8":
                    int fila_camb, columna_camb;
                    System.out.println("Introduce la posición del número a cambiar ");
                    System.out.println("Introduce la fila ");
                    fila_camb= sn_teclado.nextInt();
                    System.out.println("Introduce la columna ");
                    columna_camb= sn_teclado.nextInt();
                    System.out.println("Introduce nuevo valor ");
                    numero= sn_teclado.nextInt();
                    cambiarNumero(array, fila_camb, columna_camb, numero);
                    break;
                case "9":
                    int fila_pri, columna_pri, fila_seg, columna_seg;
                    System.out.println("Introduce las dos posiciones a intercambiar");
                    System.out.println("Introduce la fila del primero");
                    fila_pri= sn_teclado.nextInt();
                    System.out.println("Introduce la comuna del primero");
                    columna_pri= sn_teclado.nextInt();
                    System.out.println("Introduce la fila del segundo");
                    fila_seg= sn_teclado.nextInt();
                    System.out.println("Introduce la comuna del segundo");
                    columna_seg= sn_teclado.nextInt();
                    
                    intercambiarNumeros(array, fila_pri, columna_pri, fila_seg, columna_seg);
                    break;
                case "10":
                    ordenarMenorMayor(array, fila, columna);
                    break;
                case "11":
                    ordenarMayorMenor(array, fila, columna);
                    break;
                case "12":
                    nuevoArrayRandom(array, fila, columna);
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

package ejemplos.tramo04;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class MatrizCerosUnosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
        System.out.println("LA TAREA CONSISTE EN DIBUJAR EN LA PANTALLA UNA MATRIZ\n"
                + "USANDO UN ARRAY DE DOS DIMENSIONES,\n"
                + "QUE TENGA UN NÚMERO DE FILAS Y COLUMNAS\n"
                + "DEFINIDAS POR EL USUARIO,\n"
                + "Y ESTÉ FORMADA POR CEROS EN SU INTERIOR,\n"
                + "Y POR UNOS EN TODOS SUS BORDES.\n");
        int fila , colum, dato;// Declaramos la variables
        // Pedimos por teclado el tamaño de la matriz
        Scanner entrada_tecla = new Scanner(System.in);
        System.out.print ("Elija un número de FILAS: ");
        fila = entrada_tecla.nextInt();
        System.out.print ("Elija un número de COLUMNAS: ");
        colum = entrada_tecla.nextInt();
        // Inicializamos el ARRAY
        int [][] arraymatriz = new int [fila][colum];
        //Los bucles generan las filas y las columnas
        for (int i=0; i<=(fila-1); i++){
            System.out.println("");
            for (int j=0; j<=(colum-1); j++){
                // Con el condicional forzamos dato=1 si está¡ en los estremos
                if ((j==0)||(i==0)||(j==(colum-1))||(i==(fila-1))){
                    dato=1;
                }
                else {
                    dato=0;
                }
                //Asignamos valores al ARRAY
                arraymatriz[i][j]=dato;
                // Por último se saca por pantalla
                System.out.print(arraymatriz[i][j]);
            }
        }System.out.println("");
    }
    
}

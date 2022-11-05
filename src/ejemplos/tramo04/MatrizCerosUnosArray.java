
package ejemplos.tramo04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class MatrizCerosUnosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
        System.out.println("LA TAREA CONSISTE EN DIBUJAR EN LA PANTALLA UNA MATRIZ\n"
                + "USANDO UN ARRAY DE DOS DIMENSIONES,\n"
                + "QUE TENGA UN N�MERO DE FILAS Y COLUMNAS\n"
                + "DEFINIDAS POR EL USUARIO,\n"
                + "Y EST� FORMADA POR CEROS EN SU INTERIOR,\n"
                + "Y POR UNOS EN TODOS SUS BORDES.\n");
        int fila , colum, dato;// Declaramos la variables
        // Pedimos por teclado el tama�o de la matriz
        Scanner entrada_tecla = new Scanner(System.in);
        System.out.print ("Elija un n�mero de FILAS: ");
        fila = entrada_tecla.nextInt();
        System.out.print ("Elija un n�mero de COLUMNAS: ");
        colum = entrada_tecla.nextInt();
        // Inicializamos el ARRAY
        int [][] arraymatriz = new int [fila][colum];
        //Los bucles generan las filas y las columnas
        for (int i=0; i<=(fila-1); i++){
            System.out.println("");
            for (int j=0; j<=(colum-1); j++){
                // Con el condicional forzamos dato=1 si est� en los estremos
                if ((j==0)||(i==0)||(j==(colum-1))||(i==(fila-1))){
                    dato=1;
                }
                else {
                    dato=0;
                }
                //Asignamos valores al ARRAY
                arraymatriz[i][j]=dato;
                // Por �ltimo se saca por pantalla
                System.out.print(arraymatriz[i][j]);
            }
        }System.out.println("");
    }
    
}

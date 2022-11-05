
package ejemplos.tramo03;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class MatrizCerosUnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("LA TAREA CONSISTE EN DIBUJAR EN LA PANTALLA UNA MATRIZ\n"
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
        
        //Los bucles generan las filas y las columnas
        // Dejo que empiecen en 0 por si me sirve despues para el indice de un array
        // Al empezar en 0 tendr� que terminar en (fila-1) y en (colum-1)
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
                
                // Por �ltimo se saca por pantalla
                System.out.print(""+dato);
            }
        }System.out.println("");
    }
}
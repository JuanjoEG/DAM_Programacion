
package bloque04;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Biblioteca {
    
    public static void main(String[] args) {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in);
            System.out.println("""
                               
                               
                               
                               
                               
                    ***********************************************************************
                    *                CLASES / BIBLIOTECAS Y PAQUETES                      *
                    ***********************************************************************
                    *                     COMANDO  -->  import                            *
                    ***********************************************************************
                    * IMPORTAR PAQUETE COMPLETO  -->  import NOMBREPAQUETE.*;             *
                    * IMPORTAR UNA CLASE  -->  import NOMBREPAQUETE.NOMBRECLASE;          *
                    ***********************************************************************
                    * PARA CREAR UNA BIBLIOTECA EN NETBEANS:                              *
                    *       NUEVO PROYECTO --> Java Class Library                         *
                    *                          CREAMOS LOS PAQUETES Y LAS CLASES          *
                    * PARA CREAR EL ARCHIVO DE LA BIBLIOTECA:                             *
                    *       MEN� RUN --> CLEAN AND BUILD PROYECT                          *
                    *                    SE CREA CARPETA BUILD CON EL FICHERO  .jar       *
                    ***********************************************************************
                    * PARA IMPORTAR LIBRERIA EN NETBEANS:                                 *
                    *       BOT�N DERECHO SOBRE Libraries --> Add JAR/Folder              *
                    *                    SELECCIONAMOS EL FICHERO  .jar                   *
                    * USAR Relative Path --> RUTA RELATIVA PARA PODER MOVER EL PROYECTO.  *
                    * YA PODEMOS IMPORTAR TODOS LOS ELEMENTOS CON EL COMANDO --> import   *
                    ***********************************************************************
                    *  1. �MBITOS DE VISIBILIDAD EN LAS BIBLIOTECAS.                      *
                    ***********************************************************************
                    *  0. ATR�S.                                                          *
                    ***********************************************************************
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque04.Visibilidad.main(args);
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
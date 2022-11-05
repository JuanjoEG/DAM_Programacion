
package ejemplos.tramo08;

import Clases.Alumno;

/**
 * ESPA�A / SEVILLA / 2022
 * APACHE NET BEANS IDE 14
 * TOOLS --> TEMPLATES --> SETTINGS --> BORRAR # DE �LTIMA L�NEA --> USER=Juan Jos� Est�vez Gonz�lez
 * BOT�N DERECHO EN PROYECTO --> PROPERTIES --> SOURCE/BINARY FORMAT --> JDK 18
 * BOT�N DERECHO EN PROYECTO --> PROPERTIES --> PROFILE --> FULL JRE
 * BOT�N DERECHO EN PROYECTO --> PROPERTIES --> ENCODING --> ISO-8859-1
 * TOOLS --> OPTIONS --> FONTS & COLOR --> PROFILE: FLATLAF DARK
 * TOOLS --> OPTIONS --> FONTS & COLOR --> FONT --> MONOSPACED 18
 * TOOLS --> OPTIONS --> APPEARANCE --> LOOK AND FEEL --> FLATLAF DARK
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class Escuela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // INSTANCIACI�N DE OBJETOS
        // USAMOS EL CONSTRUCTOR POR PAR�METROS
        // LE DAMOS VALORES A LOS ATRIBUTOS 
        
        // POR SEPARADO...
        // 1. ESTO ES UNA REFERENCIA
        
        Alumno alumno_01;
        
        // 2. Y LA REFERENCIA APUNTAR� A UN OBJETO NUEVO
        
        alumno_01= new Alumno("Manolo","Gonz�lez Pineda",25636565, 15, 6.1, 3.6, 5.4);
        
        // ...O EN UNA SOLA L�NEA...
        // CREAMOS EL OBJETO Y LA REFERENCIA QUE APUNTA A �L
        
        Alumno alumno_02 = new Alumno("�ngel","Guti�rrez Peinado",28542754, 15, 7.4, 5.2, 8.7);
        Alumno alumno_03 = new Alumno("Elena","Fern�dez Lobato",28391467, 15, 8.6, 6.1, 7.4);
        Alumno alumno_04 = new Alumno("�ngel","Mor�n Porcino",28734951, 15, 3.5, 5.4, 6.3);
        Alumno alumno_05 = new Alumno("Mar�a","Guisado Navarro",26802045, 15, 6.3, 9.4, 8.2);
        Alumno alumno_06 = new Alumno("Mois�s","Lop�z Menudo",29447295, 15, 4.1, 5.9, 6.6);
        
        // ACCEDEMOS A LA VARIABLE DE CLASE
        // DECLARADA EN LA CLASE COMO public static
        // NO DEPENDEN DE NING�N OBJETO
        
        System.out.println("\n"+"Nuestra Escuela tiene ... " + Alumno.numero_de_alumnos + " alumnos."+"\n");
        
        // LLAMADAS A LOS M�TODOS toString
        // LLAMADAS A LOS M�TODOS calcularMedia
        
        System.out.println(alumno_01);
        System.out.println("Su media es de ="+alumno_01.calcularMedia()+"\n");
        System.out.println(alumno_02);
        System.out.println("Su media es de ="+alumno_02.calcularMedia()+"\n");
        System.out.println(alumno_03);
        System.out.println("Su media es de ="+alumno_03.calcularMedia()+"\n");
        
        // AL M�TODO toString SE LE LLAMA POR DEFECTO CON EL NOMBRE DEL OBJETO
        // O USANDO EL LLAMAMIENTO EXPL�CITO
        
        System.out.println(alumno_04.toString());
        System.out.println("Su media es de ="+alumno_04.calcularMedia()+"\n");
        System.out.println(alumno_05.toString());
        System.out.println("Su media es de ="+alumno_05.calcularMedia()+"\n");
        System.out.println(alumno_06.toString());
        System.out.println("Su media es de ="+alumno_06.calcularMedia()+"\n");
        
    }    
}
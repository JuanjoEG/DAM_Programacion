
package ejemplos.tramo05;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class UsandoExpresionesRegulares {
    
    public static void main(String[] args) {
        
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                              
                    
                    
                    
                    
                    **************************************************************
                    *             EJEMPLOS DE EXPRESIONES REGULARES              *
                    **************************************************************
                    *  1. VERIFICAR TELEFONO MOVIL.                              *
                    *  2. VERIFICAR CORREO ELECTR�NICO.                          *
                    *  3. DIVIDIR EN SUBCADENAS.   (M�TODO split)                *
                    **************************************************************
                    *  0. ATR�S.                                                 *
                    **************************************************************
            
                    
                    """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> verificarTelefono();
                case "2" -> verificarCorreo();
                case "3" -> dividirMetodoSplit();
                case "0" -> {}
                default -> System.out.println("La opci�n no es correcta.");                    
            }            
        } while (!"0".equals(menu));
    }

    private static void verificarTelefono() {
        
        Scanner teclaStr = new Scanner(System.in);
        String telefono;
        final String exprRegTelefono = "(\\+34|0034|34)?[ -]*(6|7)[ -]*([0-9][ -]*){8}";
        System.out.print("""
                    Se verifica que el tel�fono ... 
                Empiece por +34, 0034 o por 34. 
                Su siguiente d�gito sea un 6 o un 7. 
                El n�mero de d�gitos sean correctos. 
                
                INTRODUCE EL N�MERO A VERIFICAR: """);
        telefono = teclaStr.nextLine();
        if (Pattern.matches(exprRegTelefono, telefono)){
        
            System.out.println("\n"
                    + "El TLF. " + telefono + " es CORRECTO. \n");
        } else {
        
            System.out.println("\n"
                    + "El TLF. " + telefono + " ��� NO ES CORRECTO !!! \n");
        }
    }

    private static void verificarCorreo() {
        /*
        [\\w-]+          -->Inicio del email
                            El signo + indica que debe aparecer uno o m�s de los caracteres entre corchetes:
                            \\w indica caracteres de la A a la Z tanto may�sculas como min�sculas, d�gitos del 0 al 9 y el car�cter _
                            Car�cter –
                            En lugar de usar \\w podemos escribir el rango de caracteres con lo que esta expresión quedaría así:
                            [A-Za-z0-9-_]+
        
        (\\.[\\w-]+)*    -->A continuación:
                            El * indica que este grupo puede aparecer cero o más veces. 
                            El email puede contener de forma opcional  un punto seguido de uno o más de los caracteres entre corchetes.
        
        @                -->A continuación debe contener el carácter @
        
        [A-Za-z0-9]+     -->Después de la @ el email debe contener uno o más de los caracteres que aparecen entre los corchetes
        
        (\\.[A-Za-z0-9]+)*  -->Seguido (opcional, 0 ó más veces) de un punto y 1 ó más de los caracteres entre corchetes
        
        (\\.[A-Za-z]{2,})   -->Seguido de un punto y al menos 2 de los caracteres que aparecen entre corchetes (final del email)
        */
        Scanner teclaStr = new Scanner(System.in);
        String email;
        System.out.print("SE VERIFICA QUE EN EL email ... \n"
                + "SE UTILICEN CARACTERES DE LA a A LA z,\n"
                + "TANTO MAY�SCULAS COMO MIN�SCULAS,\n"
                + "SE UTILICEN D�GITOS DEL 0 AL 9,\n"
                + "Y LOS CARACTERES --> _ - @\n"
                + "Y TERMINAR CON PUNTO M�S UNA EXPRESI�N\n\n"
                + "INTRODUCE email A VERIFICAR: ");
        email = teclaStr.nextLine();
        Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");   
        Matcher mat = pat.matcher(email);
        if(mat.find()){
           System.out.println("Correo V�lido.\n");
        }else{
           System.out.println("Correo No V�lido.\n ��� NO ES CORRECTO !!! \n");
     }
    }

    private static void dividirMetodoSplit() {
        
        System.out.println("\nDIVIDIR EN SUBCADENAS\n");
        Scanner teclaStr = new Scanner(System.in);
        String cadena;
        System.out.print("INTRODUCE UNA CADENA\n"
                + "DEL TIPO...\n"
                + "\"esto es un ejemplo de como funciona split: banco-rojo:amarillo.verde_azul\"\n"
                + "ESCRIBE TU CADENA AQU�: ");
        cadena = teclaStr.nextLine();
        String[] cadenas1 = cadena.split("[-:._]");
        String[] cadenas2 = cadena.split("(e[s|m])|(pl)");
        
        System.out.println("EXPRESI�N REGULAR --> [-:._]");
        for (int i=0; i<cadenas1.length; i++){
        
            System.out.println(cadenas1[i]);
        }
        System.out.println("EXPRESI�N REGULAR --> (e[s|m])|(pl)");
        for (int i=0; i<cadenas2.length; i++){
        
            System.out.println(cadenas2[i]);
        }
    }
}
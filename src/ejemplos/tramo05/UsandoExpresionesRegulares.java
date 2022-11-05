
package ejemplos.tramo05;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Juan José Estévez González
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
                    *  2. VERIFICAR CORREO ELECTRÓNICO.                          *
                    *  3. DIVIDIR EN SUBCADENAS.   (MÉTODO split)                *
                    **************************************************************
                    *  0. ATRÁS.                                                 *
                    **************************************************************
            
                    
                    """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> verificarTelefono();
                case "2" -> verificarCorreo();
                case "3" -> dividirMetodoSplit();
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");                    
            }            
        } while (!"0".equals(menu));
    }

    private static void verificarTelefono() {
        
        Scanner teclaStr = new Scanner(System.in);
        String telefono;
        final String exprRegTelefono = "(\\+34|0034|34)?[ -]*(6|7)[ -]*([0-9][ -]*){8}";
        System.out.print("""
                    Se verifica que el teléfono ... 
                Empiece por +34, 0034 o por 34. 
                Su siguiente dí­gito sea un 6 o un 7. 
                El número de dí­gitos sean correctos. 
                
                INTRODUCE EL NÚMERO A VERIFICAR: """);
        telefono = teclaStr.nextLine();
        if (Pattern.matches(exprRegTelefono, telefono)){
        
            System.out.println("\n"
                    + "El TLF. " + telefono + " es CORRECTO. \n");
        } else {
        
            System.out.println("\n"
                    + "El TLF. " + telefono + " ¡¡¡ NO ES CORRECTO !!! \n");
        }
    }

    private static void verificarCorreo() {
        /*
        [\\w-]+          -->Inicio del email
                            El signo + indica que debe aparecer uno o más de los caracteres entre corchetes:
                            \\w indica caracteres de la A a la Z tanto mayúsculas como minúsculas, dí­gitos del 0 al 9 y el carácter _
                            Carácter â€“
                            En lugar de usar \\w podemos escribir el rango de caracteres con lo que esta expresiÃ³n quedarÃ­a asÃ­:
                            [A-Za-z0-9-_]+
        
        (\\.[\\w-]+)*    -->A continuaciÃ³n:
                            El * indica que este grupo puede aparecer cero o mÃ¡s veces. 
                            El email puede contener de forma opcional  un punto seguido de uno o mÃ¡s de los caracteres entre corchetes.
        
        @                -->A continuaciÃ³n debe contener el carÃ¡cter @
        
        [A-Za-z0-9]+     -->DespuÃ©s de la @ el email debe contener uno o mÃ¡s de los caracteres que aparecen entre los corchetes
        
        (\\.[A-Za-z0-9]+)*  -->Seguido (opcional, 0 Ã³ mÃ¡s veces) de un punto y 1 Ã³ mÃ¡s de los caracteres entre corchetes
        
        (\\.[A-Za-z]{2,})   -->Seguido de un punto y al menos 2 de los caracteres que aparecen entre corchetes (final del email)
        */
        Scanner teclaStr = new Scanner(System.in);
        String email;
        System.out.print("SE VERIFICA QUE EN EL email ... \n"
                + "SE UTILICEN CARACTERES DE LA a A LA z,\n"
                + "TANTO MAYÚSCULAS COMO MINÚSCULAS,\n"
                + "SE UTILICEN DÍGITOS DEL 0 AL 9,\n"
                + "Y LOS CARACTERES --> _ - @\n"
                + "Y TERMINAR CON PUNTO MÁS UNA EXPRESIÓN\n\n"
                + "INTRODUCE email A VERIFICAR: ");
        email = teclaStr.nextLine();
        Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");   
        Matcher mat = pat.matcher(email);
        if(mat.find()){
           System.out.println("Correo Válido.\n");
        }else{
           System.out.println("Correo No Válido.\n ¡¡¡ NO ES CORRECTO !!! \n");
     }
    }

    private static void dividirMetodoSplit() {
        
        System.out.println("\nDIVIDIR EN SUBCADENAS\n");
        Scanner teclaStr = new Scanner(System.in);
        String cadena;
        System.out.print("INTRODUCE UNA CADENA\n"
                + "DEL TIPO...\n"
                + "\"esto es un ejemplo de como funciona split: banco-rojo:amarillo.verde_azul\"\n"
                + "ESCRIBE TU CADENA AQUÍ: ");
        cadena = teclaStr.nextLine();
        String[] cadenas1 = cadena.split("[-:._]");
        String[] cadenas2 = cadena.split("(e[s|m])|(pl)");
        
        System.out.println("EXPRESIÓN REGULAR --> [-:._]");
        for (int i=0; i<cadenas1.length; i++){
        
            System.out.println(cadenas1[i]);
        }
        System.out.println("EXPRESIÓN REGULAR --> (e[s|m])|(pl)");
        for (int i=0; i<cadenas2.length; i++){
        
            System.out.println(cadenas2[i]);
        }
    }
}
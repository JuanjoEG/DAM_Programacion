
package ejemplos.tramo05;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class Zodiaco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaracion de Variables
        int dia;
        int mes;
        
        //Entrada por Teclado
        Scanner var_tecla = new Scanner(System.in);
        
        System.out.print ("Por favor..." + "\n" + "Ponga su Dí­a de Nacimiento :");
        dia = var_tecla.nextInt();
        
        System.out.print ("Gracias, y ahora..." + "\n" + "Por favor..." + "\n" + "Ponga su Mes de Nacimiento :");
        mes = var_tecla.nextInt();
        
        if ((dia>=21&&mes==3)||(dia<=20&&mes==4)){
        System.out.println("Ustéd pertenece al signo de ARIES");
            
            }else if (((dia>=21)&&(dia<=30)&&(mes==4))||((dia>=1)&&(dia<=21)&&(mes==5))){
                 System.out.println("Ustéd pertenece al signo de TAURO"); 
                 
                }else if (((dia>=22)&&(dia<=31)&&(mes==5))||((dia>=1)&&(dia<=21)&&(mes==6))){
                System.out.println("Ustéd pertenece al signo de GÉMINIS");
                
                    }else if (((dia>=22)&&(dia<=30)&&(mes==6))||((dia>=1)&&(dia<=23)&&(mes==7))){
                    System.out.println("Ustéd pertenece al signo de CANCER");
                    
                        }else if (((dia>=24)&&(dia<=31)&&(mes==7))||((dia>=1)&&(dia<=23)&&(mes==8))){
                        System.out.println("Ustéd pertenece al signo de LEO");
                        
                            }else if (((dia>=24)&&(dia<=31)&&(mes==8))||((dia>=1)&&(dia<=23)&&(mes==9))){
                            System.out.println("Ustéd pertenece al signo de VIRGO");
                            
                                }else if (((dia>=24)&&(dia<=30)&&(mes==9))||((dia>=1)&&(dia<=23)&&(mes==10))){
                                System.out.println("Ustéd pertenece al signo de LIBRA");
                                
                                    }else if (((dia>=24)&&(dia<=31)&&(mes==10))||((dia>=1)&&(dia<=22)&&(mes==11))){
                                    System.out.println("Ustéd pertenece al signo de ESCORPIO");
                                    
                                        }else if (((dia>=23)&&(dia<=30)&&(mes==11))||((dia>=1)&&(dia<=21)&&(mes==12))){
                                        System.out.println("Ustéd pertenece al signo de SAGITARIO");
                                        
                                            }else if (((dia>=22)&&(dia<=31)&&(mes==12))||((dia>=1)&&(dia<=20)&&(mes==1))){
                                            System.out.println("Ustéd pertenece al signo de CAPRICORNIO");
                                            
                                                }else if (((dia>=21)&&(dia<=31)&&(mes==1))||((dia>=1)&&(dia<=19)&&(mes==2))){
                                                System.out.println("Ustéd pertenece al signo de ACUARIO");
                                                
                                                    }else if (((dia>=20)&&(dia<=29)&&(mes==2))||((dia>=1)&&(dia<=20)&&(mes==3))){
                                                    System.out.println("Ustéd pertenece al signo de PICIS");
                                                    
                                                    }else System.err.println("Lo lamento..." + "\n" + "Su fecha no pertenece al ningún signo" + "\n" + "Es posible que su fecha no esté correcta ");
    }    
}
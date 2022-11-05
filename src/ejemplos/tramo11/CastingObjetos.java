
package ejemplos.tramo11;

import Clases.Comercial;
import Clases.Empleado;
import Clases.Repartidor;

/**
 * ESPAÑA / SEVILLA / 2022
 * APACHE NET BEANS IDE 14
 * TOOLS --> TEMPLATES --> SETTINGS --> BORRAR # DE ÚLTIMA LÍNEA --> USER=Juan José Estévez González
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> SOURCE/BINARY FORMAT --> JDK 18
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> PROFILE --> FULL JRE
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> ENCODING --> ISO-8859-1
 * TOOLS --> OPTIONS --> FONTS & COLOR --> PROFILE: FLATLAF DARK
 * TOOLS --> OPTIONS --> FONTS & COLOR --> FONT --> MONOSPACED 18
 * TOOLS --> OPTIONS --> APPEARANCE --> LOOK AND FEEL --> FLATLAF DARK
 * @author Juan José Estévez González
 */
public class CastingObjetos {
    
    public static void main(String[] args) {
        
        System.out.println("""
                           Hola a todos, hoy os voy a explicar como podemos hacer casting de objetos.
                           
                           Ya vimos el tema del casting entre tipos primitivos, en objetos tambien podemos hacer castings.
                           Igual que en el de tipos, los objetos deben ser compatibles entre sí, por ejemplo una clase hija y una clase padre.
                           
                           La mayor utilidad de los castings de objetos es cuando necesitamos que sea de un objeto en concreto,
                           ya que si es del tipo de la clase padre, no podrá llamar a los métodos propios de la clase hija.
                           
                           Fijaros en las clases Repartidor y Comercial, les he puesto un método que es único en cada uno. Bien,
                           ahora mira en la clase ejecutable y fijate que meto 3 objetos en un array Empleado,
                           cada uno de ellos ahora estan enmascarados como si fuera un Empleado por lo que no podran llamar a ese método único.
                           Dentro del bucle, uso instanceof para asegurme que el objeto sea del tipo que yo quiero castear.
                           Si lo es puedo hacer el casting sin problemas.
                           
                           Como resumen, los casting son útiles cuando queremos llamar a métodos propios de un objeto que esta en otra clase compatible.
                           Por último, te recomiendo utilizar polimorfismo para evitar en todo lo posible el casting, siempre que se pueda.
                           """);
        
        Comercial e1 = new Comercial("fer", "ure", 60, 1000, 150);
        Repartidor e2 = new Repartidor("fer", "ure", 50, 1000, "zona 3");
        Empleado e3 = new Empleado("fer", "ure", 42, 1000);
 
        Empleado[] empleados = {e1, e2, e3};
 
        Comercial c1;
        Repartidor r1;
         
        for (Empleado e : empleados) {
            
            //Nos aseguramos de que sea del tipo Comercial
            
            if(e instanceof Comercial){
                c1 = (Comercial)e;           //Casting a comercial
                c1.metodoComercial();        //Ahora puedo llamar al metodo
            }
            
            //Nos aseguramos de que sea del tipo Repartidor
            
            if(e instanceof Repartidor){
                r1 = (Repartidor)e;          //Casting a repartidor
                r1.metodoRepartidor();       //Ahora puedo llamar al metodo
            }
            
            //Nos aseguramos de que sea del tipo Comercial
            
            if(e instanceof Comercial comercial){
                c1 = comercial;           
                c1.metodoComercial();        //Ahora puedo llamar al metodo
            }
            
            //Nos aseguramos de que sea del tipo Repartidor
            
            if(e instanceof Repartidor repartidor){
                r1 = repartidor;          
                r1.metodoRepartidor();       //Ahora puedo llamar al metodo
            }
        }
    }
}
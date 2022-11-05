
package principal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

/**
 * ESPAÑA / SEVILLA / 2022
 * 
 * APACHE NET BEANS IDE 14
 * TOOLS --> TEMPLATES --> SETTINGS --> BORRAR # DE ÚLTIMA LÍNEA --> USER=Juan José Estévez González
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> SOURCE/BINARY FORMAT --> JDK 17
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> PROFILE --> FULL JRE
 * BOTÓN DERECHO EN PROYECTO --> PROPERTIES --> ENCODING --> ISO-8859-1
 * TOOLS --> OPTIONS --> FONTS & COLOR --> PROFILE: FLATLAF DARK
 * TOOLS --> OPTIONS --> FONTS & COLOR --> FONT --> MONOSPACED 16
 * TOOLS --> OPTIONS --> MISCELLANEOUS --> OUTPUT --> FONT --> MONOSPACED 16
 * TOOLS --> OPTIONS --> MISCELLANEOUS --> TERMINAL -->FONT --> MONOSPACED 16
 * TOOLS --> OPTIONS --> APPEARANCE --> LOOK AND FEEL --> FLATLAF DARK
 * 
 * INTELLIJ IDEA 2022.2 (COMMUNITY EDITION)
 * FILE --> SETTINGS --> APPEARANCE & BEHAVIOR --> APPEARANCE --> THEME --> DARCULA
 * FILE --> SETTINGS --> APPEARANCE & BEHAVIOR --> APPEARANCE --> USE CUSTOM FRONT --> SEGOE UI - SIZE 12
 * FILE --> SETTINGS --> EDITOR --> FONT --> MONOSPACED 16.0 - LINE HEIGHT 1.0
 * FILE --> SETTINGS --> EDITOR --> FILE ENCODINGS --> GLOBAL ENCODING UTF-8
 * FILE --> SETTINGS --> EDITOR --> FILE ENCODINGS --> PROJECT ENCODING ISO-8859-1
 * 
 * @author Juan José Estévez González
 */
public class ProgramacionEnJava {

    /**
     * @param args the command line arguments
     * @throws javax.xml.transform.TransformerException
     * @throws javax.xml.transform.TransformerConfigurationException
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws TransformerException, TransformerConfigurationException, ParserConfigurationException, IOException, FileNotFoundException, ClassNotFoundException, Exception {
        
        String menu;
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""
                               
                               
                               
                               
                               
                               **********************************************************************************
                               *            P  R  O  G  R  A  M  A  C  I  Ó  N    E  N    J  A  V  A            *
                               **********************************************************************************
                               *  1- PRIMEROS PASOS.                                                            *
                               *  2- TIPOS DE DATOS.                                                            *
                               *             DATOS PRIMITIVOS:                                                  *
                               *      2.1- TIPOS DE DATOS ENTEROS.                                              *
                               *      2.2- TIPOS DE DATOS REALES.                                               *
                               *      2.3- TIPOS DE DATOS ALFANUMÉRICOS.                                        *
                               *            2.3.1 SECUENCIAS DE ESCAPE.                                         *
                               *            2.3.2 OPERACIONES CON CADENAS DE CARACTERES. MÉTODOS DE String.     *
                               *      2.4- TIPOS DE DATOS BOOLEANOS.                                            *
                               *             DATOS ENVOLTORIO:                                                  *
                               *      2.5- TIPOS DE DATOS GENÉRICOS. PARAMETRIZADOS.                            *
                               *  3- OPERADORES.  /  CONDICIONALES.                                             *
                               *      3.1- OPERADORES ARITMÉTICOS.                                              *
                               *      3.2- OPERADORES LÓGICOS.  /  CONDICIONALES MÚLTIPLES                      *
                               *      3.3- OPERADORES RELACIONALES.    /  CONDICIONALES                         *
                               *      3.4- OPERADORES DE ASIGNACIÓN.                                            *
                               *      3.5- CONDICIONES.                                                         *
                               *      3.6- TABLA DE LA VERDAD.                                                  *
                               *  4- SALIDA POR PANTALLA.                                                       *
                               *      4.1- USOS DE printf. Dar formato a los datos.                             *
                               *      4.2- SALIDA POR PANTALLA DE UN OBJETO - GETTERS.                          *
                               *      4.3- SALIDA POR PANTALLA DE UN OBJETO - toString.                         *
                               *  5- LECTURA DE DATOS POR TECLADO.                                              *
                               *  6- EXPRESIONES REGULARES.                                                     *
                               *  7- COMENTARIOS Y DOCUMENTACIÓN.                                               *
                               *      7.1- DOCUMENTACIÓN DE UNA CLASE.                                          *
                               *  8- CASTINGS.                                                                  *
                               *  9- PALABRAS RESERVADAS EN JAVA.                                               *
                               * 10- CONDICIONAL  if  /  if-else  /  if-else-if.                                *
                               * 11- CONDICIONAL switch.                                                        *
                               *      11.1- CONDICIONAL RULE switch.                                            *
                               * 12- BUCLE while  /  BUCLE do-while.                                            *
                               * 13- BUCLE for  /  BUCLE foreach.                                               *
                               *      13.1- CONTINUE  /  BREAK.                                                 *
                               * 14- EXCEPCIONES.                                                               *
                               *      14.1- EXCEPCIONES PERSONALIZADAS.                                         *
                               *      14.2- DOCUMENTACIÓN DE EXCEPCIONES.                                       *
                               * 15- ARRAYS.                                                                    *
                               *      15.1- ARRAYS DE DOS DIMENSIONES  -->  MATRICES.                           *
                               *      15.2- ARRAY LIST.                                                         *
                               *      15.3- ITERADORES.                                                         *
                               * 16- COLECCIONES.                                                               *
                               *      16.1- LISTAS.                                                             *
                               *             16.11- ArrayList.                                                  *
                               *             16.12- LinkedList.                                                 *
                               *             16.13- Vector.                                                     *
                               *             16.14- MÉTODOS DE LA INTERFAZ List.                                *
                               *      16.2- CONJUNTOS.                                                          *
                               *             16.21- HashSet.                                                    *
                               *             16.22- TreeSet.                                                    *
                               *             16.23- LinkedHashSet.                                              *
                               *      16.3- MAPAS.                                                              *
                               *             16.31- HashMap.                                                    *
                               *             16.32- TreeMap.                                                    *
                               *             16.33- LinkedTreeMap.                                              *
                               *             16.34- MÉTODOS DE LA INTERFAZ Map.                                 *
                               *      16.4- ITERADORES.                                                         *
                               * 17- DOCUMENTOS XML / DTD / XSD. BIBLIOTECA DOM.                                *
                               * 18- OPERACIONES CON FICHEROS.                                                  *
                               *      18.1- CREACIÓN Y ELIMINACIÓN DE DIRECTORIOS.                              *
                               * 19- ORIENTACIÓN A OBJETOS.                                                     *
                               *      19.1- PRINCIPIOS BÁSICOS.                                                 *
                               *             19.11- ABSTRACCIÓN.                                                *
                               *             19.12- ENCAPSULAMIENTO.                                            *
                               *             19.13- MODULARIZACIÓN.                                             *
                               *             19.14- HERENCIA.                                                   *
                               *             19.15- POLIMORFISMO.                                               *
                               *             19.16- OCULTACIÓN DE LA INFORMACIÓN.                               *
                               *      19.2- VISIBILIDAD DE LOS OBJETOS DE UNA CLASE.                            *
                               *          19.21- ESTÁNDAR.    (PREDETERMINADO)                                  *
                               *          19.22- PÚBLICO.      -->   public                                     *
                               *          19.23- PROTEGIDO.    -->   protected                                  *
                               *          19.24- PRIVADO.      -->   private                                    *
                               *      19.3- CLASES.                                                             *
                               *          19.31- ATRIBUTOS.                                                     *
                               *          19.32- MÉTODOS.                                                       *
                               *              19.320- CONSTRUCTORES.                                            *
                               *                  19.3201- CONSTRUCTOR POR DEFECTO.                             *
                               *                  19.3202- CONSTRUCTOR POR PARÁMETROS.                          *
                               *                  19.3203- CONSTRUCTOR POR COPIA.                               *
                               *              19.321- OBSERVADORES.   -->  GETTERS.                             *
                               *              19.322- MODIFICADORES.  -->  SETTERS.                             *
                               *              19.323- MÉTODO toString.                                          *
                               *              19.324- MÉTODOS PERSONALIZADOS.                                   *
                               *                  19.3241- MÉTODOS PERSONALIZADOS.  -->  FUNCIONES.             *
                               *                  19.3242- MÉTODOS PERSONALIZADOS.  -->  PROCEDIMIENTOS.        *
                               *                  19.3243- LLAMAR A UN MÉTODOS.                                 *
                               *              19.325- MÉTODOS ESTÁTICOS.                                        *
                               *              19.326- SOBRECARGA DE MÉTODOS.                                    *
                               *              19.327- SOBREESCRITURA DE MÉTODOS.                                *
                               *              19.328- BLOQUES ESTÁTICOS.                                        *
                               *              19.329- PASO POR VALOR Y PASO POR REFERENCIA.                     *
                               *          19.33- CREACIÓN DE OBJETOS.                                           *
                               *      19.4- LA ESTÁTICA.                                                        *
                               *          19.41- VARIABLES ESTÁTICAS.                                           *
                               *          19.42- MÉTODOS ESTÁTICOS.                                             *
                               *          19.43- BLOQUES ESTÁTICOS.                                             *
                               *      19.5- DOCUMENTACIÓN DE UNA CLASE.                                         *
                               *      19.6- BIBLIOTECA. IMPORTACIÓN DE CLASES.                                  *
                               * 20- RELACIÓN ENTRE CLASES.                                                     *
                               *     20.1- RELACIÓN DE COMPOSICIÓN.    MÉTODO PUENTE.                           *
                               *     20.2- RELACIÓN DE HERENCIA.       MÉTODO PUENTE.                           *
                               *     20.3- CLASES Y MÉTODOS FINALES.                                            *
                               *     20.4- CLASES Y MÉTODOS ABSTRACTOS.                                         *
                               *     20.5- CLASES Y EL POLIMORFISMO.                                            *
                               *     20.6- INTERFACES.                                                          *
                               *     20.7- TIPOS GENÉRICOS./CLASES GENÉRICAS./MÉTODOS GENÉRICOS.                *
                               *     20.8- SOBREESCRITURA DE MÉTODOS.                                           *
                               *     20.9- EL MÉTODO super / this.                                              *
                               * 21- DEPURACIÓN.                                                                *
                               * 22- INTERFACES GRÁFICAS.                                                       *
                               *     22.1- CREACIÓN DE UN NUEVO PROYECTO CON INTERFAZ GRÁFICA.                  *
                               *     22.2- ELEMENTOS PRINCIPALES.                                               *
                               *     22.3- ELEMENTOS GRÁFICOS.                                                  *
                               *         22.31- LAYOUTS - MAQUETADORES.                                         *
                               *     22.4- VENTANAS DE DIÁLOGO PREDEFINIDAS.                                    *
                               * 23- BASES DE DATOS.                                                            *
                               **********************************************************************************
                               * 00. EJEMPLOS.                                                                  *
                               **********************************************************************************
                               *  0. SALIR.                                                                     *
                               **********************************************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "1" -> bloque01.PrimerosPasos.main(args);
                case "2" -> bloque01.TiposDeDatos.main(args);
                    case "2.1" -> bloque01.DatosEnteros.main(args);
                    case "2.2" -> bloque01.DatosReales.main(args);
                    case "2.3" -> bloque01.DatosAlfanumericos.main(args);
                        case "2.31" -> bloque01.SecuenciasDeEscape.main(args);
                        case "2.32" -> bloque01.OperacionesConCadenas.main(args);
                    case "2.4" -> bloque01.DatosBooleanos.main(args);
                    case "2.5" -> bloque05.ClasesGenericas.main(args);
                case "3" -> bloque01.Operadores.main(args);
                    case "3.1" -> bloque01.OperadoresAritmeticos.main(args);
                    case "3.2" -> bloque01.OperadoresLogicos.main(args);
                    case "3.3" -> bloque01.OperadoresRelacionales.main(args);
                    case "3.4" -> bloque01.OperadoresDeAsignacion.main(args);
                    case "3.5" -> bloque01.Condiciones.main(args);
                    case "3.6" -> bloque01.TablaDeLaVerdad.main(args);
                case "4" -> bloque01.SalidaPorPantalla.main(args);
                    case "4.1" -> bloque01.UsosDePrintF.main(args);
                    case "4.2" -> bloque04.MetodosGetters.main(args);
                    case "4.3" -> bloque04.MetodotoString.main(args);
                case "5" -> bloque01.LecturaPorTeclado.main(args);
                case "6" -> bloque01.ExpresionesRegulares.main(args);
                case "7" -> bloque01.Comentarios.main(args);
                    case "7.1" -> bloque04.DocumentacionClase.main(args);
                case "8" -> bloque01.Castings.main(args);
                case "9" -> bloque02.PalabrasReservadas.main(args);
                case "10" -> bloque02.CondicionalIfElseIf.main(args);
                case "11" -> bloque02.CondicionalSwitch.main(args);
                    case "11.1" -> bloque02.CondicionalRuleSwitch.main(args);
                case "12" -> bloque02.BucleWhile.main(args);
                case "13" -> bloque02.BucleFor.main(args);
                    case "13.1" -> bloque02.ContinueBreak.main(args);
                case "14" -> bloque03.Excepciones.main(args);
                    case "14.1" -> bloque03.ExcepcionesPersonalizadas.main(args);
                    case "14.2" -> bloque04.DocumentacionClase.main(args);
                case "15" -> bloque03.Arrays.main(args);                                      
                    case "15.1" -> bloque03.ArraysDosDimensiones.main(args);
                    case "15.2" -> bloque03.ArrayList.main(args);
                    case "15.3" -> bloque03.Iteradores.main(args);
                case "16" -> bloque03.Colecciones.main(args);
                    case "16.1" -> bloque03.Listas.main(args);
                        case "16.11" -> bloque03.ArrayList.main(args);
                        case "16.12" -> {System.out.println("EN PROCESO DE CONSTRUCCIÓN");}
                        case "16.13" -> {System.out.println("EN PROCESO DE CONSTRUCCIÓN");}
                        case "16.14" -> bloque03.MetodosList.main(args);
                    case "16.2" -> bloque03.Conjuntos.main(args);
                        case "16.21" -> {System.out.println("EN PROCESO DE CONSTRUCCIÓN");}
                        case "16.22" -> {System.out.println("EN PROCESO DE CONSTRUCCIÓN");}
                        case "16.23" -> {System.out.println("EN PROCESO DE CONSTRUCCIÓN");}
                    case "16.3" -> bloque03.Mapas.main(args);
                        case "16.31" -> bloque03.HashMap.main(args);
                        case "16.32" -> {System.out.println("EN PROCESO DE CONSTRUCCIÓN");}
                        case "16.33" -> {System.out.println("EN PROCESO DE CONSTRUCCIÓN");}
                        case "16.34" -> bloque03.MetodosMap.main(args);
                    case "16.4" -> bloque03.Iteradores.main(args);
                case "17" -> bloque03.DocumentosXML.main(args);
                case "18" -> bloque03.OperacionesConFicheros.main(args);
                    case "18.1" -> bloque03.CreacionEliminacionDirectorios.main(args);
                case "19" -> bloque04.OrientacionObjetos.main(args);
                    case "19.1" -> bloque04.PrincipiosBasicosOrientacionObjetos.main(args);
                        case "19.11" -> bloque04.Abstraccion.main(args);
                        case "19.12" -> bloque04.Encapsulamiento.main(args);
                        case "19.13" -> bloque04.Modularizacion.main(args);
                        case "19.14" -> bloque04.Herencia.main(args);
                        case "19.15" -> bloque04.Polimorfismo.main(args);
                        case "19.16" -> bloque04.Ocultacion.main(args);
                    case "19.2" -> bloque04.Visibilidad.main(args);
                        case "19.21" -> bloque04.VisibilidadEstandar.main(args);
                        case "19.22" -> bloque04.VisibilidadPublico.main(args);
                        case "19.23" -> bloque04.VisibilidadProtegido.main(args);
                        case "19.24" -> bloque04.VisibilidadPrivado.main(args);
                    case "19.3" -> bloque04.Clases.main(args);
                        case "19.31" -> bloque04.Atributos.main(args);
                        case "19.32" -> bloque04.Metodos.main(args);
                            case "19.320" -> bloque04.Constructores.main(args);
                                case "19.3201" -> bloque04.ConstructorPorDefecto.main(args);
                                case "19.3202" -> bloque04.ConstructorPorParametros.main(args);
                                case "19.3203" -> bloque04.ConstructorPorCopia.main(args);
                            case "19.321" -> bloque04.MetodosGetters.main(args);
                            case "19.322" -> bloque04.MetodosSetters.main(args);
                            case "19.323" -> bloque04.MetodotoString.main(args);
                            case "19.324" -> bloque04.MetodosPersonalizados.main(args);
                                case "19.3241" -> bloque04.MetodosFunciones.main(args);
                                case "19.3242" -> bloque04.MetodosProcedimientos.main(args);
                                case "19.3243" -> bloque04.MetodosLlamar.main(args);
                            case "19.325" -> bloque04.MetodosEstaticos.main(args);
                            case "19.326" -> bloque04.MetodosSobrecarga.main(args);
                            case "19.327" -> bloque05.MetodosSobreescritura.main(args);
                            case "19.328" -> bloque04.BloqueEstatico.main(args);
                            case "19.329" -> bloque04.MetodosPasoValorReferencia.main(args);
                        case "19.33" -> bloque04.CreacionObjetos.main(args);
                    case "19.4" -> bloque04.Estatica.main(args);
                        case "19.41" -> bloque04.AtributosEstaticos.main(args);
                        case "19.42" -> bloque04.MetodosEstaticos.main(args);
                        case "19.43" -> bloque04.BloqueEstatico.main(args);
                    case "19.5" -> bloque04.DocumentacionClase.main(args);
                    case "19.6" -> bloque04.Biblioteca.main(args);
                case "20" -> bloque05.RelacionClases.main(args);
                    case "20.1" -> bloque05.RelacionClasesComposicion.main(args);
                    case "20.2" -> bloque05.RelacionClasesHerencia.main(args);
                    case "20.3" -> bloque05.RelacionClasesFinales.main(args);
                    case "20.4" -> bloque05.RelacionClasesAbstractas.main(args);
                    case "20.5" -> bloque05.RelacionClasesPolimorfismo.main(args);
                    case "20.6" -> bloque05.Interfaces.main(args);
                    case "20.7" -> bloque05.ClasesGenericas.main(args);
                    case "20.8" -> bloque05.MetodosSobreescritura.main(args);
                    case "20.9" -> bloque05.MetodoSuper.main(args);
                case "21" -> bloque06.Depuracion.main(args);
                case "22" -> bloque06.InterfacesGraficas.main(args);
                    case "22.1" -> bloque06.NuevoProyecto.main(args);
                    case "22.2" -> bloque06.ElementosPrincipales.main(args);
                    case "22.3" -> bloque06.ElementosGraficos.main(args);
                        case "22.31" ->bloque06.Layouts.main(args);
                    case "22.4" -> System.out.println("EN PROCESO DE CONSTRUCCIÓN");
                case "23" -> {System.out.println("EN PROCESO DE CONSTRUCCIÓN");}
                case "00" -> ejemplos.MenuEjemplos.main(args);
                case "0" -> {}
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
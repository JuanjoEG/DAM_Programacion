
package bloque06;

import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class ElementosGraficos {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                               *********************************************************************************
                               *             INTERFACES GRÁFICAS / ELEMENTOS GRÁFICOS                          *
                               *********************************************************************************
                               *             BIBLIOTECA SWING INTEGRADA EN LA JDK DE JAVA.                     *
                               *********************************************************************************
                               *  JFrame        --> VENTANA DE INTERFAZ GRÁFICA. PANÉL PRINCIPAL.              *
                               *********************************************************************************
                               *  JPanel        --> PANELES PARA COLOCAR ELEMENTOS EN SU INERIOR.              *
                               *********************************************************************************
                               *  JLabel        --> MUESTRA ETIQUETA DE TEXTO                                  *
                               *  JTextField    --> CAJA DE TEXTO --> ESCRIBIR TEXTO / UNA LÍNEA.              *
                               *  JTextArea     --> CAJA MULTILÍNEA --> ESCRIBIR TEXTO / MUCHAS LÍNEAS.        *
                               *  JButton       --> BOTÓN                                                      *
                               *  JCheckBox     --> CUADROS DE ELECCIÓN MÚLTIPLE.                              *
                               *  JRadioButton  --> CIRCULOS DE ÚNICA ELECCIÓN.                                *
                               *  ButtonGroup   --> GRUPO DE JRadioButton PARA ÚNICA ELECCIÓN.                 *
                               *          .getText(); --> OBTIENE TEXTO.                                       *
                               *          .setText(String TEXTO); --> MODIFICA TEXTO.                          *
                               *          .isSelected(); --> DEVUELVE true/false SEGÚN SELECCIÓN.              *
                               *          .setSelected(boolean VALOR); --> CAMBIA ESTADO DE SELECCIÓN.         *
                               *********************************************************************************
                               *  JComboBox     --> LISTAS DE VALORES SELECCIONABLES.                          *
                               *          .addItem(String TEXTO); --> AGREGA ELEMENTO A LISTA.                 *
                               *          .getSelectedItem().toString(); --> VALOR SELECCIONADO DE LA LISTA.   *
                               *********************************************************************************
                               *  JTable --> TABLAS CON FILAS Y COLUMNAS.                                      *
                               *  MODELO TABLA --> DefaultTableModel modelo = (DefaultModel)jtable.getModel(); *
                               *          .addRow(Array DE String); --> INSERTAR FILAS.                        *
                               *          .addColum(String NOMBRE); --> INSERTAR UNA COLUMNA.                  *
                               *          .removeRow(int ÍNDICE);   --> ELIMINAR UNA FILA.                     *
                               *          .getSelectedColumn();     --> DEVUELVE int                           *
                               *                                    --> ÍNDICE COLUMNA SELECCIONADA.           *
                               *          .getSelectedColumns();    --> DEVUELVE Array DE int                  *
                               *                                    --> ÍNDICES COLUMNAS SELECCIONADAS.        *
                               *********************************************************************************
                               *  1. LAYOUTS - MAQUETADORES.                                                   *
                               *********************************************************************************
                               *  0. ATRÁS.                                                                    *
                               *********************************************************************************
                               
                               """);
            System.out.print("Seleccione una opción: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                case "1" -> bloque06.Layouts.main(args);
                default -> System.out.println("La opción no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
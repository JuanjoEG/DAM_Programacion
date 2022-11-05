
package bloque06;

import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class ElementosGraficos {
    
    public static void main(String[] args) {
        
        String menu;        
        do {
            Scanner teclaStr = new Scanner(System.in);        
            System.out.println("""
                               
                               
                               
                               
                               
                               *********************************************************************************
                               *             INTERFACES GR�FICAS / ELEMENTOS GR�FICOS                          *
                               *********************************************************************************
                               *             BIBLIOTECA SWING INTEGRADA EN LA JDK DE JAVA.                     *
                               *********************************************************************************
                               *  JFrame        --> VENTANA DE INTERFAZ GR�FICA. PAN�L PRINCIPAL.              *
                               *********************************************************************************
                               *  JPanel        --> PANELES PARA COLOCAR ELEMENTOS EN SU INERIOR.              *
                               *********************************************************************************
                               *  JLabel        --> MUESTRA ETIQUETA DE TEXTO                                  *
                               *  JTextField    --> CAJA DE TEXTO --> ESCRIBIR TEXTO / UNA L�NEA.              *
                               *  JTextArea     --> CAJA MULTIL�NEA --> ESCRIBIR TEXTO / MUCHAS L�NEAS.        *
                               *  JButton       --> BOT�N                                                      *
                               *  JCheckBox     --> CUADROS DE ELECCI�N M�LTIPLE.                              *
                               *  JRadioButton  --> CIRCULOS DE �NICA ELECCI�N.                                *
                               *  ButtonGroup   --> GRUPO DE JRadioButton PARA �NICA ELECCI�N.                 *
                               *          .getText(); --> OBTIENE TEXTO.                                       *
                               *          .setText(String TEXTO); --> MODIFICA TEXTO.                          *
                               *          .isSelected(); --> DEVUELVE true/false SEG�N SELECCI�N.              *
                               *          .setSelected(boolean VALOR); --> CAMBIA ESTADO DE SELECCI�N.         *
                               *********************************************************************************
                               *  JComboBox     --> LISTAS DE VALORES SELECCIONABLES.                          *
                               *          .addItem(String TEXTO); --> AGREGA ELEMENTO A LISTA.                 *
                               *          .getSelectedItem().toString(); --> VALOR SELECCIONADO DE LA LISTA.   *
                               *********************************************************************************
                               *  JTable --> TABLAS CON FILAS Y COLUMNAS.                                      *
                               *  MODELO TABLA --> DefaultTableModel modelo = (DefaultModel)jtable.getModel(); *
                               *          .addRow(Array DE String); --> INSERTAR FILAS.                        *
                               *          .addColum(String NOMBRE); --> INSERTAR UNA COLUMNA.                  *
                               *          .removeRow(int �NDICE);   --> ELIMINAR UNA FILA.                     *
                               *          .getSelectedColumn();     --> DEVUELVE int                           *
                               *                                    --> �NDICE COLUMNA SELECCIONADA.           *
                               *          .getSelectedColumns();    --> DEVUELVE Array DE int                  *
                               *                                    --> �NDICES COLUMNAS SELECCIONADAS.        *
                               *********************************************************************************
                               *  1. LAYOUTS - MAQUETADORES.                                                   *
                               *********************************************************************************
                               *  0. ATR�S.                                                                    *
                               *********************************************************************************
                               
                               """);
            System.out.print("Seleccione una opci�n: ");
            menu = teclaStr.nextLine();
            switch(menu){
                case "0" -> {}
                case "1" -> bloque06.Layouts.main(args);
                default -> System.out.println("La opci�n no es correcta.");
            }
        } while (!"0".equals(menu));
    }
}
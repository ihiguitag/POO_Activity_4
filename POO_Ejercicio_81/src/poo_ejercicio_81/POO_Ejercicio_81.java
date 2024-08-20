package poo_ejercicio_81;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase define el punto de ingreso al programa de gestión de
 * personas. Por lo tanto, cuenta con un método main de acceso al programa.
 * @version 1.2/2020
 */
public class POO_Ejercicio_81 {


    // MÉTODOS

    /**
     * Método main que sirve de punto de entrada al programa
     * @param args Parámetros de línea de comandos (no utilizados en este caso)
     */
    public static void main(String[] args) {
        // Define la ventana principal
        VentanaPrincipal miVentanaPrincipal;

        // Crea la ventana principal
        miVentanaPrincipal = new VentanaPrincipal();

        // Establece la ventana como visible
        miVentanaPrincipal.setVisible(true);
    }
}

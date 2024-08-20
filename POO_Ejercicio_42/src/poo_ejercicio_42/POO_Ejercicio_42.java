package poo_ejercicio_42;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase prueba diferentes inmuebles, calcula su precio de
 * acuerdo al area y muestra sus datos en pantalla.
 * @version 1.2/2020
 */
public class POO_Ejercicio_42 {
    /**
     * Metodo main que crea dos inmuebles, calcula su precio de
     * acuerdo al area y muestra sus datos en pantalla.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un apartamento familiar
        ApartamentoFamiliar apto1 = new ApartamentoFamiliar(103067, 120, "Avenida Santander 45-45", 3, 2, 200000);
        System.out.println("Datos apartamento familiar:");
        apto1.calcularPrecioVenta(ApartamentoFamiliar.valorArea);
        apto1.imprimir();

        // Linea en blanco para separar los datos
        System.out.println();

        // Crear un apartaestudio
        Apartaestudio aptestudio1 = new Apartaestudio(12354, 50, "Avenida Caracas 30-15", 1, 1);
        System.out.println("Datos apartaestudio:");
        aptestudio1.calcularPrecioVenta(Apartaestudio.valorArea);
        aptestudio1.imprimir();
    }
}

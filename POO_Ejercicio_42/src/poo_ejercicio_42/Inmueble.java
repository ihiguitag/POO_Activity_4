package poo_ejercicio_42;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase denominada Inmueble modela un inmueble que posee
 * como atributos un identificador, un area, una direccion y un precio
 * de venta. Es la clase raiz de una jerarquia de herencia.
 * @version 1.2/2020
 */
public class Inmueble {

    // ATRIBUTOS

    // Atributo para el identificador inmobiliario de un inmueble
    protected int identificadorInmobiliario;
    
    // Atributo que identifica el area de un inmueble
    protected int area;
    
    // Atributo que identifica la direccion de un inmueble
    protected String direccion;
    
    // Atributo que identifica el precio de venta de un inmueble
    protected double precioVenta;

    // MÉTODOS

    /**
     * Constructor de la clase Inmueble
     * 
     * @param identificadorInmobiliario Parametro que define el identificador de un inmueble
     * @param area Parametro que define el area de un inmueble
     * @param direccion Parametro que define la direccion donde se encuentra localizado un inmueble
     */
    Inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    /**
     * Metodo que a partir del valor del area de un inmueble, calcula su precio de venta
     * 
     * @param valorArea El valor unitario por area de un determinado inmueble
     * @return Precio de venta del inmueble
     */
    double calcularPrecioVenta(double valorArea) {
        // Se calcula el precio de venta
        precioVenta = area * valorArea;
        return precioVenta;
    }

    /**
     * Metodo que muestra en pantalla los datos de un inmueble
     */
    void imprimir() {
        System.out.println("Identificador inmobiliario = " + identificadorInmobiliario);
        System.out.println("area = " + area);
        System.out.println("Direccion = " + direccion);
        System.out.println("Precio de venta = $" + precioVenta);
    }
}
